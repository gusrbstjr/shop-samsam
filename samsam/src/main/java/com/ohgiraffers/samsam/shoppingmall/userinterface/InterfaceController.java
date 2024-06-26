package com.ohgiraffers.samsam.shoppingmall.userinterface;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/userinterface")
public class InterfaceController {

    @GetMapping("/yoonji-shop-single")
    public String yoonjiDetails() {
        return "userinterface/yoonji-shop-single";
    }

    @GetMapping("/changyeon-shop-single")
    public String changyeonDetails() {
        return "userinterface/changyeon-shop-single";
    }

    @GetMapping("/hyunkyun-shop-single")
    public String hynkyunDetails() {
        return "userinterface/hyunkyun-shop-single";
    }

    @GetMapping("/jeonghun-shop-single")
    public String jeonghunDetails() {
        return "userinterface/jeonghun-shop-single";
    }

    @GetMapping("/love-shop-single")
    public String loveDetails() {
        return "userinterface/love-shop-single";
    }

    @GetMapping("/seungjae-shop-single")
    public String seungjaeDetails() {
        return "userinterface/seungjae-shop-single";
    }

    @GetMapping("/ssg-shop-single")
    public String ssgDetails() {
        return "userinterface/ssg-shop-single";
    }

    @GetMapping("/yoonjung-shop-single")
    public String yoonjungDetails() {
        return "userinterface/yoonjung-shop-single";
    }
}
