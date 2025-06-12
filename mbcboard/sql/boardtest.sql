-- 부모테이블생성 -> 자식테이블생성 -> 부모 더미데이터입력 -> 자식에서 외래키 설정 -> 자식 더미데이터입력


-- member테이블 (board의 부모) ----------------------------------------------------------
CREATE TABLE member(
mno number(5) not null,
bwriter nvarchar2(10) not null,
id nvarchar2(10) primary key,   -- board테이블의 bwriter와 fk로 관계설정 (타입일치)
pw nvarchar2(10) not null,
regidate date default sysdate not null
);

-- 시퀀스 객체는 이미 1개가 있으니 board_seq를 같이 사용

drop table member; -- member테이블 삭제용
delete from member; -- member테이블에 입력된 더미데이터만 삭제

-- 부모 데미데이터 (regidate는 자동으로 생성되게 만들었기 때문에 값을 지정하지 않아도 된다.)
insert into member(mno, bwriter, id, pw)
values(board_seq.nextval, '김기원', 'kkw', '123');
insert into member(mno, bwriter, id, pw)
values(board_seq.nextval, '이하늘', 'lhn', '123');
insert into member(mno, bwriter, id, pw)
values(board_seq.nextval, '배혜민', 'bhm', '123');
insert into member(mno, bwriter, id, pw)
values(board_seq.nextval, '김샛별', 'ksb', '123');
insert into member(mno, bwriter, id, pw)
values(board_seq.nextval, '전혜진', 'jhj', '123');

select * from member; -- 생성된 테이블 보기

-- board테이블 (member의 자식) -------------------------------------------------

drop table board; --기존에 board 테이블 삭제
drop sequence board_seq; -- 자동번호 생성 제거
delete from board; -- board에 입력된 더미데이터만 삭제

create table board(
bno number(5) primary key,
btitle nvarchar2(30) not null,
bcontent nvarchar2(1000) not null,
bwriter nvarchar2(10) not null,
bdate date not null
);

create sequence board_seq increment by 1 start with 1 nocycle nocache ; -- 자동번호생성 시퀀스
alter table board add constraint board_member_fk foreign key (bwriter) references member(id)-- 외래키설정


insert into BOARD (bno, btitle, bcontent, bwriter, bdate)
values (board_seq.nextval, '덥내용~', '무더운데 등교하시는냐고 고생 하셨습니다.', 'kkw', sysdate);
insert into BOARD (bno, btitle, bcontent, bwriter, bdate)
values (board_seq.nextval, '안녕하세요~', '무더운데 등교하시는냐고 고생 하셨습니다.', 'kkw', sysdate);
insert into BOARD (bno, btitle, bcontent, bwriter, bdate)
values (board_seq.nextval, '감사합니다.~', '무더운데 등교하시는냐고 고생 하셨습니다.', 'lhn', sysdate);
insert into BOARD (bno, btitle, bcontent, bwriter, bdate)
values (board_seq.nextval, '수고하셨내요~', '무더운데 등교하시는냐고 고생 하셨습니다.', 'jhj', sysdate);
insert into BOARD (bno, btitle, bcontent, bwriter, bdate)
values (board_seq.nextval, '화이팅하세요~', '무더운데 등교하시는냐고 고생 하셨습니다.', 'ksb', sysdate);
insert into BOARD (bno, btitle, bcontent, bwriter, bdate)
values (board_seq.nextval, '방갑습니다.~', '무더운데 등교하시는냐고 고생 하셨습니다.', 'bhm', sysdate);

select * from board; 

-------------------------------------------------------------------------------------------
--조인 : 2개 테이블을 연결하여 값을 본다.
select b.*, m.bwriter from member m inner join board b on m.id = b.bwriter where id='kkw'
-- id가 kkw로 된 모든 데이터를 본다.
