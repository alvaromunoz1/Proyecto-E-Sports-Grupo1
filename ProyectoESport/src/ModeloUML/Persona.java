/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ModeloUML;

/**
 *
 * @author Imanol Urquijo
 */
public class Persona {
    
    
    private int id;
    private String nombre;
    private String nick;
    private double sueldo;
    private Equipo equipo;

    public Persona() {
    }

    public Persona(int id, String nombre, String nick, double sueldo) {
        this.id = id;
        this.nombre = nombre;
        this.nick = nick;
        this.sueldo = sueldo;
    }

    public Persona(int id, String nombre, String nick, double sueldo, 
            Equipo equipo) {
        this.id = id;
        this.nombre = nombre;
        this.nick = nick;
        this.sueldo = sueldo;
        this.equipo = equipo;
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

    public String getNick() {
        return nick;
    }

    public void setNick(String nick) {
        this.nick = nick;
    }

    public double getSueldo() {
        return sueldo;
    }

    public void setSueldo(double sueldo) {
        this.sueldo = sueldo;
    }

    public Equipo getEquipo() {
        return equipo;
    }

    public void setEquipo(Equipo equipo) {
        this.equipo = equipo;
    }

    @Override
    public String toString() {
        return "Persona{" + "id=" + id + ", nombre=" + nombre + ", nick=" 
                + nick + ", sueldo=" + sueldo + ", equipo=" + equipo + '}';
    }
    
    
}
