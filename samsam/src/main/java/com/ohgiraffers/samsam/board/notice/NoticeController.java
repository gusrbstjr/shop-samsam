package com.ohgiraffers.samsam.board.notice;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
@RequiredArgsConstructor
@RequestMapping("/board/notice")
public class NoticeController {
    private final NoticeService noticeService;

    @GetMapping
    public String notice(Model model) {
        List<Board> boards = noticeService.findAll();
        model.addAttribute("boards", boards);
        return "/board/notice";
    }

    @GetMapping("/detail/{boardSeq}")
    public String detail(@PathVariable int boardSeq, Model model) {
        Board board = noticeService.findDetailById(boardSeq);
        model.addAttribute("board", board);
        return "/board/detail";
    }

    @GetMapping("/update/{boardSeq}")
    public String update(@PathVariable int boardSeq, Model model) {
        Board board = noticeService.findDetailById(boardSeq);
        model.addAttribute("board", board);
        return "board/update";
    }

    @PostMapping("/update/{boardSeq}")
    public String update(Board updateParam, Model model) {
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
