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
public class Equipo {
    
    private int id;
    private String nombre;
    private String paginaWeb;
    private int puntos;
    private int id_calendario;
    private Dueño dueño;
    private Asistente asistente;
    private Entrenador entrenador;
    private ArrayList<Jugador> jugadores;

    public Equipo() {
    }

    public Equipo(int id, String nombre, String paginaWeb, int puntos, 
            int id_calendario, Dueño dueño, Asistente asistente, 
            Entrenador entrenador, ArrayList<Jugador> jugadores) {
        this.id = id;
        this.nombre = nombre;
        this.paginaWeb = paginaWeb;
        this.puntos = puntos;
        this.id_calendario = id_calendario;
        this.dueño = dueño;
        this.asistente = asistente;
        this.entrenador = entrenador;
        this.jugadores = jugadores;
    }

    public Dueño getDueño() {
        return dueño;
    }

    public void setDueño(Dueño dueño) {
        this.dueño = dueño;
    }

    public Asistente getAsistente() {
        return asistente;
    }

    public void setAsistente(Asistente asistente) {
        this.asistente = asistente;
    }

    public Entrenador getEntrenador() {
        return entrenador;
    }

    public void setEntrenador(Entrenador entrenador) {
        this.entrenador = entrenador;
    }

    public ArrayList<Jugador> getJugadores() {
        return jugadores;
    }

    public void setJugadores(ArrayList<Jugador> jugadores) {
        this.jugadores = jugadores;
    }

    public Equipo(int id, String nombre, String paginaWeb, int puntos, 
            int id_calendario) {
        this.id = id;
        this.nombre = nombre;
        this.paginaWeb = paginaWeb;
        this.puntos = puntos;
        this.id_calendario = id_calendario;
    }

    public Equipo(int id, String nombre, String paginaWeb, int puntos) {
        this.id = id;
        this.nombre = nombre;
        this.paginaWeb = paginaWeb;
        this.puntos = puntos;
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

    public String getPaginaWeb() {
        return paginaWeb;
    }

    public void setPaginaWeb(String paginaWeb) {
        this.paginaWeb = paginaWeb;
    }

    public int getPuntos() {
        return puntos;
    }

    public void setPuntos(int puntos) {
        this.puntos = puntos;
    }

    public int getId_calendario() {
        return id_calendario;
    }

    public void setId_calendario(int id_calendario) {
        this.id_calendario = id_calendario;
    }

    @Override
    public String toString() {
        return "Equipo{" + "id=" + id + ", nombre=" + nombre + ", paginaWeb=" 
                + paginaWeb + ", puntos=" + puntos + ", id_calendario=" 
                + id_calendario + ", due\u00f1o=" + dueño + ", asistente=" 
                + asistente + ", entrenador=" + entrenador + ", jugadores=" 
                + jugadores + '}';
    }
    
    
    
}
