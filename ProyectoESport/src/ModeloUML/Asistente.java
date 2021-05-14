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
public class Asistente extends Persona {
    
    private int ida;
    private int años_asistente;

    public Asistente() {
    }

    public Asistente(int ida, int años_asistente, int id, String nombre, 
            String nick, double sueldo) {
        super(id, nombre, nick, sueldo);
        this.ida = ida;
        this.años_asistente = años_asistente;
    }

    public Asistente(int ida, int años_asistente, int id, String nombre, 
            String nick, double sueldo, Equipo equipo) {
        super(id, nombre, nick, sueldo, equipo);
        this.ida = ida;
        this.años_asistente = años_asistente;
    }

    public int getIda() {
        return ida;
    }

    public void setIda(int ida) {
        this.ida = ida;
    }

    public int getAños_asistente() {
        return años_asistente;
    }

    public void setAños_asistente(int años_asistente) {
        this.años_asistente = años_asistente;
    }

    @Override
    public String toString() {
        return "Asistente{" + "ida=" + ida + ", a\u00f1os_asistente=" 
                + años_asistente + '}';
    }
    
    
    
}
