package com.ohgiraffers.samsam.board.model.service;

import com.ohgiraffers.samsam.board.model.dao.QnAMapper;
import com.ohgiraffers.samsam.board.model.dto.BoardDTO;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Service
@Slf4j
public class QnAServiceImpl implements QnAService {
    private final QnAMapper qnAMapper;


    public QnAServiceImpl(QnAMapper qnAMapper) {
        this.qnAMapper = qnAMapper;
    }

    @Override
    public List<BoardDTO> boardAll() {
        return qnAMapper.boardAll();
    }

    @Override
    public int isAnswer(int boardSeq) {
        return qnAMapper.isAnswer(boardSeq);
    }

    @Override
    public int upLoadAnswer(int boardSeq, String answerContent) {
        Map<Object, Object> map = new HashMap<>();
        map.put("boardSeq", boardSeq);
        map.put("answerContent", answerContent);
        return qnAMapper.upLoadAnswer(map);
    }
}
