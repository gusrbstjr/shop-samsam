package com.ohgiraffers.samsam.login.model.dao;

import org.apache.ibatis.annotations.Mapper;

import java.util.Map;

@Mapper
public interface loginMapper {
    int isLogin(Map<String, String> map);

    String findAccountRoll(String accountId);

    int findSeq(String accountId);
}
