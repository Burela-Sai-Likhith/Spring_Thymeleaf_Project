package pd.workshop.springthymeleafdemoproject.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
@Controller
public class IndexController {
    @GetMapping("/expressionIndex")
    public String expressionIndex() {
        return "expressionIndex";
    }



}