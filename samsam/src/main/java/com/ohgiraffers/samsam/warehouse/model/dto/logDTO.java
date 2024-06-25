package com.ohgiraffers.samsam.warehouse.model.dto;

import lombok.*;

import java.sql.Date;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@ToString
public class logDTO {
    private int warehouseSeq;
    private int productSeq;
    private int productQuantity;
    private int status;
    private Date logDate;
}
