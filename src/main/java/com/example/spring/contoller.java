package com.example.spring;

import com.example.spring.DAO.UserDAO;
import com.example.spring.domain.User;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;


@Controller

class HelloWorldController {

private final UserDAO userDAO;
    @Autowired
    public HelloWorldController(UserDAO userDAO) {
        this.userDAO = userDAO;
    }
//    @GetMapping(value = "/greeting")
//    public String helloWorldController(@RequestParam(name = "name", required = false, defaultValue = "World") String name, Model model) {
//        model.addAttribute("name", name);
//        return "greeting";

//    }
//    @GetMapping
//    public  String main( Model model){
//        Iterable<User> users = loginRepo.findAll();
//        model.addAttribute("users",users);
//        return "index";
//    }

    @GetMapping
    public  String show(@ModelAttribute("user") User user, Model model){
        return "index";
    }



    @PostMapping
    public  String add(@ModelAttribute("user") @Valid User user,
                       BindingResult bindingResult, Model model){

        if(bindingResult.hasErrors()){
            return "greeting";

        }
        userDAO.save(user);


        return "redirect:/";
    }

}