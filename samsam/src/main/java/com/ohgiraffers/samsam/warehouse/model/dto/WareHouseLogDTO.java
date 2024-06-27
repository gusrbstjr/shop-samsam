package com.ohgiraffers.samsam.warehouse.model.dto;


import lombok.*;

import java.util.Date;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@ToString
public class WareHouseLogDTO {

   private int warehouse_seq;
   private int product_seq;
   private int pro_quantity;
   private int status;
   private String statusDesc;
   private Date warehouse_date;
}
