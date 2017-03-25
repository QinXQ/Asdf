package asdf.web.modules.visitor;

import asdf.web.exception.RefusedConnectionException;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by QinXQ on 2017/3/25.
 */
@Controller
public class VisitorController {
    @RequestMapping("index")
    public String toIndex(){
        return "visitor/index";
    }

    @RequestMapping(value = "important")
    public String toImportantPage(){
        throw new RefusedConnectionException("need higher account");
    }
}
