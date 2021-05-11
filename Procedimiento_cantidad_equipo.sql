create or replace PROCEDURE Cantidad_equipo(T in VARCHAR2)
as
cant_jugador number;
begin
select count(idj) into cant_jugador
from jugador
where idj=(select id
            from personas
            where id_equipo=(select id
                                from equipo
                                where lower(nombre)=T));
end;
