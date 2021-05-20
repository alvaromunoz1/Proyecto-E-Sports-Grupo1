/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ModeloDB;

import ModeloUML.Usuario;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

/**
 *
 * @author 1GDAW02
 */
public class TablaUsuario {
    
    private BaseDatos bd;
    
    
    
    
    public TablaUsuario() {
        bd = new BaseDatos();
    }
    
    
     public void insertarUsuario(Usuario u) throws Exception
    {
        bd.conectar();
        
        String plantilla = "INSERT INTO Usuarios VALUES (?,?,?,?);";
        PreparedStatement ps = bd.getCon().prepareStatement(plantilla);
        ps.setInt(1, u.getId());
        ps.setString(2,u.getNombre());
        ps.setString(3, u.getContraseña());
        ps.setDouble(4, u.getTipo());
      
        int n = ps.executeUpdate();
        ps.close();
        if (n != 1)
            throw new Exception("El número de filas actualizadas no es uno");
        
        bd.desconectar();
    }
     
     
     public void cambiarUsuario(Usuario u) throws Exception
    {
        bd.conectar();
        
        String plantilla = "UPDATE Usuarios SET Nombre=?, Contrasenia=?, Tipo=? WHERE ID =?";
        PreparedStatement ps = bd.getCon().prepareStatement(plantilla);
        
        ps.setInt(4, u.getId());
        ps.setString(1, u.getNombre());
        ps.setString(2, u.getContraseña());
        ps.setString(3, String.valueOf(u.getTipo()));
      
        int n = ps.executeUpdate();
        ps.close();
        if (n != 1)
            throw new Exception("El número de filas actualizadas no es uno");
        
        bd.desconectar();
    }
    
    
        
        
      public void borrarUsuario(Usuario u) throws Exception
    {
        bd.conectar();
        
        String plantilla = "DELETE FROM Usuario WHERE ID=?;";
        PreparedStatement ps = bd.getCon().prepareStatement(plantilla);
        ps.setInt(1, u.getId());
      
        int n = ps.executeUpdate();
        ps.close();
        if (n != 1)
            throw new Exception("El número de filas actualizadas no es uno");
        
        bd.desconectar();
    }    
      
      
    public ArrayList<Usuario>  seleccionarTodosLosUsuarios() 
                throws Exception
    {
        bd.conectar();
        
        ArrayList<Usuario> lista = new ArrayList();
        String plantilla = "SELECT * FROM Usuarios;";
        PreparedStatement ps = bd.getCon().prepareStatement(plantilla);
        ResultSet resultado = ps.executeQuery();

       while(resultado.next())
       {
                Usuario u = new Usuario();
                
                u.setId(resultado.getInt("ID"));
                u.setNombre(resultado.getString("Nombre"));
                u.setContraseña(resultado.getString("Contraseina"));
                u.setTipo(resultado.getString("Tipo").charAt(0));
                
                lista.add(u);
       }
       bd.desconectar();
       return lista;
    }
    
    
    public Usuario  seleccionarUnUsuario(int id) throws Exception
    {
        bd.conectar();
        
        String plantilla = "SELECT * FROM Usuarios WHERE ID=?;";
        PreparedStatement ps = bd.getCon().prepareStatement(plantilla);
        ps.setInt(1, id);
       
        ResultSet resultado = ps.executeQuery();

       if (resultado.next())
       {
           Usuario u = new Usuario();
           
           u.setId(resultado.getInt("ID"));
           u.setNombre(resultado.getString("Nombre"));
           u.setContraseña(resultado.getString("Contraseina"));
           u.setTipo(resultado.getString("Tipo").charAt(0));
           
           bd.desconectar();
           return u;
       }
       else
           return null;
    }
    
    public Usuario  seleccionarTipoDeUsuario(String nom) throws Exception
    {
        bd.conectar();
        
        String plantilla = "SELECT Tipo FROM Usuarios WHERE Nombre=?;";
        PreparedStatement ps = bd.getCon().prepareStatement(plantilla);
        ps.setString(1, nom);
       
        ResultSet resultado = ps.executeQuery();

       if (resultado.next())
       {
           Usuario u = new Usuario();
           
           u.setTipo(resultado.getString("Tipo").charAt(0));
           
           bd.desconectar();
           return u;
       }
       else
           return null;
    }    
    
}
