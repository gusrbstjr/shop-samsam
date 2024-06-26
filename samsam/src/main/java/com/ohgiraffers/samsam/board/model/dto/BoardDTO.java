package com.ohgiraffers.samsam.board.model.dto;

import lombok.*;

import java.sql.Date;


@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@ToString
public class BoardDTO {
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

}
