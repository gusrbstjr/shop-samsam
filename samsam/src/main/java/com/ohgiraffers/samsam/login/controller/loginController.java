package com.ohgiraffers.samsam.login.controller;


import com.ohgiraffers.samsam.login.model.service.loginService;
import com.ohgiraffers.samsam.main.model.service.SaleService;
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

    private final SaleService saleService;



    public loginController(loginService loginService, SaleService saleService) {
        this.loginService = loginService;
        this.saleService = saleService;
    }

    @PostMapping("/login")
    public String login(Model model, @RequestParam(required = false) String username, String password) {
        boolean isLogin = loginService.isLogin(username, password);
        if (isLogin) {
            String findAccountRoll = loginService.findAccountRoll(username);
            int findSeq = loginService.findSeq(username);
            System.out.println("findSeq" + findSeq);
            switch (findAccountRoll) {
                case "쇼핑몰관리자":
                case "창고관리자":
                    return "redirect:/main";
                default:
                    return "userinterface/index";
            }

        }else {
            model.addAttribute("isError",true);

            return "login/login";
        }
    }


}
