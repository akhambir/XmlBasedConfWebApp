package com.akhambir.xmlbased.controller;

import com.akhambir.xmlbased.model.Comment;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HomeController {

    @RequestMapping("/")
    public String homePage() {
        return "home";
    }

    @RequestMapping("/flood")
    public String floodLine(Model model) {    //TODO is it okay return view with model by default?
        model.addAttribute("newComment", new Comment());
        return "floodLine";
    }

    @RequestMapping("/loginPage")
    public String loginPage() {
        return "login";
    }

    @RequestMapping("/test")
    public String testPage() {
        return "test";
    }
}
