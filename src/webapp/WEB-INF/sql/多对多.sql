drop table if exists ay_role;
create table ay_role(
	id bigint(32) not null,
	name varchar(255) default null,
	PRIMARY key (id)
)ENGINE=INNODB default charset=utf8;

drop table if exists ay_user_role_rel;
create table ay_user_role_rel(
	id bigint(32) not null,
	user_id BIGINT(32) default null,
	role_id BIGINT(32) DEFAULT null,
	PRIMARY KEY (id)
)ENGINE=INNODB DEFAULT charset=utf8;
