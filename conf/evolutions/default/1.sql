# --- Created by Ebean DDL
# To stop Ebean DDL generation, remove this comment and start using Evolutions

# --- !Ups

create table companies (
  id                        serial not null,
  name                      varchar(255),
  created_at                timestamp not null,
  updated_at                timestamp not null,
  constraint pk_companies primary key (id))
;

create table educations (
  id                        serial not null,
  school                    varchar(255),
  year_start                varchar(4),
  year_until                varchar(4),
  degree                    integer,
  field                     varchar(255),
  description               varchar(255),
  employee_id               integer,
  created_at                timestamp not null,
  updated_at                timestamp not null,
  constraint pk_educations primary key (id))
;

create table employees (
  id                        serial not null,
  first_name                varchar(255),
  last_name                 varchar(255),
  nickname                  varchar(255),
  email_address             varchar(255),
  mobile_phone              varchar(255),
  avatar                    varchar(255),
  joined_at                 timestamp,
  company_id                integer,
  created_at                timestamp not null,
  updated_at                timestamp not null,
  constraint uq_employees_company_id unique (company_id),
  constraint pk_employees primary key (id))
;

create table roles (
  id                        serial not null,
  title                     varchar(50),
  created_at                timestamp not null,
  updated_at                timestamp not null,
  constraint pk_roles primary key (id))
;

create table users (
  id                        serial not null,
  first_name                varchar(255),
  last_name                 varchar(255),
  password                  varchar(255),
  email                     varchar(255),
  avatar                    varchar(255),
  company_id                integer,
  created_at                timestamp not null,
  updated_at                timestamp not null,
  constraint uq_users_company_id unique (company_id),
  constraint pk_users primary key (id))
;


create table users_roles (
  role_id                        integer not null,
  user_id                        integer not null,
  constraint pk_users_roles primary key (role_id, user_id))
;
alter table educations add constraint fk_educations_employee_1 foreign key (employee_id) references employees (id);
create index ix_educations_employee_1 on educations (employee_id);
alter table employees add constraint fk_employees_company_2 foreign key (company_id) references companies (id);
create index ix_employees_company_2 on employees (company_id);
alter table users add constraint fk_users_company_3 foreign key (company_id) references companies (id);
create index ix_users_company_3 on users (company_id);



alter table users_roles add constraint fk_users_roles_roles_01 foreign key (role_id) references roles (id);

alter table users_roles add constraint fk_users_roles_users_02 foreign key (user_id) references users (id);

# --- !Downs

drop table if exists companies cascade;

drop table if exists educations cascade;

drop table if exists employees cascade;

drop table if exists roles cascade;

drop table if exists users_roles cascade;

drop table if exists users cascade;

