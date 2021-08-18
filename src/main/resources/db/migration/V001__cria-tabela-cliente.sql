create table cliente (
	id bigint not null auto_increment,
	nome varchar(80) not null,
	created_by varchar(80) not null,
	created_date datetime not null,
	last_modified_by varchar(80) not null,
	last_modified_date datetime not null,
	primary key (id)
) engine=InnoDB default charset=utf8;
