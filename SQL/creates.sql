create table produtos(
	id serial primary key not null,
	nome varchar(150),
	preco numeric(10,2)
)

create table produtos2(
	id serial primary key not null,
	nome varchar(150),
	preco numeric(10,2),
	preco_imposto numeric(10,2)
)

create table clientes(
	id serial primary key not null,
	nome varchar(150),
	email varchar(150),
	data_cadastro timestamp
)