CREATE OR REPLACE TRIGGER Block_Calendario
BEFORE INSERT OR UPDATE OR DELETE on Equipo
DECLARE
    cal_nombre VARCHAR2(50);
    eki_nombre VARCHAR2(50);
BEGIN 
    SELECT Nombre
    INTO cal_nombre
    FROM Calendario;

    SELECT Nombre
    INTO eki_nombre
    FROM Equipo
    WHERE Nombre_Calendario=cal_nombre;
    
    IF (eki_nombre) THEN
      raise_application_error(-20500,'No se pueden realizar modificaciones con
      el calendario cerrado');
    END IF;
EXCEPTION
    WHEN NO_DATA_FOUND THEN
      NULL;
    WHEN too_many_rows then
       raise_application_error (-20500,'');
  END ;
  