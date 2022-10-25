create tablespace INFRADATA
	datafile '/u02/oracle/infrawalk/INFRADATA.dbf' size 10M
	extent management local autoallocate segment space management auto;
	
create user morris
	identified by morris
	default tablespace INFRADATA;
	profile default;
	account unlock;
	
grant connect to morris;
grant dba to morris;

alter user morris quota unlimited on INFRADATA;
grant create table to morris;	

-- https://www.youtube.com/watch?v=zcKR0KhTgHg