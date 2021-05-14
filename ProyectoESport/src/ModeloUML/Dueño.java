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
public class Dueño extends Persona {
    
    private int idd;
    private int años_dueño;

    public Dueño() {
    }

    public Dueño(int idd, int años_dueño, int id, String nombre, String nick, 
            double sueldo) {
        super(id, nombre, nick, sueldo);
        this.idd = idd;
        this.años_dueño = años_dueño;
    }

    public Dueño(int idd, int años_dueño, int id, String nombre, String nick, 
            double sueldo, Equipo equipo) {
        super(id, nombre, nick, sueldo, equipo);
        this.idd = idd;
        this.años_dueño = años_dueño;
    }

    public int getIdd() {
        return idd;
    }

    public void setIdd(int idd) {
        this.idd = idd;
    }

    public int getAños_dueño() {
        return años_dueño;
    }

    public void setAños_dueño(int años_dueño) {
        this.años_dueño = años_dueño;
    }

    @Override
    public String toString() {
        return "Due\u00f1o{" + "idd=" + idd + ", a\u00f1os_due\u00f1o=" 
                + años_dueño + '}';
    }
    
    
}
