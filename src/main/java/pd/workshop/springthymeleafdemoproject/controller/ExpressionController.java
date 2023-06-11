package pd.workshop.springthymeleafdemoproject.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import pd.workshop.springthymeleafdemoproject.domain.Address;
import pd.workshop.springthymeleafdemoproject.domain.Person;
@Controller
public class ExpressionController {
    @GetMapping("/expression")
    public String expression(Model model) {
        Address address = new Address("Nakkavanipalem", 530013);
        Person p1 = new Person(1, "B.Sai Likhith", address);
        model.addAttribute("person", p1);
        return "expression";
    }
}