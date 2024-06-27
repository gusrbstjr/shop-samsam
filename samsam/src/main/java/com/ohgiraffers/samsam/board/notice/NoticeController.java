package com.ohgiraffers.samsam.board.notice;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
@Slf4j
@RequiredArgsConstructor
@RequestMapping("/board/notice")
public class NoticeController {
    private final NoticeService noticeService;

    @GetMapping
    public String notice(Model model) {
        System.out.println("NoticeController.notice");
        List<Board> boards = noticeService.findAll();
        System.out.println("boards = " + boards);
        model.addAttribute("boards", boards);
        log.info("/notice");
        return "/board/notice";
    }

    @GetMapping("/detail/{boardSeq}")
    public String detail(@PathVariable int boardSeq, Model model) {
        System.out.println("boardSeq = " + boardSeq);
        Board board = noticeService.findDetailById(boardSeq);
        System.out.println("board = " + board);
        model.addAttribute("board", board);
        return "/board/detail";
    }

    @GetMapping("/update/{boardSeq}")
    public String update(@PathVariable int boardSeq, Model model) {
        Board board = noticeService.findDetailById(boardSeq);
        model.addAttribute("board", board);
        System.out.println("board.getBoardContent() = " + board.getBoardContent());
        return "board/update";
    }

    @PostMapping("/update/{boardSeq}")
    public String update(Board updateParam, Model model) {
        System.out.println("NoticeController.update");
        noticeService.update(updateParam);
        model.addAttribute("board", updateParam);
        return "/board/detail";
    }

    @GetMapping("/delete/{boardSeq}")
    public String delete(@PathVariable int boardSeq) {
        noticeService.delete(boardSeq);
        return "redirect:/board/notice";
    }

    @GetMapping("/new")
    public String newForm() {
        return "/board/new";
    }

    @PostMapping("/new")
    public String newForm(Board board) {
        noticeService.save(board);
        return "redirect:/board/notice";
    }

}
