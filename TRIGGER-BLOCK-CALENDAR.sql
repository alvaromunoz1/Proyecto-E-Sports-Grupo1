CREATE OR REPLACE TRIGGER Block_Cal
BEFORE INSERT OR UPDATE ON Equipo
DECLARE
    cal_nombre VARCHAR2(50);
    cal_nom_eki VARCHAR2(50);
    RAISE_APLICATION_ERROR
BEGIN
    SELECT Nombre 
    INTO cal_nombre 
    FROM Calendario;

    SELECT DISTINCT(Nombre_Calendario)
    INTO cal_nom_eki
    FROM Equipo
    WHERE Nombre_Calendario=cal_nombre;

    IF (cal_nom_eki)=(cal_nombre) THEN
    RAISE_APLICATION_ERROR(-20001, 'No se pueden modificar los equipos con el 
    calendario cerrado.');
    END IF;

END Block_Cal;