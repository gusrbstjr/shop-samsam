package com.ohgiraffers.samsam.mail;

import org.apache.ibatis.annotations.Mapper;

import java.util.Map;

@Mapper
public interface MailMapper {

    void save(Map<String, String> mailMap);

}
