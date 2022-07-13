use RAPortal;
create table if not exists UserDemographicData( ParticipantID varchar(15) not null, ParticipantName varchar(50) not null, Gender varchar(10) not null, Dateofbirth date not null, profession varchar(20) not null, phonenumber varchar(12) not null,email varchar(50) not null, FavouriteLanguage varchar(20) not null, Highesteducation varchar(30) not null, state varchar(30) not null, country varchar(30) not null, fieldofinterest varchar(100) not null, termsandconditions varchar(50) not null, score int(5), primary key(ParticipantID));

insert into UserDemographicData values("Entrant00001","test","Male","26-06-2002","Student","9876543201","test@testuser.com","c++","Matriculation","Rajasthan","India","CyberSeurity","Accepted","0");

select * from UserDemographicData;


select count(*) from UserDemographicData;

insert into UserDemographic values(\""+id+"\",)
