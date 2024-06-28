package com.ohgiraffers.samsam.main.controller;

import com.ohgiraffers.samsam.login.model.service.loginService;
import com.ohgiraffers.samsam.main.model.dao.SaleMapper;
import com.ohgiraffers.samsam.main.model.service.SaleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller

public class MainController {

    private final SaleService saleService;

    public MainController(SaleService saleService) {
        this.saleService = saleService;
    }
    @GetMapping("/")
    public String index(Model model) {
        return "login/login";
    }

    @GetMapping(value={ "/main"})
    public String defaultLocation(Model model){
        Integer revenueMonth = saleService.revenueMonth();
        Integer sale =saleService.totalSale();
        System.out.println("sale = " + sale);
        System.out.println("revenueMonth = " + revenueMonth);
        Integer customer = saleService.customer();
        System.out.println("customer = " + customer);
        model.addAttribute("customer",customer);
        model.addAttribute("sale",sale);
        model.addAttribute("revenueMonth", revenueMonth);
        System.out.println("hello");
        model.addAttribute("isError", false);
        return "main/main";
    }

}



