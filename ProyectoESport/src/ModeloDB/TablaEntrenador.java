/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ModeloDB;

import ModeloUML.Entrenador;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

/**
 *
 * @author Imanol Urquijo
 */

public class TablaEntrenador {
    
    
        private BaseDatos bd;
        private TablaPersona tp;

    public TablaEntrenador() {
        bd = new BaseDatos();
    }
    
     public void insertar(Entrenador e) throws Exception
    {
        bd.conectar();
        
        String plantilla = "INSERT INTO Entrenador VALUES (?,?);";
        PreparedStatement ps = bd.getCon().prepareStatement(plantilla);
        ps.setInt(1, e.getIde());
        ps.setString(2,e.getEmail());
      
        int n = ps.executeUpdate();
        ps.close();
        if (n != 1)
            throw new Exception("El número de filas actualizadas no es uno");
        
        bd.desconectar();
    }
     
     
     public void actualizarEmail(Entrenador e) throws Exception
    {
        bd.conectar();
        
        String plantilla = "UPDATE Entrenador SET mail=? WHERE IDE=?";
        PreparedStatement ps = bd.getCon().prepareStatement(plantilla);
        
        ps.setInt(3, e.getIde());
        ps.setString(1, e.getEmail());
      
        int n = ps.executeUpdate();
        ps.close();
        if (n != 1)
            throw new Exception("El número de filas actualizadas no es uno");
        
        bd.desconectar();
    }
     
     
       public void borrar(Entrenador e) throws Exception
    {
        bd.conectar();
        
        String plantilla = "DELETE FROM Entrenador WHERE IDE=?;";
        PreparedStatement ps = bd.getCon().prepareStatement(plantilla);
        ps.setInt(1, e.getIde());
      
        int n = ps.executeUpdate();
        ps.close();
        if (n != 1)
            throw new Exception("El número de filas actualizadas no es uno");
        
        bd.desconectar();
    } 
    
        public ArrayList<Entrenador>  seleccionarTodosLosEntrenadores() 
                throws Exception
    {
        bd.conectar();
        
        ArrayList<Entrenador> lista = new ArrayList();
        String plantilla = "SELECT * FROM Entrenador;";
        PreparedStatement ps = bd.getCon().prepareStatement(plantilla);
        ResultSet resultado = ps.executeQuery();

       while(resultado.next())
       {
                Entrenador e = new Entrenador();
                
                e.setIde(resultado.getInt("IDE"));
                e.setEmail(resultado.getString("mail"));
  
                lista.add(e);
       }
       bd.desconectar();
       return lista;
    }
    
    
    public Entrenador  seleccionarUnEntrenador(int id) throws Exception
    {
        bd.conectar();
        
        String plantilla = "SELECT * FROM Entrenador WHERE IDE=?;";
        PreparedStatement ps = bd.getCon().prepareStatement(plantilla);
        ps.setInt(1, id);
       
        ResultSet resultado = ps.executeQuery();

       if (resultado.next())
       {
           Entrenador e = new Entrenador();
           
           e.setIde(resultado.getInt("IDE"));
           e.setEmail(resultado.getString("mail"));
           
           bd.desconectar();
           return e;
       }
       else
           return null;
    }    
        
   public Entrenador  seleccionarUnEntrenador_Persona(int id) throws Exception
    {
        bd.conectar();
        
        String plantilla = "SELECT * FROM Entrenador WHERE IDE=?;";
        PreparedStatement ps = bd.getCon().prepareStatement(plantilla);
        ps.setInt(1, id);
       
        ResultSet resultado = ps.executeQuery();

       if (resultado.next())
       {
           Entrenador e = new Entrenador();
           
           e.setIde(resultado.getInt("IDE"));
           e.setId(tp.seleccionarUnaPersona(id).getId());
           e.setEmail(resultado.getString("mail"));
           e.setNombre(tp.seleccionarUnaPersona(id).getNombre());
           e.setNick(tp.seleccionarUnaPersona(id).getNick());
           e.setSueldo(tp.seleccionarUnaPersona(id).getSueldo());
           e.setEquipo(tp.seleccionarUnaPersona(id).getEquipo());
           
           bd.desconectar();
           return e;
       }
       else
           return null;
    }
   

   public Entrenador  seleccionarEmail(int id) throws Exception
    {
        bd.conectar();
        
        String plantilla = "SELECT mail FROM Entrenador WHERE IDE=?;";
        PreparedStatement ps = bd.getCon().prepareStatement(plantilla);
        ps.setInt(1, id);
       
        ResultSet resultado = ps.executeQuery();

       if (resultado.next())
       {
           Entrenador e = new Entrenador();
           
           e.setEmail(resultado.getNString("mail"));
           
           bd.desconectar();
           return e;
       }
       else
           return null;
    }
}
