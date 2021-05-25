CREATE OR REPLACE VIEW ASISTENTES (NOMBRE, NICK, SUELDO, ANIOS_ASISTENTE, NOMBRE_EQUIPO)
AS
SELECT P.NOMBRE, P.NICK, P.SUELDO, A.ANIOS_ASISTENTE, E.NOMBRE
FROM PERSONAS P, ASISTENTE A, EQUIPO E
WHERE P.ID_EQUIPO=E.ID
AND P.ID=A.IDA;