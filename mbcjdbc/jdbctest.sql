-- 일반사용자 계정용 sql 쿼리 메모장
-- 블럭설정하고 alt + c로 실행



create table emp( -- 테이블 생성
num number(5) primary key, -- num필드 숫자 5개 타입, 기본키
name varchar2(16) not null, -- name필드 문자 16개 타입,nn
dept varchar2(16), -- dept필드 문자 16개 타입
score number(7,2) -- score 숫자 7개중 소수점 2개
);

create sequence emp_seq increment by 1 start with 1 nocache nocycle; -- 자동번호생성

drop sequence emp_seq; -- 자동번호 생성객체 삭제


insert into emp(num, name, dept, score) 
values(emp_seq.nextval, '이하늘', '카카오', 75.3)
insert into emp(num, name, dept, score) 
values(emp_seq.nextval, '배혜민', '넥슨', 85.3)
insert into emp(num, name, dept, score) 
values(emp_seq.nextval, '김샛별', '네이버', 95.3)
insert into emp(num, name, dept, score) 
values(emp_seq.nextval, '전민기', '스팀', 55.3)
insert into emp(num, name, dept, score) 
values(emp_seq.nextval, '김진우', '삼성', 65.3)
insert into emp(num, name, dept, score) 
values(emp_seq.nextval, '김보령', 'LG', 78.3) -- 더미데이터 6개 입력\



select * from emp; -- 입력결과 보기
