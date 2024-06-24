package com.ohgiraffers.samsam.member;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

@Controller
@RequestMapping("/members")
@Slf4j
@RequiredArgsConstructor
public class MemberController {
    private final MemberService memberService;

    @GetMapping()
    public String members(Model model) {
        log.info("/members/");
        List<MemberDTO> members = memberService.findAll();
        model.addAttribute("members", members);
        return "member/members";
    }

    @GetMapping("/mail-form")
    public String mail() {
        log.info("/members/mail-form");
        return "member/mail-form";
    }
}
