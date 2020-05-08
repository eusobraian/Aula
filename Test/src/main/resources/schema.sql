drop table if exists campeoes;

create table campeoes(
     id_campeoes bigint auto_increment,
     nome varchar(20) not null,
     skills varchar(20) not null,
     damage int not null,
     primary key (id_campeoes));