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

-- 81년도 입사한 사원 목록
select ename, hiredate
from emp
where hiredate like '81%';





