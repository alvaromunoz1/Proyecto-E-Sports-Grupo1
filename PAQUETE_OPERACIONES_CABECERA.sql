CREATE OR REPLACE PACKAGE OPERACIONES IS
    FUNCTION RESULTADOS (NEQUIPO IN EQUIPO.NOMBRE%TYPE)
        RETURN NUMBER;
    PROCEDURE SUMA_VICTORIAS;
    PROCEDURE Cantidad_equipo(T in VARCHAR2);
END OPERACIONES;