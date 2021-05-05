drop table Calendario cascade constraints;
drop table Jornada cascade constraints;
drop table Partido cascade constraints;
drop table Equipo cascade constraints;
drop table Juega cascade constraints;
drop table Dueino cascade constraints;
drop table Entrenador cascade constraints;
drop table Jugador cascade constraints;
drop table Usuarios cascade constraints;

create table Calendario(
Nombre  varchar2(50) PRIMARY KEY
);

create table Jornada(
Nombre              varchar2(50) PRIMARY KEY,
Fecha               date,
Nombre_Calendario   VARCHAR2(50),
CONSTRAINT Nombre_Cal_FK foreign key (Nombre_Calendario)
references Calendario (Nombre)
);

create table Partido(
Nombre              varchar2(50) PRIMARY KEY,
Hora                TIMESTAMP,
Nombre_Jornada      VARCHAR2(50),
CONSTRAINT Nombre_Jornada_FK foreign key (Nombre_Jornada) 
references Jornada (Nombre)
);

create table Equipo(
Nombre                  varchar2(50) PRIMARY KEY,
Nombre_Calendario       VARCHAR2(50),
CONSTRAINT Nombre_Calendario_FK foreign key (Nombre_Calendario)
references Calendario (Nombre)
);

create table Juega(
ID                  INT PRIMARY KEY,
Nombre_Partido       VARCHAR2(50),
Nombre_Equipo1       VARCHAR2(50),
Nombre_Equipo2       VARCHAR2(50),
CONSTRAINT Nombre_Partido_FK foreign key (Nombre_Partido)
references Partido (Nombre),
CONSTRAINT Nombre_Equipo1_FK foreign key (Nombre_Equipo1)
references Equipo (Nombre),
CONSTRAINT Nombre_Equipo2_FK foreign key (Nombre_Equipo2)
references Equipo (Nombre)
);

create table Dueino(
ID                  INT PRIMARY KEY,
Nombre              varchar2(20),
Nick                VARCHAR2(15),
Sueldo              INT,
Nombre_Equipo       VARCHAR2(50),
CONSTRAINT Nombre_Equipo_FK foreign key (Nombre_Equipo)
references Equipo (Nombre)
);

create table Entrenador(
ID                  INT PRIMARY KEY,
Nombre              varchar2(20),
Nick                VARCHAR2(15),
Sueldo              INT,
Nombre_Equipo       VARCHAR2(50),
Asistente           varchar2(20) null,
CONSTRAINT Nombre_Equipo3_FK foreign key (Nombre_Equipo)
references Equipo (Nombre)
);

create table Jugador(
ID                  INT PRIMARY KEY,
Nombre              varchar2(20),
Nick                VARCHAR2(15),
Sueldo              INT,
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

