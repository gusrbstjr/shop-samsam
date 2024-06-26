package com.ohgiraffers.samsam.board.model.dao;

import com.ohgiraffers.samsam.board.model.dto.BoardDTO;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;
import java.util.Map;

@Mapper
public interface QnAMapper {
    List<BoardDTO> boardAll();

    int isAnswer(int boardSeq);

    int upLoadAnswer(Map<Object, Object> map);
}
