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
ID_Calendario           INT,
CONSTRAINT ID_Calendario_FK foreign key (ID_Calendario)
references Calendario (ID)
);

create table Pesonas(
ID                  INT PRIMARY KEY,
Nombre              varchar2(20),
Nick                VARCHAR2(15),
Sueldo              NUMBER(5,2),
ID_Equipo           INT,
CONSTRAINT ID_Equipo_FK foreign key (ID_Equipo)
references Equipo (ID)
);

create table Dueino(
Anios_Dueino        INT
) inherits (Personas);

create table Entrenador(
ID                  INT PRIMARY KEY,
Nombre              varchar2(20),
Nick                VARCHAR2(15),
Sueldo              NUMBER(5,2),
Nombre_Equipo       VARCHAR2(50),
CONSTRAINT Nombre_Equipo3_FK foreign key (Nombre_Equipo)
references Equipo (Nombre)
);

create table Asistente(
ID                  INT PRIMARY KEY,
Nombre              varchar2(20),
Nick                VARCHAR2(15),
Sueldo              NUMBER(5,2),
Nombre_Equipo       VARCHAR2(50),
CONSTRAINT Nombre_Equipo6_FK foreign key (Nombre_Equipo)
references Equipo (Nombre)
);

create table Jugador(
ID                  INT PRIMARY KEY,
Nombre              varchar2(20),
Nick                VARCHAR2(15),
Sueldo              NUMBER(5,2),
Rol                 varchar2(10),
Nombre_Equipo       VARCHAR2(50),
CONSTRAINT Nombre_Equipo4_FK foreign key (Nombre_Equipo)
references Equipo (Nombre)
);

create table Usuarios(
ID                  INT PRIMARY KEY,
Nombre              varchar2(20),
Contraseina         varchar2(30),
tipo                VARCHAR2(15)
);

