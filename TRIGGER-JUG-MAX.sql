
CREATE OR REPLACE TRIGGER Tamaño_equipo
BEFORE INSERT OR UPDATE ON Jugador
DECLARE
    cant_jug NUMBER(10);
    raise_aplication_error;
BEGIN
    SELECT MAX(COUNT(Nombre_Equipo))
    INTO cant_jug
    FROM Jugador
    GROUP BY Nombre_Equipo;

IF cant_jug==6 THEN 
    raise_application_error(-20500,'No puede insertar mas de 6 jugadores en el equipo');
END IF;
EXCEPTION
    WHEN NO_DATA_FOUND THEN
      raise_application_error(-20500,'No existen jugadores');
    WHEN too_many_rows then
       raise_application_error (-20500,'Error');
END Tamaño_equipo;