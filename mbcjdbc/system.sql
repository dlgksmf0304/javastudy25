create user jdbctest identified by jdbctest; -- 사용자계정 생성
grant resource, connect to jdbctest -- 접속권한과 일반 사용자 권한 제공

alter user jdbctest default tablespace users --테이블스테이스(db)는 users용으로 배졍
alter user jdbctest temporary tablespace temp -- 임시용 db는 temp용으로 배정