package com.ohgiraffers.samsam.login.controller;


import com.ohgiraffers.samsam.login.model.service.loginService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@Slf4j
public class loginController {

    private final com.ohgiraffers.samsam.login.model.service.loginService loginService;

    public loginController(loginService loginService) {
        this.loginService = loginService;
    }

    @PostMapping("/login")
    public String login(Model model, @RequestParam(required = false) String username, String password) {
        boolean isLogin = loginService.isLogin(username, password);
        if (isLogin) {
            String findAccountRoll = loginService.findAccountRoll(username);
            switch (findAccountRoll) {
                case "쇼핑몰관리자":
                case "창고관리자":
                    return "main/main";
                default:
                    return "userinterface/index";
            }

        }else {
            model.addAttribute("isError",true);

            return "login/login";
        }
    }


}
