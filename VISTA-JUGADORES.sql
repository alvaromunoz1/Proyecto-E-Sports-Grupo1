CREATE OR REPLACE VIEW JUGADORES (NOMBRE, NICK, SUELDO, ROL, NOMBRE_EQUIPO)
AS
SELECT P.NOMBRE, P.NICK, P.SUELDO, J.ROL, E.NOMBRE
FROM PERSONAS P, JUGADOR J, EQUIPO E
WHERE P.ID_EQUIPO=E.ID
AND P.ID=J.IDJ;