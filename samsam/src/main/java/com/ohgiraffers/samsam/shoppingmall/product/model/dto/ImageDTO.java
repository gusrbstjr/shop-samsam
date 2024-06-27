package com.ohgiraffers.samsam.shoppingmall.product.model.dto;

import lombok.*;

import java.util.Date;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@ToString
public class ImageDTO {

    private int imgSeq;
    private int productSeq;
    private String imgStore;
    private String storeName;
    private boolean deleteYn;
}
