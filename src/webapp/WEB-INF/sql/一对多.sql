drop table if exists ay_student;
create table ay_student(
	id bigint(32) not null ,
	name varchar(255) default null,
	age int(2) default null,
	school_id bigint(32) default null,
	PRIMARY key (id)
)ENGINE=innodb default charset=utf8;

drop table if exists ay_school;
create table ay_school(
	id bigint(32) not null,
	name varchar(255) default null,
	PRIMARY key (id)
)engine=innodb default charset=utf8;
