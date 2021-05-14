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
public class Entrenador extends Persona {
    
    private int ide;
    private String email;

    public Entrenador() {
    }

    public Entrenador(int ide, String email, int id, String nombre, 
            String nick, double sueldo) {
        super(id, nombre, nick, sueldo);
        this.ide = ide;
        this.email = email;
    }

    public Entrenador(int ide, String email, int id, String nombre, 
            String nick, double sueldo, Equipo equipo) {
        super(id, nombre, nick, sueldo, equipo);
        this.ide = ide;
        this.email = email;
    }

    public int getIde() {
        return ide;
    }

    public void setIde(int ide) {
        this.ide = ide;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public String toString() {
        return "Entrenador{" + "ide=" + ide + ", email=" + email + '}';
    }
    
    
    
}
