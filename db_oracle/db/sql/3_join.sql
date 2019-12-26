-- (Oracle) join

select * from dept;
select * from emp;

select ename, loc, dname
from emp, dept
where emp.deptno = dept.deptno;
-- join 조건은 where절에 기입

select ename, dept.deptno, dname, loc
from emp, dept
where emp.deptno = dept.deptno;
-- 공통으로 갖는 deptno는 어느 테이블에서 갖고오는지 명시해줘야 한다.

select ename, e.deptno, dname, loc
from emp e, dept d
where e.deptno = d.deptno;
-- table alias 함.

-- sal > 2000 이면서 deptno가 20인 사원의 이름, sal, loc 정보 출력
select ename, sal, loc
from emp e, dept d
where e.deptno = d.deptno and sal > 2000 and e.deptno = 20;


************************
--모든 DB 사용 가능. Ansi join (표준: ',' => join / 'where' => on)
************************

-- inner join
select ename, e.deptno, dname, loc
from emp e join dept d
on e.deptno = d.deptno;
-- inner 생략

select ename, e.deptno, dname, loc
from emp e inner join dept d
on e.deptno = d.deptno;

-- sal > 2000 이면서 deptno가 20인 사원의 이름, sal, loc 정보 출력
select ename, sal, loc
from emp e join dept d
on e.deptno = d.deptno
where sal > 2000 and e.deptno = 20;


-- (Oracle) outer join
-- null 쪽에  '+' 마킹

select ename, d.deptno, dname, loc
from emp e, dept d
where e.deptno(+) = d.deptno;

-- Ansi join : outer join
-- right 쪽의 테이블이 마스터 테이블이 된다.
select ename, d.deptno, dname, loc
from emp e right outer join dept d
on e.deptno = d.deptno;

select ename, d.deptno, dname, loc
from emp e right join dept d
on e.deptno = d.deptno;
-- outer 생략


*********************************
-- non equi join
*********************************

select * from salgrade;

-- oracle join
select ename, sal, grade
from emp, salgrade
where sal between losal and hisal;

-- ansi join
select ename, sal, grade
from emp join salgrade
on sal between losal and hisal;


*************************
-- n개의 테이블 join
*************************
-- 사원명, sal, 부서이름, salgrade 출력
-- oracle join
select ename, sal, dname, grade
from emp, dept, salgrade
where emp.deptno = dept.deptno 
	and sal between losal and hisal;

--ansi join
select ename, sal, dname, grade
from emp 
	join dept on emp.deptno = dept.deptno 
	join salgrade on sal between losal and hisal;

-- sal이 1500 이상인 ename, sal, dname, grade 출력
select ename, sal, dname, grade
from emp 
	join dept on emp.deptno = dept.deptno 
	join salgrade on sal between losal and hisal
where sal >= 1500;


********************
  oracle self join
********************
-- 사원의 이름과 그 사원의 상사이름 출력
-- 같은 table 두개 -> alias 필수
select e.ename "사원명", m.ename "상사이름"
from emp e, emp m
where e.mgr = m.empno;

select e.ename "사원명", nvl(m.ename, 'CEO') "상사이름"
from emp e, emp m
where e.mgr = m.empno(+);

-- 상사보다 급여를 많이 받는 사원 리스트
select e.ename "사원명", e.sal, m.sal, m.ename "상사이름"
from emp e, emp m
where e.mgr = m.empno and e.sal > m.sal;

*************
-- ansi join
*************
select e.ename "사원명", nvl(m.ename, 'CEO') "상사이름"
from emp e left join emp m on e.mgr = m.empno;

select e.ename "사원명", e.sal, m.sal, m.ename "상사이름"
from emp e left join emp m on e.mgr = m.empno
where e.sal > m.sal;


-- 집계함수
select ename, round(sal) from emp;
select avg(sal) from emp;
select ename, avg(sal) from emp; >> ERROR

select round(avg(sal))||'원' 전체평균급여 from emp;
select deptno, round(avg(sal)) 전체평균급여 from emp group by deptno;



select avg(sal), count(*), min(sal), max(sal), count(mgr)
from emp;
-- * 대신 특정변수 기입하면 null값은 비포함하여 집계한다.

select avg(sal), count(*), min(sal), max(sal), count(mgr)
from emp
where deptno = 10;

select avg(sal), count(*), min(sal), max(sal), count(mgr)
from emp
where deptno = 40;

select avg(sal), count(*), min(sal), max(sal), count(mgr)
from emp
group by deptno;

select deptno, avg(sal), count(*), min(sal), max(sal), count(mgr)
from emp
group by deptno;
-- group by 시킨 변수 deptno는 집계함수없이 select절에 올 수 있다.

select emp.deptno, dname, avg(sal), count(*), min(sal), max(sal), count(mgr)
from emp, dept 
where emp.deptno = dept.deptno
group by emp.deptno, dname;

col dname for a10;


****************
select
from
where
group by
having
order by
****************
-- 부서번호별 평균급여가 2000이상인 목록 출력
select e.deptno, dname, round(avg(sal)) as "평균급여"
from emp e, dept d
where e.deptno = d.deptno
group by e.deptno, dname
having round(avg(sal)) >= 2000;


-- subQuery

-- Ford 보다 급여가 많은 사원 목록

select sal from emp where ename = 'FORD';

select *
from emp 
where sal > (select sal from emp where ename = 'FORD');

-- 전체 평균 급여보다 적게 받는 사원 목록
select *
from emp
where sal < (select avg(sal) from emp);

-- 최소 급여 받는 사람의 목록
select *
from emp
where sal = (select min(sal) from emp);

-- 부서별 최고 급여를 받는 사람 목록
select * from emp
where sal in (select max(sal) from emp group by deptno);

-- !! 위의 쿼리는 명확하지 않다. deptno도 함께 확인해야 정확하다.
select * from emp
where (deptno, sal) in (select deptno, max(sal) from emp group by deptno)
order by deptno;


********************
-- rownum
********************

select ename, job, sal
from emp;

select rownum, ename, job, sal
from emp;

select rownum, ename, job, sal
from emp
order by sal;
-- rownum 이후 order by 절 처리하여 순서 뒤바뀜.

select rownum, ename, job, sal
from (select * from emp order by sal);

select rownum, ename, job, sal
from (select * from emp order by sal desc)
where rownum < 4;

select rownum, ename, job, sal
from (select * from emp order by sal desc)
where rownum between 1 and 3;

-- oracle page 처리
select rownum, ename, job, sal
from (select * from emp order by sal desc)
where rownum between 6 and 10;
--오류 : rownum생성이 1 부터 이루어져(?) 중간 부분부터 따로 뽑을 수 없다.

select *
from (
	select rownum row#, ename, job, sal
	from (select * from emp order by sal desc)
	)
where row# between 6 and 10;



























