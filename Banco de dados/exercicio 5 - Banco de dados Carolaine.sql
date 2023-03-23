drop database curso;
create database curso;
use curso;
create table professor (
  nome varchar(45),
  endereco varchar(45),
  telefone varchar(45),
  email varchar(45),
  num_matricula int not null,
  primary key (num_matricula)
);
create table sala (
duracao int not null,
id int auto_increment not null,
primary key (id),
professor_num_matricula int not null,
foreign key (professor_num_matricula) references professor (num_matricula)
);
create table curso (
  duracao int not null,
  id int auto_increment not null,
  primary key (id),
  professor_num_matricula int not null,
  foreign key (professor_num_matricula) references professor (num_matricula)
);
create table turma (
  codigo int auto_increment not null,
  periodo varchar(45),
  servico_copa_id int not null,
  curso_id int not null,
  sala_id int not null,
  primary key (codigo),
  foreign key (curso_id) references curso (id),
  foreign key (sala_id) references sala (id)
);
create table aluno (
nome varchar(45),
endereco varchar(45),
telefone varchar(45),
email varchar(45),
rg varchar(45),
cpf varchar(45),
RA int auto_increment not null,
primary key (RA)
);
create table curso_has_aluno (
  curso_id int not null,
  aluno_RA int not null,
  foreign key (curso_id) references curso (id),
  foreign key (aluno_RA) references aluno (RA)
);
create table aluno_has_turma (
aluno_RA int not null,
turma_codigo int not null,
foreign key (aluno_RA) references aluno (RA),
foreign key (turma_codigo) references turma (codigo)
);

