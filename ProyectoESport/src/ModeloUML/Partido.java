/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ModeloUML;

import java.time.LocalTime;

/**
 *
 * @author Imanol Urquijo
 */
public class Partido {
    
    
    private int id;
    private String nombre;
    private Equipo local;
    private Equipo visitante;
    private LocalTime hora;
    private int res_local;
    private int res_visit;
    private int id_jornada;

    public Partido() {
    }

    public Partido(int id, String nombre, Equipo local, Equipo visitante, 
            LocalTime hora, int id_jornada) {
        this.id = id;
        this.nombre = nombre;
        this.local = local;
        this.visitante = visitante;
        this.hora = hora;
        this.id_jornada = id_jornada;
    }

    public Partido(int id, String nombre, Equipo local, Equipo visitante, 
            LocalTime hora, int res_local, int res_visit, int id_jornada) {
        this.id = id;
        this.nombre = nombre;
        this.local = local;
        this.visitante = visitante;
        this.hora = hora;
        this.res_local = res_local;
        this.res_visit = res_visit;
        this.id_jornada = id_jornada;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Equipo getLocal() {
        return local;
    }

    public void setLocal(Equipo local) {
        this.local = local;
    }

    public Equipo getVisitante() {
        return visitante;
    }

    public void setVisitante(Equipo visitante) {
        this.visitante = visitante;
    }

    public LocalTime getHora() {
        return hora;
    }

    public void setHora(LocalTime hora) {
        this.hora = hora;
    }

    public int getRes_local() {
        return res_local;
    }

    public void setRes_local(int res_local) {
        this.res_local = res_local;
    }

    public int getRes_visit() {
        return res_visit;
    }

    public void setRes_visit(int res_visit) {
        this.res_visit = res_visit;
    }

    public int getId_jornada() {
        return id_jornada;
    }

    public void setId_jornada(int id_jornada) {
        this.id_jornada = id_jornada;
    }

    @Override
    public String toString() {
        return "Partido{" + "id=" + id + ", nombre=" + nombre + ", local=" 
                + local + ", visitante=" + visitante + ", hora=" + hora 
                + ", res_local=" + res_local + ", res_visit=" + res_visit 
                + ", id_jornada=" + id_jornada + '}';
    }
}
