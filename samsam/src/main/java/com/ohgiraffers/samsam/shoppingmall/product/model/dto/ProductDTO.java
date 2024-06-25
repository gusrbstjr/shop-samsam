package com.ohgiraffers.samsam.shoppingmall.product.model.dto;

import lombok.*;

import java.util.Date;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@ToString

public class ProductDTO {

    private int productSeq;
    private String productName;
    private Date registerDate;
    private int productPrice;
    private String categoryName;
}
