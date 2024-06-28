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
    private String registerDate;
    private int productPrice;
    private String categoryName;
    private String productContent;
    private int deleteYn;
    private ImageDTO image;
}
