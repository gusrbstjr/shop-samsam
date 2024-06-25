package com.ohgiraffers.samsam.board.controller;

import com.ohgiraffers.samsam.order.model.service.OrderFindService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@Slf4j
public class QnAController {

    @GetMapping("/QnA.html")
    public String QnAChange() {
        return "board/QnA"; // templates 폴더 안의 OrderChange.html을 렌더링
    }


}
