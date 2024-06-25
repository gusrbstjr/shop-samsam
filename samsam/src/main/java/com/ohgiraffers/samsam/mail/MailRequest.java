package com.ohgiraffers.samsam.mail;

import java.util.List;

public record MailRequest(List<String> recipients, String subject, String content) {

}
