USE RAPortal;
DROP TABLE questionbank;
create table if not exists Questionbank(
QuestionBankID varchar(50),
programminglanguage varchar(15) not null,
languagelevel varchar(15) not null,
codenumber int(1) not null,
codeimage blob not null,
codetimer time not null,
quiztimer time not null,
primary key (QuestionBankID)
);
drop table questions;
create table if not exists Questions(
questionID varchar(50),
QuestionBankID varchar(50),
questionnumber int(1) not null,
question varchar(300) not null,
option1 varchar(100) not null,
option2 varchar(100) not null,
option3 varchar(100) not null,
option4 varchar(100) not null,
correctoption varchar(100) not null,
questionscore int(1) not null,
primary key (questionID),
Foreign Key (QuestionBankID) References Questionbank(QuestionBankID)
);

describe questionbank;
describe questions;

show tables;
