insert into calendario values (70, 'Valorant');

insert into Jornada values (1, 'Jornada1', to_date('11-05-2021','dd-mm-yyyy'), 70);
insert into Jornada values (2, 'Jornada2', to_date('18-05-2021','dd-mm-yyyy'), 70);

insert into equipo values (1, 'G2', 'G2.com', 0, 70);
insert into equipo values (2, 'Fnatic', 'fnatic.com', 0, 70);
insert into equipo values (3, 'sentinels', 'sentinels.com', 0, 70);
insert into equipo values (4, '100thieves', '100thieves.com', 0, 70);
insert into equipo values (5, 'Version 1', 'version1.com', 0, 70);
insert into equipo values (6, 'Liquid', 'liquid.com', 0, 70);

insert into partido (ID, Nombre, ID_local, ID_visitante, Resultado_local, 
Resultado_visitante, ID_Jornada) values (100, 'g2 vs sentinels', 1, 3, 13, 9, 1);
insert into partido (ID, Nombre, ID_local, ID_visitante, Resultado_local, 
Resultado_visitante, ID_Jornada) values (101, 'Fnatic vs 100thieves', 2, 4, 13, 15, 1);
insert into partido (ID, Nombre, ID_local, ID_visitante, Resultado_local, 
Resultado_visitante, ID_Jornada) values (102, 'Version1 vs liquid', 5, 6, 17, 15, 1);
insert into partido (ID, Nombre, ID_local, ID_visitante, Resultado_local, 
Resultado_visitante, ID_Jornada) values (103, 'g2 vs Version1', 1, 5, 13, 7, 2);
insert into partido (ID, Nombre, ID_local, ID_visitante, Resultado_local, 
Resultado_visitante, ID_Jornada) values (104, 'Fnatic vs sentinels', 2, 3, 5, 13, 2);
insert into partido (ID, Nombre, ID_local, ID_visitante, Resultado_local, 
Resultado_visitante, ID_Jornada) values (105, 'liquid vs 100thieves', 6, 4, 13, 15, 2);

insert into personas values(1, 'Oscar', 'Mixwell', 10000, 1);
insert into personas values(2, 'Patryk', 'patitek', 9000, 1);
insert into personas values(3, 'Jacob', 'pyth', 9000, 1);
insert into personas values(4, 'Ardis', 'ardiis', 7000, 1);
insert into personas values(5, 'Aleksander', 'zeek', 8000, 1);
insert into personas values(6, 'Domagoj', 'Doma', 10000, 2);
insert into personas values(7, 'Jake', 'Boaster', 7000, 2);
insert into personas values(8, 'James', 'Mistic', 6000, 2);
insert into personas values(9, 'Nikita', 'Derke', 4000, 2);
insert into personas values(10, 'Martin', 'Magnum', 9000, 2);
insert into personas values(11, 'Tyson', 'TenZ', 14000, 3);
insert into personas values(12, 'Shahzeb', 'Shahzam', 10000, 3);
insert into personas values(13, 'Hunter', 'Sick', 9000, 3);
insert into personas values(14, 'Jared', 'Zombs', 8000, 3);
insert into personas values(15, 'Michael', 'Dapr', 7000, 3);
insert into personas values(16, 'Spencer', 'Hiko', 10000, 4);
insert into personas values(17, 'Nicholas', 'nitr0', 7000, 4);
insert into personas values(18, 'Joshua', 'steel', 8000, 4);
insert into personas values(19, 'Peter', 'Asuna', 7000, 4);
insert into personas values(20, 'Ethan', 'Ethan', 5000, 4);
insert into personas values(21, 'Anthony', 'vanity', 10000, 5);
insert into personas values(22, 'Loic', 'effys', 7000, 5);
insert into personas values(23, 'Erik', 'penny', 8000, 5);
insert into personas values(24, 'Jordan', 'zellsis', 7000, 5);
insert into personas values(25, 'Maxim', 'wippie', 5000, 5);
insert into personas values(26, 'Dom', 'Soulcas', 10000, 6);
insert into personas values(27, 'James', 'Kryptix', 7000, 6);
insert into personas values(28, 'Travis', 'L1nk', 8000, 6);
insert into personas values(29, 'Adil', 'ScreaM', 7000, 6);
insert into personas values(30, 'Elias', 'Jamppi', 5000, 6);

insert into Jugador values(1, 'awper');
insert into Jugador values(2, 'IGL');
insert into Jugador values(3, 'Lurker');
insert into Jugador values(4, 'entry');
insert into Jugador values(5, 'rifler');
insert into Jugador values(6, 'rifler');
insert into Jugador values(7, 'IGL');
insert into Jugador values(8, 'entry');
insert into Jugador values(9, 'lurker');
insert into Jugador values(10, 'awper');
insert into Jugador values(11, 'awper, rifler');
insert into Jugador values(12, 'awper, rifler, IGL');
insert into Jugador values(13, 'entry');
insert into Jugador values(14, 'entry, lurker');
insert into Jugador values(15, 'lurker');
insert into Jugador values(16, 'IGL');
insert into Jugador values(17, 'awper');
insert into Jugador values(18, 'rifler');
insert into Jugador values(19, 'entry');
insert into Jugador values(20, 'Lurker');
insert into Jugador values(21, 'awper');
insert into Jugador values(22, 'entry');
insert into Jugador values(23, 'rifler');
insert into Jugador values(24, 'IGL');
insert into Jugador values(25, 'lurker');
insert into Jugador values(26, 'lurker');
insert into Jugador values(27, 'entry');
insert into Jugador values(28, 'IGL');
insert into Jugador values(29, 'rifler');
insert into Jugador values(30, 'awper');
