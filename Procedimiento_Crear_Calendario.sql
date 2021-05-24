CREATE OR REPLACE PROCEDURE CrearCalendario(
    p_id IN calendario.id%TYPE,
    p_nombre IN calendario.nombre%TYPE)
AS
a NUMBER(3); 
BEGIN
    INSERT INTO Calendario VALUES(p_id,p_nombre);
     
    UPDATE Jornada SET ID_Calendario=p_id;  
END;

CREATE OR REPLACE PROCEDURE PonerHora(
    p_ID IN partido.id%TYPE) 
AS
BEGIN
     UPDATE Partido 
     SET Hora=CURRENT_TIMESTAMP 
     WHERE ID= p_ID;
END;