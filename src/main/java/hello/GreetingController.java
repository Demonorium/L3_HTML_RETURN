package hello;

import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

@org.springframework.stereotype.Controller
public class GreetingController {

    @GetMapping("/greeting")
    public String greetingForm(Model model) {
        model.addAttribute("input", new InputForm());

        return "greeting";
    }

    @PostMapping("/greeting")
    public String greetingSubmit(@ModelAttribute InputForm form, Model model) {
        model.addAttribute("controller", new Controller(form));
        return "result";
    }

}