package com.ohgiraffers.samsam.warehouse.model.dto;

import lombok.*;

import java.sql.Date;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@ToString
public class productDTO {
    private int productSeq;
    private String productName;
    private Date registerDate;
    private int productPrice;
    private String categoryName;
}
