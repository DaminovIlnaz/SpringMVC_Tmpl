package ru.itis.kpfu.springPro.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import ru.itis.kpfu.springPro.dto.LoginDto;
import ru.itis.kpfu.springPro.dto.RegDto;
import ru.itis.kpfu.springPro.services.UserService;

import java.util.Map;

@Controller
public class AuthController {


    @Autowired
    private UserService userService;

    @GetMapping("/login")
    public String getLogin(ModelMap map){
        return "singIn";
    }

    @PostMapping("/login")
    public String login(@RequestParam Map<String, String> params){
        if(userService.login(params.get("login"), params.get("password"))){
            return "usrPage";
        }
        return "redirect:/login";
    }

    @GetMapping("/registration")
    public String getSignUp(ModelMap map){
        return "signUp";
    }

    @PostMapping("/registration")
    public String registration(@RequestParam Map<String, String> params){
        System.out.println(params.get("login") + " " + params.get("password"));
        if(userService.register(params.get("login"), params.get("password"))){
            return "usrPage";

        }
        return "redirect:/login";
    }

}
