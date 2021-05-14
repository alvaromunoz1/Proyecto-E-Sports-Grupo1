/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ModeloDB;

import ModeloUML.Persona;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

/**
 *
 * @author Imanol Urquijo
 */
public class TablaPersona {
    
    
        private Connection con;
        private TablaEntrenador te;
        private TablaAsistente ta;
        private TablaDueño td;
        private TablaJugador tj;

    public TablaPersona(Connection con) {
        this.con = con;
    }
    
    public void setTablasExtra( TablaEntrenador te, TablaAsistente ta, TablaDueño td, TablaJugador tj)
    {
        this.te = te;
        this.ta = ta;
        this.td = td;
        this.tj = tj;
    }
    
     public void insertar(Persona p) throws Exception
    {
        
        String plantilla = "INSERT INTO Personas VALUES (?,?,?,?);";
        PreparedStatement ps = con.prepareStatement(plantilla);
        ps.setInt(1, p.getId());
        ps.setString(2,p.getNombre());
        ps.setString(3, p.getNick());
        ps.setDouble(4, p.getSueldo());
        ps.setInt(4, p.getEquipo().getId());
      
        int n = ps.executeUpdate();
        ps.close();
        if (n != 1)
            throw new Exception("El número de filas actualizadas no es uno");
    }
     
     
     public void actualizarNick(Persona p) throws Exception
    {
        
        String plantilla = "UPDATE personas SET Nick=? WHERE ID =?";
        PreparedStatement ps = con.prepareStatement(plantilla);
        
        ps.setInt(3, p.getId());
        ps.setString(1, p.getNick());
      
        int n = ps.executeUpdate();
        ps.close();
        if (n != 1)
            throw new Exception("El número de filas actualizadas no es uno");
    }
    
      public void ModificarSueldo(Persona p) throws Exception
    {
        
        String plantilla = "UPDATE personas SET Sueldo=? WHERE ID =?";
        PreparedStatement ps = con.prepareStatement(plantilla);
        
        ps.setInt(3, p.getId());
        ps.setDouble(1, p.getSueldo());
      
        int n = ps.executeUpdate();
        ps.close();
        if (n != 1)
            throw new Exception("El número de filas actualizadas no es uno");
    }
     
      
      
        public void CambiarDeEquipo(Persona p) throws Exception
    {
        
        String plantilla = "UPDATE personas SET ID_Equipo=? WHERE ID =?";
        PreparedStatement ps = con.prepareStatement(plantilla);
        
        ps.setInt(3, p.getId());
        ps.setInt(1, p.getEquipo().getId());
      
        int n = ps.executeUpdate();
        ps.close();
        if (n != 1)
            throw new Exception("El número de filas actualizadas no es uno");
    }
        
        
      public void borrar(Persona p) throws Exception
    {
        
        String plantilla = "DELETE FROM Personas WHERE ID=?;";
        PreparedStatement ps = con.prepareStatement(plantilla);
        ps.setInt(1, p.getId());
      
        int n = ps.executeUpdate();
        ps.close();
        if (n != 1)
            throw new Exception("El número de filas actualizadas no es uno");
    }    
      
      
      public void borrarPorEquipo(Persona p) throws Exception
    {
        
        String plantilla = "DELETE FROM Personas WHERE ID_Equipo=?;";
        PreparedStatement ps = con.prepareStatement(plantilla);
        ps.setInt(1, p.getEquipo().getId());
      
        int n = ps.executeUpdate();
        ps.close();
        if (n != 1)
            throw new Exception("El número de filas actualizadas no es uno");
    }  
      
        public ArrayList<Persona>  seleccionarTodosLasPersonas() throws Exception
    {
        ArrayList<Persona> lista = new ArrayList();
        String plantilla = "SELECT * FROM Personas;";
        PreparedStatement ps = con.prepareStatement(plantilla);
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
       return lista;
    }
        
     
        public ArrayList<Persona>  seleccionarPersonasPorEquipos(int id) throws Exception
    {
        ArrayList<Persona> lista = new ArrayList();
        String plantilla = "SELECT * FROM Personas WHERE ID_Equipo=?;";
        PreparedStatement ps = con.prepareStatement(plantilla);
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
       return lista;
    }   
    
        public int  seleccionarIDPorEquipos(int id) throws Exception
    {
        String plantilla = "SELECT ID FROM Personas WHERE ID_Equipo=?;";
        PreparedStatement ps = con.prepareStatement(plantilla);
        ps.setInt(1, id);
        ResultSet resultado = ps.executeQuery();

       if (resultado.next())
       {
           Persona p = new Persona();
           
           p.setId(resultado.getInt("ID"));
           int resp = p.getId();
           
           return resp;
       }
       else
           return null;
    }     
        
    public Persona  seleccionarUnaPersona(int id) throws Exception
    {
        
        String plantilla = "SELECT * FROM Personas WHERE ID=?;";
        PreparedStatement ps = con.prepareStatement(plantilla);
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
           
           return p;
       }
       else
           return null;
    }
    
    public Persona  seleccionarIdDeUnaPersona(int id) throws Exception
    {
        
        String plantilla = "SELECT ID FROM Personas WHERE ID=?;";
        PreparedStatement ps = con.prepareStatement(plantilla);
        ps.setInt(1, id);
       
        ResultSet resultado = ps.executeQuery();

       if (resultado.next())
       {
           Persona p = new Persona();
           
           p.setId(resultado.getInt("ID"));
           
           
           return p;
       }
       else
           return null;
    }
    
    public Persona  seleccionarNombreDeUnaPersona(int id) throws Exception
    {
        
        String plantilla = "SELECT Nombre FROM Personas WHERE ID=?;";
        PreparedStatement ps = con.prepareStatement(plantilla);
        ps.setInt(1, id);
       
        ResultSet resultado = ps.executeQuery();

       if (resultado.next())
       {
           Persona p = new Persona();
           
           p.setNombre(resultado.getString("Nombre"));
           
           return p;
       }
       else
           return null;
    }
    
    public Persona  seleccionarNickDeUnaPersona(int id) throws Exception
    {
        
        String plantilla = "SELECT Nick FROM Personas WHERE ID=?;";
        PreparedStatement ps = con.prepareStatement(plantilla);
        ps.setInt(1, id);
       
        ResultSet resultado = ps.executeQuery();

       if (resultado.next())
       {
           Persona p = new Persona();
           
           p.setNick(resultado.getString("Nick"));
           
           return p;
       }
       else
           return null;
    }
    
    public Persona  seleccionarSueldoDeUnaPersona(int id) throws Exception
    {
        
        String plantilla = "SELECT Sueldo FROM Personas WHERE ID=?;";
        PreparedStatement ps = con.prepareStatement(plantilla);
        ps.setInt(1, id);
       
        ResultSet resultado = ps.executeQuery();

       if (resultado.next())
       {
           Persona p = new Persona();
           
           p.setSueldo(resultado.getDouble("Sueldo"));
           
           return p;
       }
       else
           return null;
    }
    
    
    public Persona  seleccionarEquipoDeUnaPersona(int id) throws Exception
    {
        
        String plantilla = "SELECT ID_Equipo FROM Personas WHERE ID=?;";
        PreparedStatement ps = con.prepareStatement(plantilla);
        ps.setInt(1, id);
       
        ResultSet resultado = ps.executeQuery();

       if (resultado.next())
       {
           Persona p = new Persona();
           
           p.getEquipo().setId_calendario(resultado.getInt("ID_Equipo"));
           
           return p;
       }
       else
           return null;
    }
}
