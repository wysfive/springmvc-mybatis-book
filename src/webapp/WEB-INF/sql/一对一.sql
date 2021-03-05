drop table if exists ay_user;
create table ay_user (
	id bigint(32) not null auto_increment,
	name varchar(10) default null,
	password varchar(64) default null,
	age int(10) default null,
	address_id bigint(32) default null,
	PRIMARY key (id),
	KEY FK_address_id (address_id),
	CONSTRAINT FK_address_id foreign key (address_id)
	REFERENCES ay_user_address (id)
)ENGINE=INNODB Auto_increment=1 default charset=utf8;

drop table if exists ay_user_address;
create table ay_user_address(
	id BIGINT(32) not null auto_increment,
	name varchar(255) default null,
	PRIMARY key (id)
)ENGINE=INNODB DEFAULT charset=utf8;