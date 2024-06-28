package com.ohgiraffers.samsam.mail;

import jakarta.mail.MessagingException;
import jakarta.mail.internet.MimeMessage;
import lombok.RequiredArgsConstructor;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.mail.javamail.MimeMessageHelper;
import org.springframework.stereotype.Service;

import java.util.Map;

@Service
@RequiredArgsConstructor
public class MailService {

    private final JavaMailSender sender;
    private final MailMapper mailMapper;

    private static String getDefaultTitle() {
        return "삼삼이네 안경점 여름 특별 세일!";
    }

    public void save(Map<String, String> mailMap) {
        String title = mailMap.get("mailTitle");
        String content = mailMap.get("mailContent");
        if (title == null || title.isEmpty()) title = getDefaultTitle();
        if (content == null || content.isEmpty()) content = getDefaultContent();
        mailMap.put("mailTitle", title);
        mailMap.put("mailContent", content);
        mailMapper.save(mailMap);
    }

    public void sendMail(MailRequest mailRequest) {
        String subject = mailRequest.subject();
        String content = mailRequest.content();
        mailRequest.recipients().forEach(recipient -> sendMail(recipient, subject, content));
    }

    public void sendMail(String to, String title, String content) {
        String from = "samsam.glasses.com";
        if (title == null || title.isEmpty()) title = getDefaultTitle();
        if (content == null || content.isEmpty()) content = getDefaultContent();
        send(from, to, title, content);
    }

    private void send(String from, String to, String subject, String text) {
        try {
            MimeMessage msg = sender.createMimeMessage();
            MimeMessageHelper helper = new MimeMessageHelper(msg, true, "utf-8");
            helper.setFrom(from);
            helper.setTo(to);
            helper.setSubject(subject);
            helper.setText(text, true);
            sender.send(msg);
        } catch (MessagingException e) {
            throw new RuntimeException(e);
        }
    }

    private String getDefaultContent() {
        String content = """
                <!DOCTYPE html>
                              <html lang="ko">
                              <head>
                                  <meta charset="UTF-8">
                                  <meta name="viewport" content="width=device-width, initial-scale=1.0">
                                  <title>삼삼이네 안경점 여름 특별 세일!</title>
                                  <style>
                                      body {
                                          font-family: Arial, sans-serif;
                                          background-color: #f4f4f4;
                                          color: #333;
                                          line-height: 1.6;
                                          margin: 0;
                                          padding: 0;
                                      }
                              
                                      .container {
                                          width: 100%;
                                          max-width: 600px;
                                          margin: 0 auto;
                                          background-color: #fff;
                                          padding: 20px;
                                          border-radius: 8px;
                                          box-shadow: 0 0 10px rgba(0, 0, 0, 0.1);
                                      }
                              
                                      .logo {
                                          width: 100%;
                                          text-align: center;
                                          margin-bottom: -20px;
                                      }
                              
                                      img {
                                          width: 30%;
                                      }
                              
                                      .header {
                                          text-align: center;
                                          padding-bottom: 20px;
                                          border-bottom: 1px solid #ddd;
                                      }
                              
                                      .header h1 {
                                          font-size: 24px;
                                          color: #007bff;
                                      }
                              
                                      .content {
                                          padding: 20px 0;
                                      }
                              
                                      .content h2 {
                                          font-size: 20px;
                                          color: #333;
                                          margin-bottom: 10px;
                                          text-align: center;
                                      }
                              
                                      .content p {
                                          margin-bottom: 20px;
                                      }
                              
                                      .button {
                                          display: block;
                                          width: 95%;
                                          padding: 15px;
                                          background-color: #007bff;
                                          color: #fff;
                                          text-align: center;
                                          border-radius: 4px;
                                          text-decoration: none;
                                          font-size: 16px;
                                          margin: 20px 0;
                                      }
                              
                                      .button:hover {
                                          background-color: #0056b3;
                                      }
                              
                                      .footer {
                                          text-align: center;
                                          padding-top: 20px;
                                          border-top: 1px solid #ddd;
                                          color: #777;
                                      }
                                  </style>
                              </head>
                              <body>
                                  <div class="container">
                                      <div class="logo">
                                          <img src="https://i.ibb.co/9hnCXPZ/logo.png" alt="">
                                      </div>
                                      <div class="header">
                                          <h1>삼삼이네 안경점 여름 특별 세일!</h1>
                                      </div>
                                      <div class="content">
                                          <h2>안녕하세요, 고객님!</h2>
                                          <p>올 여름, 삼삼 안경점에서 최고의 안경을 최고의 가격에 만나보세요!<br>
                                              다양한 스타일과 기능을 갖춘 최신 안경들을 특별한 할인가로 제공해드립니다.</p>
                                          <h2>특별 혜택</h2>
                                          <p>이번 세일 기간 동안 다음과 같은 혜택을 누리실 수 있습니다:</p>
                                          <ul>
                                              <li>모든 안경 최대 50% 할인</li>
                                              <li>구매 금액에 따른 추가 할인 쿠폰 제공</li>
                                              <li>무료 가맹점 컨설팅 서비스</li>
                                          </ul>
                                          <h2>인기 상품</h2>
                                          <p>삼삼 안경점에서는 다음과 같은 인기 상품들을 만나보실 수 있습니다:</p>
                                          <ul>
                                              <li>블루라이트 차단 안경</li>
                                              <li>자외선 차단 선글라스</li>
                                              <li>고급 티타늄 프레임 안경</li>
                                          </ul>
                                          <p>이 외에도 다양한 최신 제품들을 준비해두었습니다.<br>
                                              지금 바로 삼삼이네 안경점을 방문하여 특별한 혜택을 누리세요!</p>
                                          <a href="http://localhost:8080" class="button">지금 쇼핑하러 가기</a>
                                      </div>
                                      <div class="footer">
                                          <p>© 2024 삼삼이네 안경점. All rights reserved.</p>
                                          <p>본 메일은 발신 전용입니다. 문의사항은 삼삼이네 안경점 고객센터로 연락주시기 바랍니다.</p>
                                      </div>
                                  </div>
                              </body>
                              </html>
                """;
        return content;
    }

}
