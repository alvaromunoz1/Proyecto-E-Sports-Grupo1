/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ModeloUML;

import java.util.ArrayList;

/**
 *
 * @author Imanol Urquijo
 */
public class Calendario {
    
    private int id;
    private String nombre;
    private ArrayList<Jornada> jornadas;

    public Calendario(int id, String nombre) {
        this.id = id;
        this.nombre = nombre;
    }

    public Calendario(int id, String nombre, ArrayList<Jornada> jornadas) {
        this.id = id;
        this.nombre = nombre;
        this.jornadas = jornadas;
    }

    public Calendario() {
    }

    public ArrayList<Jornada> getJornadas() {
        return jornadas;
    }

    public void setJornadas(ArrayList<Jornada> jornadas) {
        this.jornadas = jornadas;
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

    @Override
    public String toString() {
        return "Calendario{" + "id=" + id + ", nombre=" + nombre 
                + ", jornadas=" + jornadas + '}';
    }
    
    
    
}
