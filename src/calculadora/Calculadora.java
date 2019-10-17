/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package calculadora;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 *
 * @author Paulo Jr
 */
public class Calculadora {
    
    public static double Resolver(String a) throws ExpressaoMalFormuladaException, Exception{
        
        String n = "-?\\d+(\\.?\\d+)?";
        a = a.trim().replace(" ", "").replace(",", ".").replaceAll("^sen|^seno", "sin").replaceAll("^cosseno|^cossen", "cos").replaceAll("^tangente|^tan", "tg");
        
        String z = "^(?<unitario>sqrt|sin|cos|tg)("+n+")$|^("+n+")(?<modulo>mod)("+n+")$|^("+n+")(?<simbolo>[\\+\\-\\*\\/\\%\\^])("+n+")$";
//        String z = "^("+n+")(?<simbolo>[\\+\\-\\*\\/\\%\\^])("+n+")$";
        
        if( !a.matches(z) )
            throw new ExpressaoMalFormuladaException(a);
        
        Matcher l = Pattern.compile(z).matcher(a);
        l.find();
        String gp = l.group("modulo") != null ? "modulo" : l.group("simbolo") != null ? "simbolo" : "unitario";
        String b = l.group(gp);
        
        if( gp.equals("unitario") )
            return unitario(Double.parseDouble(a.substring(l.end(gp))), b);
        else
            return normal(Double.parseDouble(a.substring(0, l.start(gp))), Double.parseDouble(a.substring(l.end(gp))), b);
        
    }
    
    private static double unitario(double p, String o) throws Exception{
        return OperadorUnitario.calcula(p, o);
    }
    
    private static double normal(double q, double p, String o) throws Exception{
        return OperadorBinario.calcula(q, p, o);
    }
    
}
