-- 데이터베이스 생성
CREATE DATABASE ssafy_sample DEFAULT CHARACTER SET utf8mb4;

-- 데이터베이스 사용
USE ssafy_sample;

-- 회원정보 테이블 생성
CREATE TABLE `memberTBL` (
    userNo INT AUTO_INCREMENT NOT NULL,
    userId VARCHAR(30) NOT NULL,
    userPwd VARCHAR(30) NOT NULL,
    userName VARCHAR(10) NOT NULL,
    userEmail VARCHAR(14) NOT NULL,
    address VARCHAR(100) NOT NULL,
    phoneNumber VARCHAR(15) NOT NULL,
    joinDate TIMESTAMP NOT NULL DEFAULT CURRENT_TIMESTAMP,
    PRIMARY KEY (userNo)
)  ENGINE=INNODB DEFAULT CHARSET=UTF8MB4;

-- 도서정보 테이블 생성
CREATE TABLE `bookTBL` (
    bookNo INT AUTO_INCREMENT NOT NULL,
    bookName VARCHAR(100) NOT NULL,
    price INT NOT NULL,
    publisher VARCHAR(30) NOT NULL,
    PRIMARY KEY (bookNo)
)  ENGINE=INNODB DEFAULT CHARSET=UTF8MB4;

-- 장바구니 테이블 생성
CREATE TABLE `pickTBL` (
    pickNo INT AUTO_INCREMENT NOT NULL,
    userNo INT NOT NULL,
    bookNo INT NOT NULL,
    PRIMARY KEY (pickNo),
    FOREIGN KEY (userNo)
        REFERENCES `memberTBL` (userNo),
    FOREIGN KEY (bookNo)
        REFERENCES `bookTBL` (bookNo)
)  ENGINE=INNODB DEFAULT CHARSET=UTF8MB4;

-- 주문정보 테이블 생성
CREATE TABLE `orderTBL` (
    orderNo INT AUTO_INCREMENT NOT NULL,
    userNo INT NOT NULL,
    bookNo INT NOT NULL,
    orderDate TIMESTAMP NOT NULL DEFAULT CURRENT_TIMESTAMP,
    PRIMARY KEY (orderNo),
    FOREIGN KEY (userNo)
        REFERENCES `memberTBL` (userNo),
    FOREIGN KEY (bookNo)
        REFERENCES `bookTBL` (bookNo)
)  ENGINE=INNODB DEFAULT CHARSET=UTF8MB4;

-- 도서 샘플 데이터 입력
INSERT INTO `bookTBL`
(bookNo, bookName, price, publisher)
VALUES (0, '오픈마켓 쇼핑몰 상세페이지 제작', 15750, '앤써북'),
(0, '기초부터 완성까지, 프런트엔드', 29700, '비제이퍼블릭'),
(0, '모든 기획자와 디자이너가 알아야 할 사람에 대한 100가지 사실', 22500, '위키북스'),
(0, '스토리텔링 우동이즘의 잘 팔리는 웹툰', 14400, '한빛미디어'),
(0, 'Do it! 자바스크립트 입문', 16200, '이지퍼블리싱'),
(0, 'Node.js로 서버 만들기', 24300, '로드북'),
(0, '네이버 블로그로 돈 벌기', 14400, '한빛미디어'),
(0, '맛있는 다지인 망고보드', 15300, '애드앤미디어'),
(0, '모바일 UX/UI 디자인 강의 with Adobe XD', 23400, '한빛미디어'),
(0, '쇼피파이로 글로벌 쇼핑몰 만들기', 23450, 'e비즈북스');

SELECT * FROM `memberTBL`;
SELECT * FROM `bookTBL`;
SELECT * FROM `pickTBL`;
SELECT * FROM `orderTBL`;