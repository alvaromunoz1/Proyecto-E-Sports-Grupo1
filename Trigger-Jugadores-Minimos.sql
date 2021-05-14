CREATE OR REPLACE TRIGGER Jugadores_minimos
BEFORE INSERT ON Calendario
--Por cada fila de la tabla
FOR EACH ROW -- Si se olvida no se comporta bie

DECLARE
	Cant_jug NUMBER(5);
BEGIN
	SELECT COUNT(Nombre_Equipo)
	INTO Cant_jug
	FROM Jugador
	GROUP BY Nombre_Equipo;

	IF (Cant_jug < 2) THEN
		raise_application_error(-20500,'La cantidad de jugadores de algun equipo es menor de 2.');
	END IF;
EXCEPTION
	WHEN NO_DATA_FOUND THEN
      raise_application_error (-20500,'No existen jugadores.');
    WHEN too_many_rows then
       raise_application_error (-20500,'Error al recuperar datos');

END Control_Empleados;



SELECT COUNT(Nombre_Equipo)
	INTO Cant_jug
	FROM Jugador
	GROUP BY Nombre_Equipo;