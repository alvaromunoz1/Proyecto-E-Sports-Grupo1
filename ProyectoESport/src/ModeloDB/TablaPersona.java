/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ModeloDB;

import ModeloUML.Persona;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

/**
 *
 * @author Imanol Urquijo
 */
public class TablaPersona {
    
    
        private BaseDatos bd;
        private TablaEntrenador te;
        private TablaAsistente ta;
        private TablaDueño td;
        private TablaJugador tj;

    public TablaPersona() {
        bd = new BaseDatos();
    }
    

     public void insertar(Persona p) throws Exception
    {
        bd.conectar();
        
        String plantilla = "INSERT INTO Personas VALUES (?,?,?,?);";
        PreparedStatement ps = bd.getCon().prepareStatement(plantilla);
        ps.setInt(1, p.getId());
        ps.setString(2,p.getNombre());
        ps.setString(3, p.getNick());
        ps.setDouble(4, p.getSueldo());
        ps.setInt(4, p.getEquipo().getId());
      
        int n = ps.executeUpdate();
        ps.close();
        if (n != 1)
            throw new Exception("El número de filas actualizadas no es uno");
        
        bd.desconectar();
    }
     
     
     public void actualizarNick(Persona p) throws Exception
    {
        bd.conectar();
        
        String plantilla = "UPDATE personas SET Nick=? WHERE ID =?";
        PreparedStatement ps = bd.getCon().prepareStatement(plantilla);
        
        ps.setInt(3, p.getId());
        ps.setString(1, p.getNick());
      
        int n = ps.executeUpdate();
        ps.close();
        if (n != 1)
            throw new Exception("El número de filas actualizadas no es uno");
        
        bd.desconectar();
    }
    
      public void ModificarSueldo(Persona p) throws Exception
    {
        bd.conectar();
        
        String plantilla = "UPDATE personas SET Sueldo=? WHERE ID =?";
        PreparedStatement ps = bd.getCon().prepareStatement(plantilla);
        
        ps.setInt(3, p.getId());
        ps.setDouble(1, p.getSueldo());
      
        int n = ps.executeUpdate();
        ps.close();
        if (n != 1)
            throw new Exception("El número de filas actualizadas no es uno");
        
        bd.desconectar();
    }
     
      
      
        public void CambiarDeEquipo(Persona p) throws Exception
    {
        bd.conectar();
        
        String plantilla = "UPDATE personas SET ID_Equipo=? WHERE ID =?";
        PreparedStatement ps = bd.getCon().prepareStatement(plantilla);
        
        ps.setInt(3, p.getId());
        ps.setInt(1, p.getEquipo().getId());
      
        int n = ps.executeUpdate();
        ps.close();
        if (n != 1)
            throw new Exception("El número de filas actualizadas no es uno");
        
        bd.desconectar();
    }
        
        
      public void borrar(Persona p) throws Exception
    {
        bd.conectar();
        
        String plantilla = "DELETE FROM Personas WHERE ID=?;";
        PreparedStatement ps = bd.getCon().prepareStatement(plantilla);
        ps.setInt(1, p.getId());
      
        int n = ps.executeUpdate();
        ps.close();
        if (n != 1)
            throw new Exception("El número de filas actualizadas no es uno");
        
        bd.desconectar();
    }    
      
      
      public void borrarPorEquipo(Persona p) throws Exception
    {
        bd.conectar();
        
        String plantilla = "DELETE FROM Personas WHERE ID_Equipo=?;";
        PreparedStatement ps = bd.getCon().prepareStatement(plantilla);
        ps.setInt(1, p.getEquipo().getId());
      
        int n = ps.executeUpdate();
        ps.close();
        if (n != 1)
            throw new Exception("El número de filas actualizadas no es uno");
        
        bd.desconectar();
    }  
      
    public ArrayList<Persona>  seleccionarTodosLasPersonas() 
                throws Exception
    {
        bd.conectar();
        
        ArrayList<Persona> lista = new ArrayList();
        String plantilla = "SELECT * FROM Personas;";
        PreparedStatement ps = bd.getCon().prepareStatement(plantilla);
        ResultSet resultado = ps.executeQuery();

       while(resultado.next())
       {
                Persona p = new Persona();
                
                p.setId(resultado.getInt("ID"));
                p.setNombre(resultado.getString("Nombre"));
                p.setNick(resultado.getString("Nick"));
                p.setSueldo(resultado.getDouble("Sueldo"));
                p.getEquipo().setId(resultado.getInt("ID_Equipo"));
                
                lista.add(p);
       }
       bd.desconectar();
       return lista;
    }
        
    public ArrayList<Persona>  seleccionarTodosLosID() 
                throws Exception
    {
        bd.conectar();
        
        ArrayList<Persona> lista = new ArrayList();
        String plantilla = "SELECT ID FROM Personas;";
        PreparedStatement ps = bd.getCon().prepareStatement(plantilla);
        ResultSet resultado = ps.executeQuery();

       while(resultado.next())
       {
                Persona p = new Persona();
                
                p.setId(resultado.getInt("ID"));
                
                lista.add(p);
       }
       bd.desconectar();
       return lista;
    }     
        public ArrayList<Persona>  seleccionarPersonasPorEquipos(int id) 
                throws Exception
    {
        bd.conectar();
        
        ArrayList<Persona> lista = new ArrayList();
        String plantilla = "SELECT * FROM Personas WHERE ID_Equipo=?;";
        PreparedStatement ps = bd.getCon().prepareStatement(plantilla);
        ps.setInt(1, id);
        ResultSet resultado = ps.executeQuery();

       while(resultado.next())
       {
                Persona p = new Persona();
                
                p.setId(resultado.getInt("ID"));
                p.setNombre(resultado.getString("Nombre"));
                p.setNick(resultado.getString("Nick"));
                p.setSueldo(resultado.getDouble("Sueldo"));
                p.getEquipo().setId(resultado.getInt("ID_Equipo"));
                
                lista.add(p);
       }
       bd.desconectar();
       return lista;
    }   
    
        
    public ArrayList<Persona>  seleccionarIDPorEquipos(int id) throws Exception
    {
        bd.conectar();
        
        ArrayList<Persona> lista = new ArrayList();
        String plantilla = "SELECT ID FROM Personas WHERE ID_Equipo=?;";
        PreparedStatement ps = bd.getCon().prepareStatement(plantilla);
        ps.setInt(1, id);
        ResultSet resultado = ps.executeQuery();

       while(resultado.next())
       {
                Persona p = new Persona();
                
                p.setId(resultado.getInt("ID"));
                
                lista.add(p);
       }
       bd.desconectar();
       return lista;
    }     
        
        
        
    public Persona  seleccionarUnaPersona(int id) throws Exception
    {
        bd.conectar();
        
        String plantilla = "SELECT * FROM Personas WHERE ID=?;";
        PreparedStatement ps = bd.getCon().prepareStatement(plantilla);
        ps.setInt(1, id);
       
        ResultSet resultado = ps.executeQuery();

       if (resultado.next())
       {
           Persona p = new Persona();
           p.setId(resultado.getInt("ID"));
           p.setNombre(resultado.getString("Nombre"));
           p.setNick(resultado.getString("Nick"));
           p.setSueldo(resultado.getDouble("Sueldo"));
           p.getEquipo().setId(resultado.getInt("ID_Equipo"));
           
           bd.desconectar();
           return p;
       }
       else
           return null;
    }
    
    
    public Persona  seleccionarNombreDeUnaPersona(int id) throws Exception
    {
        bd.conectar();
        
        String plantilla = "SELECT Nombre FROM Personas WHERE ID=?;";
        PreparedStatement ps = bd.getCon().prepareStatement(plantilla);
        ps.setInt(1, id);
       
        ResultSet resultado = ps.executeQuery();

       if (resultado.next())
       {
           Persona p = new Persona();
           
           p.setNombre(resultado.getString("Nombre"));
           
           bd.desconectar();
           return p;
       }
       else
           return null;
    }
    
    public Persona  seleccionarNickDeUnaPersona(int id) throws Exception
    {
        bd.conectar();
        
        String plantilla = "SELECT Nick FROM Personas WHERE ID=?;";
        PreparedStatement ps = bd.getCon().prepareStatement(plantilla);
        ps.setInt(1, id);
       
        ResultSet resultado = ps.executeQuery();

       if (resultado.next())
       {
           Persona p = new Persona();
           
           p.setNick(resultado.getString("Nick"));
           
           bd.desconectar();
           return p;
       }
       else
           return null;
    }
    
    public Persona  seleccionarSueldoDeUnaPersona(int id) throws Exception
    {
        bd.conectar();
        
        String plantilla = "SELECT Sueldo FROM Personas WHERE ID=?;";
        PreparedStatement ps = bd.getCon().prepareStatement(plantilla);
        ps.setInt(1, id);
       
        ResultSet resultado = ps.executeQuery();

       if (resultado.next())
       {
           Persona p = new Persona();
           
           p.setSueldo(resultado.getDouble("Sueldo"));
           
           bd.desconectar();
           return p;
       }
       else
           return null;
    }
    
    
    public Persona  seleccionarEquipoDeUnaPersona(int id) throws Exception
    {
        bd.conectar();
        
        String plantilla = "SELECT ID_Equipo FROM Personas WHERE ID=?;";
        PreparedStatement ps = bd.getCon().prepareStatement(plantilla);
        ps.setInt(1, id);
       
        ResultSet resultado = ps.executeQuery();

       if (resultado.next())
       {
           Persona p = new Persona();
           
           p.getEquipo().setId_calendario(resultado.getInt("ID_Equipo"));
           
           bd.desconectar();
           return p;
       }
       else
           return null;
    }  
}
