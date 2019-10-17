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
public class OperadorBinario {
    
    protected static double calcula(double p, double q, String o) throws Exception{
        
        if( o.equals("mod") )
            return p%q;
        else if( o.equals("+") )
            return p+q;
        else if( o.equals("-") )
            return p-q;
        else if( o.equals("*") )
            return p*q;
        else if( o.equals("/") )
            return p/q;
        else if( o.equals("%") )
            return (p/100)*q;
        else if( o.equals("^") )
            return Math.pow(p, q);
        else
            throw new Exception("Operador \""+o+"\" não implementado");
        
    }
    
    public static String geraSoma(double a, double b){
        return a+"+"+b;
    }
    
    public static String geraSubtracao(double a, double b){
        return a+"-"+b;
    }
    
    public static String geraMultiplicacao(double a, double b){
        return a+"*"+b;
    }
    
    public static String geraDivisao(double a, double b){
        return a+"/"+b;
    }
    
    public static String geraPorcentagem(double a, double b){
        return a+"%"+b;
    }
    
    public static String geraModulo(double a, double b){
        return a+"mod"+b;
    }
    
    public static String geraPotencia(double a, double b){
        return a+"^"+b;
    }
    
}
