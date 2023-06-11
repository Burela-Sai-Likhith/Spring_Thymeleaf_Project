package pd.workshop.springthymeleafdemoproject.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class LayoutController {
    @GetMapping("/layoutIndex")
    public String layoutIndex(){
        return"layoutIndex";

    }

    @GetMapping("/user")
    public String user(){
        return"user";

    }

}