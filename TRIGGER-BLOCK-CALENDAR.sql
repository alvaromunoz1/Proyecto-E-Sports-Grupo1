CREATE OR REPLACE TRIGGER Block_Cal
BEFORE INSERT OR UPDATE ON Equipo
DECLARE
    cal_id VARCHAR2(50);
    cal_id_eki VARCHAR2(50);
BEGIN
    SELECT ID
    INTO cal_id
    FROM Calendario;

    SELECT DISTINCT(ID_CALENDARIO)
    INTO cal_id_eki
    FROM Equipo
    WHERE ID_CALENDARIO=cal_id;

    IF (cal_id_eki)=(cal_id) THEN
    RAISE_APPLICATION_ERROR(-20001, 'No se pueden modificar los equipos con el 
    calendario cerrado.');
    END IF;

END Block_Cal;