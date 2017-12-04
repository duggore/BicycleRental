package Controlers.BicycleRental;

/**
 * @author  Francisco Carena
 */
public class ServiceFailureException extends RuntimeException{

    public ServiceFailureException(String message) {
        super(message);
    }

    public ServiceFailureException(Throwable cause) {
        super(cause);
    }

    public ServiceFailureException(String message, Throwable cause) {
        super(message, cause);
    }

}
