/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package calculadora;

/**
 *
 * @author Paulo Jr
 */
public class OperadorUnitario {
    
    protected static double calcula(double p, String o) throws Exception{
        
        if( o.equals("sqrt") )
            return Math.sqrt(p);
        else if( o.equals("sin") )
            return Math.sin(p);
        else if( o.equals("cos") )
            return Math.cos(p);
        else if( o.equals("tg") )
            return Math.tan(p);
        else
            throw new Exception("Operador \""+o+"\" não implementado");
        
    }
    
    public static String geraRaizQuadrada(double a){
        return "sqrt"+a;
    }
    
    public static String geraSeno(double a){
        return "sin"+a;
    }
    
    public static String geraCosseno(double a){
        return "cos"+a;
    }
    
    public static String geraTangente(double a){
        return "tg"+a;
    }
    
}
