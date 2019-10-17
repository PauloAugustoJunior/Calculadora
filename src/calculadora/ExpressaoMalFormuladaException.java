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
public class ExpressaoMalFormuladaException extends RuntimeException{
    
    public ExpressaoMalFormuladaException(String calculo) {
        super(calculo);
    }
    
}
