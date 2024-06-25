package com.ohgiraffers.samsam.warehouse.model.dto;

import lombok.*;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@ToString
public class WareHouseDTO {

    private int StockSeq;       // 제품
    private int quantity;
    private int productSeq;     // 재고
}
