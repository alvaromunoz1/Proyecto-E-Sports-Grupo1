/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ModeloDB;

import ModeloUML.Jugador;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

/**
 *
 * @author Imanol Urquijo
 */
public class TablaJugador {
    
    
        private Connection con;
        private TablaPersona tp;

    public TablaJugador(Connection con, TablaPersona tp) {
        this.con = con;
        this.tp = tp;
    }
    
     public void insertar(Jugador j) throws Exception
    {
        
        String plantilla = "INSERT INTO Jugador VALUES (?,?);";
        PreparedStatement ps = con.prepareStatement(plantilla);
        ps.setInt(1, j.getIdj());
        ps.setString(2,j.getRol());
      
        int n = ps.executeUpdate();
        ps.close();
        if (n != 1)
            throw new Exception("El número de filas actualizadas no es uno");
    }
     
     
     public void actualizarRol(Jugador j) throws Exception
    {
        
        String plantilla = "UPDATE Jugador SET Rol=? WHERE IDJ=?";
        PreparedStatement ps = con.prepareStatement(plantilla);
        
        ps.setInt(3, j.getIdj());
        ps.setString(1, j.getRol());
      
        int n = ps.executeUpdate();
        ps.close();
        if (n != 1)
            throw new Exception("El número de filas actualizadas no es uno");
    }
     
     
       public void borrar(Jugador j) throws Exception
    {
        
        String plantilla = "DELETE FROM Jugador WHERE IDJ=?;";
        PreparedStatement ps = con.prepareStatement(plantilla);
        ps.setInt(1, j.getIdj());
      
        int n = ps.executeUpdate();
        ps.close();
        if (n != 1)
            throw new Exception("El número de filas actualizadas no es uno");
    } 
    
        public ArrayList<Jugador>  seleccionarTodosLosJugadores() throws Exception
    {
        ArrayList<Jugador> lista = new ArrayList();
        String plantilla = "SELECT * FROM Jugador;";
        PreparedStatement ps = con.prepareStatement(plantilla);
        ResultSet resultado = ps.executeQuery();

       while(resultado.next())
       {
                Jugador j = new Jugador();
                
                j.setIdj(resultado.getInt("IDJ"));
                j.setRol(resultado.getString("Rol"));
  
                lista.add(j);
       }
       return lista;
    }
    
    
    public Jugador  seleccionarUnJugador(int id) throws Exception
    {
        
        String plantilla = "SELECT * FROM Jugador WHERE IDJ=?;";
        PreparedStatement ps = con.prepareStatement(plantilla);
        ps.setInt(1, id);
       
        ResultSet resultado = ps.executeQuery();

       if (resultado.next())
       {
           Jugador j = new Jugador();
           
           j.setIdj(resultado.getInt("IDJ"));
           j.setRol(resultado.getString("Rol"));
           
           return j;
       }
       else
           return null;
    }    
        
   public Jugador  seleccionarUnJugador_Persona(int id) throws Exception
    {
        
        String plantilla = "SELECT * FROM Jugador WHERE IDJ=?;";
        PreparedStatement ps = con.prepareStatement(plantilla);
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
           
           return j;
       }
       else
           return null;
    }
   

   public Jugador  seleccionarRol(int id) throws Exception
    {
        
        String plantilla = "SELECT Rol FROM Jugador WHERE IDJ=?;";
        PreparedStatement ps = con.prepareStatement(plantilla);
        ps.setInt(1, id);
       
        ResultSet resultado = ps.executeQuery();

       if (resultado.next())
       {
           Jugador j = new Jugador();
           
           j.setRol(resultado.getString("Rol"));
           
           return j;
       }
       else
           return null;
    }
    
}
