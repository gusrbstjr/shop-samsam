package com.ohgiraffers.samsam.board.notice;

import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface NoticeMapper {

    List<Board> findAll();

    Board findDetailById(int boardSeq);

    void update(Board board);

    void delete(int boardSeq);

    void save(Board board);
}
