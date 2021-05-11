insert into calendario values (70, 'Valorant');

insert into Jornada values (1, 'Jornada1', to_date('11-05-2021','dd-mm-yyyy'), 70);
insert into Jornada values (2, 'Jornada2', to_date('18-05-2021','dd-mm-yyyy'), 70);

insert into equipo values (1, 'G2', 'G2.com', 0, 70);
insert into equipo values (2, 'Fnatic', 'fnatic.com', 0, 70);
insert into equipo values (3, 'sentinels', 'sentinels.com', 0, 70);
insert into equipo values (4, '100thieves', '100thieves.com', 0, 70);

insert into partido (ID, Nombre, ID_local, ID_visitante, Resultado_local, 
Resultado_visitante, ID_Jornada) values (100, 'g2 vs sentinels', 1, 3, 13, 9, 1);
insert into partido (ID, Nombre, ID_local, ID_visitante, Resultado_local, 
Resultado_visitante, ID_Jornada) values (101, 'Fnatic vs 100thieves', 2, 4, 13, 15, 1);
insert into partido (ID, Nombre, ID_local, ID_visitante, Resultado_local, 
Resultado_visitante, ID_Jornada) values (102, 'g2 vs 100thieves', 1, 4, 13, 7, 2);
insert into partido (ID, Nombre, ID_local, ID_visitante, Resultado_local, 
Resultado_visitante, ID_Jornada) values (103, 'Fnatic vs sentinels', 2, 3, 5, 13, 2);

insert into personas values(1, 'Oscar', 'Mixwell', 10000, 1);
insert into personas values(2, 'Olofmeister', 'Olofmeister', 10000, 2);
insert into personas values(3, 'Tyson', 'TenZ', 5000, 3);
insert into personas values(4, 'Hiko', 'Hiko', 5000, 4);

insert into Jugador values(1, 'awper');
insert into Jugador values(2, 'lurker');
insert into Jugador values(3, 'Entry');
insert into Jugador values(4, 'IGL');

