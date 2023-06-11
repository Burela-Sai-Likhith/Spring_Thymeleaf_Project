package pd.workshop.springthymeleafdemoproject.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HierarchicalIndexController {

        @GetMapping("/hierarchicalIndex")
        public String hierarchicalIndex(){
            return "hierarchicalIndex";
        }
        @GetMapping("/hierarchicalUser")
        public String hierarchicalUser(){
            return "hierarchicalUser";
        }

    }

