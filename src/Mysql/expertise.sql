create table IF NOT EXISTS expertise(

PARTICIPANTID VARCHAR(10) NOT null,
PROGRAMMINGLANGUAGE VARCHAR(15) NOT NULL,
LANGUAGELEVEL VARCHAR(15) NOT NULL,
DURATIONOFUSE VARCHAR(30) NOT NULL,
EXACTTIME VARCHAR(30) NOT NULL,
LASTUSED VARCHAR(30) NOT NULL,
PRIMARY KEY(PARTICIPANTID)
);