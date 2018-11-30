
package exceptions;


public class CalculateHarvestException  extends Exception{

    public CalculateHarvestException() {
    }

    public CalculateHarvestException(String message) {
        super(message);
    }

    public CalculateHarvestException(String message, Throwable cause) {
        super(message, cause);
    }

    public CalculateHarvestException(Throwable cause) {
        super(cause);
    }

    public CalculateHarvestException(String message,
                                     Throwable cause,
                                     boolean enableSuppression,
                                     boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }
    
    
}
