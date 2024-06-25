package com.ohgiraffers.samsam.member;

import lombok.*;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@ToString
public class Member {
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
    private String gradeName;
}
