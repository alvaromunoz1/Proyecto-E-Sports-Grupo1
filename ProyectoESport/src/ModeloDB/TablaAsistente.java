/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ModeloDB;

import ModeloUML.Asistente;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

/**
 *
 * @author Imanol Urquijo
 */
public class TablaAsistente {
    
        private TablaPersona tp;
        private BaseDatos bd;

    public TablaAsistente() {
        bd = new BaseDatos();
        
    }
    
     public void insertar(Asistente a) throws Exception
    {
        bd.conectar();
        
        String plantilla = "INSERT INTO Asistente VALUES (?,?);";
        PreparedStatement ps = bd.getCon().prepareStatement(plantilla);
        ps.setInt(1, a.getIda());
        ps.setInt(2, a.getAños_asistente());
      
        int n = ps.executeUpdate();
        ps.close();
        if (n != 1)
            throw new Exception("El número de filas actualizadas no es uno");
        
        bd.desconectar();
    }
     
     
     public void actualizarAñosAsistente(Asistente a) throws Exception
    {
        bd.conectar();
        
        String plantilla = "UPDATE Dueino SET Anios_Asistente=? WHERE IDA=?";
        PreparedStatement ps = bd.getCon().prepareStatement(plantilla);
        
        ps.setInt(3, a.getIda());
        ps.setInt(1, a.getAños_asistente());
      
        int n = ps.executeUpdate();
        ps.close();
        if (n != 1)
            throw new Exception("El número de filas actualizadas no es uno");
        
        bd.desconectar();
    }
     
     
       public void borrar(Asistente a) throws Exception
    {
        bd.conectar();
        
        String plantilla = "DELETE FROM Asistente WHERE IDA=?;";
        PreparedStatement ps = bd.getCon().prepareStatement(plantilla);
        ps.setInt(1, a.getIda());
      
        int n = ps.executeUpdate();
        ps.close();
        if (n != 1)
            throw new Exception("El número de filas actualizadas no es uno");
        
        bd.desconectar();
    } 
    
        public ArrayList<Asistente>  seleccionarTodosLosAsistentes() 
                throws Exception
    {
        bd.conectar();
        
        ArrayList<Asistente> lista = new ArrayList();
        String plantilla = "SELECT * FROM Asistentes;";
        PreparedStatement ps = bd.getCon().prepareStatement(plantilla);
        ResultSet resultado = ps.executeQuery();

       while(resultado.next())
       {
                Asistente a = new Asistente();
                
                a.setIda(resultado.getInt("IDA"));
                a.setAños_asistente(resultado.getInt("Anios_Asistente"));
                
                
                
                
                lista.add(a);
       }
       bd.desconectar();
       return lista;
       
    }
    
        public Asistente  seleccionarUnAsistente(int id) throws Exception
    {
        bd.conectar();
        
        String plantilla = "SELECT * FROM Asistente WHERE IDA=?;";
        PreparedStatement ps = bd.getCon().prepareStatement(plantilla);
        ps.setInt(1, id);
       
        ResultSet resultado = ps.executeQuery();

       if (resultado.next())
       {
           Asistente a= new Asistente();
           
           a.setIda(resultado.getInt("IDA"));
           a.setAños_asistente(resultado.getInt("Anios_Asistente"));
           
           bd.desconectar();
           return a;
       }
       else
           return null;
       
    }
        
        
   public Asistente  seleccionarUnAsistentePersona(int id) throws Exception
    {
        bd.conectar();
        
        String plantilla = "SELECT * FROM Asistente WHERE IDA=?;";
        PreparedStatement ps = bd.getCon().prepareStatement(plantilla);
        ps.setInt(1, id);
       
        ResultSet resultado = ps.executeQuery();

       if (resultado.next())
       {
           Asistente a= new Asistente();
           
           a.setIda(resultado.getInt("IDA"));
           a.setId(tp.seleccionarUnaPersona(id).getId());
           a.setAños_asistente(resultado.getInt("Anios_Asistente"));
           a.setNombre(tp.seleccionarUnaPersona(id).getNombre());
           a.setNick(tp.seleccionarUnaPersona(id).getNick());
           a.setSueldo(tp.seleccionarUnaPersona(id).getSueldo());
           a.setEquipo(tp.seleccionarUnaPersona(id).getEquipo());
           
           bd.desconectar();
           return a;
       }
       else
           return null;
    }
    
    public Asistente  seleccionarAñosAsistente(int id) throws Exception
    {
        bd.conectar();
        
        String plantilla = "SELECT Anios_Asistente FROM Asistente WHERE IDA=?;";
        PreparedStatement ps = bd.getCon().prepareStatement(plantilla);
        ps.setInt(1, id);
       
        ResultSet resultado = ps.executeQuery();

       if (resultado.next())
       {
           Asistente a= new Asistente();
           
           a.setAños_asistente(resultado.getInt("Anios_Asistente"));
           
           bd.desconectar();
           return a;
       }
       else
           return null;
    }
}
