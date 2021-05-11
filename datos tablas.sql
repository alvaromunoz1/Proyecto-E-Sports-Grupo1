insert into calendario values (70, 'Valorant');

insert into Jornada (nombre, fecha, id_calendario) values ('Jornada1', to_date('11-05-2021','dd-mm-yyyy'), 70);
insert into Jornada (nombre, fecha, id_calendario) values ('Jornada2', to_date('18-05-2021','dd-mm-yyyy'), 70);

insert into equipo values (1, 'G2', 'G2.com', 0, 70);
insert into equipo values (2, 'Fnatic', 'fnatic.com', 0, 70);
insert into equipo values (3, 'sentinels', 'sentinels.com', 0, 70);
insert into equipo values (4, '100thieves', '100thieves.com', 0, 70);

insert into partido (ID, Nombre, ID_local, ID_visitante, hora, Resultado_local, 
Resultado_visitante) values (100, 'g2 vs sentinels', 1, 3, TO_TIMESTAMP('10-SEP-0214:10:10','DD-MON-RRHH24:MI:SS'), 13, 9);
insert into partido (ID, Nombre, ID_local, ID_visitante, Resultado_local, 
Resultado_visitante) values (101, 'Fnatic vs 100thieves', 2, 4, 13, 15);
insert into partido (ID, Nombre, ID_local, ID_visitante, Resultado_local, 
Resultado_visitante) values (102, 'g2 vs 100thieves', 1, 4, 13, 7);
insert into partido (ID, Nombre, ID_local, ID_visitante, Resultado_local, 
Resultado_visitante) values (103, 'Fnatic vs sentinels', 2, 3, 5, 13);

insert into personas values(1, 'Oscar', 'Mixwell', 10000, 1);
insert into personas values(2, 'Olofmeister', 'Olofmeister', 10000, 2);
insert into personas values(3, 'Tyson', 'TenZ', 5000, 3);
insert into personas values(4, 'Hiko', 'Hiko', 5000, 4);

insert into Jugador values(1, 'awper');
insert into Jugador values(2, 'lurker');
insert into Jugador values(3, 'Entry');
insert into Jugador values(4, 'IGL');

