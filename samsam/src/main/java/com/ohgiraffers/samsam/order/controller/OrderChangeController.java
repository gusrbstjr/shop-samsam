package com.ohgiraffers.samsam.order.controller;

import com.ohgiraffers.samsam.order.model.service.OrderFindService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@Slf4j
public class OrderChangeController {

    @GetMapping("/OrderChange.html")
    public String orderChange() {
        return "order/OrderChange"; // templates 폴더 안의 OrderChange.html을 렌더링
    }

    @GetMapping("/main.html")
    public String main() {return "main/main";}
}

