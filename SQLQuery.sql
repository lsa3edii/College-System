use CollegeSystem
go

create table admin
(
	admin_id int not null,
	name varchar(20) not null,
	password varchar(20) not null

	constraint admin_pk primary key(admin_id)
);

create table lecturers
(
	lecturer_id int not null,
	name varchar(20) not null,
	password varchar(20) not null

	constraint lecturers_pk primary key(lecturer_id)
);

create table students
(
	student_id int not null,
	name varchar(20) not null,
	password varchar(20) not null

	constraint students_pk primary key(student_id)
);

exec sp_rename 'admin', 'admins';

delete from admin 
where admin_id = 2;