--ALTER SYSTEM SET SEC_CASE_SENSITIVE_LOGON=FALSE SCOPE=BOTH;
--students table for holding data of students
create table students_tbl(
	student_ID number not null,
	student_FName varchar2(100) not null,
	student_ONames varchar2(120) not null,
	student_Email varchar2(100) not null,
	student_Phone varchar2(100) not null,
	student_Course varchar2(100) not null,
	--I'd like to have a primary key and have it auto increment with each new entry
	primary key (student_ID)
);

create sequence student_ID minvalue 1 start with 6068 cache 10;

--Host server table for the host servers
create table hostServer_tbl(
	serverIP varchar2(15) not null,
	serverName varchar2(25),
	constraint hostServer_tbl_pk primary key (serverIP)
);

create table servers_tbl(
	serversIP varchar2(15) not null,
	contents varchar2(100),
	opSys varchar2(20),
	hostServerIP varchar2(15) not null references hostServer_tbl(serverIP),--fk hostServer_tbl,serverIP varchar2(15) not null
	constraint servers_tbl_pk primary key (serversIP)
);

create table databases_tbl(
	database_id number not null,
	database_name varchar2(100) not null,
	database_type varchar2(10) not null,
	SID varchar2(20) not null,
	portNumber varchar2(5) not null,
	students_ID number not null references students_tbl(student_ID ),
	serverIP varchar(15) not null references servers_tbl(serversIP), --fk servers_tbl,serversIP
	primary key (database_id)
);
create sequence database_id minvalue 1 start with 111 cache 10;

create table special_requests (
	request_id number not null,
	request_title varchar2(100) not null,
	request_body varchar2(2000) not null,
	request_date varchar2(10) not null,
	request_response varchar2(200),
	response_date varchar2(10),
	request_status varchar2(1),
	student_id number not null,
	primary key (request_id)
);
create sequence request_id minvalue 1 start with 1 cache 10;

create table courses_tbl (
	course_id number not null,
	course_name varchar2(100) not null,
	course_shortName varchar2(100) not null,
	primary key (course_id)
);
create sequence course_id minvalue 1 start with 222 cache 10;

create table users_tbl(
	user_id number not null,
	first_name varchar(50) not null,
	other_names varchar(200) not null,
	username varchar(50) not null,
	passwds varchar(100) not null,
	primary key (user_id)
);
create sequence user_id minvalue 1 start with 1111 cache 10;

---insert some test data
--students table
insert into students_tbl values (student_ID.nextval,'Alex','Mugangi','AlekiMugs@yu.com','333444567','DBA cert');
insert into students_tbl values (student_ID.nextval,'Mui','Dany','muidan@yu.com','0938876','OCA cert');
insert into students_tbl values (student_ID.nextval,'Morris','Ki','Moki@yu.com','0987488','DBA cert');
insert into students_tbl values (student_ID.nextval,'Alex','Wui','alewui@yu.com','84767','OCA cert');
insert into students_tbl values (student_ID.nextval,'Derrik','Weum','DerriWu@yu.com','9987633','Cyber Sec');
insert into students_tbl values (student_ID.nextval,'Alex','Wui','alewui@yu.com','987765','Web Dev');

--Host server tables
insert into hostServer_tbl values ('11.176.15.20','Samba Server');
insert into hostServer_tbl values ('11.176.15.21','Sima Server');
insert into hostServer_tbl values ('11.176.15.22','Sigma Server');


--Db or other server data
insert into servers_tbl values ('11.176.15.10','databases','Oracle Linux 7.3','11.176.15.20');
insert into servers_tbl values ('11.176.15.8','databases','Oracle Linux 7.9','11.176.15.22');
insert into servers_tbl values ('11.176.15.11','databases','Solaris','11.176.15.22');
insert into servers_tbl values ('11.176.15.12','databases','RedHat Linux 8','11.176.15.20');
insert into servers_tbl values ('11.176.15.9','databases','Ubuntu','11.176.15.21');
insert into servers_tbl values ('11.176.15.13','databases','Oracle Linux 7.9','11.176.15.22');
insert into servers_tbl values ('11.176.15.14','databases','Oracle Linux 6','11.176.15.21');
insert into servers_tbl values ('11.176.15.5','databases','RedHat Linux 7','11.176.15.20');
insert into servers_tbl values ('11.176.15.6','File Server','Windows Server','11.176.15.21');

--databases_tbl table for holding data on the different databases available.

insert into databases_tbl values (database_id.nextval,'gregor','Oracle 12c','gregor','1521','6068','11.176.15.13');
insert into databases_tbl values (database_id.nextval,'litmus','Oracle 12c','litmus','1522','6069','11.176.15.13');
insert into databases_tbl values (database_id.nextval,'Quest','Oracle 19c','Quest','1521','6070','11.176.15.5');
insert into databases_tbl values (database_id.nextval,'Believ','Oracle 12c','Believ','1523','6071','11.176.15.5');
insert into databases_tbl values (database_id.nextval,'Aleki','Oracle 10g','Aleki','1521','6072','11.176.15.11');
insert into databases_tbl values (database_id.nextval,'Meat','Oracle 11g','Meat','1522','6073','11.176.15.8');

---courses table data
insert into courses_tbl values (course_id.nextval, 'Database Administration Certification','DBA cert');
insert into courses_tbl values (course_id.nextval, 'Oracle Certified Administrator Certificate','OCA cert');
insert into courses_tbl values (course_id.nextval, 'Cyber Security','Cyber Sec');
insert into courses_tbl values (course_id.nextval, 'Web Development Technologies','Web Dev');
insert into courses_tbl values (course_id.nextval, 'Certification in Linux Administration','Linux Admin');

--users
insert into users_tbl values (user_id.nextval, 'Morris', 'Morrison Kwemi', 'morris', 'morris');