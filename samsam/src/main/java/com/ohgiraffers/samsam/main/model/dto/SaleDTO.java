package com.ohgiraffers.samsam.main.model.dto;

import lombok.*;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@ToString
public class SaleDTO {

    private int order_seq;
    private int customer_seq;
    private int product_seq;
    private int total_price;
    private String register_date;
    private String order_status;

}
