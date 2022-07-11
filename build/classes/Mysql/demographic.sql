use RAPortal;
create table if not exists UserDemographicData( ParticipantID varchar(15) not null, ParticipantName varchar(50) not null, Gender varchar(10) not null, Dateofbirth date not null, worksas varchar(20) not null, phonenumber varchar(12) not null,email varchar(50) not null, FavouriteLanguage varchar(20) not null, Highesteducation varchar(30) not null, state varchar(30) not null, country varchar(30) not null, fieldofinterest varchar(100) not null, termsandconditions varchar(50) not null, score int(5), primary key(ParticipantID));

insert into UserDemographicData values()

select * from UserDemographicData;


select count(*) from UserDemographicData;