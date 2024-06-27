package com.ohgiraffers.samsam.shoppingmall.userinterface.purchase.model;

import lombok.*;

import java.util.Date;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@ToString
public class PurchaseDTO {
    private int orderSeq;
    private int customerSeq;
    private int productSeq;
    private int total_price;
    private Date registerDate;
    private String orderStatus;
    private int orderQuantity;
}
