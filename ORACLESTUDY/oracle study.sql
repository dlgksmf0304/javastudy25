------------------------------(R) SELECT-----------------------------------------------
desc emp;   -- emp 테이블 구조보기
select * from emp; -- emp 테이블 내용보기

desc dept;  -- dept 테이블 구조보기
select * from dept; -- dept 테이블 내용보기

desc bonus; -- bonus 테이블 구조보기
select * from bonus; -- bonus 테이블 내용보기

desc salgrade; -- salgrade 테이블 구조보기
select * from salgrade; -- salgrade 테이블 내용보기

select empno, ename, deptno from emp;  -- 열을 쉼표로 구분하여 출력

select distinct deptno from emp; -- deptno열에서 중복되는 것은 하나만 남겨두고 제거해서 출력함
-- distinct가 중복데이터 삭제하는 것

select distinct job, deptno from emp; -- 여러개 열 중복제거하기
-- 결과에서 job와 deptno가 다른값도 있기때문에 중복이 아니라 여러값 출력함

select all job, deptno from emp; -- 중복 삭제 없이 그대로 출력
-- all을 치면 모든 값이 출력된다.

select ename, sal, sal*12+comm, comm from emp;
--sal에 12를 곱하고 comm을 더해서 출력값이 나오도록 한것

---------------------별칭 지정하는 방법---------------------------
--1
select ename, sal, sal*12+comm annsal, comm from emp;
-- 연산 및 가공된 문장 이후 한 칸 띄고 별칭지정

--2
select ename, sal, sal*12+comm "annsal", comm from emp;
-- 연산 및 가공된 문장 이후 한 칸 띄고 큰따옴표로 묶어서 지정(괄호안에 소문자를 쓰면 소문자로 별칭이 지정된다.)

--3
select ename, sal, sal*12+comm as annsal, comm from emp;
-- 연산 및 가공된 문장 이후 한 칸 띄고 "as"를 쓴 다음에 별칭 지정

--4
select ename, sal, sal*12+comm as "annsal", comm from emp;
-- "as"를 쓴 다음에 큰따옴표로 묶어서 지정(괄호안에 소문자를 쓰면 소문자로 별칭이 지정된다.)

------------------------- order by ------------------------------

select * from emp order by sal; -- sal을 오름차순 정렬하여 출력
--order by은 제일 마지막 줄에 써야한다.

select * from emp order by sal desc; -- sal을 내림차순으로 정렬하여 출력
--desc를 쓰면 내림차순으로 정렬해서 출력한다.

select * from emp order by deptno asc, sal desc; -- 오름차순 내림차순 같이 쓰기
-- deptno를 오름차수능로 나오게 하고  그 안에서 sal을 내림차순한다.

------------------------ where --------------------------------

select * from emp where deptno = 30; -- deptno번호가 30인 숫자만 출력
-- where은 필요한 데이판 출력하는것.

select * from emp where deptno = 30 and job = 'SALESMAN'; --AND를 사용하여 조건이 두개가 충족되는 값을 출력하기
-- deptno가 30이고 job가 SALESMAN인걸 출력한다.(비교하는 데이터가 문자열일때 ''을 붙여줘야한다.)

select * from emp where deptno = 30 or job = 'CLERK'; -- or을 사용하여 1개의 조건이 충족되는 값을 출력하기
-- deptno가 30, job가 CLERK인것중에 1개라도 해당되는것을 출력한다.

------------------------- 산술 연산자 --------------------------------------

select * from emp where sal * 12 = 36000; -- 곱셈산술 연산자
-- sal열에서 12를 곱한값이 36000인 행을 출력한다.

select * from emp where sal >= 3000; -- 숫자 대소비교 연산자
-- sal열에서 3000보다 크거가 같은 값을 출력한다.

select * from emp where ename >= 'F'; -- 문자 대소비교 연산자
-- ename열에서 첫글자가 F와 같거나 F뒤쪽 값을 출력한다.

select * from emp where ename <= 'FORZ'; -- 문자열 대소비교 연산자
-- ename열에서 FORZ문자열보다 알파벳 순서로 앞에 잇는 행을 출력

select * from emp where sal != 3000; -- !=등가비교 연산자
-- sal열에서 3000이 아닌 숫자를 출력한다.

select * from emp where sal <> 3000; -- <>등가비교 연산자
-- sal 열에서 3000이 아닌 숫자를 출력한다.

select * from emp where sal ^= 3000; -- ^=등가비교 연산자
-- sal 열에서 3000이 아닌 숫자를 출력한다.

select * from emp where not sal = 3000; -- 논리부정(not)연산자
-- sal 열에서 3000이 아닌 숫자를 출력한다.

select * from emp where job = 'MANAGER' OR job = 'SALESMAN' OR job = 'CLERK';
select * from emp where job in ('MANAGER', 'SALESMAN', 'CLERK'); -- in연산자
-- in연산자를 쓰면 위에줄보다 밑에줄처럼 간결하게 문장을 끝낼 수 있다.

select * from emp where job != 'MANAGER' AND JOB <> 'SALESMAN' AND JOB ^= 'CLERK';
SELECT * FROM EMP WHERE JOB NOT IN('MANAGER', 'SALESMAN', 'CLERK');
-- NOT연산자와 IN연산자 같이 쓰기

SELECT * FROM EMP WHERE SAL >= 2000 AND SAL <= 3000; -- 대소비교 연산자와 AND 연산자
-- SAL열에서 2000보다 같거나 크고 3000보다 같거나 작은 값을 출력한다.

SELECT * FROM EMP WHERE SAL BETWEEN 2000 AND 3000; -- BETWEEN A AND B 연산자
-- 대소비교 연산자와 AND연산자 처럼 2000보다 같거나 크고 3000보다 같거나 작은 값을 출력한다.

SELECT * FROM EMP WHERE SAL NOT BETWEEN 2000 AND 3000; -- NOT연산자와 BETWEEN A AND B연산자
-- NOT을 붙였기 때문에 2000과 3000사이 값이 아닌 그 이외의 값을 출력한다.

SELECT * FROM EMP WHERE ENAME LIKE 'S%'; -- LIKE연산자
-- LIKE 'S%'는 ENAME열에서 대문자 S로 시작하는것을 출력한다.

SELECT * FROM EMP WHERE ENAME LIKE '_L%'; -- LIKE연산자
-- _는 어떤값이든 상관없이 한개의 문자 데이터를 의미하기 때문에 ENAME열에서 두번쨰 글자가 L인것을 출력한다.

SELECT * FROM EMP WHERE ENAME LIKE '__L%';
-- 언더바를 2개 써서 3번째자리가 L인것을 출력한다.

SELECT * FROM EMP WHERE ENAME LIKE '%AM%';
-- LIKE '%AM%'은 ENAME열에서 AM글자가 포함된 데이터를 출력한다.

SELECT * FROM EMP WHERE ENAME NOT LIKE '%AM%';
-- LIKE 앞에 NOT가 붙었기 때문에 AM글자가 포함되지 않은 데이터를 출력한다.

SELECT * FROM EMP  WHERE COMM = NULL;
-- NULL은 산술연산자와 비교연산자로 비교해도 결과값이 NULL이기 때문에 아무것도 출력되지 않는다.

SELECT * FROM EMP WHERE COMM IS NULL; -- IS NULL 연산자
-- COMM열에서 NULL인 데이터만 출력한다.

SELECT * FROM EMP WHERE MGR IS NOT NULL; -- IS NULL 부정 연산자
-- NOT이 붙었기 때문에 MGR열에서 NULL값이 아닌 데이타들만 출력한다.

SELECT * FROM EMP WHERE SAL > NULL AND COMM IS NULL;

SELECT * FROM EMP WHERE SAL > NULL OR COMM IS NULL;

-----------------------집합연산자----------------------------

SELECT EMPNO, ENAME, SAL, DEPTNO FROM EMP WHERE DEPTNO = 10 UNION SELECT EMPNO, ENAME, SAL, DEPTNO FROM EMP WHERE DEPTNO = 20;
--두개의 SELECT문 사이에 사용된 UNION연산자가 집합연산자이다.(결과값을 연결할때 출력하려는 열 개수와 각 열의 자료형이 순서별로 일치해야 한다.)
--UNION연산자는 중복데이터를 제거하고 결과값을 출력한다.

SELECT EMPNO, ENAME, SAL, DEPTNO FROM EMP WHERE DEPTNO = 10 UNION ALL SELECT EMPNO, ENAME, SAL, DEPTNO FROM EMP WHERE DEPTNO = 10;
-- UNION ALL 연산자는 중복데이터도 모두 출력한다.

SELECT EMPNO, ENAME, SAL, DEPTNO FROM EMP MINUS SELECT EMPNO, ENAME, SAL, DEPTNO FROM EMP WHERE DEPTNO = 10;
-- MINUS 연산자는 먼저 작성한 SELECT문의 결과 값 중 다음 SELECT문에 존재하지 않는 데이터만 출력한다.

SELECT EMPNO, ENAME, SAL, DEPTNO FROM EMP INTERSECT SELECT EMPNO, ENAME, SAL, DEPTNO FROM EMP WHERE DEPTNO = 10;
-- INTERSECT 연산자는 먼저 작성한 SELECT문과 다음 SELECT문의 결과값이 같은데이터만 출력한다.

----------------------------------- 함수 ----------------------------------------------

SELECT ENAME, UPPER(ENAME), LOWER(ENAME), INITCAP(ENAME) FROM EMP; -- 대소문자를 바꿔주는 함수
-- UPPER은 괄호안에 데이터를 대문자로 변환하여 출력, LOWER는 괄호안 데이터를 소문자로 변환하여 출력, INITCAP는 괄호안 데이터를 첫글자는 대문자고 나머지는 소문자로 변환하여 출력

SELECT * FROM EMP WHERE UPPER(ENAME) = UPPER('scott');
-- ENAME열에서 대소문자 상관없는 SCOTT인 데이터 찾아 출력

SELECT * FROM EMP WHERE UPPER(ENAME) LIKE UPPER('%scott%');
-- ENAME열에서 SCOTT가 포함된 데이터를 찾아 줄력

SELECT ENAME, LENGTH(ENAME) FROM EMP; -- LENGTH는 문자열 길이 구하는 함수
-- ENAME열이 몇글자인지 출력한다.

SELECT ENAME, LENGTH(ENAME) FROM EMP WHERE LENGTH(ENAME) >= 5;
-- ENAME열에서 5글자거나 그 이상인 데이터만 출력력하고 옆에 몇글자인지 출력한다.

SELECT JOB, SUBSTR(JOB, 1, 2), SUBSTR(JOB, 3, 2), SUBSTR(JOB, 5) FROM EMP; -- SUBSTR은 문자열 일부를 출력하는 함수
-- (JOB, 1, 2)는 첫번째 글자부터 2글자를 출력,(JOB 3, 2)는 3번째 글자부터 2글자를 출력, (JOB, 5)는 5번째 글자부터 마지막 글자까지 출력

SELECT * FROM EMP WHERE INSTR(ENAME, 'S') > 0; -- INSTR은 문자열 데이터 안에서 특정 문자위치를 찾는 함수
SELECT * FROM EMP WHERE ENAME LIKE '%S%'; -- ENAME열에서 S가 포함된 데이터를 찾아 출력

--REPLACE는 특정문자를 다른문자로 바꾸는 함수
SELECT '010-1234-5678' AS REPLACE_BEFORE, REPLACE('010-1234-5678', '-', ' ') AS REPLACE_1, REPLACE('010-1234-5678', '-') AS REPLACE_2 FROM DUAL;
-- REPLACE(문자열데이터 또는 열 이름 , 찾는문자, 대체할문자) 순으로 쓰면 된다.

--LPAD, RPAD는 데이터의 빈 공간을 특정 문자로 채우는 함수
SELECT 'Oracle', LPAD('Oracle', 10, '#') AS LPAD_1, RPAD('Oracle', 10, '*') AS RPAD_1, LPAD('Oracle', 10) AS LPAD_2, RPAD('Oracle', 10) AS RPAD_2 FROM DUAL;
--LPAD(문자열데이터 또는 열이름 , 데이터자릿수, 빈공간에 채울문자) 순으로 쓰면 된다.
--RPAD(문자열데이터 또는 열이름, 데이터자릿수, 빈공간에 채울문자)순으로 쓰면 된다.

SELECT RPAK('030304-', 14, '*') AS RPAD_JMNO, RPAD('010-1234-', 13, '*') AS RPAD_PHONE FROM DUAL;
-- RPAD함수로 개인정보 뒷자리를 *처리하여 출력

-- CONCAT는 두 문자열 데이터를 합치는 함수이다.
SELECT CONCAT(EMPNO, ENAME), CONCAT(EMPNO, CONCAT(' : ', ENAME)) FROM EMP WHERE ENAME = 'SCOTT';
------------------------------------ 그룹화 -----------------------------------------------------------------------------

SELECT SUM(SAL) FROM EMOP; -- SUM은 열 값을 모두 합하여 출력한다.
--SAL열을 모두 한한 결과값이 하나의 행으로 출력

SELECT COUNT(*) FROM EMP; -- COUNT 함수는 데이터 개수를 구해주는 함수
--행이 총 몇개인지 출력한다.

SELECT COUNT(*) FROM EMP WHERE DEPTNO = 30;
-- DEPTNO열에서 30인 행이 총 몇개인지 출력한다.

SELECT MAX(SAL) FROM EMP WHERE DEPTNO = 10; -- MAX는 최대값을 출력하는 함수
-- DEPTNO열에서 10인 데이이터중에 SAL값이 가장 높은 값을 출력

SELECT MIN(SAL) FROM EMP WHERE DEPTNO = 10; -- MIN은 최소값을 출력하는 함수
-- DEPTNO열에서 10인 데이터중에 SAL값이 가장 작은 값을 출력

SELECT AVG(SAL) FROM EMP WHERE DEPTNO = 30; -- AVG는 평균값을 구하는 함수
-- DEPTNO열에서 30인 데이터의 SAL의 평균값을 계산해서 출력

SELECT AVG(SAL), DEPTNO FROM EMP GROUP BY DEPTNO; -- GROUP BY는 결과값을 원하는 열로 묶어 출력하는 함수
-- DEPTNO열에서 각각의 SAL읜 평균값을 출력

--HAVING는 GROUP BY절에서 조건을 줄때 사용하는 함수이다.
SELECT DEPTNO, JOB, AVG(SAL) FROM EMP GROUP BY DEPTNO, JOB HAVING AVG(SAL) >= 2000 ORDER BY DEPTNO, JOB;
-- AVG가 2000이랑 같거나 더 높은 값만 출력한다.

SELECT DEPTNO, JOB, COUNT(*), MAX(SAL), SUM(SAL), AVG(SAL) FROM EMP GROUP BY ROLLUP(DEPTNO, JOB);
-- ROLLUP는 GROUP BY절에 지정할 수 있는 특수 함수이다.(그룹화 데이터의 합계를 출력할때 유용하게 사용할 수 있다.)

SELECT DEPTNO, JOB, COUNT(*), MAX(SAL), SUM(SAL), AVG(SAL) FROM EMP GROUP BY CUBE(DEPTNO, JOB) ORDER BY DEPTNO, JOB;
--CUBE는 ROLLUP를 사용했을때보다 좀더 많은 결과값이 나온다.

--LISTAGG는 그룹에 속해있는 데이터를 가로로 나열하는 함수이다.
SELECT DEPTNO, LISTAGG(ENAME, ', ') WITHIN GROUP(ORDER BY SAL DESC) AS ENAMES FROM EMP GROUP BY DEPTNO;
--DEPTNO열에 각 데이터들에서  ENAME 데이터가 가로로 출력된다.

--PIVOT는 기존테이블 행을 열로 바꾸는 함수이다.
SELECT * FROM(SELECT DEPTNO, JOB, SAL FROM EMP) PIVOT(MAX(SAL) FOR DEPTNO IN (10, 20, 30)) ORDER BY JOB;

---------------------------------- 조인 --------------------------------------------------------------------------
-- 조인은 두개 이상의 테이블을 연결하여 하나의 테이블처럼 출력할때 사용하는 방식

SELECT * FROM EMP, DEPT WHERE EMP.DEPTNO = DEPT.DEPTNO ORDER BY EMPNO;--열이름을 비교하는 조건식으로 조인하기
-- 두 테이블의 DEPTNO열 값이 같은 14개 행만 출력


-----------------등가조인(테이블을 연결한 후에 출력 행을 각 테이블의 특정열에 일치한 데이터를 기준으로 선정하는 방식)
SELECT E.EMPNO, E.ENAME, D.DEPTNO, D.DNAME, D.LOC FROM EMP E, DEPT D WHERE E.DEPTNO = D.DEPTNO ORDER BY D.DEPTNO, E.EMPNO;
-- 열 이름에 각각의 테이블 이름도 함께 명시

SELECT E.EMPNO, E.ENAME, D.DEPTNO, E.SAL, D.DNAME, D.LOC FROM EMP E, DEPT D WHERE E.DEPTNO = D.DEPTNO AND SAL >= 3000;
-- SAL이 3000이거나 더 큰 값만 출력

----------------비등가조인(등가조인 방식 외의 방식)
SELECT * FROM EMP E, SALGRADE S WHERE E.SAL BETWEEN S.LOSAL AND S.HISAL;
--급여 범위를 지정하는 조건식으로 조인

----------------자체조인
SELECT E1.EMPNO, E1.ENAME, E1.MGR, E2.EMPNO AS MGR_EMPNO, E2.ENAME AS MGR_ENAME FROM EMP E1, EMP E2 WHERE E1.MGR = E2.EMPNO;
--같은 테이블을 두번 사용하여 자체 조인

----------------외부조인
-- 왼쪽 외부조인
SELECT E1.EMPNO, E1.ENAME, E1.MGR, E2.EMPNO AS MGR_EMPNO, E2.ENAME AS MGR_ENAME FROM EMP E1, EMP E2 WHERE E1.MGR = E2.EMPNO(+) ORDER BY E1.EMPNO;
-- 오른쪽 외부조인
SELECT E1.EMPNO, E1.ENAME, E1.MGR, E2.EMPNO AS MGR_EMPNO, E2.ENAME AS MGR_ENAME FROM EMP E1, EMP E2 WHERE E1.MGR(+) = E2.EMPNO ORDER BY E1.EMPNO;
-- +위치가 다름

--------NATURAL JOIN(등가조인을 대신해 사용 할 수 있는 조인 방식으로 조인 대상이 되는 두 테이블에 이름과 자료형이 같은 열을 찾은 후 그 열을 기준으로 등가조인을 해주는 방식
SELECT E.EMPNO, E.ENAME, E.JOB, E.MGR, E.HIREDATE, E.SAL, E.COMM, DEPTNO, D.DNAME, D.LOC FROM EMP E NATURAL JOIN DEPT D ORDER BY DEPTNO, E.EMPNO;
--EMP테이블과 DEPT테이블은 공통 열 DEPTNO를 가지고 있으므로 NATURAL JOIN을 사용할 때 자동으로 DEPTNO열을 기준으로 등가조인된다.

-------JOIN ~ USING(키워드를 사용한 조인 역시 기존 등가 조인을 대신하는 조인 방식)
--FROM TABLE1 JOIN TABLE2 USING(조인에 사용한 기준열)
SELECT E.EMPNO, E.ENAME, E.JOB, E.MGR, E.HIREDATE, E.SAL, E.COMM, DEPTNO, D.DNAME, D.LOC FROM EMP E JOIN DEPT D USING (DEPTNO) WHERE SAL >= 3000 ORDER BY DEPTNO, E.EMPNO;

-------JOIN ~ ON(키워드를 사용한 조인 방식에서는 기존 WHERE절에 있는 조인 조건식을 ON키워드 옆에 작성합니다. 조인기준 조건식은 ON에 명시하고 그 밖의 출력행을 걸러내기 위해 WHERE조건식을 따로 사용하는 방식)
--FROM TABLE1 JOIN TABLE2 ON (조인조건식) -> 이렇게 쓰면 됌
SELECT E.EMPNO, E.ENAME, E.JOB, E.MGR, E.HIREDATE, E.SAL, E.COMM, E.DEPTNO, E.DEPTNO, D.DNAME, D.LOC FROM EMP E JOIN DEPT D ON (E.DEPTNO = D.DEPTNO) WHERE SAL <= 3000 ORDER BY E.DEPTNO, EMPNO;

-------OUTER JOIN(키워드는 외부조인에 사용. 다른 SQL-99방식의 조인과 마찬가지로 WHERE절이 아닌 FROM절에서 외부 조인을 선언합니다.)
-- 왼쪽 외부조인을 SQL-99로 작성
SELECT E1.EMPNO, E1.ENAME, E1.MGR, E2.EMPNO AS MGR_EMPNO, E2.ENAME AS MGR_ENAME FROM EMP E1 LEFT OUTER JOIN EMP E2 ON (E1.MGR = E2.EMPNO) ORDER BY E1.EMPNO;
-- 오른쪽 외부조인을 SQL-99로 작성
SELECT E1.EMPNO, E1.ENAME, E1.MGR, E2.EMPNO AS MGR_EMPNO, E2.ENAME AS MGR_ENAME FROM EMP E1 RIGHT OUTER JOIN EMP E2 ON (E1.MGR = E2.EMPNO) ORDER BY E1.EMPNO, MGR_EMPNO;
-- 전체외부조인을 SQL-99로 작성
SELECT E1.EMPNO, E1.ENAME, E1.MGR, E2.EMPNO AS MGR_EMPNO, E2.ENAME AS MGR_ENAME FROM EMP E1 FULL OUTER JOIN EMP E2 ON (E1.MGR = E2.EMPNO) ORDER BY E1.EMPNO;

---------------------------------- 서브쿼리 ------------------------------------------------------
-- 서브쿼리란 SQL문을 실행하는데 필요한 데이터를 추가로 조회하기 위해 SQL문 내부에 사용하는 SELECT문을 의미한다.(서브쿼리의 결과값을 사용하여 기능을 수행하는 영역은 메인쿼리라고 부른다.)
SELECT * FROM EMP WHERE SAL > (SELECT SAL FROM EMP WHERE ENAME = 'JONES'); -- 서브쿼리를 사용하여 ENAME열에 JONES보다 SAL 값이 높은 데이터를 출력

----------단일행 서브쿼리(서브쿼리의 결과값이 날짜형인 경우)
SELECT * FROM EMP WHERE HIREDATE < (SELECT HIREDATE FROM EMP WHERE ENAME = 'SCOTT'); -- ENAME열에서 SCOTT보다 날짜가 빠른 데이터만 출력

----------단일행 서브쿼리(서브쿼리 안에서 함수를 사용한 경우)
SELECT E.EMPNO, E.ENAME, E.JOB, E.SAL, D.DEPTNO, D.DNAME, D.LOC FROM EMP E, DEPT D WHERE E.DEPTNO = D.DEPTNO AND E.DEPTNO = 20 AND E.SAL > (SELECT AVG(SAL)FROM EMP);
-- DEPTNO열에서 20의 값을 가지고 있는 데이터중에 SAL값이 평균보다 높은 데이터만 출력

--------- 다중행 서브쿼리 (IN 연산자)
SELECT * FROM EMP WHERE DEPTNO IN (20,30); 
-- DEPTNO열에서 데이터 값이 20이거나 30인 데이터만 출력

SELECT * FROM EMP WHERE SAL IN (SELECT MAX(SAL) FROM EMP GROUP BY DEPTNO);
-- DEPTNO열에서 각 데이터 값중에 SAL값이 제일 큰 값들만 출력

-------- 다중행 서브쿼리 (ANY, SOME 연산자)
SELECT * FROM EMP WHERE SAL = ANY (SELECT MAX(SAL)FROM EMP GROUP BY DEPTNO);
SELECT * FROM EMP WHERE SAL = SOME (SELECT MAX(SAL)FROM EMP GROUP BY DEPTNO);
-- 등가(=)비교 연산자가 아닌 대소 비교 연산자이다.

SELECT * FROM EMP WHERE SAL < ALL (SELECT SAL FROM EMP WHERE DEPTNO = 30) ORDER BY SAL, EMPNO;
-- DEPTNO열에서 30 데이터 값중에 SAL의 최대값보다 적은 값을 가지고있는 데이터들만 출력

SELECT * FROM EMP WHERE SAL > ALL (SELECT SAL FROM EMP WHERE DEPTNO = 30) ORDER BY SAL, EMPNO;
-- DEPTNO열에서 30 데이터 값중에 SAL의 최대값보다 많은 값을 가지고있는 데이터들만 출력

SELECT * FROM EMP WHERE EXISTS(SELECT DNAME FROM DEPT WHERE DEPTNO = 10); --EXISTS연산자는 서브쿼리에 결과값이 하나 이상 존재하면 조건식이 모두 TRUE, 존재하지 않으면 FALSE가 되는 연산자이다.
-- 서브쿼리 결과 값이 존재하는 경우 출력

SELECT * FROM EMP WHERE EXISTS(SELECT DNAME FROM DEPT WHERE DEPTNO = 50);
-- 서브쿼리 결과 값이 존재하지 않는 경우 출력되지 않는다.

-------다중열 서브쿼리(복수열 서브쿼리)
SELECT * FROM EMP WHERE(DEPTNO, SAL) IN(SELECT DEPTNO, MAX(SAL) FROM EMP GROUP BY DEPTNO); --메인쿼리에 비교할 열을 괄호루 묶어 명시하고 서브쿼리에서는 괄호로 묶은 데이터와 같은 자료형 데이터를 SELECT절에 명시하여 사용 할 수 있다.

-------FROM절에 사용하는 서브쿼리와 WITH절(FROM절에 사용하는 서브쿼리는 인라인뷰라고도 부른다. 특정테이블 전체 데이터가 아닌 SELECT문을 통해 일부 데이털르 먼저 추출해온 후 별칭을 준다.)
SELECT E10.EMPNO, E10.ENAME, E10.DEPTNO, D.DNAME, D.LOC FROM (SELECT * FROM EMP WHERE DEPTNO = 10) E10, (SELECT * FROM DEPT) D WHERE E10.DEPTNO = D.DEPTNO; -- 인라인뷰 사용

WITH E10 AS(SELECT * FROM EMP WHERE DEPTNO = 10), D AS(SELECT * FROM DEPT) SELECT E10.EMPNO, E10.ENAME, E10.DEPTNO, D.DNAME, D.LOC FROM E10, D WHERE E10.DEPTNO = D.DEPTNO; --WHTH절 사용

--------SELECT절에 사용하는 서브쿼리(스칼라 서브쿼리라고 부른다. SELECT절에 하나의 열 영역으로서 결과를 출력할 수 있다.
SELECT EMPNO, ENAME, JOB, SAL,(SELECT GRADE FROM SALGRADE WHERE E.SAL BETWEEN LOSAL AND HISAL) AS SALGRADE, DEPTNO,(SELECT DNAME FROM DEPT WHERE E.DEPTNO = DEPT.DEPTNO) AS DNAME FROM EMP E;
-- SELECT절에 명시하는 서브쿼리는 반드시 하나의 결과만 반환하도록 작성해야한다.

-----------------------------------(R) SELECT 끝 -------------------------------------------------------------------
----------------------------------(C) INSERT----------------------------------------------------------------------------------------

CREATE TABLE DEPT_TEMP AS SELECT * FROM DEPT; -- 새로운 테이블 만들기
-- 이미 존재하고있는 DEPT테이블을 복사해서 DEPT_TEMP라는 곳에 새로 만든다.

--------------데이터 추가
INSERT INTO DEPT_TEMP (DEPTNO, DNAME, LOC) VALUES(50, 'DATABASE', 'SEOUL'); -- INSERT는 테이블에 데이터를 추가하는 것
SELECT * FROM DEPT_TEMP;
-- INSETR문을 먼저 실행하고 SELECT문을  따로 실행해야 함
-- DEPTNO필드에 50 값이 들어가고 DNAME에는 DATABASE필드에 들어가고 LOC필드에 SEOUL값이 들어간다.(필드와 값 갯수가 일치하지 않으면 오류가 발생함)

INSERT INTO DEPT_TEMP VALUES(60, 'NETWORK', 'BUSAN');
SELECT * FROM DEPT_TEMP;
-- 열 지정없이 데이터 추가

INSERT INTO DEPT_TEMP (DEPTNO, DNAME, LOC) VALUES(70, 'WEB', NULL);
SELECT * FROM DEPT_TEMP;
-- NULL 데이터를 지정하여 입력

INSERT INTO DEPT_TEMP (DEPTNO, DNAME, LOC) VALUES(80, 'MOBILE', '');
SELECT * FROM DEPT_TEMP;
-- NULL 데이터를 빈 공백 문자열로 입력하여 지정

INSERT INTO DEPT_TEMP (DEPTNO, LOC) VALUES(90, 'INCHEON');
SELECT * FROM DEPT_TEMP;
-- 확정되지 않은 DEPTNO열에 90번 행은 DNAME이 확정되지 않았는데 열을 쓰지 않으면 자동으로 DNAME이 NULL처리가 된다.

----------------날짜 데이터 입력
CREATE TABLE EMP_TEMP AS SELECT * FROM EMP WHERE 1<>1; --새로운테이블 만들기
SELECT * FROM EMP_TEMP;

INSERT INTO EMP_TEMP (EMPNO, ENAME, JOB, MGR, HIREDATE, SAL, COMM, DEPTNO) VALUES(9999, '홍길동', 'PRESIDENT', NULL, '2001/01/01', 5000, 1000, 10);
SELECT * FROM EMP_TEMP; -- 날짜 사이에 - 입력하기

INSERT INTO EMP_TEMP (EMPNO, ENAME, JOB, MGR, HIREDATE, SAL, COMM, DEPTNO) VALUES(2111, '이순신', 'MANAGER', 9999, TO_DATE('07/01/2001', 'DD/MM/YYYY'),4000, NULL, 20);
SELECT * FROM EMP_TEMP; -- 날짜를 쓸때는 년, 월, 일 순으로 써야하는데 반대로 쓸 때에는 TO_DATE함수를 사용하여 날짜데이터를 입력하면 된다.

INSERT INTO EMP_TEMP (EMPNO, ENAME, JOB, MGR, HIREDATE, SAL, COMM, DEPTNO) VALUES(3111, '심청이', 'MANAGER', 9999, SYSDATE, 4000, NULL, 30);
SELECT * FROM EMP_TEMP; --SYSDATE함수를 사용하면 현재 시간도 같이 출력된다.

INSERT INTO EMP_TEMP (EMPNO, ENAME, JOB, MGR, HIREDATE, SAL, COMM, DEPTNO) SELECT E.EMPNO, E.ENAME, E.JOB, E.MGR, E.HIREDATE, E.SAL, E.COMM, E.DEPTNO FROM EMP E, SALGRADE S WHERE E.SAL BETWEEN S.LOSAL AND S.HISAL AND S.GRADE = 1;
SELECT * FROM EMP_TEMP; -- 서브쿼리로 여러 데이터 추가하기

-------------------------------(U) UPDATE---------------------------------------------------------------------------------------

CREATE TABLE DEPT_TEMP2 AS SELECT * FROM DEPT;
SELECT * FROM DEPT_TEMP2;-- 새로운 테이블 생성

---------------데이터 전체 수정하기
UPDATE DEPT_TEMP2 SET LOC = 'SEOUL';
SELECT * FROM DEPT_TEMP2;--LOC열에 있는 값을 모두 SEOUL로 변경하여 출력

ROLLBACK; -- 테이블 내용을 이전상태로 되돌리기

-------------데이터 일부분만 수정하기
UPDATE DEPT_TEMP2 SET DNAME = 'DATABASE', LOC = 'SEOUL' WHERE DEPTNO = 40;
SELECT * FROM DEPT_TEMP2; --DEPTNO열에 40번째 값 행만 변경하여 출력

-------------서브쿼리를 사용하여 데이터 수정
UPDATE DEPT_TEMP2 SET (DNAME, LOC) = (SELECT DNAME, LOC FROM DEPT WHERE DEPTNO = 40) WHERE DEPTNO = 40;
SELECT * FROM DEPT_TEMP2;-- 서브쿼리로 열을 한번에 수정하는 경우

UPDATE DEPT_TEMP2 SET DNAME = (SELECT DNAME FROM DEPT WHERE DEPTNO = 40), LOC = (SELECT LOC FROM DEPT WHERE DEPTNO = 40) WHERE DEPTNO = 40;
SELECT * FROM DEPT_TEMP2;-- 서브쿼리로 열을 한번에 수정하는 경우

UPDATE DEPT_TEMP2 SET LOC = 'SEOUL' WHERE DEPTNO = (SELECT DEPTNO FROM DEPT_TEMP2 WHERE DNAME = 'OPERATONOS');
SELECT * FROM DEPT_TEMP2;-- WHERE절에 서브쿼르르 사용하여 데이터를 수정하는 경우

------------------------------(D) DELETE--------------------------------------------------------------------------------

CREATE TABLE EMP_TEMP2 AS SELECT * FROM EMP;
SELECT * FROM EMP_TEMP2; -- 새로운 테이블 생성

----------------데이터 일부분만 삭제하기
DELETE FROM EMP_TEMP2 WHERE JOB = 'MANAGER';
SELECT * FROM EMP_TEMP2; -- JOB열에 MANAGER데이터만 삭제하여 출력

---------------서브쿼리를 이용하여 데이터 일부분만 삭제
DELETE FROM EMP_TEMP2 WHERE EMPNO IN (SELECT E.EMPNO FROM EMP_TEMP2 E, SALGRADE S WHERE E.SAL BETWEEN S.LOSAL AND S.HISAL AND S.GRADE = 3 AND DEPTNO = 30);
SELECT * FROM EMP_TEMP2; -- ALLEN ALC TURNER위 데이터가 삭제되어 출력

---------------데이터 전체 삭제 
DELETE FROM EMP_TEMP2;
SELECT * FROM EMP_TEMP2;-- 모든 데이터 삭제됌

--------------------------------------- 트랜젝션 -------------------------------------------------------
CREATE TABLE DEPT_TCL AS SELECT * FROM DEPT;
SELECT * FROM DEPT_TCL; --새로운 테이블 생성

----------DEPT_TCL테이블에 데이터를 입력, 수정, 삭제 하기

INSERT INTO DEPT_TCL VALUES(50, 'DATABASE', 'SEOUL'); -- 입력
UPDATE DEPT_TCL SET LOC = 'BUSAN' WHERE DEPTNO = 40; -- 수정
DELETE FROM DEPT_TCL WHERE DNAME = 'RESEARCH'; -- 삭제
SELECT * FROM DEPT_TCL; 

---------트랜젝션 취소
ROLLBACK; -- 전 명령어 실행 취소
SELECT * FROM DEPT_TCL;

--------트랜젝션을 영원히 저장
COMMIT; -- 한번 저장하면 트래젝션은 되돌릴수없다.

----------------------------------세션------------------------------------------------------------------
SELECT * FROM DEPT_TCL WHERE DEPTNO = 50;
SELECT * FROM DEPT_TCL;

SELECT * FROM DEPT_TCL;

------------------------------------ 데이터정의어 ------------------------------------------------------------
-------테이블생성 CREATE
CREATE TABLE EMP_DDL(EMPNO NUMBER(4), ENAME VARCHAR2(10), JOB VARCHAR2(9), MGR NUMBER(4), HTREDATE DATE, SAL NUMBER(7,2), COMM NUMBER(7,2), DEPTNO NUMBER(2));
DESC EMP_DDL; --모든열의 각 자료형을 정의해서 테이블 생성

CREATE TABLE DEPT_DDL AS SELECT * FROM DEPT;
DESC DEPT_DDL; -- 다른테이블을 복사하여 테이블 생성

SELECT * FROM DEPT_DDL; -- 테이블 전체 조회하기

CREATE TABLE EMP_DDL_30 AS SELECT * FROM EMP WHERE DEPTNO = 30 ;
SELECT * FROM EMP_DDL_30; -- 다른테이블의 일부를 복사하여 테이블 생성

CREATE TABLE EMPDEPT_DDL AS SELECT E.EMPNO, E.ENAME, E.JOB, E.MGR, E.HIREDATE, E.SAL, E.COMM, D.DEPTNO, D.DNAME, D.LOC FROM EMP E, DEPT D WHERE 1 <> 1;
SELECT * FROM EMPDEPT_DDL; -- 다른테이블의 열 구조만 복사하여 새테이블 생성(결과값은 복사 안하므로 아무것도 출력 안됌)

-------테이블변경 ALTER
CREATE TABLE EMP_ALTER AS SELECT * FROM EMP;
SELECT * FROM EMP_ALTER; -- EMP테이블을 복사하여 EMP_ALTER테이블 생성

ALTER TABLE EMP_ALTER ADD HP VARCHAR2(20);
SELECT * FROM EMP_ALTER; -- ADD는 테이블에 열을 추가하는 것(맨 마지막에 HP열이 추가되서 출력됨)

ALTER TABLE EMP_ALTER RENAME COLUMN HP TO TEL;
SELECT * FROM EMP_ALTER; -- RENAME은 열 이름을 바꾼다 (HP열이 TEL로 열 이름이 바껴서 출력됨)

ALTER TABLE EMP_ALTER MODIFY EMPNO NUMBER(5);
DESC EMP_ALTER; -- MODIFY는 열 자료형의 길이를 변경

ALTER TABLE EMP_ALTER DROP COLUMN TEL;
SELECT * FROM EMP_ALTER; -- DROP은 특정열을 삭제한다.(맨 마지막열인 TEL열이 삭제되어서 출력됨)

------테이블이름 변경 RENAME
RENAME EMP_ALTER TO EMP_RENAME; -- 테이블 이름 변경하기(EMP_ALTER테이블 이름을 EMP_RENAME으로 변경됨

SELECT * FROM EMP_RENAME; -- 변경된 테이블 이름으로 조회하기

------테이블 데이터삭제 TRUNCATE
TRUNCATE TABLE EMP_RENAME; --TRUNCATE는 테이블의 전체데이터를 삭제한다.
SELECT * FROM EMP_RENAME; --전체데이터를 삭제했으므로 출력되는거 없음

------테이블 삭제 DROP
DROP TABLE EMP_RENAME; -- DROP은 테이블 데이터가 아닌 테이블 자체를 삭제한다.
SELECT * FROM EMP_RENAME; --EMP_RENAME테이블을 삭제했으므로 오류가 뜬다.

----------------------------------- 객체종류 ----------------------------------------------------
----------데이터 사전
SELECT * FROM DICT; 
SELECT * FROM DICTIONARY;
-- SCOTT계정에서 사용가능한 데이터사전보기

SELECT TABLE_NAME FROM USER_TABLES; -- USER_은 가지고있는 객체정보를 알고싶을때 사용한다.
-- SCOTT계정이 가지고있는 테이블 이름이 출력된다.

SELECT OWNER, TABLE_NAME FROM ALL_TABLES; --ALL_은 사용할 수 있는 객체정보를 알고싶을때 사용한다.
-- SCOTT계정이 사용 할 수 있는 테이블이 출력된다.

SELECT * FROM DBA_TABLES; -- DBA_는 데이터베이스 관리 권한을 가진 사용자만 조회 할 수 있는 테이블이다.
-- SCOTT계정은 권한이 없기 때문에 조회할 수 없다.

----------인덱스
SELECT * FROM USER_INDEXES; -- SCOTT계정이 소유한 인덱스 정보알아보기

SELECT * FROM USER_IND_COLUMNS; -- SCOTT계정이 소유한 인덱스 컬럼 정보알아보기

CREATE INDEX IDX_EMP_SAL ON EMP(SAL); -- EMP테이블 SAL열에 인덱스 생성
SELECT * FROM USER_IND_COLUMNS; -- 생성된 인덱스 보기

DROP INDEX IDX_EMP_SAL; -- 인덱스 삭제(DROP INDEX 인덱스이름; ->인덱스 삭제는 이렇게 쓰면 됨)
SELECT * FROM USER_IND_COLUMNS;

-----------뷰
SELECT EMPNO, ENAME, JOB, DEPTNO FROM EMP WHERE DEPTNO = 20;

CREATE VIEW VW_EMP20 AS (SELECT EMPNO, ENAME, JOB, DEPTNO FROM EMP WHERE DEPTNO = 20); -- 뷰 생성

SELECT * FROM USER_VIEWS; -- 생성한 뷰 확인

SELECT * FROM VW_EMP20; -- 생성한 뷰 조회

DROP VIEW VW_EMP20; -- 뷰 삭제

--------시퀀스 (오라클 데이터베이스에서 특정 규칙에 맞는 연속숫자를 생성하는 객체)
CREATE TABLE DEPT_SEQUENCE AS SELECT * FROM DEPT WHERE 1 <> 1; -- DEPT테이이블과 열 구성만 같은 새로운 테이블 생성
SELECT * FROM DEPT_SEQUENCE;

CREATE SEQUENCE SEQ_DEPT_SEQUENCE INCREMENT BY 10 START WITH 10 MAXVALUE 90 MINVALUE 0 NOCYCLE CACHE 2; -- 시퀀스 생성
SELECT * FROM USER_SEQUENCES; -- 생성한 시퀀스 확인

INSERT INTO DEPT_SEQUENCE(DEPTNO, DNAME, LOC) VALUES(SEQ_DEPT_SEQUENCE.NEXTVAL, 'DATABASE', 'SEOUL'); -- 시퀀스에서 생성한 순번을 사용한 INSERT문 실행
SELECT * FROM DEPT_SEQUENCE ORDER BY DEPTNO; --DEPT_SEQUENCE테이블에 새로운 부서를 추가하려면 INSERT문에 NEXTVAL을 사용하면된다.

SELECT SEQ_DEPT_SEQUENCE.CURRVAL FROM DUAL; -- CURRVAL을 사용하면 가장 마지막으로 생성된 시퀀스를 확인할 수 있다.

INSERT INTO DEPT_SEQUENCE(DEPTNO, DNAME, LOC) VALUES(SEQ_DEPT_SEQUENCE.NEXTVAL, 'DATABASE', 'SEOUL');-- 시퀀스에서 생성한 순번을 반복사용하여 INSERT문 실행
SELECT * FROM DEPT_SEQUENCE ORDER BY DEPTNO;-- INSERT문을 시퀀스의 NEXTVAL을 사용하여 부서 번호가 90번에 이를때까지 실행하고 그 후 다시 실행하면 최댓값(90)이 이미 생성되었고 NOCYCLE옵션으로 순환되지 않도록 설정하여서 오류가 난다.

ALTER SEQUENCE SEQ_DEPT_SEQUENCE INCREMENT BY 3 MAXVALUE 99 CYCLE; -- 시퀀스옵션 수정(최댓값을 99로 바꾸고 증가값을 3, NOCYCLE대신 CYCLE옵션으로 수정)
SELECT * FROM USER_SEQUENCES; -- 옵션 수정한 시퀀스 조회

INSERT INTO DEPT_SEQUENCE(DEPTNO, DNAME, LOC) VALUES(SEQ_DEPT_SEQUENCE.NEXTVAL, 'DATABASE', 'SEOUL'); -- 수정한 시퀀스 실행
SELECT * FROM DEPT_SEQUENCE ORDER BY DEPTNO; -- 수정된 시퀀스의 중가값 때문에 마자막 값이 100이 아닌 93으로 출력

INSERT INTO DEPT_SEQUENCE(DEPTNO, DNAME, LOC) VALUES(SEQ_DEPT_SEQUENCE.NEXTVAL, 'DATABASE', 'SEOUL'); -- 계속 실행해서 최대값까지 값이 갔을 경우엔 최솟값인 0에서부터 다시 시작되서 출력된다.
SELECT * FROM DEPT_SEQUENCE ORDER BY DEPTNO;

DROP SEQUENCE SEQ_DEPT_SEQUENCE; -- 시퀀스 삭제
SELECT * FROM USER_SEQUENCES;

---------동의어(테이블, 뷰, 시퀀스 등 객체 이름 대신 사용할 수 있는 다른 이름을 부여하는 객체)
--CREATE[PUBLIC] SUNONYM 동의어이름 FOR [사용자.][객체 이름]; -> 동의어 기본형식
CREATE SYNONYM E FOR EMP; --EMP 테이블의 동의어 생성하기 (CMD에서 권한을 먼저 부여해야 함)

SELECT * FROM E; -- 동의어 E를 사용하여 EMP테이블 데이터 조회

DROP SYNONYM E; -- 생성한 동의어 삭제(동의어만 삭제되고 EMP테이블이름과 데이터에는 아무영향을 주지않는다)

--------------------------------------------- 제약 조건 ------------------------------------------------------------------------
---------NOT NULL(지정한 열에 NULL을 허용하지않고 NULL을 제외한 데이터의 중복은 허용)
CREATE TABLE TABLE_NOTNULL(LOGIN_ID VARCHAR2(20) NOT NULL, LOGIN_PWD VARCHAR2(20) NOT NULL, TEL VARCHAR2(20)); -- 테이블 생성할때 NOT NULL 설정하기
DESC TABLE_NOTNULL;

INSERT INTO TABLE_NOTNULL (LOGIN_ID, LOGIN_PWD) VALUES ('TEST_ID_01', '1234'); --제약조건이 없는 TEL 열에 NULL값 입력
SELECT * FROM TABLE_NOTNULL;

UPDATE TABLE_NOTNULL SET LOGIN_PWD = NULL WHERE LOGIN_ID = 'TEST_ID_01'; -- NOT NULL제약조건이 지정된 열 데이터를 NULL값으로 업데이트하기

SELECT OWNER, CONSTRAINT_NAME, CONSTRAINT_TYPE, TABLE_NAME FROM USER_CONSTRAINTS; -- 제약조건 살펴보기

CREATE TABLE TABLE_NOTNULL2(LOGIN_ID VARCHAR2(20) CONSTRAINT TBLNN2_LGNID_NN NOT NULL, LOGIN_PWD VARCHAR2(20) CONSTRAINT TBLNN2_LGNPW_NN NOT NULL, TEL VARCHAR2(20));
SELECT OWNER, CONSTRAINT_NAME, CONSTRAINT_TYPE, TABLE_NAME FROM USER_CONSTRAINTS;
--테이블을 생성할 때 제약조건에 이름 지정하기
--CONSTRAINT를 쓰면 제약조건에 이름을 직접 지정할 수 있다.

UPDATE TABLE_NOTNULL SET TEL = '010-1234-5678' WHERE LOGIN_ID = 'TEST_ID_01'; -- TEL 열 데이터 수정하기
SELECT * FROM TABLE_NOTNULL;

ALTER TABLE TABLE_NOTNULL MODIFY(TEL NOT NULL); --NOT NULL 제약조건 추가하기
SELECT OWNER, CONSTRAINT_NAME, CONSTRAINT_TYPE, TABLE_NAME FROM USER_CONSTRAINTS;

ALTER TABLE TABLE_NOTNULL2 MODIFY(TEL CONSTRAINT TBLNN_TEL_NN NOT NULL); -- 제약조건에 이름 지정해서 추가하기
SELECT OWNER, CONSTRAINT_NAME, CONSTRAINT_TYPE, TABLE_NAME FROM USER_CONSTRAINTS;

DESC TABLE_NOTNULL2; -- 테이블 열 구조 확인

ALTER TABLE TABLE_NOTNULL2 RENAME CONSTRAINT TBLNN_TEL_NN TO TBLNN2_TEL_NN; -- 이미 생성된 제약조건 이름 변경하기 (ALTER명령어에 RENAME CONSTRAINT키워드를 사용한다.)
SELECT OWNER, CONSTRAINT_NAME, CONSTRAINT_TYPE, TABLE_NAME FROM USER_CONSTRAINTS;

ALTER TABLE TABLE_NOTNULL2 DROP CONSTRAINT TBLNN2_TEL_NN; -- 제약조건 삭제
DESC TABLE_NOTNULL2; -- TEL 열이 NULL이 저장 될 수 있는 열로 변한다.

--------UNIQUE(제약조건은 열에 저장할 데이터의 중복을 허용하지 않을때 사용. 제약조건을 지정한 열에 NULL은 여러개 존재 할 수 있다.)
CREATE TABLE TABLE_UNIQUE(LOGIN_ID VARCHAR2(20) UNIQUE, LOGIN_PWD VARCHAR2(20) NOT NULL, TEL VARCHAR2(20)); -- 제약조건 지정(테이블생성)
DESC TABLE_UNIQUE;

SELECT OWNER, CONSTRAINT_NAME, CONSTRAINT_TYPE, TABLE_NAME FROM USER_CONSTRAINTS WHERE TABLE_NAME = 'TABLE_UNIQUE'; -- USER_CONSTRAINTS데이터 사전 뷰로 제약조건 확인하기

INSERT INTO TABLE_UNIQUE(LOGIN_ID, LOGIN_PWD, TEL) VALUES('TEST_ID_01', 'PWD01', '010-1234-5678'); -- TABLE_UNIQUE테이블에 데이터 입력하기
SELECT * FROM TABLE_UNIQUE;

INSERT INTO TABLE_UNIQUE(LOGIN_ID, LOGIN_PWD, TEL) VALUES('TEST_ID_02', 'PWD01', '010-1234-5678'); -- LOGIN_PWD열에 NOT NULL 제약조건을 지정하여 중복값이 있어도 문제가 발생하지 않는다.
SELECT * FROM TABLE_UNIQUE;-- NOT NULL은 열 값이 NULL만 아니면 된다.

INSERT INTO TABLE_UNIQUE(LOGIN_ID, LOGIN_PWD, TEL) VALUES(NULL, 'PWD01', '010-1234-5678'); -- UNOQUE제약조건이 지정된 열에 NULL값 입력
SELECT * FROM TABLE_UNIQUE;

CREATE TABLE TABLE_UNIQUE2(LOGIN_ID VARCHAR2(20) CONSTRAINT TBLUNQ2_LGNID_UNQ UNIQUE, LOGIN_PWD VARCHAR2(20) CONSTRAINT TBLUNQ2_LGNPW_NN NOT NULL, TEL VARCHAR2(20));
-- 테이블을 생성할때 UNIQUE 제약 조건 설정하기

SELECT OWNER, CONSTRAINT_NAME, CONSTRAINT_TYPE, TABLE_NAME FROM USER_CONSTRAINTS WHERE TABLE_NAME LIKE 'TABLE_UNIQUE%';
-- 생성한 UNIQUE제약조건 확인하기

UPDATE TABLE_UNIQUE SET TEL = NULL; -- TEL열 값을 모두 NULL값으로 변경
SELECT * FROM TABLE_UNIQUE;

ALTER TABLE TABLE_UNIQUE MODIFY(TEL UNIQUE);

ALTER TABLE TABLE_UNIQUE2 DROP CONSTRAINT TBLUNQ2_TEL_UNQ; --제약조건 삭제
SELECT OWNER, CONSTRAINT_NAME, CONSTRAINT_TYPE, TABLE_NAME FROM USER_CONSTRAINTS WHERE TABLE_NAME LIKE 'TABLE_UNIQUE%';

--------PRIMARY KEY(데이터 중복을 허용하지 않고 NULL도 허용하지 않는다.)
CREATE TABLE TABLE_PK(LOGIN_ID VARCHAR2(20) PRIMARY KEY, LOGIN_PWD VARCHAR2(20) NOT NULL, TEL VARCHAR2(20)); -- 테이블 생성할때 특정열에 PRIMARY KEY설정하기
DESC TABLE_PK;

SELECT OWNER, CONSTRAINT_NAME, CONSTRAINT_TYPE, TABLE_NAME FROM USER_CONSTRAINTS WHERE TABLE_NAME LIKE 'TABLE_PK%'; -- 생성한 PRIMATY KEY확인하기

SELECT INDEX_NAME, TABLE_OWNER, TABLE_NAME FROM USER_INDEXES WHERE TABLE_NAME LIKE 'TABLE_PK%'; -- 생성한 PRIMARY KEY를 통해 자동 생성된 INDEX확인하기

CREATE TABLE TABLE_PK2(LOGIN_ID VARCHAR2(20) CONSTRAINT TBLPK2_LGNID_PK PRIMARY KEY, LOGIN_PWD VARCHAR2(20) CONSTRAINT TBLPK2_LGNPOW_NN NOT NULL, TEL VARCHAR2(20));
DESC TABLE_PK2; --제약조건의 이름을 직접 지정하여 테이블 생성하기

INSERT INTO TABLE_PK(LOGIN_ID, LOGIN_PWD, TEL) VALUES('TEST_ID_01', 'PWD01', '010-1234-5678'); -- TABLE_PK 테이블에 데이터 입력하기
SELECT * FROM TABLE_PK;

INSERT INTO TABLE_PK(LOGIN_ID, LOGIN_PWD, TEL) VALUES('REST_ID_01', 'PWD02', '010-2345-6789'); --PRIMATY KEY제약 조건이 지정되어있는 열은 중복이 안된다.

INSERT INTO TABLE_PK(LOGIN_ID, LOGIN_PWD, TEL) VALUES(NULL, 'PWD02', '010-345-6789'); -- NULL값을 명시적으로 입력
INSERT INTO TABLE_PK(LOGIN_PWD, TEL) VALUES('PWD02', '010-345-6789'); --NULL값을 암시적으로 입력
--PRIMARY KEY 제약 조건이 지정되어있는 NULL값을 허용하지 않는다.

----------FOREIGN KEY(특정테이블에서 PRIMARY KEY제약 조건을 지정한 열을 다른 테이블의 특정 열에서 참조하겠다는 의미)
SELECT OWNER, CONSTRAINT_NAME, CONSTRAINT_TYPE, TABLE_NAME, R_OWNER, R_CONSTRAINT_NAME FROM USER_CONSTRAINTS WHERE TABLE_NAME IN ('EMP', 'DEPT');
--EMP 테이블과 DEPT 테이블의 제약조건 살펴보기

CREATE TABLE DEPT_FK(DEPTNO NUMBER(2) CONSTRAINT DEPTFK_DEPTNO_PK PRIMARY KEY, KNAME VARCHAR2(14), LOC VARCHAR2(13)); -- DEPT_FK테이블 생성
DESC DEPT_FK;

CREATE TABLE EMP_FK(ENPNO NUMBER(4) CONSTRAINT EMPFK_EMPNO_PK PRIMARY KEY, ENAME VARCHAR2(10), JOB VARCHAR2(9), MGR NUMBER(4), HIREDATE DATE, SAL NUMBER(7,2), COMM NUMBER(7,2), DEPTNO NUMBER(2) CONSTRAINT EMPFK_DEPTNO_FK REFERENCES DEPT_FK (DEPTNO));
DESC EMP_FK; -- EMP_FK테이블 생성

INSERT INTO DEPT_FK VALUES(10, 'TEST_DNAME', 'TEST_LOC'); -- DEPT_FK에 데이터 삽입
SELECT * FROM DEPT_FK;

INSERT INTO EMP_FK VALUES(9999, 'TEST_NMAME', 'TEST_JOB', NULL, TO_DATE('2001/01/01', 'YYYY/MM/DD'), 3000, NULL, 10); -- EMPO_FK테이블에 데이터 삽입
SELECT * FROM EMP_FK;

DELETE FROM DEPT_PK WHERE DEPTNO = 10; -- DEPT_FK테이블의 10번부서 데이터 삭제하기
--오류가 뜨는 이유는 삭제하려는 DEPTNO값을 참조하는 데ㅐ이터가 존재하기 때문이다.

--------CHECK(열에 저장할 수 있는 겂의 범위 또는 패턴을 정의할 때 사용)
CREATE TABLE TABLE_CHECK(LOGIN_ID VARCHAR2(20) CONSTRAINT TBLCK_LOGINID_PK PRIMARY KEY, LOGIN_PWD VARCHAR2(20) CONSTRAINT TBLCK_LOGINPW_CK CHECK(LENGTH(LOGIN_PWD) > 3 ), TEL VARCHAR2(20));
DESC TABLE_CHECK; -- 테이블을 생성할때 CHECK 제약 조건 설정

INSERT INTO TABLE_CHECK VALUES('TEST_ID', '123', '010-1234-5678'); -- CHECK 제약조건이 맞지않은 예 (비밀번호가 4자리 이상이여야하는데 3자리임)

INSERT INTO TABLE_CHECK VALUES('TEST_ID', '1234', '010-1234-5678'); -- CHECK 제약조건이 맞는 예 (비밀번호가 4자리임)
SELECT * FROM TABLE_CHECK;

SELECT OWNER, CONSTRAINT_NAME, CONSTRAINT_TYPE, TABLE_NAME FROM USER_CONSTRAINTS WHERE TABLE_NAME LIKE 'TABLE_CHECK'; -- CHECK 제약조건 확인

--------DEFAULT(제약조건과는 별개로 특정 열에 저장할 값이 지정되지 않았을 경우에 기본값을 지정할 수 있는데 쓰이는 것이다.)
CREATE TABLE TABLE_DEFAULT(LOGIN_ID VARCHAR2(20) CONSTRAINT TBLCK2_LOGINID_PK PRIMARY KEY, LOGIN_PWD VARCHAR2(20) DEFAULT '1234', TEL VARCHAR2(20));
DESC TABLE_DEFAULT; -- 테이블을 생성할때 DEFAULT 제약 조건 설정

INSERT INTO TABLE_DEFAULT VALUES('TEST_ID', NULL, '010-1234-5678');
INSERT INTO TABLE_DEFAULT(LOGIN_ID, TEL)VALUES('TEST_ID2', '010-1234-5678');
SELECT * FROM TABLE_DEFAULT;
-- DEFAULT로 지정한 기본값이 입력되는 INSERT문 확인

----------------------------------- 사용자, 권한, 롤 관리 -------------------------------------------------------------
---------사용자 관리
CREATE USER ORCLSTUDY IDENTIFIED BY ORACLE; -- SCOTT계정은 사용자를 생성할 권한이 없어서 계정을 생성 할 수 없다.(SYSTEM이나 COM에서 계정을 생성해야 됌)

---------권한 관리
--GRANT[시스템권한] TO [사용자 이름/롤 이름/PUBLIC] [WITH ADMIN OPION]; ->권한을 부여하는 GRANT문 기본형식
--GRANT[객체권한/ALL PRIVILEGES] ON[스키마.객체 이름] TO[사용자 이름/롤 이름/PUBLIC] [WITH GRANT OPTION]; ->객체 권한을 부여하는 GRANT문 기본형식

