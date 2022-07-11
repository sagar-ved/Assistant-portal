use RAPortal;
CREATE TABLE IF NOT EXISTS AdminData (UserName varchar(10) NOT NULL, UserPassword VARCHAR(15) NOT NULL, AdminName  VARCHAR(30) NOT NULL,PRIMARY KEY (UserName));
show tables;
insert into AdminData values("ADMIN0002","IIITV@123");
select * from AdminData;


update AdminData set UserPassword  =  "IIITV@1236" where UserName = "ADMIN0002";

delete from AdminData where UserName = "ADMIN0002";

select count(*) from AdminData;

SELECT *
FROM INFORMATION_SCHEMA.COLUMNS
WHERE table_name = 'Questionbank';
