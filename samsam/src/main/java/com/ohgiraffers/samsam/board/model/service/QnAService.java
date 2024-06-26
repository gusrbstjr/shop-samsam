package com.ohgiraffers.samsam.board.model.service;

import com.ohgiraffers.samsam.board.model.dto.BoardDTO;

import java.util.List;

public interface QnAService {
    List<BoardDTO> boardAll();

    int isAnswer(int boardSeq);

    int upLoadAnswer(int boardSeq, String answerContent);
}
