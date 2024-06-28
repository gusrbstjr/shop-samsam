package com.ohgiraffers.samsam.mail;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Controller
@Slf4j
@RequiredArgsConstructor
public class MailController {

    private final MailService mailService;

    @GetMapping("/members/mail-form")
    public String mailForm() {
        log.info("/members/mail-form");
        return "/member/mail-form";
    }

    @PostMapping("/members/mail/send")
    @ResponseBody
    public String sendMail(@RequestBody MailRequest mailRequest) throws InterruptedException {
        List<String> recipients = mailRequest.recipients();
        String subject = mailRequest.subject();
        String content = mailRequest.content();
        mailService.sendMail(mailRequest);

        Map<String, String> mailMap = new HashMap<>();
        mailMap.put("mailTitle", subject);
        mailMap.put("mailContent", content);
        mailService.save(mailMap);
        
        return "ok";
    }

    @GetMapping("/members/mail-sent")
    public String mailSent() {
        return "member/mail-sent";
    }
}
