package asdf.web.modules.testAngular;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by QinXQ on 2017/3/25.
 */
@Controller
public class AngularTestController {
    @RequestMapping(value = "test1")
    public String test1(){
        return "angularTest/test1";
    }
}
