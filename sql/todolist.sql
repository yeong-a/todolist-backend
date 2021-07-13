create database mydb;
use mydb;

create table todolist
(
	no int primary key auto_increment,
    content varchar(200) not null,
	userid varchar(12),
    write_date datetime,
    end_date datetime,
    done char(1)
);

insert into todolist(content,userid,write_date,end_date,done)
values('할일1','java',now(),date_add(now() , INTERVAL 7 day),'N');

insert into todolist(content,userid,write_date,end_date,done)
values('할일2','java',now(),date_add(now() , INTERVAL 8 day),'N');

insert into todolist(content,userid,write_date,end_date,done)
values('할일3','java',now(),date_add(now() , INTERVAL 9 day),'N');

insert into todolist(content,userid,write_date,end_date,done)
values('공부','ssafy',now(),date_add(now() , INTERVAL 10 day),'N');

commit;