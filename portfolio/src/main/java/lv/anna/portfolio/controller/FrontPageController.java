package lv.anna.portfolio.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class FrontPageController {

    @GetMapping("/frontpage")
    public String getFrontPage(Model model){
        model.addAttribute("myName", "Laila");
        model.addAttribute("mySurname", "Duffy");
        return "frontpage.html";
    }



    @GetMapping("/resume")
    public String getResumePage(Model model, @RequestParam(value = "param1", required = false) String param1){
        model.addAttribute("resumeName", "My CV");
        model.addAttribute("parameter1", param1);
        return "resume.html";
    }
}
