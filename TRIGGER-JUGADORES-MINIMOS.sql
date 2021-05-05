CREATE OR REPLACE TRIGGER Jugadores_Minimos
BEFORE INSERT on Calendario
  --Por cada fila de la tabla
FOR EACH ROW

DECLARE
    Cant_jug number(5);
    Nombre_min varchar2(50);
BEGIN 
    SELECT MIN(COUNT(Nombre_Equipo))
    INTO Cant_jug
    FROM Jugador
    GROUP BY Nombre_Equipo;
    
    SELECT Nombre_Equipo
    INTO Nombre_min
    FROM Jugador
    GROUP BY Nombre_Equipo
    HAVING COUNT(*)=(SELECT MIN(COUNT(Nombre_Equipo))
                        FROM Jugador
                        GROUP BY Nombre_Equipo);

    IF (Cant_jug < 2) THEN
      raise_application_error(-20500,('El equipo' || to_char(Nombre_min) ||
      'tiene menos de 2 jugadores'));
    END IF;
EXCEPTION
    WHEN NO_DATA_FOUND THEN
        raise_application_error (-20500,'No existen jugadores');
    WHEN too_many_rows then
        raise_application_error (-20500,'Error al recuperar los datos');
END Jugadores_Minimos;