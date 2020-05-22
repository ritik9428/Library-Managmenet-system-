# Library-Managmenet-system-
This is JAVA language based Library management system desktop application which uses MySQL in the back-end for storing records.

#Following are some MySQL commands for creating tables in your database

create database library_system;

create table books (bookid int(11) primary key,
book_name varchar(255),
edition varchar(5),
author varchar(255),
publisher varchar(255));
desc books;

create table issue_Details(issue_is varchar(20) primary key,
book_id varchar(20) unique,
student_id varchar(20),
issue_date varchar(20)
);
desc issue_details;

create table librarian (
username varchar(255) primary key,
name varchar(255),
password varchar(255) not null unique,
question varchar(255),
answer varchar(255));
desc librarian;

create table return_details (return_id varchar(30) primary key,
book_id varchar(30),
student_id varchar(30),
return_date varchar(30));
desc return_details;

create table student (
id varchar(20) primary key,
name varchar(255),
branch varchar(20),
email varchar(20),
mobno varchar(20));
desc student;
