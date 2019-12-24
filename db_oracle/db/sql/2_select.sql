conn SCOTT/TIGER

select * from emp;
select * from dept;
select * from salgrade;

desc emp;

select ename, sal, deptno
from emp;

select ename, hiredate
from emp;

select deptno, dname
from dept;

select distinct job
from emp;
rem distinct 중복 제거

select ename, sal, sal*12 as "연봉" 
from emp;
rem 오라클에서는 문자열 항상 '' 이지만 as 쓸 때만 "" 사용한다.

select ename, job, sal, comm
from emp;

select ename, job, sal, comm, sal+nvl(comm, 0) as "총급여"
from emp;
rem nvl() null이면 특정값으로 보이기

select empno, ename, nvl(mgr, '<<CEO>>')
from emp;
rem mgr은 숫자열이기 때문에 문자열 생성 못함 -> mgr을 문자열로 변경

select empno, ename, nvl(to_char(mgr), '<<CEO>>') as "매니저코드"
from emp;

-- 문자열 연결 연산자 : ||
select ename||'  '||job
from emp;

select 20*20*4
from emp;

select 20*20*4
from dept;

-- 가상의 테이블 : dual
select 20*20*4
from dual;

select sysdate
from dual;

select user
from dual;


-- row 제한을 걸 때 where 절

select ename, job, deptno
from emp
where deptno = 10;

select ename, job, deptno
from emp
where upper(job) = upper('manager');
-- 혹은 lower / 대소문자 구분시 항상 좌우 모두 확인해준다.

select ename, hiredate
from emp
where hiredate > '82/01/01';

select ename, hiredate
from emp
where hiredate = '81/05/01';

select ename, hiredate
from emp
where hiredate != '81/05/01';

select ename, hiredate
from emp
where hiredate <> '81/05/01';


-- between and (등호 포함이고 작은값이 항상 앞에 위치한다.)

select ename, sal
from emp
where sal >= 2450 and sal <=3000;

select ename, sal
from emp
where sal between 2450 and 3000;

select ename, job, deptno
from emp
where deptno = 10 or deptno = 20;

-- in 연산자
select ename, job, deptno
from emp
where deptno in(10, 20);

select *
from dept
where (deptno, loc) in((20,'DALLAS'), (30,'CHICAGO'));


-- like 연산자

select *
from emp
where ename like 'A%'; -- % : 아무거나 상관없이

select *
from emp
where ename like '%A%';

select *
from emp
where ename like '%A__'; -- 뒤에서 3번째 문자 A인 문자열

select *
from emp
where upper(ename) like upper('%A%');

-- 81년도 입사한 사원 목록
select *
from emp
where hiredate like '81%';

-- where null
select *
from emp
where mgr is null;

select *
from emp
where mgr is not null;

-- where 절에서는 별칭 사용 X
select ename, sal, comm, sal+nvl(comm,0) as "총급여"
from emp
where sal+nvl(comm,0) >= 2000;

-- 정렬
select ename, sal, comm, sal+nvl(comm,0) as "총급여"
from emp
order by sal;

select ename, sal, comm, sal+nvl(comm,0) as "총급여"
from emp
order by sal desc;

select ename, sal, comm, sal+nvl(comm,0) as "총급여"
from emp
order by sal asc;

select ename, sal, comm, sal+nvl(comm,0) as "총급여"
from emp
order by sal, comm;

select ename, sal, sal+nvl(comm,0) as "총급여"
from emp
where comm is not null
order by sal, comm desc;

select ename, sal, sal+nvl(comm,0) as "총급여"
from emp
where sal+nvl(comm,0) >= 2000
order by "총급여"; -- alias 사용(where절은 사용불가)

select ename, sal, sal+nvl(comm,0) as "총급여"
from emp
where sal+nvl(comm,0) >= 2000
order by 3; -- 위치 인덱스 사용


conn hr/hr
select * from employees;


conn SCOTT/TIGER
-- 단일행 함수
select dname, lower(dname), loc, lower(loc)
from dept;

select round(44.55), round(44.55, 1), trunc(44.55)
from dual;

select sal, trunc(sal*0.03) as "TAX"
from emp;


-- 사원의 입사 월 정보 추출
-- substr(문자열, 시작idx, 뽑아낼 문자개수)
select ename, hiredate, substr(hiredate,4,2) as "입사 월"
from emp;

-- 사원의 입사 월이 12인 정보 추출
select ename, hiredate 입사월
from emp
where substr(hiredate,4,2)='12';


-- 날짜 연산
select sysdate, sysdate+30 from dual;

select sysdate, substr(sysdate,4,2) from dual;
select sysdate, to_char(sysdate,'YY') from dual;
select sysdate, to_char(sysdate,'YYYY') from dual;
select sysdate, to_char(sysdate,'day') from dual;
select sysdate, to_char(sysdate,'mm') from dual;
select sysdate, to_char(sysdate,'dd') from dual;

-- emp에서 사원들의 입사월,입사요일 정보를 출력하세요
select ename, to_char(hiredate, 'mm') as "입사월", 
				to_char(hiredate, 'day') 입사요일
from emp
order by "입사월";

select sysdate, to_date('2019/12/24') from dual;
select sysdate, to_date('2019-12-24') from dual;
select sysdate, to_date('2019 12 24') from dual;
select sysdate, to_date('12-24-19','mm/dd/yy') from dual;


-- decode 함수
select ename, sal, deptno, decode(deptno ,10, sal*1.1,
										20, sal*0.7,
										30, sal) as "보너스"
from emp
order by deptno;











