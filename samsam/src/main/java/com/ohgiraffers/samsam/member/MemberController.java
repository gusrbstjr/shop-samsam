package com.ohgiraffers.samsam.member;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
@RequestMapping("/members")
@Slf4j
@RequiredArgsConstructor
public class MemberController {
    private final MemberService memberService;

    @GetMapping()
    public String members(Model model) {
        List<Member> members = memberService.findAll();
        for (Member member : members) {
            System.out.println(member.isSubscribeAds());
        }
        model.addAttribute("members", members);
        return "member/members";
    }
}
