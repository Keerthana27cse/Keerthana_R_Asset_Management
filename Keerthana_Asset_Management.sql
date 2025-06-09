create database Asset_Management_System;
use Asset_Management_System;

 -- drop database Asset_Management_System;
 -- drop table Employee;
 -- drop table Assets;
 -- drop table  audit_requets;
 -- drop table service_requets;

-----------------------------------
create  table Employee (employee_id int auto_increment primary key,
name varchar(100) not null,
gender varchar(100) not null,
email varchar(100) unique not null,
password varchar(255) not null,
contact_number varchar(100) not null,
address text not null,
role enum ('ADMIN','EMPLOYEE')not null,
emp_status ENUM('ACTIVE','INACTIVE') default 'ACTIVE',
created_at timestamp default current_timestamp);

-----------------------------------

create table asset_category(category_id int auto_increment primary key,
category_name varchar(100) unique not null,
description text);
---------------------------------

create table Assets(Asset_Id int auto_increment primary key,
asset_no varchar(100) not null unique , 
asset_name varchar(100)not null, 
category_id int , 
asset_model varchar(100), 
manufacturing_date date, 
expiry_date date, 
asset_value date,
asset_image_url varchar(255),
asset_status enum ('AVAILABLE','ALLOCATED','UNDER_SERVICE','EXPIRED') default 'AVAILABLE',
created_at timestamp default current_timestamp);
--------------------------------------------------
create table asset_allocations (
    allocation_id int auto_increment primary key,
    asset_id int,
    employee_id int,
    request_date timestamp default current_timestamp ,
    allocation_date date,
    return_date date,
    allocation_status ENUM('REQUESTED', 'BORROWED', 'RETURNED') DEFAULT 'REQUESTED',
    foreign key (Asset_Id) references assets(asset_id),
    foreign key (employee_id) references employee (employee_id)
);
------------------------------------------

create table service_requests (
request_id int auto_increment primary key,
asset_id int,
employee_id int,
request_date timestamp default current_timestamp,
issue_type enum ('MALFUNCTION', 'REPAIR', 'OTHER'),
description text,
request_status enum ('PENDING', 'IN_PROGRESS', 'COMPLETED', 'REJECTED') DEFAULT 'PENDING',
admin_comment text,
updated_at timestamp null,
foreign key(asset_id) references Assets(asset_id),
foreign key(employee_id)references Employee(employee_id));
------------------------------

create table audit_requests (
audit_id int auto_increment primary key,
asset_id int,
admin_int int,
employee_id  int ,
audit_date timestamp default current_timestamp,
audit_status enum('PENDING','VERIFIED','REFECTED')default 'PENDING',
remarks text,
foreign key (asset_id) references assets(asset_id ),
foreign key (admin_int) references employee (employee_id),
foreign key(employee_id) references employee (employee_id));
------------------------------
select *from Employee;
select *from asset_category;
select *from Assets;
select *from asset_allocations;
select *from service_requests;
select * from audit_requests;