--	*********************
--	 게시판  관련 SQL 작성
--	********************
--	users 테이블 생성 구문 
--	     id          
--	     password   
--	     name        
--	     role       -- admin / user
--	
drop table users;
create table users(
	id varchar2(12) constraint users_pk primary key,
	password varchar2(12),
	name varchar2(12),
	role varchar2(5) constraint users_check_role 
		check(upper(role) in (upper('admin'), upper('user')))
);

--	board 테이블 생성 구문 
--	     seq		-- num of content	
--	     title      
--	     content
--	     regdate	-- date
--	     cnt		-- view count 
--	     id      
--	     
drop table board;
create table board(
	seq number(7,0) constraint board_pk primary key,
	title varchar2(40),
	content varchar2(20), -- ??
	regdate date default sysdate,
	cnt number(5,0) default 0,
	id varchar2(12) constraint board_fk_number references users
);



--	
--	회원등록
insert into users(id,password,name,role)
values('hong','1234','홍길동','admin');
insert into users(id,password,name,role)
values('ko','123abc','고길동','user');
insert into users(id,password,name,role)
values('kim','abc123','김길동','user');
insert into users(id,password,name,role)
values('choi','1234','최길동','user');
--	회원정보수정
update users set password='123456' where (id, password) = ('고길동','123abc');
--	로그인
select * from users where (id, password) = ('고길동','123abc');
--	
--	게시판 글등록
insert into board(seq,title,content,id)
values(
	(select nvl(max(seq),0)+1 from board),
	'가입인사','안녕하세요 최길동입니다','choi');
insert into board(seq,title,content,id)
values(
	nvl((select max(seq) from board)+1,1),
	'메리크리스마스','Merry Christmas','kim');
insert into board(seq,title,content,id)
values(
	nvl((select max(seq) from board)+1,1),
	'웃어요','하하호호','kim');
--	글수정
update board set title='해피 크리스마스', content='Happy Christmas' where seq=2;
--	게시판 글 삭제
delete from board where seq=1;
--	
--	데이터검색(Query)
--	전체 등록글 수
select count(*)
from board;
--	사용자별 등록글수 
select count(*)
from board
where id='kim'
--	월별개시글수
select to_char(regdate,'mm'), count(*)
from board
group by to_char(regdate,'mm');
--	사용자별 게시글 검색
--	제목으로 게시글 검색

-- SCOTT/TIGER
