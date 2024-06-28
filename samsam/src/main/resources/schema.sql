CREATE TABLE grade
(
    grade_seq      int AUTO_INCREMENT NOT NULL
        PRIMARY KEY,
    grade_name     varchar(10)        NOT NULL,
    grade_discount float              NOT NULL,
    grade_money    int                NOT NULL
);

CREATE TABLE account
(
    account_seq        int AUTO_INCREMENT NOT NULL
        PRIMARY KEY,
    account_id         varchar(20)        NOT NULL,
    account_pwd        varchar(20)        NOT NULL,
    name               varchar(16)        NOT NULL,
    phone_number       varchar(20)        NOT NULL,
    mail_addr          varchar(32)        NOT NULL,
    account_addr       varchar(80)        NOT NULL,
    company_name       varchar(40)        NOT NULL,
    business_num       varchar(40)        NOT NULL,
    accumulated_amount int                NULL,
    subscribe_ads      tinyint(1)         NULL,
    account_role       varchar(16)        NOT NULL,
    grade_seq          int                NULL,
    CONSTRAINT FK_grade_TO_account_1
        FOREIGN KEY (grade_seq) REFERENCES grade (grade_seq)
);

CREATE TABLE board
(
    board_seq      int AUTO_INCREMENT NOT NULL
        PRIMARY KEY,
    board_title    varchar(255)       NOT NULL,
    board_content  varchar(255)       NOT NULL,
    board_secrete  int,
    board_date     datetime           NOT NULL,
    customer_seq   int                NOT NULL COMMENT '게시글 혹은 문의글 등록자',
    board_category int                NOT NULL COMMENT '문의글과 공지글 구분',
    answer_content varchar(255)       NULL,
    answer_date    datetime           NULL,
    answer_status  int DEFAULT 0 COMMENT '문의글의 답변 상태를 표현',
    CONSTRAINT FK_account_TO_board_1
        FOREIGN KEY (customer_seq) REFERENCES account (account_seq)
);

CREATE TABLE mail
(
    mail_seq     int AUTO_INCREMENT NOT NULL
        PRIMARY KEY,
    mail_title   varchar(255)       NOT NULL,
    mail_content varchar(255)       NOT NULL,
    mail_date    datetime           NOT NULL
);

CREATE TABLE mail_log
(
    mail_seq    int                NOT NULL,
    account_seq int AUTO_INCREMENT NOT NULL,
    PRIMARY KEY (mail_seq, account_seq),
    CONSTRAINT FK_account_TO_mail_log_1
        FOREIGN KEY (account_seq) REFERENCES account (account_seq),
    CONSTRAINT FK_mail_TO_mail_log_1
        FOREIGN KEY (mail_seq) REFERENCES mail (mail_seq)
);

CREATE TABLE product
(
    product_seq     int AUTO_INCREMENT NOT NULL
        PRIMARY KEY,
    product_name    varchar(32)        NOT NULL,
    register_date   datetime           NOT NULL,
    product_price   int                NOT NULL,
    category_name   varchar(10)        NOT NULL,
    product_content varchar(3000)      NOT NULL,
    delete_yn       tinyint(1)         NOT NULL
);

CREATE TABLE img_tb
(
    img_seq     int AUTO_INCREMENT
        PRIMARY KEY,
    product_seq int          NOT NULL,
    img_store   varchar(255) NOT NULL,
    origin_name varchar(255) NOT NULL,
    store_name  varchar(255) NOT NULL,
    delete_yn   tinyint(1)   NOT NULL,
    CONSTRAINT FK_product_TO_img_tb_1
        FOREIGN KEY (product_seq) REFERENCES product (product_seq)
);

CREATE TABLE `order`
(
    order_seq     int AUTO_INCREMENT                 NOT NULL
        PRIMARY KEY,
    customer_seq  int                                NOT NULL,
    product_seq   int                                NOT NULL,
    total_price   int      DEFAULT 0                 NOT NULL,
    register_date datetime DEFAULT CURRENT_TIMESTAMP NOT NULL,
    order_status  varchar(40)                        NOT NULL COMMENT '결제완료, 발송완료',
    CONSTRAINT FK_account_TO_order_1
        FOREIGN KEY (customer_seq) REFERENCES account (account_seq),
    CONSTRAINT FK_product_TO_order_1
        FOREIGN KEY (product_seq) REFERENCES product (product_seq)
);

CREATE TABLE stock
(
    stock_seq      int AUTO_INCREMENT NOT NULL
        PRIMARY KEY,
    stock_quantity int                NOT NULL,
    product_seq    int                NOT NULL,
    CONSTRAINT FK_product_TO_stock_1
        FOREIGN KEY (product_seq) REFERENCES product (product_seq)
);

CREATE TABLE warehouse_log
(
    warehouse_seq  int AUTO_INCREMENT
        PRIMARY KEY,
    product_seq    int                                NOT NULL,
    pro_quantity   int                                NOT NULL,
    status         varchar(10)                        NULL,
    warehouse_date datetime DEFAULT CURRENT_TIMESTAMP NOT NULL,
    CONSTRAINT FK_product_TO_warehouse_log_1
        FOREIGN KEY (product_seq) REFERENCES product (product_seq)
);

INSERT INTO samsamdb.product (product_seq, product_name, register_date, product_price, category_name)
VALUES (1, 'yoonji glasses', '2024-06-24 18:06:56', 340000, 'yoonji');
INSERT INTO samsamdb.product (product_seq, product_name, register_date, product_price, category_name)
VALUES (2, 'changyeon glasses', '2024-06-24 18:09:32', 600000, 'changyeon');
INSERT INTO samsamdb.product (product_seq, product_name, register_date, product_price, category_name)
VALUES (3, 'seungjae glasses', '2024-06-24 18:09:58', 1250000, 'seungjae');
INSERT INTO samsamdb.product (product_seq, product_name, register_date, product_price, category_name)
VALUES (4, 'jeonghun glasses', '2024-06-24 18:10:39', 280000, 'jeonghun');
INSERT INTO samsamdb.product (product_seq, product_name, register_date, product_price, category_name)
VALUES (5, 'yoonjung glasses', '2024-06-24 18:12:11', 150000, 'yoonjung');
INSERT INTO samsamdb.product (product_seq, product_name, register_date, product_price, category_name)
VALUES (6, 'hyunkyun glasses', '2024-06-24 18:12:41', 160000, 'hyunkyun');
INSERT INTO samsamdb.product (product_seq, product_name, register_date, product_price, category_name)
VALUES (7, 'love glasses', '2024-06-24 18:12:54', 360000, 'love');
INSERT INTO samsamdb.product (product_seq, product_name, register_date, product_price, category_name)
VALUES (8, 'ssg glasses', '2024-06-24 18:13:08', 160000, 'ssg');
INSERT INTO samsamdb.product (product_seq, product_name, register_date, product_price, category_name)
VALUES (9, 'ujin glasses', '2024-06-25 00:00:00', 560000, 'ujin');

INSERT INTO samsamdb.grade (grade_seq, grade_name, grade_discount, grade_money)
VALUES (1, 'Bronze', 0.05, 10000);
INSERT INTO samsamdb.grade (grade_seq, grade_name, grade_discount, grade_money)
VALUES (2, 'Silver', 0.1, 50000);
INSERT INTO samsamdb.grade (grade_seq, grade_name, grade_discount, grade_money)
VALUES (3, 'Gold', 0.15, 100000);

INSERT INTO samsamdb.stock (stock_seq, stock_quantity, product_seq)
VALUES (101, 17, 1);
INSERT INTO samsamdb.stock (stock_seq, stock_quantity, product_seq)
VALUES (102, 10, 2);
INSERT INTO samsamdb.stock (stock_seq, stock_quantity, product_seq)
VALUES (103, 10, 3);
INSERT INTO samsamdb.stock (stock_seq, stock_quantity, product_seq)
VALUES (104, 40, 4);
INSERT INTO samsamdb.stock (stock_seq, stock_quantity, product_seq)
VALUES (105, 40, 5);
INSERT INTO samsamdb.stock (stock_seq, stock_quantity, product_seq)
VALUES (106, 30, 6);
INSERT INTO samsamdb.stock (stock_seq, stock_quantity, product_seq)
VALUES (107, 30, 7);
INSERT INTO samsamdb.stock (stock_seq, stock_quantity, product_seq)
VALUES (108, 40, 8);

INSERT INTO samsamdb.warehouse_log (warehouse_seq, product_seq, pro_quantity, status, warehouse_date)
VALUES (201, 1, 40, '입고완료', '2024-06-25 16:24:33');
INSERT INTO samsamdb.warehouse_log (warehouse_seq, product_seq, pro_quantity, status, warehouse_date)
VALUES (202, 2, 30, '출고완료', '2024-06-25 16:25:00');
INSERT INTO samsamdb.warehouse_log (warehouse_seq, product_seq, pro_quantity, status, warehouse_date)
VALUES (203, 3, 30, '출고완료', '2024-06-25 16:25:16');
INSERT INTO samsamdb.warehouse_log (warehouse_seq, product_seq, pro_quantity, status, warehouse_date)
VALUES (204, 4, 20, '입고대기', '2024-06-25 16:33:01');
INSERT INTO samsamdb.warehouse_log (warehouse_seq, product_seq, pro_quantity, status, warehouse_date)
VALUES (205, 5, 20, '출고대기', '2024-06-25 16:33:14');
INSERT INTO samsamdb.warehouse_log (warehouse_seq, product_seq, pro_quantity, status, warehouse_date)
VALUES (206, 6, 30, '입고대기', '2024-06-25 16:33:40');
INSERT INTO samsamdb.warehouse_log (warehouse_seq, product_seq, pro_quantity, status, warehouse_date)
VALUES (207, 7, 10, '입고대기', '2024-06-25 16:34:08');
INSERT INTO samsamdb.warehouse_log (warehouse_seq, product_seq, pro_quantity, status, warehouse_date)
VALUES (208, 8, 30, '출고완료', '2024-06-25 16:34:20');

INSERT INTO samsamdb.account (account_seq, account_id, account_pwd, name, phone_number, mail_addr, account_addr,
                              company_name, business_num, accumulated_amount, subscribe_ads, account_role, grade_seq)
VALUES (1, 'shopadmin', 'password', '홍길동', '010-1234-5678', 'foo@samsam.com', '서울특별시 강남구', '삼삼안경점', '123-45-67890',
        NULL, NULL, '쇼핑몰관리자', NULL);
INSERT INTO samsamdb.account (account_seq, account_id, account_pwd, name, phone_number, mail_addr, account_addr,
                              company_name, business_num, accumulated_amount, subscribe_ads, account_role, grade_seq)
VALUES (2, 'storageadmin', 'password', '김철수', '010-2345-6789', 'bar@samsam.com', '경기도 고양시', '삼삼안경점', '234-56-78901',
        NULL, NULL, '창고관리자', NULL);
INSERT INTO samsamdb.account (account_seq, account_id, account_pwd, name, phone_number, mail_addr, account_addr,
                              company_name, business_num, accumulated_amount, subscribe_ads, account_role, grade_seq)
VALUES (3, 'user', 'password', '이영희', '010-3456-7890', 'baz@samsam.com', '인천광역시 남구', '비클리어', '345-67-89012', 25000, 1,
        '고객', 3);
INSERT INTO samsamdb.account (account_seq, account_id, account_pwd, name, phone_number, mail_addr, account_addr,
                              company_name, business_num, accumulated_amount, subscribe_ads, account_role, grade_seq)
VALUES (4, 'minsu', 'qwer123', '박민수', '010-4567-8901', 'qux@samsam.com', '대전광역시 서구', '루체안경원', '456-78-90123', 35000, 1,
        '고객', 2);
INSERT INTO samsamdb.account (account_seq, account_id, account_pwd, name, phone_number, mail_addr, account_addr,
                              company_name, business_num, accumulated_amount, subscribe_ads, account_role, grade_seq)
VALUES (5, 'youngmi', '1q2w3e', '최영미', '010-5678-9012', 'quux@samsam.com', '부산광역시 동구', '글라스에이트 안경원', '567-89-01234',
        45000, 0, '고객', 1);
INSERT INTO samsamdb.account (account_seq, account_id, account_pwd, name, phone_number, mail_addr, account_addr,
                              company_name, business_num, accumulated_amount, subscribe_ads, account_role, grade_seq)
VALUES (6, 'park23', 'rkdtns123', '박강순', '010-2415-9931', 'bio@samsam.com', '경기도 하남시', '플레인글라스', '912-12-3531', 50000,
        1, '고객', 1);
INSERT INTO samsamdb.account (account_seq, account_id, account_pwd, name, phone_number, mail_addr, account_addr,
                              company_name, business_num, accumulated_amount, subscribe_ads, account_role, grade_seq)
VALUES (7, 'hong23', 'dudghk23', '홍길자', '010-1111-2222', 'hong@samsam.com', '서울특별시 서대문구', '써니안경', '111-22-33333', 15000,
        1, '고객', 3);
INSERT INTO samsamdb.account (account_seq, account_id, account_pwd, name, phone_number, mail_addr, account_addr,
                              company_name, business_num, accumulated_amount, subscribe_ads, account_role, grade_seq)
VALUES (8, 'lee24', 'alsdk24', '이길동', '010-3333-4444', 'lee@samsam.com', '부산광역시 해운대구', '삼삼안경점', '444-55-66666', 20000,
        0, '고객', 2);
INSERT INTO samsamdb.account (account_seq, account_id, account_pwd, name, phone_number, mail_addr, account_addr,
                              company_name, business_num, accumulated_amount, subscribe_ads, account_role, grade_seq)
VALUES (9, 'choi25', 'chldl25', '최길동', '010-5555-6666', 'choi@samsam.com', '대구광역시 중구', '루체안경원', '777-88-99999', 30000,
        1, '고객', 1);
INSERT INTO samsamdb.account (account_seq, account_id, account_pwd, name, phone_number, mail_addr, account_addr,
                              company_name, business_num, accumulated_amount, subscribe_ads, account_role, grade_seq)
VALUES (10, 'park26', 'qweasdzxc', '박길동', '010-7777-8888', 'park@samsam.com', '광주광역시 서구', '비클리어', '000-11-22222', 40000,
        0, '고객', 3);
INSERT INTO samsamdb.account (account_seq, account_id, account_pwd, name, phone_number, mail_addr, account_addr,
                              company_name, business_num, accumulated_amount, subscribe_ads, account_role, grade_seq)
VALUES (11, 'yoon27', 'zxcasdqwe', '윤길동', '010-8888-9999', 'yoon@samsam.com', '대전광역시 중구', '플레인글라스', '333-44-55555',
        35000, 1, '고객', 2);
INSERT INTO samsamdb.account (account_seq, account_id, account_pwd, name, phone_number, mail_addr, account_addr,
                              company_name, business_num, accumulated_amount, subscribe_ads, account_role, grade_seq)
VALUES (12, 'kim28', 'asdqwe123', '김길동', '010-9999-0000', 'kim@samsam.com', '인천광역시 연수구', '삼삼안경점', '666-77-88888', 15000,
        0, '고객', 1);
INSERT INTO samsamdb.account (account_seq, account_id, account_pwd, name, phone_number, mail_addr, account_addr,
                              company_name, business_num, accumulated_amount, subscribe_ads, account_role, grade_seq)
VALUES (13, 'jung29', 'zxcvbnm123', '정길동', '010-0000-1111', 'jung@samsam.com', '서울특별시 강서구', '써니안경', '999-00-11111',
        10000, 1, '고객', 3);
INSERT INTO samsamdb.account (account_seq, account_id, account_pwd, name, phone_number, mail_addr, account_addr,
                              company_name, business_num, accumulated_amount, subscribe_ads, account_role, grade_seq)
VALUES (14, 'kang30', 'qwecvbnm', '강길동', '010-2222-3333', 'kang@samsam.com', '경기도 성남시', '비클리어', '222-33-44444', 25000,
        0, '고객', 2);
INSERT INTO samsamdb.account (account_seq, account_id, account_pwd, name, phone_number, mail_addr, account_addr,
                              company_name, business_num, accumulated_amount, subscribe_ads, account_role, grade_seq)
VALUES (15, 'han31', 'rtyu1234', '한길동', '010-4444-5555', 'han@samsam.com', '대전광역시 유성구', '루체안경원', '555-66-77777', 20000,
        1, '고객', 1);
INSERT INTO samsamdb.account (account_seq, account_id, account_pwd, name, phone_number, mail_addr, account_addr,
                              company_name, business_num, accumulated_amount, subscribe_ads, account_role, grade_seq)
VALUES (16, 'im32', 'bnm12345', '임길동', '010-6666-7777', 'im@samsam.com', '부산광역시 사상구', '삼삼안경점', '888-99-00000', 30000, 0,
        '고객', 3);
INSERT INTO samsamdb.account (account_seq, account_id, account_pwd, name, phone_number, mail_addr, account_addr,
                              company_name, business_num, accumulated_amount, subscribe_ads, account_role, grade_seq)
VALUES (17, 'noh33', 'plokm234', '노길동', '010-9999-8888', 'noh@samsam.com', '대구광역시 달서구', '플레인글라스', '112-23-44567', 45000,
        1, '고객', 2);
INSERT INTO samsamdb.account (account_seq, account_id, account_pwd, name, phone_number, mail_addr, account_addr,
                              company_name, business_num, accumulated_amount, subscribe_ads, account_role, grade_seq)
VALUES (18, 'bae34', 'werty234', '배길동', '010-7777-6666', 'bae@samsam.com', '서울특별시 강동구', '글라스에이트 안경원', '223-34-55678',
        50000, 0, '고객', 1);
INSERT INTO samsamdb.account (account_seq, account_id, account_pwd, name, phone_number, mail_addr, account_addr,
                              company_name, business_num, accumulated_amount, subscribe_ads, account_role, grade_seq)
VALUES (19, 'seo35', 'tyui2345', '서길동', '010-5555-4444', 'seo@samsam.com', '경기도 수원시', '비클리어', '334-45-66789', 55000, 1,
        '고객', 3);
INSERT INTO samsamdb.account (account_seq, account_id, account_pwd, name, phone_number, mail_addr, account_addr,
                              company_name, business_num, accumulated_amount, subscribe_ads, account_role, grade_seq)
VALUES (20, 'shin36', 'uiop3456', '신길동', '010-3333-2222', 'shin@samsam.com', '서울특별시 노원구', '루체안경원', '445-56-77890',
        60000, 0, '고객', 2);


INSERT INTO samsamdb.`order` (order_seq, customer_seq, product_seq, total_price, register_date, order_status)
VALUES (1, 4, 1, 340000, '2024-06-24 18:35:51', '결제완료');
INSERT INTO samsamdb.`order` (order_seq, customer_seq, product_seq, total_price, register_date, order_status)
VALUES (2, 5, 2, 600000, '2024-06-24 18:38:07', '결제완료');
INSERT INTO samsamdb.`order` (order_seq, customer_seq, product_seq, total_price, register_date, order_status)
VALUES (3, 5, 6, 160000, '2024-03-24 08:35:51', '발송완료');
INSERT INTO samsamdb.`order` (order_seq, customer_seq, product_seq, total_price, register_date, order_status)
VALUES (4, 4, 7, 360000, '2024-01-24 12:55:51', '발송완료');

INSERT INTO samsamdb.board (board_seq, board_title, board_content, board_secrete, board_date, customer_seq,
                            board_category, answer_content, answer_date, answer_status)
VALUES (5, 'Title 5', 'Content 5', 0, '2024-01-05 12:00:00', 1, 2, 'asd', '2024-06-26 17:29:00', 1);
INSERT INTO samsamdb.board (board_seq, board_title, board_content, board_secrete, board_date, customer_seq,
                            board_category, answer_content, answer_date, answer_status)
VALUES (6, 'Title 6', 'Content 6', 1, '2024-01-06 12:00:00', 1, 2, 'qwe', '2024-06-27 10:48:22', 1);
INSERT INTO samsamdb.board (board_seq, board_title, board_content, board_secrete, board_date, customer_seq,
                            board_category, answer_content, answer_date, answer_status)
VALUES (7, 'Title 7', 'Content 7', 0, '2024-01-07 12:00:00', 2, 2, NULL, NULL, 0);
INSERT INTO samsamdb.board (board_seq, board_title, board_content, board_secrete, board_date, customer_seq,
                            board_category, answer_content, answer_date, answer_status)
VALUES (8, 'Title 8', 'Content 8', 1, '2024-01-08 12:00:00', 2, 2, NULL, NULL, 0);
INSERT INTO samsamdb.board (board_seq, board_title, board_content, board_secrete, board_date, customer_seq,
                            board_category, answer_content, answer_date, answer_status)
VALUES (9, '신제품 교육 세미나 안내', '이번 주 금요일 오후 3시에 신제품 교육 세미나가 있습니다. 모든 직원은 참석해 주시기 바랍니다.', 0, '2024-01-09 12:00:00', 1, 1,
        NULL, NULL, 0);
INSERT INTO samsamdb.board (board_seq, board_title, board_content, board_secrete, board_date, customer_seq,
                            board_category, answer_content, answer_date, answer_status)
VALUES (11, '여름 휴가 일정 제출 요청', '각 부서별로 여름 휴가 일정을 이번 주말까지 제출해 주세요. 계획에 참고하겠습니다.', 0, '2024-01-11 12:00:00', 1, 1, NULL,
        NULL, 0);
INSERT INTO samsamdb.board (board_seq, board_title, board_content, board_secrete, board_date, customer_seq,
                            board_category, answer_content, answer_date, answer_status)
VALUES (12, '매장 리모델링 공사 일정', '다음 주부터 매장 리모델링 공사가 시작됩니다. 고객 안내와 내부 정리에 신경 써 주세요.
', 1, '2024-01-12 12:00:00', 2, 1, NULL, NULL, 0);
INSERT INTO samsamdb.board (board_seq, board_title, board_content, board_secrete, board_date, customer_seq,
                            board_category, answer_content, answer_date, answer_status)
VALUES (13, '정기 재고 조사 안내', '이번 달 말에 정기 재고 조사가 있습니다. 각 부서는 재고 정리를 철저히 해주시기 바랍니다.
', 0, '2024-01-13 12:00:00', 1, 1, NULL, NULL, 0);
INSERT INTO samsamdb.board (board_seq, board_title, board_content, board_secrete, board_date, customer_seq,
                            board_category, answer_content, answer_date, answer_status)
VALUES (14, '신입 직원 오리엔테이션 일정

', '신입 직원 오리엔테이션이 다음 주 월요일 오전 10시에 진행됩니다. 담당자는 준비 부탁드립니다.
', 1, '2024-01-14 12:00:00', 1, 1, NULL, NULL, 0);
INSERT INTO samsamdb.board (board_seq, board_title, board_content, board_secrete, board_date, customer_seq,
                            board_category, answer_content, answer_date, answer_status)
VALUES (15, '고객 불만 처리 절차 개선', '고객 불만 처리 절차가 개선되었습니다. 새로운 절차에 따라 신속히 대응해 주세요.
', 0, '2024-01-15 12:00:00', 2, 1, NULL, NULL, 0);
INSERT INTO samsamdb.board (board_seq, board_title, board_content, board_secrete, board_date, customer_seq,
                            board_category, answer_content, answer_date, answer_status)
VALUES (16, '안전 교육 실시 안내', '직원 안전 교육이 이번 주 수요일 오후 2시에 진행됩니다. 전 직원 참석 필수입니다.
', 1, '2024-01-16 12:00:00', 2, 1, NULL, NULL, 0);
INSERT INTO samsamdb.board (board_seq, board_title, board_content, board_secrete, board_date, customer_seq,
                            board_category, answer_content, answer_date, answer_status)
VALUES (17, '직원 할인 혜택 변경 안내', '직원 할인 혜택이 변경되었습니다. 새로운 혜택 내용을 확인하고 고객에게 안내해 주세요.
', 0, '2024-01-17 12:00:00', 1, 1, NULL, NULL, 0);
INSERT INTO samsamdb.board (board_seq, board_title, board_content, board_secrete, board_date, customer_seq,
                            board_category, answer_content, answer_date, answer_status)
VALUES (18, '업무 평가 회의 일정', '분기별 업무 평가 회의가 다음 주 금요일에 있습니다. 각 부서는 준비해 주시기 바랍니다.
', 1, '2024-01-18 12:00:00', 1, 1, NULL, NULL, 0);
INSERT INTO samsamdb.board (board_seq, board_title, board_content, board_secrete, board_date, customer_seq,
                            board_category, answer_content, answer_date, answer_status)
VALUES (19, '휴무일 변경 안내', '이번 달 휴무일이 변경되었습니다. 공지된 일정 확인 후 업무에 참고해 주세요.
', 0, '2024-01-19 12:00:00', 2, 1, NULL, NULL, 0);
INSERT INTO samsamdb.board (board_seq, board_title, board_content, board_secrete, board_date, customer_seq,
                            board_category, answer_content, answer_date, answer_status)
VALUES (20, '컴퓨터 시스템 점검 공지

', '내일 오전 9시부터 11시까지 컴퓨터 시스템 점검이 있습니다. 점검 시간 동안 업무 조정 부탁드립니다.
', 1, '2024-01-20 12:00:00', 1, 1, NULL, NULL, 0);
INSERT INTO samsamdb.board (board_seq, board_title, board_content, board_secrete, board_date, customer_seq,
                            board_category, answer_content, answer_date, answer_status)
VALUES (22, '청소 및 정리정돈 캠페인', '매장 청결을 위해 청소 및 정리정돈 캠페인을 진행합니다. 모두 적극 참여해 주세요.
', NULL, '2024-06-26 12:01:57', 1, 1, NULL, NULL, 0);
INSERT INTO samsamdb.board (board_seq, board_title, board_content, board_secrete, board_date, customer_seq,
                            board_category, answer_content, answer_date, answer_status)
VALUES (24, '월간 회의 일정 안내', '월간 회의가 매월 첫째 주 월요일 오전 9시에 열립니다. 모든 팀장은 참석해 주세요.
', NULL, '2024-06-26 12:11:36', 1, 1, NULL, NULL, 0);
INSERT INTO samsamdb.board (board_seq, board_title, board_content, board_secrete, board_date, customer_seq,
                            board_category, answer_content, answer_date, answer_status)
VALUES (25, '직원 건강 검진 안내', '직원 건강 검진이 이번 달 말에 있습니다. 건강 검진 일정표를 확인하고 참석해 주세요.
', NULL, '2024-06-26 15:55:11', 1, 1, NULL, NULL, 0);
INSERT INTO samsamdb.board (board_seq, board_title, board_content, board_secrete, board_date, customer_seq,
                            board_category, answer_content, answer_date, answer_status)
VALUES (26, '고객 서비스 개선 아이디어 공모

', '고객 서비스 개선을 위한 아이디어를 공모합니다. 많은 참여 부탁드립니다.
', NULL, '2024-06-26 15:55:45', 1, 1, NULL, NULL, 0);
INSERT INTO samsamdb.board (board_seq, board_title, board_content, board_secrete, board_date, customer_seq,
                            board_category, answer_content, answer_date, answer_status)
VALUES (27, '회사 워크숍 안내', '다음 달 회사 워크숍이 예정되어 있습니다. 세부 일정은 추후 공지하겠습니다.
', NULL, '2024-06-26 16:03:49', 1, 1, NULL, NULL, 0);
INSERT INTO samsamdb.board (board_seq, board_title, board_content, board_secrete, board_date, customer_seq,
                            board_category, answer_content, answer_date, answer_status)
VALUES (28, '주차 공간 이용 안내', '주차 공간이 제한되어 있으니, 가능한 대중교통을 이용해 주세요. 주차 규정을 준수해 주세요.
', NULL, '2024-06-26 16:07:41', 1, 1, NULL, NULL, 0);
INSERT INTO samsamdb.board (board_seq, board_title, board_content, board_secrete, board_date, customer_seq,
                            board_category, answer_content, answer_date, answer_status)
VALUES (29, '팀별 성과 발표회', '이번 주 금요일 오후 4시에 팀별 성과 발표회가 있습니다. 발표 자료 준비 부탁드립니다.
', NULL, '2024-06-26 16:07:49', 1, 1, NULL, NULL, 0);
INSERT INTO samsamdb.board (board_seq, board_title, board_content, board_secrete, board_date, customer_seq,
                            board_category, answer_content, answer_date, answer_status)
VALUES (30, '급여 지급 일정 변경', '이번 달 급여 지급 일정이 변경되었습니다. 급여 명세서를 확인해 주세요.
', NULL, '2024-06-26 16:11:01', 1, 1, NULL, NULL, 0);
INSERT INTO samsamdb.board (board_seq, board_title, board_content, board_secrete, board_date, customer_seq,
                            board_category, answer_content, answer_date, answer_status)
VALUES (31, 'Title 신규 프로모션 안내
', '새로운 프로모션이 시작됩니다. 관련 자료를 확인하고 고객에게 안내해 주세요.

', NULL, '2024-06-26 16:12:47', 1, 1, NULL, NULL, 0);

