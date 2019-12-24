

sqlplus system/1234

alter user hr identified by hr account unlock;

conn hr/hr
sqlplus hr/hr

select * from tab;
select * from employees;


**************
* TABLESPACE *
**************
create TABLESPACE mc
datafile 'C:\oraclexe\app\oracle\oradata\XE\mc.dbf'
size 10M
autoextend on next 1M maxsize UNLIMITED;


drop TABLESPACE mc INCLUDING CONTENTS AND Datafiles;

**********************************
    계정생성, 권한 부여 및 회수, 삭제
**********************************

create user test01 identified by 1234
default TABLESPACE mc;
rem test01아이디로 1234비밀번호로 디폴트 TABLESPACE는 mc로 user 생성하겠다.

grant connect,resource,dba to test01;
rem grant 권한 부여

revoke dba from test01;
revoke connect from test01;
rem revoke 권한 회수

drop user test01 cascade;
rem test01 삭제


***************************
   SCOTT/TIGER 계정 생성
***************************

create user SCOTT identified by TIGER
default TABLESPACE mc;

@C:\lib\scott.sql;
rem @ 는 file 안의 모든 명령어 수행

select * from tab;

set linesize 300;
set pagesize 20;
rem 화면 조정

select * from emp;






