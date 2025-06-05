
-------DBA_ 접두어
SELECT * FROM DBA_TABLES; -- SCOTT계정은 조회가 안되지만 SYSTEM계정은 권한을 가지고 있기 때문에 DBA_ 접두어로 조회가 가능하다.
-- 데이터베이스에 존재하는 모든 테이블이 출력되며 열 구성은 ALL_TABLES와 같다.

SELECT * FROM DBA_USERS WHERE USERNAME = 'SCOTT'; -- DBA_USERS를 사용하여 사용자정보 알아보기
--SCOTT사용자 정보가 출력된다.





