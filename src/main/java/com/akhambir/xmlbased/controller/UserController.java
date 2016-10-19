package com.akhambir.xmlbased.controller;

import com.akhambir.xmlbased.model.User;
import com.akhambir.xmlbased.services.interfaces.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class UserController {

    private final UserService userService;

    @Autowired
    public UserController(UserService userService) {
        this.userService = userService;
    }

    @RequestMapping("/register/addUser")
    public String addUserGet(Model model) {
        model.addAttribute("newUser", new User());
        return "registrationPage";
    }

    @RequestMapping(value = "/register/addUser", method = RequestMethod.POST)
    public String addUserPost(@ModelAttribute("newUser") User user, Model model) {
        model.addAttribute("newUser", userService.addUser(user));
        return "newUserPage";
    }
}
