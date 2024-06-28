# shop-samsam
3조 삼삼한 안경 쇼핑몰


# 👓안경 쇼핑몰 창고 관리 프로그램👓

## 프로젝트 소개
* 개발기간 : 2024.06.25 - 2024.05.28 (4일)
* 본사와 안경점 사장님 사이에 일어나는 제품 재고 관리를 도와주는 프로그램

*
##  팀원 구성
1. 서윤정 (yj0318)
2. 석현균 (gusrbstjr)
3. 이창연 (cylcoder)
4. 장윤지 (eliaaa)
5. 이정훈 (leejeonghun99)

##  개발 환경


## 프로젝트 구조
📦samsam
 ┣ 📂gradle
 ┃ ┗ 📂wrapper
 ┃   ┣ 📜gradle-wrapper.jar
 ┃   ┗ 📜gradle-wrapper.properties
 ┣ 📂src
 ┃ ┣ 📂main
 ┃ ┃ ┣ 📂java
 ┃ ┃ ┃ ┗ 📂com
 ┃ ┃ ┃   ┗ 📂ohgiraffers
 ┃ ┃ ┃     ┗ 📂samsam
 ┃ ┃ ┃       ┣ 📂board
 ┃ ┃ ┃       ┃ ┣ 📂controller
 ┃ ┃ ┃       ┃ ┃ ┗ 📜QnAController.java
 ┃ ┃ ┃       ┃ ┣ 📂model
 ┃ ┃ ┃       ┃ ┃ ┣ 📂dao
 ┃ ┃ ┃       ┃ ┃ ┃ ┗ 📜QnAMapper.java
 ┃ ┃ ┃       ┃ ┃ ┣ 📂dto
 ┃ ┃ ┃       ┃ ┃ ┃ ┗ 📜BoardDTO.java
 ┃ ┃ ┃       ┃ ┃ ┗ 📂service
 ┃ ┃ ┃       ┃ ┃   ┣ 📜QnAService.java
 ┃ ┃ ┃       ┃ ┃   ┗ 📜QnAServiceImpl.java
 ┃ ┃ ┃       ┃ ┗ 📂notice
 ┃ ┃ ┃       ┃   ┣ 📜Board.java
 ┃ ┃ ┃       ┃   ┣ 📜NoticeController.java
 ┃ ┃ ┃       ┃   ┣ 📜NoticeMapper.java
 ┃ ┃ ┃       ┃   ┗ 📜NoticeService.java
 ┃ ┃ ┃       ┣ 📂common
 ┃ ┃ ┃       ┃ ┣ 📂exception
 ┃ ┃ ┃       ┃ ┃ ┣ 📜OrderException.java
 ┃ ┃ ┃       ┃ ┃ ┗ 📜WareHouseException.java
 ┃ ┃ ┃       ┃ ┣ 📂mybatis
 ┃ ┃ ┃       ┃ ┃ ┗ 📜MybatisConfiguration.java
 ┃ ┃ ┃       ┃ ┗ 📂paging
 ┃ ┃ ┃       ┃   ┗ 📜Pagenation.java
 ┃ ┃ ┃       ┣ 📂login
 ┃ ┃ ┃       ┃ ┣ 📂controller
 ┃ ┃ ┃       ┃ ┃ ┗ 📜loginController.java
 ┃ ┃ ┃       ┃ ┗ 📂model
 ┃ ┃ ┃       ┃   ┣ 📂dao
 ┃ ┃ ┃       ┃   ┃ ┗ 📜loginMapper.java
 ┃ ┃ ┃       ┃   ┣ 📂dto
 ┃ ┃ ┃       ┃   ┃ ┗ 📜accountDTO.java
 ┃ ┃ ┃       ┃   ┗ 📂service
 ┃ ┃ ┃       ┃     ┣ 📜loginService.java
 ┃ ┃ ┃       ┃     ┗ 📜loginServiceImpl.java
 ┃ ┃ ┃       ┣ 📂mail
 ┃ ┃ ┃       ┃ ┣ 📜MailConfig.java
 ┃ ┃ ┃       ┃ ┣ 📜MailController.java
 ┃ ┃ ┃       ┃ ┣ 📜MailMapper.java
 ┃ ┃ ┃       ┃ ┣ 📜MailRequest.java
 ┃ ┃ ┃       ┃ ┗ 📜MailService.java
 ┃ ┃ ┃       ┣ 📂main
 ┃ ┃ ┃       ┃ ┣ 📂controller
 ┃ ┃ ┃       ┃ ┃ ┗ 📜MainController.java
 ┃ ┃ ┃       ┃ ┗ 📂model
 ┃ ┃ ┃       ┃   ┣ 📂dao
 ┃ ┃ ┃       ┃   ┃ ┗ 📜SaleMapper.java
 ┃ ┃ ┃       ┃   ┣ 📂dto
 ┃ ┃ ┃       ┃   ┃ ┗ 📜SaleDTO.java
 ┃ ┃ ┃       ┃   ┗ 📂service
 ┃ ┃ ┃       ┃     ┣ 📜SaleImpl.java
 ┃ ┃ ┃       ┃     ┗ 📜SaleService.java
 ┃ ┃ ┃       ┣ 📂member
 ┃ ┃ ┃       ┃ ┣ 📜Member.java
 ┃ ┃ ┃       ┃ ┣ 📜MemberController.java
 ┃ ┃ ┃       ┃ ┣ 📜MemberMapper.java
 ┃ ┃ ┃       ┃ ┗ 📜MemberService.java
 ┃ ┃ ┃       ┣ 📂order
 ┃ ┃ ┃       ┃ ┣ 📂controller
 ┃ ┃ ┃       ┃ ┃ ┣ 📜OrderChangeController.java
 ┃ ┃ ┃       ┃ ┃ ┗ 📜OrderFindController.java
 ┃ ┃ ┃       ┃ ┗ 📂model
 ┃ ┃ ┃       ┃   ┣ 📂dao
 ┃ ┃ ┃       ┃   ┃ ┣ 📜OrderChangeMapper.java
 ┃ ┃ ┃       ┃   ┃ ┗ 📜OrderFindMapper.java
 ┃ ┃ ┃       ┃   ┣ 📂dto
 ┃ ┃ ┃       ┃   ┃ ┣ 📜OrderChangeDTO.java
 ┃ ┃ ┃       ┃   ┃ ┣ 📜OrderFindDTO.java
 ┃ ┃ ┃       ┃   ┃ ┗ 📜StockDTO.java
 ┃ ┃ ┃       ┃   ┗ 📂service
 ┃ ┃ ┃       ┃     ┣ 📜OrderChangeImpl.java
 ┃ ┃ ┃       ┃     ┣ 📜OrderChangeService.java
 ┃ ┃ ┃       ┃     ┣ 📜OrderFindService.java
 ┃ ┃ ┃       ┃     ┗ 📜OrderFindServiceImpl.java
 ┃ ┃ ┃       ┣ 📂shoppingmall
 ┃ ┃ ┃       ┃ ┣ 📂product
 ┃ ┃ ┃       ┃ ┃ ┣ 📂controller
 ┃ ┃ ┃       ┃ ┃ ┃ ┗ 📜ProductController.java
 ┃ ┃ ┃       ┃ ┃ ┗ 📂model
 ┃ ┃ ┃       ┃ ┃   ┣ 📂dao
 ┃ ┃ ┃       ┃ ┃   ┃ ┗ 📜ProductMapper.java
 ┃ ┃ ┃       ┃ ┃   ┣ 📂dto
 ┃ ┃ ┃       ┃ ┃   ┃ ┣ 📜ImageDTO.java
 ┃ ┃ ┃       ┃ ┃   ┃ ┗ 📜ProductDTO.java
 ┃ ┃ ┃       ┃ ┃   ┗ 📂service
 ┃ ┃ ┃       ┃ ┃     ┣ 📜ProductService.java
 ┃ ┃ ┃       ┃ ┃     ┗ 📜ProductServiceImpl.java
 ┃ ┃ ┃       ┃ ┗ 📂userinterface
 ┃ ┃ ┃       ┃   ┗ 📂purchase
 ┃ ┃ ┃       ┃     ┣ 📂controller
 ┃ ┃ ┃       ┃     ┃ ┗ 📜PurchaseController.java
 ┃ ┃ ┃       ┃     ┗ 📂model
 ┃ ┃ ┃       ┃       ┣ 📂dao
 ┃ ┃ ┃       ┃       ┃ ┗ 📜PurchaseMapper.java
 ┃ ┃ ┃       ┃       ┣ 📂service
 ┃ ┃ ┃       ┃       ┃ ┣ 📜PurchaseService.java
 ┃ ┃ ┃       ┃       ┃ ┗ 📜PurchaseServiceImpl.java
 ┃ ┃ ┃       ┃       ┗ 📜PurchaseDTO.java
 ┃ ┃ ┃       ┣ 📂warehouse
 ┃ ┃ ┃       ┃ ┣ 📂controller
 ┃ ┃ ┃       ┃ ┃ ┣ 📜StockController.java
 ┃ ┃ ┃       ┃ ┃ ┗ 📜WareHouseController.java
 ┃ ┃ ┃       ┃ ┗ 📂model
 ┃ ┃ ┃       ┃   ┣ 📂dao
 ┃ ┃ ┃

                       








## 📋역할 분담

#### 서윤정
* 쇼핑몰 관리자
  1. 
  2. 
  3. 


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
* 쇼핑몰 관리
  1. 
  2.

#### 이정훈
* 창고 관리자, 쇼핑몰 관리자, 로그인
  1. 
  2.
