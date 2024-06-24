package com.ohgiraffers.samsam.member;

import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/members")
@Slf4j
public class MemberController {

    @GetMapping()
    public String members() {
        log.info("/members/");
        return "member/members";
    }

    @GetMapping("/mail-form")
    public String mail() {
        log.info("/members/mail-form");
        return "member/mail-form";
    }
}
