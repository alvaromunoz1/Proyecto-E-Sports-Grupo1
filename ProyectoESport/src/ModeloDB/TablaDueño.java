/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ModeloDB;

import ModeloUML.Dueño;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

/**
 *
 * @author Imanol Urquijo
 */
public class TablaDueño {
 
        private BaseDatos bd;
        private TablaPersona tp;

    public TablaDueño() {
        bd = new BaseDatos();
    }
    
    
     public void insertar(Dueño d) throws Exception
    {
        bd.conectar();
        
        String plantilla = "INSERT INTO Dueino VALUES (?,?);";
        PreparedStatement ps = bd.getCon().prepareStatement(plantilla);
        ps.setInt(1, d.getIdd());
        ps.setInt(2,d.getAños_dueño());
      
        int n = ps.executeUpdate();
        ps.close();
        if (n != 1)
            throw new Exception("El número de filas actualizadas no es uno");
        
        bd.desconectar();
    }
     
     
     public void actualizarAñosDueño(Dueño d) throws Exception
    {
        bd.conectar();
        
        String plantilla = "UPDATE Dueino SET Anios_Dueino=? WHERE IDD=?";
        PreparedStatement ps = bd.getCon().prepareStatement(plantilla);
        
        ps.setInt(3, d.getIdd());
        ps.setInt(1, d.getAños_dueño());
      
        int n = ps.executeUpdate();
        ps.close();
        if (n != 1)
            throw new Exception("El número de filas actualizadas no es uno");
        
        bd.desconectar();
    }
     
     
       public void borrar(Dueño d) throws Exception
    {
        bd.conectar();
        
        String plantilla = "DELETE FROM Dueino WHERE IDD=?;";
        PreparedStatement ps = bd.getCon().prepareStatement(plantilla);
        ps.setInt(1, d.getIdd());
      
        int n = ps.executeUpdate();
        ps.close();
        if (n != 1)
            throw new Exception("El número de filas actualizadas no es uno");
        
        bd.desconectar();
    } 
    
        public ArrayList<Dueño>  seleccionarTodosLosDueños() throws Exception
    {
        bd.conectar();
        
        ArrayList<Dueño> lista = new ArrayList();
        String plantilla = "SELECT * FROM Duenio;";
        PreparedStatement ps = bd.getCon().prepareStatement(plantilla);
        ResultSet resultado = ps.executeQuery();

       while(resultado.next())
       {
                Dueño d = new Dueño();
                
                d.setIdd(resultado.getInt("IDD"));
                d.setAños_dueño(resultado.getInt("Anios_Dueino"));
  
                lista.add(d);
       }
       bd.desconectar();
       return lista;
    }
    
    
    public Dueño  seleccionarUnDueño(int id) throws Exception
    {
        bd.conectar();
        
        String plantilla = "SELECT * FROM Dueino WHERE IDD=?;";
        PreparedStatement ps = bd.getCon().prepareStatement(plantilla);
        ps.setInt(1, id);
       
        ResultSet resultado = ps.executeQuery();

       if (resultado.next())
       {
           Dueño d = new Dueño();
           
           d.setIdd(resultado.getInt("IDD"));
           d.setAños_dueño(resultado.getInt("Anios_Dueino"));
           
           bd.desconectar();
           return d;
       }
       else
           return null;
    }    
        
   public Dueño  seleccionarUnDueño_Persona(int id) throws Exception
    {
        bd.conectar();
        
        String plantilla = "SELECT * FROM Dueino WHERE IDD=?;";
        PreparedStatement ps = bd.getCon().prepareStatement(plantilla);
        ps.setInt(1, id);
       
        ResultSet resultado = ps.executeQuery();

       if (resultado.next())
       {
           Dueño d = new Dueño();
           
           d.setIdd(resultado.getInt("IDD"));
           d.setId(tp.seleccionarUnaPersona(id).getId());
           d.setAños_dueño(resultado.getInt("Anios_Dueino"));
           d.setNombre(tp.seleccionarUnaPersona(id).getNombre());
           d.setNick(tp.seleccionarUnaPersona(id).getNick());
           d.setSueldo(tp.seleccionarUnaPersona(id).getSueldo());
           d.setEquipo(tp.seleccionarUnaPersona(id).getEquipo());
           
           bd.desconectar();
           return d;
       }
       else
           return null;
    }
   

   public Dueño  seleccionarAñosDueño(int id) throws Exception
    {
        bd.conectar();
        
        String plantilla = "SELECT Anios_Dueino FROM Dueino WHERE IDD=?;";
        PreparedStatement ps = bd.getCon().prepareStatement(plantilla);
        ps.setInt(1, id);
       
        ResultSet resultado = ps.executeQuery();

       if (resultado.next())
       {
           Dueño d = new Dueño();
           
           d.setAños_dueño(resultado.getInt("Anios_Dueino"));
           
           bd.desconectar();
           return d;
       }
       else
           return null;
    } 
}
