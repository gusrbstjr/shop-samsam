package com.ohgiraffers.samsam.login.controller;


import com.ohgiraffers.samsam.login.model.service.LoginService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.SessionAttributes;

@SessionAttributes(value = "findSeq")
@Controller
@Slf4j
public class LoginController {

    private final LoginService loginService;

    public LoginController(LoginService loginService) {
        this.loginService = loginService;
    }

    @PostMapping("/login")
    public String login(Model model, @RequestParam(required = false) String username, String password) {
        boolean isLogin = loginService.isLogin(username, password);
        if (isLogin) {
            String findAccountRoll = loginService.findAccountRoll(username);
            int findSeq = loginService.findSeq(username);
            System.out.println("findSeq" + findSeq);
            model.addAttribute("findSeq", findSeq);
            switch (findAccountRoll) {
                case "쇼핑몰관리자":
                case "창고관리자":
                    return "redirect:/main";
                default:
                    return "userinterface/index";
            }

        } else {
            model.addAttribute("isError", true);

            return "login/login";
        }
    }


}
