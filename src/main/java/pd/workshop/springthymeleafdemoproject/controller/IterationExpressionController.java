package pd.workshop.springthymeleafdemoproject.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import pd.workshop.springthymeleafdemoproject.domain.Person;

import java.util.Arrays;
import java.util.List;

@Controller
public class IterationExpressionController {
    @GetMapping("/iterationExpression")
    public String iterationExpression(Model model){
        List<Person> people = Arrays.asList(
                new Person(11,"Vijay"),
                new Person(12,"Sai"),
                new Person(13,"Likhith")
        );
        model.addAttribute("people",people);
        return "iterationExpression";
    }
}