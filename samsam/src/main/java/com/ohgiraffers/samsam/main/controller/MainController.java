package com.ohgiraffers.samsam.main.controller;

import com.ohgiraffers.samsam.order.model.service.OrderFindService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/*")
public class MainController {


    @GetMapping(value={"/", "/main"})
    public String defaultLocation(){
        return "main/main";
    }

}
