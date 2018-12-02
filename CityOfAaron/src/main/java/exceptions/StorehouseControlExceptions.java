/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exceptions;

/**
 *
 * @author jonclarkes
 */
public class StorehouseControlExceptions extends Exception {

    public StorehouseControlExceptions() {
    }

    public StorehouseControlExceptions(String message) {
        super(message);
    }

    public StorehouseControlExceptions(String message, Throwable cause) {
        super(message, cause);
    }

    public StorehouseControlExceptions(Throwable cause) {
        super(cause);
    }

    public StorehouseControlExceptions(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }
    
    
}
