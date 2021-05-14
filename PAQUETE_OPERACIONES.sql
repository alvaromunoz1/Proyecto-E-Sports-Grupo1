CREATE OR REPLACE PACKAGE BODY OPERACIONES IS
    FUNCTION RESULTADOS
        (NEQUIPO IN EQUIPO.NOMBRE%TYPE)
        RETURN NUMBER
    IS
        V_VISITANTE NUMBER;
        V_LOCAL NUMBER;
        CANTIDAD NUMBER;
    BEGIN

        SELECT MAX(COUNT(*)) INTO V_VISITANTE
        FROM VICTORIAS_VISITANTE
        WHERE NOMBRE_EQUIPO=NEQUIPO
        GROUP BY NOMBRE_EQUIPO;

        SELECT MAX(COUNT(*)) INTO V_LOCAL
        FROM VICTORIAS_LOCAL
        WHERE NOMBRE_EQUIPO=NEQUIPO
        GROUP BY NOMBRE_EQUIPO;
    
        CANTIDAD:=V_LOCAL+V_VISITANTE;
    
        RETURN CANTIDAD;
    END RESULTADOS;
    
    PROCEDURE SUMA_VICTORIAS  AS
        RESULTADO NUMBER;
    BEGIN
        RESULTADO:=VICTORIAS_TOTALES('G2');
        DBMS_OUTPUT.put_line('El numero total de victorias es' || RESULTADO);
    END SUMA_VICTORIAS;
    PROCEDURE Cantidad_equipo(T in VARCHAR2)
    Is
        cant_jugador number;
    begin
        select count(idj) into cant_jugador
        from jugador
        where idj=(select id
                    from personas
                    where id_equipo=(select id
                                        from equipo
                                        where lower(nombre)=T));
    end CANTIDAD_EQUIPO;

END OPERACIONES; 