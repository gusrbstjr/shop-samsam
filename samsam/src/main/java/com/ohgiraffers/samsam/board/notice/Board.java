package com.ohgiraffers.samsam.board.notice;

import lombok.*;

import java.sql.Date;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@ToString
public class Board {
    private int boardSeq;
    private String boardTitle;
    private String boardContent;
    private int boardSecrete;
    private Date boardDate;
    private int customerSeq;
    private int boardCategory;
    private String answerContent;
    private Date answerDate;
    private int answerStatus;
    private String writer;
}
