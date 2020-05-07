package ru.itis.kpfu.springPro.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import ru.itis.kpfu.springPro.dto.LoginDto;
import ru.itis.kpfu.springPro.dto.RegDto;
import ru.itis.kpfu.springPro.services.UserService;

@Controller
public class AuthController {


    @Autowired
    private UserService userService;

    @GetMapping("/login")
    public String getLogin(ModelMap map){
        return "singIn";
    }

    @PostMapping("/login")
    public String login(@RequestBody LoginDto dto){
        if(userService.login(dto)){
            return "usrPage";
        }
        return "redirect:/login";
    }

    @GetMapping("/registration")
    public String getSignUp(ModelMap map){
        return "signUp";
    }

    @PostMapping("/registration")
    public String registration(@RequestBody RegDto userDto){
        try{
            userService.register(userDto);
            return "usrPage";
        }catch (Exception e){
            return "redirect:/login";
        }
    }

}
