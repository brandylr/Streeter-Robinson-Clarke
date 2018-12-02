/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exceptions;

/**
 *
 * @author brobinson
 */
public class PopulationControlException extends Exception{

    public PopulationControlException() {
    }

    public PopulationControlException(String message) {
        super(message);
    }

    public PopulationControlException(String message, Throwable cause) {
        super(message, cause);
    }

    public PopulationControlException(Throwable cause) {
        super(cause);
    }

    public PopulationControlException(String message, 
                                      Throwable cause, 
                                      boolean enableSuppression, 
                                      boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }
    
}
