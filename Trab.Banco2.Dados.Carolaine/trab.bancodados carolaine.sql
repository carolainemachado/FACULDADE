drop database hotel;
create database hotel;
use hotel;
create table acompanhantes (
 registra_pedidos_lavanderia varchar(45),
  CPF int auto_increment,
  RG varchar(45) not null,
  primary key (CPF),
  nome_acompanhantes varchar(45) not null
);
create table cliente_hospede (
 CPF int auto_increment not null,
 nome varchar(45),
 RG varchar(45) not null,
 acompanhantes varchar(45) not null,
 data_nascimento date,
 idade varchar(45),
 telef_contato varchar(45) not null,
 acompanhantes_CPF int not null,
 email varchar(45),
 primary key (CPF),
 foreign key (acompanhantes_CPF) references acompanhantes (CPF)
);
create table reserva (
  quant_pessoas varchar(45),
  data_entrada date,
  hora_entrada varchar(45),
  data_saida date,
  hora_saida varchar(45),
  id int auto_increment not null,
  cliente_hospede_CPF int not null,
  primary key (id)
);
create table quarto (
  numero int auto_increment not null,
  andar varchar(45),
  reserva_id int not null,
  quanti_de_camas varchar(45) not null,
  categoria varchar(45),
  situacao varchar(45),
  primary key (numero),
  foreign key (reserva_id) references reserva (id)
);
create table endereco (
lagradouro int auto_increment not null,
cliente_hospede_CPF int not null,
 numero varchar(45),
 complemento varchar(45),
 bairro varchar(45),
 cidade varchar(45),
 primary key (lagradouro),
 foreign key (cliente_hospede_CPF) references cliente_hospede (CPF)
 );
create table servico_lavanderia (
 registra_pedidos_lavanderia varchar(45) not null,
 id int auto_increment not null,
 cliente_hospede_CPF int not null,
  primary key (id),
  foreign key (cliente_hospede_CPF) references cliente_hospede (CPF)
);
create table servico (
  codigo int auto_increment not null,
  nome varchar(45),
  desc_detalhada varchar(45) not null,
  preco_unico varchar(45) not null,
  unidade varchar(45),
  categoria varchar(45),
  servico_lavanderia_id int not null,
  primary key (codigo),
  foreign key (servico_lavanderia_id) references servico_lavanderia (id)
);
create table servico_copa (
  regis_pedi_cardapio varchar(45) not null,
  cliente_hospede_CPF int not null,
  id int auto_increment not null,
  primary key (id),
  foreign key (cliente_hospede_CPF) references cliente_hospede (CPF)
);
create table cardapio (
  nome varchar(45),
  codigo int auto_increment not null,
  des_detalhada varchar(45),
  preco_unico varchar(45),
  unidade varchar(45),
  categoria varchar(45),
  servico_copa_id int  not null,
  primary key (codigo),
  foreign key (servico_copa_id) references servico_copa (id)
);

ALTER TABLE reserva
ADD FOREIGN KEY (cliente_hospede_CPF) references cliente_hospede(CPF);

