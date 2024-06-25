package com.ohgiraffers.samsam.login.controller;


import com.ohgiraffers.samsam.login.model.service.loginService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@Slf4j
public class loginController {

    private final com.ohgiraffers.samsam.login.model.service.loginService loginService;

    public loginController(loginService loginService) {
        this.loginService = loginService;
    }

    @GetMapping("/login")
    public String login(Model model, @RequestParam(required = false) String username, String password) {
        boolean isLogin = loginService.isLogin(username, password);
        if (isLogin) {

            return "main/main";
        }else {

            return "login/login";
        }
    }


}
