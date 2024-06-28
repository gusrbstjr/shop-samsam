package com.ohgiraffers.samsam.board.controller;

import com.ohgiraffers.samsam.board.model.dto.BoardDTO;
import com.ohgiraffers.samsam.board.model.service.QnAService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

@Controller
@Slf4j
public class QnAController {

    private final QnAService qnAService;

    public QnAController(QnAService qnAService) {
        this.qnAService = qnAService;
    }

    @GetMapping("QnA")
    public String QnAChange(Model model) {
        List<BoardDTO> boardDTOList = qnAService.boardAll();
        model.addAttribute("boards", boardDTOList);
        return "board/QnA"; // templates 폴더 안의 OrderChange.html을 렌더링
    }

    @PostMapping("QnA/answer")
    public String QnAAnswer(Model model, @RequestParam(required = false) int boardSeq, String answerContent) {
        int isAnswer = qnAService.isAnswer(boardSeq);
        log.info("isAnswer: " + isAnswer);
        if (isAnswer == 1) {
            int upLoadAnswer = qnAService.upLoadAnswer(boardSeq, answerContent);

        } else {
            model.addAttribute("isError", true);
            return "board/QnA";
        }
        return "redirect:/QnA";
    }


}
