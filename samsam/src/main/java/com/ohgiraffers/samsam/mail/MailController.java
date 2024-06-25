package com.ohgiraffers.samsam.mail;

import com.ohgiraffers.samsam.member.MemberService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
@Slf4j
@RequiredArgsConstructor
public class MailController {

    private final MailService mailService;

    @GetMapping("/members/mail-form")
    public String mailForm() {
        log.info("/members/mail-form");

//        return "member/mail-form";
        return "member/mail-form";
    }

    @PostMapping("/members/mail/send")
    @ResponseBody
    public String sendMail(@RequestBody MailRequest mailRequest) {
        List<String> recipients = mailRequest.recipients();
        String subject = mailRequest.subject();
        String content = mailRequest.content();

        log.info("recipients={}", recipients);
        log.info("subject={}", subject);
        log.info("content={}", content);

        mailService.sendMail(mailRequest);

        return "ok";
    }

}
