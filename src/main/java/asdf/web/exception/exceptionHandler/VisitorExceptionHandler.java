package asdf.web.exception.exceptionHandler;

import asdf.web.exception.RefusedConnectionException;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

/**
 * Created by QinXQ on 2017/3/25.
 */
@ControllerAdvice
public class VisitorExceptionHandler {
    @ExceptionHandler(value = {RefusedConnectionException.class})
    public String refusedConnectionException(){
        return "redirect:index";
    }
}
