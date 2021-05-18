/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ModeloDB;

import ModeloUML.Jugador;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

/**
 *
 * @author Imanol Urquijo
 */
public class TablaJugador {
    
    
        private BaseDatos bd;
        private TablaPersona tp;

    public TablaJugador() {
        bd = new BaseDatos();
    }
    
     public void insertar(Jugador j) throws Exception
    {
        bd.conectar();
        
        String plantilla = "INSERT INTO Jugador VALUES (?,?);";
        PreparedStatement ps = bd.getCon().prepareStatement(plantilla);
        ps.setInt(1, j.getIdj());
        ps.setString(2,j.getRol());
      
        int n = ps.executeUpdate();
        ps.close();
        if (n != 1)
            throw new Exception("El número de filas actualizadas no es uno");
        
        bd.desconectar();
    }
     
     
     public void actualizarRol(Jugador j) throws Exception
    {
        bd.conectar();
        
        String plantilla = "UPDATE Jugador SET Rol=? WHERE IDJ=?";
        PreparedStatement ps = bd.getCon().prepareStatement(plantilla);
        
        ps.setInt(3, j.getIdj());
        ps.setString(1, j.getRol());
      
        int n = ps.executeUpdate();
        ps.close();
        if (n != 1)
            throw new Exception("El número de filas actualizadas no es uno");
        
        bd.desconectar();
    }
     
     
       public void borrar(Jugador j) throws Exception
    {
        bd.conectar();
        
        String plantilla = "DELETE FROM Jugador WHERE IDJ=?;";
        PreparedStatement ps = bd.getCon().prepareStatement(plantilla);
        ps.setInt(1, j.getIdj());
      
        int n = ps.executeUpdate();
        ps.close();
        if (n != 1)
            throw new Exception("El número de filas actualizadas no es uno");
        
        bd.desconectar();
    } 
    
        public ArrayList<Jugador>  seleccionarTodosLosJugadores() 
                throws Exception
    {
        bd.conectar();
        
        ArrayList<Jugador> lista = new ArrayList();
        String plantilla = "SELECT * FROM Jugador;";
        PreparedStatement ps = bd.getCon().prepareStatement(plantilla);
        ResultSet resultado = ps.executeQuery();

       while(resultado.next())
       {
                Jugador j = new Jugador();
                
                j.setIdj(resultado.getInt("IDJ"));
                j.setRol(resultado.getString("Rol"));
  
                lista.add(j);
       }
       bd.desconectar();
       return lista;
    }
    
    
    public Jugador  seleccionarUnJugador(int id) throws Exception
    {
        bd.conectar();
        
        String plantilla = "SELECT * FROM Jugador WHERE IDJ=?;";
        PreparedStatement ps = bd.getCon().prepareStatement(plantilla);
        ps.setInt(1, id);
       
        ResultSet resultado = ps.executeQuery();

       if (resultado.next())
       {
           Jugador j = new Jugador();
           
           j.setIdj(resultado.getInt("IDJ"));
           j.setRol(resultado.getString("Rol"));
           
           bd.desconectar();
           return j;
       }
       else
           return null;
    }    
        
   public Jugador  seleccionarUnJugador_Persona(int id) throws Exception
    {
        bd.conectar();
        
        String plantilla = "SELECT * FROM Jugador WHERE IDJ=?;";
        PreparedStatement ps = bd.getCon().prepareStatement(plantilla);
        ps.setInt(1, id);
       
        ResultSet resultado = ps.executeQuery();

       if (resultado.next())
       {
           Jugador j = new Jugador();
           
           j.setIdj(resultado.getInt("IDJ"));
           j.setId(tp.seleccionarUnaPersona(id).getId());
           j.setRol(resultado.getString("Rol"));
           j.setNombre(tp.seleccionarUnaPersona(id).getNombre());
           j.setNick(tp.seleccionarUnaPersona(id).getNick());
           j.setSueldo(tp.seleccionarUnaPersona(id).getSueldo());
           j.setEquipo(tp.seleccionarUnaPersona(id).getEquipo());
           
           bd.desconectar();
           return j;
       }
       else
           return null;
    }
   

   public Jugador  seleccionarRol(int id) throws Exception
    {
        bd.conectar();
        
        String plantilla = "SELECT Rol FROM Jugador WHERE IDJ=?;";
        PreparedStatement ps = bd.getCon().prepareStatement(plantilla);
        ps.setInt(1, id);
       
        ResultSet resultado = ps.executeQuery();

       if (resultado.next())
       {
           Jugador j = new Jugador();
           
           j.setRol(resultado.getString("Rol"));
           
           bd.desconectar();
           return j;
       }
       else
           return null;
    }  
}
