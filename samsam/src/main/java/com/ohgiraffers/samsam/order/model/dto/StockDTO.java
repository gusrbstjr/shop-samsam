package com.ohgiraffers.samsam.order.model.dto;

import lombok.*;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@ToString
public class StockDTO {

    private int stock_seq;
    private int stock_quantity;
    private int product_seq;
}
