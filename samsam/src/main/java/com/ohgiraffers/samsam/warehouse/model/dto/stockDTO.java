package com.ohgiraffers.samsam.warehouse.model.dto;


import lombok.*;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@ToString
public class stockDTO {
    private int stockSeq;
    private int stockQuantity;
    private int productSeq;
}
