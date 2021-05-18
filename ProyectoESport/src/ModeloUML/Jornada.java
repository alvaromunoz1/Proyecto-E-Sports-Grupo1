/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ModeloUML;

import java.util.ArrayList;
import java.util.Date;

/**
 *
 * @author Imanol Urquijo
 */
public class Jornada {
    
    private int id;
    private String nombre;
    private Date fecha;
    private int id_calendario;
    private ArrayList<Partido> partidos;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Jornada(int id, String nombre, Date fecha, int id_calendario) {
        this.id = id;
        this.nombre = nombre;
        this.fecha = fecha;
        this.id_calendario = id_calendario;
    }

    public Jornada(int id, String nombre, Date fecha, int id_calendario, 
            ArrayList<Partido> partidos) {
        this.id = id;
        this.nombre = nombre;
        this.fecha = fecha;
        this.id_calendario = id_calendario;
        this.partidos = partidos;
    }

    

    public ArrayList<Partido> getPartidos() {
        return partidos;
    }

    public void setPartidos(ArrayList<Partido> partidos) {
        this.partidos = partidos;
    }

    public Jornada() {
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    public int getId_calendario() {
        return id_calendario;
    }

    public void setId_calendario(int id_calendario) {
        this.id_calendario = id_calendario;
    }

    @Override
    public String toString() {
        return "Jornada{" + "nombre=" + nombre + ", fecha=" + fecha 
                + ", id_calendario=" + id_calendario + ", partidos=" 
                + partidos + '}';
    }   
}
