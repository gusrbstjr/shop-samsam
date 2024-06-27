package com.ohgiraffers.samsam.board.notice;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class NoticeService {
    private final NoticeMapper noticeMapper;

    public List<Board> findAll() {
        return noticeMapper.findAll();
    }

    public Board findDetailById(int boardSeq) {
        return noticeMapper.findDetailById(boardSeq);
    }

    public void update(Board board) {
        noticeMapper.update(board);
    }

    public void delete(int boardSeq) {
        noticeMapper.delete(boardSeq);
    }

    public void save(Board board) {
        noticeMapper.save(board);
    }
}
