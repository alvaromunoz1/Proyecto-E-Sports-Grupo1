CREATE OR REPLACE TRIGGER Jugadores_Minimos
BEFORE INSERT on Calendario
  --Por cada fila de la tabla
FOR EACH ROW

DECLARE
    Cant_jug number(10);
BEGIN 
    SELECT MIN(COUNT(ID_Equipo))
    INTO Cant_jug
    FROM PERSONAS
    GROUP BY ID_Equipo;

    IF (Cant_jug < 2) THEN
      raise_application_error(-20500,('El equipo tiene menos de 2 jugadores'));
    END IF;
EXCEPTION
    WHEN NO_DATA_FOUND THEN
        raise_application_error (-20500,'No existen jugadores');
    WHEN too_many_rows then
        raise_application_error (-20500,'Error al recuperar los datos');
END Jugadores_Minimos;