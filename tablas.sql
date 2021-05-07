drop table Calendario cascade constraints;
drop table Jornada cascade constraints;
drop table Partido cascade constraints;
drop table Equipo cascade constraints;
drop table Personas cascade constraints;
drop table Dueino cascade constraints;
drop table Entrenador cascade constraints;
drop table Asistente cascade constraints;
drop table Jugador cascade constraints;
drop table Usuarios cascade constraints;

create table Calendario(
ID      INT PRIMARY KEY,
Nombre  varchar2(50)
);

create table Jornada(
ID                  INT PRIMARY KEY,
Nombre              varchar2(50),
Fecha               date,
ID_Calendario       INT,
CONSTRAINT ID_Cal_FK foreign key (ID_Calendario)
references Calendario (ID)
);

create table Partido(
ID                  INT PRIMARY KEY,
Nombre              varchar2(50),
Hora                TIMESTAMP,
ID_Jornada          INT,
CONSTRAINT ID_Jornada_FK foreign key (ID_Jornada) 
references Jornada (ID)
);

create table Equipo(
ID                      INT PRIMARY KEY,
Nombre                  varchar2(50),
Pagina_Web              varchar2(50),
Puntos                  INT,
ID_Calendario           INT,
CONSTRAINT ID_Calendario_FK foreign key (ID_Calendario)
references Calendario (ID)
);

create table Personas(
ID                  INT PRIMARY KEY,
Nombre              varchar2(20),
Nick                VARCHAR2(15),
Sueldo              NUMBER(5,2),
ID_Equipo           INT,
tipo                CHAR(1),
constraint tipo_ck check(tipo in('D','E','A','J')),
CONSTRAINT ID_Equipo1_FK foreign key (ID_Equipo)
references Equipo (ID)
);

create table Dueino(
ID                  INT PRIMARY KEY,
Nombre              varchar2(20),
Nick                VARCHAR2(15),
Sueldo              NUMBER(5,2),
ID_Equipo           INT,
Anios_Dueino        INT,
CONSTRAINT ID_Equipo2_FK foreign key (ID_Equipo)
references Equipo (ID)
);

create table Entrenador(
ID                  INT PRIMARY KEY,
Nombre              varchar2(20),
Nick                VARCHAR2(15),
Sueldo              NUMBER(5,2),
mail                VARCHAR2(25),
ID_Equipo           INT,
CONSTRAINT ID_Equipo3_FK foreign key (ID_Equipo)
references Equipo (ID)
);

create table Asistente(
ID                  INT PRIMARY KEY,
Nombre              varchar2(20),
Nick                VARCHAR2(15),
Sueldo              NUMBER(5,2),
Anios_Asistente     INT,
ID_Equipo           int,
CONSTRAINT ID_Equipo4_FK foreign key (ID_Equipo)
references Equipo (ID)
);

create table Jugador(
ID                  INT PRIMARY KEY,
Nombre              varchar2(20),
Nick                VARCHAR2(15),
Sueldo              NUMBER(5,2),
Rol                 varchar2(10),
ID_Equipo           INT,
CONSTRAINT ID_Equipo5_FK foreign key (ID_Equipo)
references Equipo (ID)
);

create table Usuarios(
ID                  INT PRIMARY KEY,
Nombre              varchar2(20),
Contraseina         varchar2(30),
tipo                CHAR(1),
constraint tipe_ck check(tipo in('A','U'))
);

