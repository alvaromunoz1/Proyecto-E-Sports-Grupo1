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
Resultado_equipo1   int,           
Resultado_equipo2   int,           
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
CONSTRAINT ID_Equipo1_FK foreign key (ID_Equipo)
references Equipo (ID)
);

create table Dueino(
IDD                  INT PRIMARY KEY,
Anios_Dueino        INT,
CONSTRAINT ID_Persona1_FK foreign key (IDD)
references Personas (ID)
);

create table Entrenador(
IDE                  INT PRIMARY KEY,
mail                VARCHAR2(25),
CONSTRAINT ID_Persona2_FK foreign key (IDE)
references Personas (ID)
);

create table Asistente(
IDA                  INT PRIMARY KEY,
Anios_Asistente     INT,
CONSTRAINT ID_Persona3_FK foreign key (IDA)
references Personas (ID)
);

create table Jugador(
IDJ                  INT PRIMARY KEY,
Rol                 varchar2(10),
CONSTRAINT ID_Persona4_FK foreign key (IDJ)
references Personas (ID)
);

create table Usuarios(
ID                  INT PRIMARY KEY,
Nombre              varchar2(20),
Contraseina         varchar2(30),
tipo                CHAR(1),
constraint tipe_ck check(tipo in('A','C'))
);

