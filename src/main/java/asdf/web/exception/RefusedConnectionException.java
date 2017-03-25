package asdf.web.exception;

/**
 * Created by QinXQ on 2017/3/25.
 */
public class RefusedConnectionException extends RuntimeException{
    public RefusedConnectionException(String message) {
        super(message);
    }
}
