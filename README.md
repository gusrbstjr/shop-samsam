# shop-samsam
3조 삼삼한 안경 쇼핑몰


# 👓안경 쇼핑몰 창고 관리 프로그램👓

## 프로젝트 소개
* 개발기간 : 2024.06.25 - 2024.06.28 (4일)
* 안경을 자체제작하는 samsam이라는 안경 회사가 전국의 안경을 직접 판매하는 안경점 사장님들을 대상으로 안경을 판매하는관리자 관점의 재고관리 프로그램입니다.

*
##  🙍‍♂️팀원 구성
1. 서윤정 (yj0318)
2. 석현균 (gusrbstjr)
3. 이창연 (cylcoder)
4. 장윤지 (eliaaa)
5. 이정훈 (leejeonghun99)

##  개발 환경
* devtool : IntelliJ IDEA 2024.1.1 (Ultimate Edition)
* JAVA JDK: Temurin version '17.0.10'
* MySQL-connector-j : 8.0.33
* Mybatis : 3.5.6
* Build Tool : gradle
* Version Control : Git
* Communicate : Slack
* Collaboration Tool : Figma, Github, Notion

## 프로젝트 구조

````
📦samsam
 ┣ 📂gradle
 ┃ ┗ 📂wrapper
 ┃ ┃ ┣ 📜gradle-wrapper.jar
 ┃ ┃ ┗ 📜gradle-wrapper.properties
 ┣ 📂src
 ┃ ┣ 📂main
 ┃ ┃ ┣ 📂java
 ┃ ┃ ┃ ┗ 📂com
 ┃ ┃ ┃ ┃ ┗ 📂ohgiraffers
 ┃ ┃ ┃ ┃ ┃ ┗ 📂samsam
 ┃ ┃ ┃ ┃ ┃ ┃ ┣ 📂board
 ┃ ┃ ┃ ┃ ┃ ┃ ┃ ┣ 📂controller
 ┃ ┃ ┃ ┃ ┃ ┃ ┃ ┃ ┗ 📜QnAController.java
 ┃ ┃ ┃ ┃ ┃ ┃ ┃ ┣ 📂model
 ┃ ┃ ┃ ┃ ┃ ┃ ┃ ┃ ┣ 📂dao
 ┃ ┃ ┃ ┃ ┃ ┃ ┃ ┃ ┃ ┗ 📜QnAMapper.java
 ┃ ┃ ┃ ┃ ┃ ┃ ┃ ┃ ┣ 📂dto
 ┃ ┃ ┃ ┃ ┃ ┃ ┃ ┃ ┃ ┗ 📜BoardDTO.java
 ┃ ┃ ┃ ┃ ┃ ┃ ┃ ┃ ┗ 📂service
 ┃ ┃ ┃ ┃ ┃ ┃ ┃ ┃ ┃ ┣ 📜QnAService.java
 ┃ ┃ ┃ ┃ ┃ ┃ ┃ ┃ ┃ ┗ 📜QnAServiceImpl.java
 ┃ ┃ ┃ ┃ ┃ ┃ ┃ ┗ 📂notice
 ┃ ┃ ┃ ┃ ┃ ┃ ┃ ┃ ┣ 📜Board.java
 ┃ ┃ ┃ ┃ ┃ ┃ ┃ ┃ ┣ 📜NoticeController.java
 ┃ ┃ ┃ ┃ ┃ ┃ ┃ ┃ ┣ 📜NoticeMapper.java
 ┃ ┃ ┃ ┃ ┃ ┃ ┃ ┃ ┗ 📜NoticeService.java
 ┃ ┃ ┃ ┃ ┃ ┃ ┣ 📂common
 ┃ ┃ ┃ ┃ ┃ ┃ ┃ ┣ 📂exception
 ┃ ┃ ┃ ┃ ┃ ┃ ┃ ┃ ┣ 📜OrderException.java
 ┃ ┃ ┃ ┃ ┃ ┃ ┃ ┃ ┗ 📜WareHouseException.java
 ┃ ┃ ┃ ┃ ┃ ┃ ┃ ┣ 📂mybatis
 ┃ ┃ ┃ ┃ ┃ ┃ ┃ ┃ ┗ 📜MybatisConfiguration.java
 ┃ ┃ ┃ ┃ ┃ ┃ ┃ ┗ 📂paging
 ┃ ┃ ┃ ┃ ┃ ┃ ┃ ┃ ┗ 📜Pagenation.java
 ┃ ┃ ┃ ┃ ┃ ┃ ┣ 📂login
 ┃ ┃ ┃ ┃ ┃ ┃ ┃ ┣ 📂controller
 ┃ ┃ ┃ ┃ ┃ ┃ ┃ ┃ ┗ 📜loginController.java
 ┃ ┃ ┃ ┃ ┃ ┃ ┃ ┗ 📂model
 ┃ ┃ ┃ ┃ ┃ ┃ ┃ ┃ ┣ 📂dao
 ┃ ┃ ┃ ┃ ┃ ┃ ┃ ┃ ┃ ┗ 📜loginMapper.java
 ┃ ┃ ┃ ┃ ┃ ┃ ┃ ┃ ┣ 📂dto
 ┃ ┃ ┃ ┃ ┃ ┃ ┃ ┃ ┃ ┗ 📜accountDTO.java
 ┃ ┃ ┃ ┃ ┃ ┃ ┃ ┃ ┗ 📂service
 ┃ ┃ ┃ ┃ ┃ ┃ ┃ ┃ ┃ ┣ 📜loginService.java
 ┃ ┃ ┃ ┃ ┃ ┃ ┃ ┃ ┃ ┗ 📜loginServiceImpl.java
 ┃ ┃ ┃ ┃ ┃ ┃ ┣ 📂mail
 ┃ ┃ ┃ ┃ ┃ ┃ ┃ ┣ 📜MailConfig.java
 ┃ ┃ ┃ ┃ ┃ ┃ ┃ ┣ 📜MailController.java
 ┃ ┃ ┃ ┃ ┃ ┃ ┃ ┣ 📜MailMapper.java
 ┃ ┃ ┃ ┃ ┃ ┃ ┃ ┣ 📜MailRequest.java
 ┃ ┃ ┃ ┃ ┃ ┃ ┃ ┗ 📜MailService.java
 ┃ ┃ ┃ ┃ ┃ ┃ ┣ 📂main
 ┃ ┃ ┃ ┃ ┃ ┃ ┃ ┣ 📂controller
 ┃ ┃ ┃ ┃ ┃ ┃ ┃ ┃ ┗ 📜MainController.java
 ┃ ┃ ┃ ┃ ┃ ┃ ┃ ┗ 📂model
 ┃ ┃ ┃ ┃ ┃ ┃ ┃ ┃ ┣ 📂dao
 ┃ ┃ ┃ ┃ ┃ ┃ ┃ ┃ ┃ ┗ 📜SaleMapper.java
 ┃ ┃ ┃ ┃ ┃ ┃ ┃ ┃ ┣ 📂dto
 ┃ ┃ ┃ ┃ ┃ ┃ ┃ ┃ ┃ ┗ 📜SaleDTO.java
 ┃ ┃ ┃ ┃ ┃ ┃ ┃ ┃ ┗ 📂service
 ┃ ┃ ┃ ┃ ┃ ┃ ┃ ┃ ┃ ┣ 📜SaleImpl.java
 ┃ ┃ ┃ ┃ ┃ ┃ ┃ ┃ ┃ ┗ 📜SaleService.java
 ┃ ┃ ┃ ┃ ┃ ┃ ┣ 📂member
 ┃ ┃ ┃ ┃ ┃ ┃ ┃ ┣ 📜Member.java
 ┃ ┃ ┃ ┃ ┃ ┃ ┃ ┣ 📜MemberController.java
 ┃ ┃ ┃ ┃ ┃ ┃ ┃ ┣ 📜MemberMapper.java
 ┃ ┃ ┃ ┃ ┃ ┃ ┃ ┗ 📜MemberService.java
 ┃ ┃ ┃ ┃ ┃ ┃ ┣ 📂order
 ┃ ┃ ┃ ┃ ┃ ┃ ┃ ┣ 📂controller
 ┃ ┃ ┃ ┃ ┃ ┃ ┃ ┃ ┣ 📜OrderChangeController.java
 ┃ ┃ ┃ ┃ ┃ ┃ ┃ ┃ ┗ 📜OrderFindController.java
 ┃ ┃ ┃ ┃ ┃ ┃ ┃ ┗ 📂model
 ┃ ┃ ┃ ┃ ┃ ┃ ┃ ┃ ┣ 📂dao
 ┃ ┃ ┃ ┃ ┃ ┃ ┃ ┃ ┃ ┣ 📜OrderChangeMapper.java
 ┃ ┃ ┃ ┃ ┃ ┃ ┃ ┃ ┃ ┗ 📜OrderFindMapper.java
 ┃ ┃ ┃ ┃ ┃ ┃ ┃ ┃ ┣ 📂dto
 ┃ ┃ ┃ ┃ ┃ ┃ ┃ ┃ ┃ ┣ 📜OrderChangeDTO.java
 ┃ ┃ ┃ ┃ ┃ ┃ ┃ ┃ ┃ ┣ 📜OrderFindDTO.java
 ┃ ┃ ┃ ┃ ┃ ┃ ┃ ┃ ┃ ┗ 📜StockDTO.java
 ┃ ┃ ┃ ┃ ┃ ┃ ┃ ┃ ┗ 📂service
 ┃ ┃ ┃ ┃ ┃ ┃ ┃ ┃ ┃ ┣ 📜OrderChangeImpl.java
 ┃ ┃ ┃ ┃ ┃ ┃ ┃ ┃ ┃ ┣ 📜OrderChangeService.java
 ┃ ┃ ┃ ┃ ┃ ┃ ┃ ┃ ┃ ┣ 📜OrderFindService.java
 ┃ ┃ ┃ ┃ ┃ ┃ ┃ ┃ ┃ ┗ 📜OrderFindServiceImpl.java
 ┃ ┃ ┃ ┃ ┃ ┃ ┣ 📂shoppingmall
 ┃ ┃ ┃ ┃ ┃ ┃ ┃ ┣ 📂product
 ┃ ┃ ┃ ┃ ┃ ┃ ┃ ┃ ┣ 📂controller
 ┃ ┃ ┃ ┃ ┃ ┃ ┃ ┃ ┃ ┗ 📜ProductController.java
 ┃ ┃ ┃ ┃ ┃ ┃ ┃ ┃ ┗ 📂model
 ┃ ┃ ┃ ┃ ┃ ┃ ┃ ┃ ┃ ┣ 📂dao
 ┃ ┃ ┃ ┃ ┃ ┃ ┃ ┃ ┃ ┃ ┗ 📜ProductMapper.java
 ┃ ┃ ┃ ┃ ┃ ┃ ┃ ┃ ┃ ┣ 📂dto
 ┃ ┃ ┃ ┃ ┃ ┃ ┃ ┃ ┃ ┃ ┣ 📜ImageDTO.java
 ┃ ┃ ┃ ┃ ┃ ┃ ┃ ┃ ┃ ┃ ┗ 📜ProductDTO.java
 ┃ ┃ ┃ ┃ ┃ ┃ ┃ ┃ ┃ ┗ 📂service
 ┃ ┃ ┃ ┃ ┃ ┃ ┃ ┃ ┃ ┃ ┣ 📜ProductService.java
 ┃ ┃ ┃ ┃ ┃ ┃ ┃ ┃ ┃ ┃ ┗ 📜ProductServiceImpl.java
 ┃ ┃ ┃ ┃ ┃ ┃ ┃ ┗ 📂userinterface
 ┃ ┃ ┃ ┃ ┃ ┃ ┃ ┃ ┗ 📂purchase
 ┃ ┃ ┃ ┃ ┃ ┃ ┃ ┃ ┃ ┣ 📂controller
 ┃ ┃ ┃ ┃ ┃ ┃ ┃ ┃ ┃ ┃ ┗ 📜PurchaseController.java
 ┃ ┃ ┃ ┃ ┃ ┃ ┃ ┃ ┃ ┗ 📂model
 ┃ ┃ ┃ ┃ ┃ ┃ ┃ ┃ ┃ ┃ ┣ 📂dao
 ┃ ┃ ┃ ┃ ┃ ┃ ┃ ┃ ┃ ┃ ┃ ┗ 📜PurchaseMapper.java
 ┃ ┃ ┃ ┃ ┃ ┃ ┃ ┃ ┃ ┃ ┣ 📂service
 ┃ ┃ ┃ ┃ ┃ ┃ ┃ ┃ ┃ ┃ ┃ ┣ 📜PurchaseService.java
 ┃ ┃ ┃ ┃ ┃ ┃ ┃ ┃ ┃ ┃ ┃ ┗ 📜PurchaseServiceImpl.java
 ┃ ┃ ┃ ┃ ┃ ┃ ┃ ┃ ┃ ┃ ┗ 📜PurchaseDTO.java
 ┃ ┃ ┃ ┃ ┃ ┃ ┣ 📂warehouse
 ┃ ┃ ┃ ┃ ┃ ┃ ┃ ┣ 📂controller
 ┃ ┃ ┃ ┃ ┃ ┃ ┃ ┃ ┣ 📜StockController.java
 ┃ ┃ ┃ ┃ ┃ ┃ ┃ ┃ ┗ 📜WareHouseController.java
 ┃ ┃ ┃ ┃ ┃ ┃ ┃ ┗ 📂model
 ┃ ┃ ┃ ┃ ┃ ┃ ┃ ┃ ┣ 📂dao
 ┃ ┃ ┃ ┃ ┃ ┃ ┃ ┃ ┃ ┗ 📜WareHouseMapper.java
 ┃ ┃ ┃ ┃ ┃ ┃ ┃ ┃ ┣ 📂dto
 ┃ ┃ ┃ ┃ ┃ ┃ ┃ ┃ ┃ ┣ 📜logDTO.java
 ┃ ┃ ┃ ┃ ┃ ┃ ┃ ┃ ┃ ┣ 📜productDTO.java
 ┃ ┃ ┃ ┃ ┃ ┃ ┃ ┃ ┃ ┣ 📜WareHouseDTO.java
 ┃ ┃ ┃ ┃ ┃ ┃ ┃ ┃ ┃ ┗ 📜WareHouseLogDTO.java
 ┃ ┃ ┃ ┃ ┃ ┃ ┃ ┃ ┗ 📂service
 ┃ ┃ ┃ ┃ ┃ ┃ ┃ ┃ ┃ ┣ 📜WareHouseService.java
 ┃ ┃ ┃ ┃ ┃ ┃ ┃ ┃ ┃ ┗ 📜WareHouseServiceImpl.java
 ┃ ┃ ┃ ┃ ┃ ┃ ┗ 📜SamsamApplication.java
 ┃ ┃ ┗ 📂resources
 ┃ ┃ ┃ ┣ 📂mappers
 ┃ ┃ ┃ ┃ ┣ 📜loginMapper.xml
 ┃ ┃ ┃ ┃ ┣ 📜MailMapper.xml
 ┃ ┃ ┃ ┃ ┣ 📜MemberMapper.xml
 ┃ ┃ ┃ ┃ ┣ 📜NoticeMapper.xml
 ┃ ┃ ┃ ┃ ┣ 📜OrderChangeMapper.xml
 ┃ ┃ ┃ ┃ ┣ 📜OrderFindMapper.xml
 ┃ ┃ ┃ ┃ ┣ 📜ProductMapper.xml
 ┃ ┃ ┃ ┃ ┣ 📜purchaseMapper.xml
 ┃ ┃ ┃ ┃ ┣ 📜QnAMapper.xml
 ┃ ┃ ┃ ┃ ┣ 📜SaleMapper.xml
 ┃ ┃ ┃ ┃ ┣ 📜Stock2Mapper.xml
 ┃ ┃ ┃ ┃ ┣ 📜StockMapper.xml
 ┃ ┃ ┃ ┃ ┗ 📜WareHouseMapper.xml
 ┃ ┃ ┃ ┣ 📂static
 ┃ ┃ ┃ ┃ ┣ 📂bootstrap
 ┃ ┃ ┃ ┃ ┃ ┗ 📂assets
 ┃ ┃ ┃ ┃ ┃ ┃ ┣ 📂css
 ┃ ┃ ┃ ┃ ┃ ┃ ┃ ┗ 📜style.css
 ┃ ┃ ┃ ┣ 📂templates
 ┃ ┃ ┃ ┃ ┣ 📂board
 ┃ ┃ ┃ ┃ ┃ ┣ 📜detail.html
 ┃ ┃ ┃ ┃ ┃ ┣ 📜new.html
 ┃ ┃ ┃ ┃ ┃ ┣ 📜notice.html
 ┃ ┃ ┃ ┃ ┃ ┣ 📜QnA.html
 ┃ ┃ ┃ ┃ ┃ ┗ 📜update.html
 ┃ ┃ ┃ ┃ ┣ 📂login
 ┃ ┃ ┃ ┃ ┃ ┗ 📜login.html
 ┃ ┃ ┃ ┃ ┣ 📂main
 ┃ ┃ ┃ ┃ ┃ ┗ 📜main.html
 ┃ ┃ ┃ ┃ ┣ 📂member
 ┃ ┃ ┃ ┃ ┃ ┣ 📜mail-form.html
 ┃ ┃ ┃ ┃ ┃ ┣ 📜mail-sent.html
 ┃ ┃ ┃ ┃ ┃ ┗ 📜members.html
 ┃ ┃ ┃ ┃ ┣ 📂order
 ┃ ┃ ┃ ┃ ┃ ┣ 📜OrderChange.html
 ┃ ┃ ┃ ┃ ┃ ┣ 📜OrderChangeSelect.html
 ┃ ┃ ┃ ┃ ┃ ┣ 📜OrderChangeStatus.html
 ┃ ┃ ┃ ┃ ┃ ┗ 📜OrderFind.html
 ┃ ┃ ┃ ┃ ┣ 📂product
 ┃ ┃ ┃ ┃ ┃ ┣ 📜delete.html
 ┃ ┃ ┃ ┃ ┃ ┣ 📜product.html
 ┃ ┃ ┃ ┃ ┃ ┣ 📜productRegister.html
 ┃ ┃ ┃ ┃ ┃ ┗ 📜update.html
 ┃ ┃ ┃ ┃ ┣ 📂sale
 ┃ ┃ ┃ ┃ ┃ ┗ 📜sale.html
 ┃ ┃ ┃ ┃ ┣ 📂userinterface
 ┃ ┃ ┃ ┃ ┃ ┣ 📜contact.php
 ┃ ┃ ┃ ┃ ┃ ┣ 📜index.html
 ┃ ┃ ┃ ┃ ┃ ┣ 📜license.html
 ┃ ┃ ┃ ┃ ┃ ┗ 📜shop-single.html
 ┃ ┃ ┃ ┃ ┣ 📂warehouse
 ┃ ┃ ┃ ┃ ┃ ┣ 📜InAndOut.html
 ┃ ┃ ┃ ┃ ┃ ┣ 📜list.html
 ┃ ┃ ┃ ┃ ┃ ┗ 📜WareHouseLog.html
 ┃ ┃ ┃ ┃ ┗ 📜customer-main.html
 ┃ ┃ ┃ ┣ 📜application.yml
 ┃ ┃ ┃ ┣ 📜logback.xml
 ┃ ┃ ┃ ┗ 📜schema.sql
````

## 🧮데이터 베이스 구조
<img src="https://github.com/ssg-240304-java2/shop-samsam/assets/116702048/9bae956f-3a28-47a6-a5f4-35cfbc613787">

## 메뉴 구조도 
<img src="https://github.com/ssg-240304-java2/shop-samsam/assets/116702048/a8e63340-89eb-4da5-acc0-0c7e555e6230">

## 🖥주요 기능
# 관리자 기능

로그인 :사전에 등록된 계정을 통해 로그인 합니다. 
입고 : 입고 된 상품에 대해 관리자는 입고 완료 상태로 변경 할 수 있습니다.
출고 : 주문이 들어온 상품에 대해 제품 상태는 결제 완료가 확인한 후 , 출고 요청으로 변경되고 이후  출고를 완료하면 출고 완료로 상태 변경이 가능합니다.
상품등록: 기존에 있던 상품 외에 새로운 상품 등록이 가능합니다.
상품 삭제: 모두 배송 완료 혹은 주문이 없는 상품에 한해서 상품 삭제가 가능합니다.

상품 조회 : 현재 창고 내 물품 조회가 가능합니다. 

상품 정보 수정 : 상품 상세 정보를 변경가능합니다. (상품명, 등록 날짜, 상품 상세 설명, )
매출액 확인 : 제품 별 판매 수량과 매출액을 월 단위로 확인합니다.

회원 목록 조회 : 가입된 회원 목록을 볼 수 있습니다.
Q&A : 고객( 안경점 사장님들이) 관리자에게 문의하는 게시판이 있습니다. 

게시판 : 관리자들끼리 공유해야 할 내용에 대한 글 작성이 가능한 게시판이 있습니다.
메일 발송 : 회원 등급에 따라 광고, 쿠폰을 다르게 발송 가능하며 이 경우  SNS 홍보 수신 동의자에게만 광고 메일을 보낼 수 있습니다.

# 사용자(안경점 사장님들)기능

로그인 : 이미 생성된 계정을 통해 로그인 할 수 있습니다.
상품 주문 : 원하는 수량을 선택 후 상품을 주문 할 수 있습니다.

# 창고 기능

상품 요청 :  필요한 상품을 공장 관리자에게 주문할 수 있습니다. 
상품 출고 : 공장 관리자는 요청 수량 만큼 안경을 만든 안경을 쇼핑몰 관리자에게 출고 할 수 있습니다.


## 📋역할 분담

#### 서윤정
* 쇼핑몰 관리자
  1. 주문관리
  2. 매출조회
  


#### 석현균
* 창고 관리자
  1. 재고 조회
  2. 로그 조회

#### 이창연
* 쇼핑몰 관리자
  1. 고객 목록 조회
  2. 메일 전송
  3. 공지사항

#### 장윤지
* 쇼핑몰 관리자, 사용자(안경점 사장)
  1. 상품 조회, 등록, 삭제, 수정
  2. 원하는 상품 수량 선택 후 구매

#### 이정훈
* 창고 관리자, 쇼핑몰 관리자, 로그인
  1. 창고 입/출고
  2. 고객 QnA
  3. 로그인

## 📕 프로젝트 후기

#### 서윤정
* 이번 프로젝트를 통해 많은 것을 배울 수 있었습니다. 특히 팀원들과의 소통이 정말 중요하다는 것을 다시 한 번 깨달았습니다.
  처음 사용하는 Spring Boot와 Bootstrap이었지만, 팀원분들 덕분에 기능 구현을 할 수 있었습니다. 다음 프로젝트에서는 더 열심히 해야겠다고 다시 한 번 다짐하는 계기가 되었습니다.
 
#### 석현균
* 본사와 안경점 사장님 사이에 일어나는 제품 재고 관리를 도와주는 프로그램주제로 추가할 기능들을
자유롭게 토론하여 기능들을 정하였다. 생각 했던거와 달리 기능들을 구현하는게 어려웠고,
팀 프로젝트인 만큼 팀원들과 소통이 중요하다는걸 다시 알게 되었다. 진행 도중 어려운 부분에서 막혔을때
팀원에게 도움을 받아 진행을 하였고 팀원 덕분에 이번 프로젝트를 통해 나의 부족한 점을 자세히 알게 되었고
실력 또한 팀원들의 도움 덕분에 많이 향상 시킬 수 있는 경험이 되었다.
다음 프로젝트때는 나도 도움을 줄 수 있게 노력해야 겠다고 생각한다.
 
#### 이창연
* 프로젝트를 통해 많은 것을 배울 수 있었습니다. 특히, 팀원들과의 소통과 협력이 얼마나 중요한지를 깨닫게 되었습니다.
예상과는 다르게 기능 구현이 어려웠지만, 팀원들과의 토론과 지원 덕분에 극복할 수 있었습니다.
이 경험을 통해 부족한 점을 파악하고 개선할 수 있는 기회가 되었습니다.
다음 프로젝트에서도 팀에 보다 큰 기여를 할 수 있도록 노력하겠습니다.

#### 장윤지
* 데이터 구조도를 짜는 것의 중요성을 인지하지 못하고 있었는데 이번 프로젝트를 하면서 처음 데이터 구조도를 좀 더 세심히 해놓지 않았을때 생길 수 있는 문제점들에 무엇이 있는지 알게되었습니다.
  구조를 짜놓고 제가 구현해야하는 부분의 테이블 확인을 제대로 하지 않은 채 구현부터하고 부족한 부분을 채워넣으려고 하니 이미 제가 써야할 테이블의 데이터를 사용하고 계시던 분들의 구현기능에 문제들이 생기면서 의도치않은 피해를 끼치게 되었습니다. 데이터 구조도의 중요성을 인지하게 되었으니 다음 프로젝트때는 이점을 유의해서 문제를 발생시키지 않도록 해야겠다고 다짐하는 계기가 되었습니다.
#### 이정훈
* 프로젝트를 통해 이전에 콘솔 화면으로만 진행하던 프로젝트에서 웹화면을 구성하면서 많은 점을 배웠습니다.
또한 웹화면의 구성을 사전에 협의하여 분리하는 작업이 매우 중요하다는 사실을 알게되며 다음 프로젝트에 적용 가능할것 같습니다.
마지막으로 이번 프로젝트를 통해 팀원간 소통과 사전에 문서 작업에서 기능과 구성을 확실히 정해야 프로젝트의 진행이 원활하게
가능하다는 사실을 다시한번 느끼게 되었습니다.
