/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ModeloUML;

/**
 *
 * @author 1GDAW02
 */
public class Usuario {
    
    private int id;
    private String nombre;
    private String contraseña;
    private Character tipo;

    public Usuario() {
    }

    public Usuario(int id, String nombre, String contraseña, Character tipo) {
        this.id = id;
        this.nombre = nombre;
        this.contraseña = contraseña;
        this.tipo = tipo;
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

    public String getContraseña() {
        return contraseña;
    }

    public void setContraseña(String contraseña) {
        this.contraseña = contraseña;
    }

    public Character getTipo() {
        return tipo;
    }

    public void setTipo(Character tipo) {
        this.tipo = tipo;
    }

    @Override
    public String toString() {
        return "Usuario{" + "id=" + id + ", nombre=" + nombre 
                + ", contrase\u00f1a=" + contraseña + ", tipo=" + tipo + '}';
    }
    
    
    
}
