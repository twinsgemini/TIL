-- 테이블 생성문
create table users(
	id varchar2(20) constraint users_pk primary key,
	pw varchar2(15)
	);

-- 회원 등록 sql 구문
insert into users (id, pw)
values('hong', '1234');
insert into users (id, pw)
values('kim', 'abc123');
commit;

-- 로그인 sql 구문
select * 
from users 
where id='hong' and pw='1234';

select * 
from users 
where id='kim' and pw='abc123';