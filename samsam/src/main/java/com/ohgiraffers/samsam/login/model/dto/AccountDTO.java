package com.ohgiraffers.samsam.login.model.dto;

import lombok.*;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@ToString
public class AccountDTO {
    private int accountSeq;
    private String accountId;
    private String accountPwd;
    private String name;
    private String phoneNumber;
    private String mailAddr;
    private String accountAddr;
    private String companyName;
    private String businessNum;
    private int accumulatedAmount;
    private boolean subscribeAds;
    private String accountRole;
    private int gradeSeq;
}
