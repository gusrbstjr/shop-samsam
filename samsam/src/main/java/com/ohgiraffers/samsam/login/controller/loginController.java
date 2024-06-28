package com.ohgiraffers.samsam.login.controller;


import com.ohgiraffers.samsam.login.model.service.loginService;
import com.ohgiraffers.samsam.main.model.service.SaleService;
import com.ohgiraffers.samsam.member.MemberService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.SessionAttributes;

@SessionAttributes(value = {"username"})
@Controller
@Slf4j
public class loginController {

    private final com.ohgiraffers.samsam.login.model.service.loginService loginService;

    private final SaleService saleService;
    private final MemberService memberService;

    public loginController(loginService loginService, SaleService saleService, MemberService memberService) {
        this.loginService = loginService;
        this.saleService = saleService;
        this.memberService = memberService;
    }

    @PostMapping("/login")
    public String login(Model model, @RequestParam(required = false) String username, String password) {
        boolean isLogin = loginService.isLogin(username, password);
        if (isLogin) {
            String findAccountRoll = loginService.findAccountRoll(username);

            switch (findAccountRoll) {
                case "쇼핑몰관리자":
                case "창고관리자":
                    return "redirect:/main";
                default:
                    model.addAttribute("username", username);
                    return "userinterface/index";
            }

        }else {
            model.addAttribute("isError",true);

            return "login/login";
        }
    }


}
