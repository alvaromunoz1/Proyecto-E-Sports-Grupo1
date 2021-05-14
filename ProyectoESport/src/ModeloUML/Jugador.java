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
public class Jugador extends Persona {
    
    private int idj;
    private String rol;

    public Jugador() {
    }

    public Jugador(int idj, String rol, int id, String nombre, String nick, 
            double sueldo) {
        super(id, nombre, nick, sueldo);
        this.idj = idj;
        this.rol = rol;
    }

    public Jugador(int idj, String rol, int id, String nombre, String nick, 
            double sueldo, Equipo equipo) {
        super(id, nombre, nick, sueldo, equipo);
        this.idj = idj;
        this.rol = rol;
    }

    public int getIdj() {
        return idj;
    }

    public void setIdj(int idj) {
        this.idj = idj;
    }

    public String getRol() {
        return rol;
    }

    public void setRol(String rol) {
        this.rol = rol;
    }

    @Override
    public String toString() {
        return "Jugador{" + "idj=" + idj + ", rol=" + rol + '}';
    }
    
    
}
