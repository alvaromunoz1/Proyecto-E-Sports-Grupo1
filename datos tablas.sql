insert into calendario values (70, 'Valorant');

insert into Jornada values (1, 'Jornada1', to_date('11-05-2021','dd-mm-yyyy'), 70);
insert into Jornada values (2, 'Jornada2', to_date('18-05-2021','dd-mm-yyyy'), 70);
insert into Jornada values (3, 'Jornada3', to_date('25-05-2021','dd-mm-yyyy'), 70);
insert into Jornada values (4, 'Jornada4', to_date('02-06-2021','dd-mm-yyyy'), 70);
insert into Jornada values (5, 'Jornada5', to_date('09-06-2021','dd-mm-yyyy'), 70);
insert into Jornada values (6, 'Jornada6', to_date('16-06-2021','dd-mm-yyyy'), 70);
insert into Jornada values (7, 'Jornada7', to_date('23-06-2021','dd-mm-yyyy'), 70);
insert into Jornada values (8, 'Jornada8', to_date('30-06-2021','dd-mm-yyyy'), 70);

insert into equipo values (1, 'G2', 'G2.com', 0, 70);
insert into equipo values (2, 'Fnatic', 'fnatic.com', 0, 70);
insert into equipo values (3, 'sentinels', 'sentinels.com', 0, 70);
insert into equipo values (4, '100thieves', '100thieves.com', 0, 70);
insert into equipo values (5, 'Version 1', 'version1.com', 0, 70);
insert into equipo values (6, 'Liquid', 'liquid.com', 0, 70);
insert into equipo values (7, 'T1', 't1.com', 0, 70);
insert into equipo values (8, 'Heretics', 'heretics.com', 0, 70);

insert into partido (ID, Nombre, ID_local, ID_visitante, Resultado_local, 
Resultado_visitante, ID_Jornada) values (100, 'g2 vs sentinels', 1, 3, null, null, 1);
insert into partido (ID, Nombre, ID_local, ID_visitante, Resultado_local, 
Resultado_visitante, ID_Jornada) values (101, 'Fnatic vs 100thieves', 2, 4, null, null, 1);
insert into partido (ID, Nombre, ID_local, ID_visitante, Resultado_local, 
Resultado_visitante, ID_Jornada) values (102, 'Version1 vs liquid', 5, 6, null, null, 1);
insert into partido (ID, Nombre, ID_local, ID_visitante, Resultado_local, 
Resultado_visitante, ID_Jornada) values (103, 'T1 vs Heretics', 7, 8, null, null, 1);
insert into partido (ID, Nombre, ID_local, ID_visitante, Resultado_local, 
Resultado_visitante, ID_Jornada) values (104, 'g2 vs Version1', 1, 5, null, null, 2);
insert into partido (ID, Nombre, ID_local, ID_visitante, Resultado_local, 
Resultado_visitante, ID_Jornada) values (105, 'Fnatic vs sentinels', 2, 3, null, null, 2);
insert into partido (ID, Nombre, ID_local, ID_visitante, Resultado_local, 
Resultado_visitante, ID_Jornada) values (106, 'liquid vs 100thieves', 6, 4, null, null, 2);
insert into partido (ID, Nombre, ID_local, ID_visitante, Resultado_local, 
Resultado_visitante, ID_Jornada) values (107, 'Heretics vs T1', 8, 7, null, null, 2);
insert into partido (ID, ID_Jornada) values (108, 3);
insert into partido (ID, ID_Jornada) values (109, 3);
insert into partido (ID, ID_Jornada) values (110, 3);
insert into partido (ID, ID_Jornada) values (111, 3);

insert into partido (ID, ID_Jornada) values (112, 4);
insert into partido (ID, ID_Jornada) values (113, 4);
insert into partido (ID, ID_Jornada) values (114, 4);
insert into partido (ID, ID_Jornada) values (115, 4);

insert into partido (ID, ID_Jornada) values (116, 5);
insert into partido (ID, ID_Jornada) values (117, 5);
insert into partido (ID, ID_Jornada) values (118, 5);
insert into partido (ID, ID_Jornada) values (119, 5);

insert into partido (ID, ID_Jornada) values (120, 6);
insert into partido (ID, ID_Jornada) values (121, 6);
insert into partido (ID, ID_Jornada) values (122, 6);
insert into partido (ID, ID_Jornada) values (123, 6);

insert into partido (ID, ID_Jornada) values (124, 7);
insert into partido (ID, ID_Jornada) values (125, 7);
insert into partido (ID, ID_Jornada) values (126, 7);
insert into partido (ID, ID_Jornada) values (127, 7);

insert into partido (ID, ID_Jornada) values (128, 8);
insert into partido (ID, ID_Jornada) values (129, 8);
insert into partido (ID, ID_Jornada) values (130, 8);
insert into partido (ID, ID_Jornada) values (131, 8);

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
insert into personas values(29, 'Adil', 'ScreaM', 11000, 6);
insert into personas values(30, 'Elias', 'Jamppi', 5000, 6);
insert into personas values(31, 'Tyler', 'Skadoodle', 5000, 7);
insert into personas values(32, 'Sam', 'DaZeD', 10000, 7);
insert into personas values(33, 'Ha Jung-woo', 'Spyder', 7000, 7);
insert into personas values(34, 'Timothy', 'autimatic', 8000, 7);
insert into personas values(35, 'Rahul', 'curry', 7000, 7);
insert into personas values(36, 'Ruben', 'RUBINO', 5000, 8);
insert into personas values(37, 'Auni', 'AvovA', 5000, 8);
insert into personas values(38, 'Žygimantas', 'nukkye', 10000, 8);
insert into personas values(39, 'Melih', 'pAura', 7000, 8);
insert into personas values(40, 'Mikel', 'Lowel', 8000, 8);
insert into personas values(41, 'Javi', 'Pum', 5000, 1);
insert into personas values(42, 'Sheldon', 'Hulk', 11000, 2);
insert into personas values(43, 'Peter', 'Riky', 9000, 3);
insert into personas values(44, 'Harry', 'Toy', 7000, 4);
insert into personas values(45, 'Aitor', 'Capi', 8000, 5);
insert into personas values(46, 'Ferdinand', 'Mister', 12000, 6);
insert into personas values(47, 'Troy', 'Lowel', 8000, 7);
insert into personas values(48, 'Christian', 'Ornjias', 6000, 8);
insert into personas values(49, 'Miquel', 'Pum', 5000, 1);
insert into personas values(50, 'Ozimantias', 'Hulk', 11000, 2);
insert into personas values(51, 'Imanol', 'Riky', 9000, 3);
insert into personas values(52, 'Sergio', 'Toy', 7000, 4);
insert into personas values(53, 'Aitor', 'Capi', 8000, 5);
insert into personas values(54, 'Luis', 'Mister', 12000, 6);
insert into personas values(55, 'Leonard', 'Lowel', 8000, 7);
insert into personas values(56, 'Bartolo', 'Ornjias', 6000, 8);
insert into personas values(57, 'Javier', 'Pum', 5000, 1);
insert into personas values(58, 'Paco', 'Hulk', 10000, 2);
insert into personas values(59, 'Quasimodo', 'Riky', 9000, 3);
insert into personas values(60, 'Harper', 'Toy', 7000, 4);
insert into personas values(61, 'Gorka', 'Capi', 8000, 5);
insert into personas values(62, 'Eneko', 'Mister', 9000, 6);
insert into personas values(63, 'Michael', 'Lowel', 8000, 7);
insert into personas values(64, 'Chrisi', 'Ornjias', 6000, 8);

insert into Jugador values(1, 'Duelista, sniper, capitan');
insert into Jugador values(2, 'Controlador, lurker');
insert into Jugador values(3, 'Centinela, Reconocimiento');
insert into Jugador values(4, 'Iniciador, Control de multitudes, Reconocimiento');
insert into Jugador values(5, 'Duelista, Entry');
insert into Jugador values(6, 'Duelista, Entry');
insert into Jugador values(7, 'Iniciador, Control de multitudes, Reconocimiento, Capitan');
insert into Jugador values(8, 'Controlador, Control de multitudes');
insert into Jugador values(9, 'Duelista, Entry');
insert into Jugador values(10, 'Centinela, Control de multitudes');
insert into Jugador values(11, 'Duelista, Sniper');
insert into Jugador values(12, 'Polivalente, Sniper, capitan');
insert into Jugador values(13, 'Duelista, Entry');
insert into Jugador values(14, 'Controlador, Control de multitudes');
insert into Jugador values(15, 'Centinela, Reconocimiento');
insert into Jugador values(16, 'Iniciador, Control de multitudes, Reconocimiento');
insert into Jugador values(17, 'Controlador, Sniper, Lurker');
insert into Jugador values(18, 'Centinela, Control de multitudes, Capitan');
insert into Jugador values(19, 'Duelista, Entry');
insert into Jugador values(20, 'Centinela, Apoyo');
insert into Jugador values(21, 'Controlador, sniper, capitan');
insert into Jugador values(22, 'Iniciador, Control de multitudes, Reconocimiento');
insert into Jugador values(23, 'Duelista, Entry');
insert into Jugador values(24, 'Duelista, Control de multitudes');
insert into Jugador values(25, 'Controlador, Control de multitudes');
insert into Jugador values(26, 'Iniciador, Control de multitudes, Reconocimiento');
insert into Jugador values(27, 'Controladores, Entry');
insert into Jugador values(28, 'Controlador, Control de multitudes, lurker');
insert into Jugador values(29, 'Duelista, Control de multitudes');
insert into Jugador values(30, 'Duelista, sniper');
insert into Jugador values(31, 'Controlador, Control de multitudes');
insert into Jugador values(32, 'Iniciador, Control de multitudes, Reconocimiento, Capitan');
insert into Jugador values(33, 'Duelista, Entry');
insert into Jugador values(34, 'Duelista, Entry');
insert into Jugador values(35, 'Centinela, Reconocimiento');
insert into Jugador values(36, 'Iniciador, Control de multitudes, Reconocimiento');
insert into Jugador values(37, 'Controlador, Control de multitudes');
insert into Jugador values(38, 'Duelista, Entry');
insert into Jugador values(39, 'Centinela, Control de multitudes, Reconocimiento');
insert into Jugador values(40, 'Centinela, Apoyo, Capitan');

insert into Dueino values(41, 3);
insert into Dueino values(42, 5);
insert into Dueino values(43, 13);
insert into Dueino values(44, 9);
insert into Dueino values(45, 3);
insert into Dueino values(46, 4);
insert into Dueino values(47, 12);
insert into Dueino values(48, 1);

insert into Asistente values(49, 13);
insert into Asistente values(50, 15);
insert into Asistente values(51, 3);
insert into Asistente values(52, 19);
insert into Asistente values(53, 6);
insert into Asistente values(54, 7);
insert into Asistente values(55, 1);
insert into Asistente values(56, 1);

insert into Entrenador values(57, 'www.@gmail.com');
insert into Entrenador values(58, 'www.@gmail.com');
insert into Entrenador values(59, 'www.@gmail.com');
insert into Entrenador values(60, 'www.@gmail.com');
insert into Entrenador values(61, 'www.@gmail.com');
insert into Entrenador values(62, 'www.@gmail.com');
insert into Entrenador values(63, 'www.@gmail.com');
insert into Entrenador values(64, 'www.@gmail.com');


insert into Usuarios values(01, 'Imanol', 'ima123', 'A');
insert into Usuarios values(02, 'Sergio', 'ima123', 'C');

