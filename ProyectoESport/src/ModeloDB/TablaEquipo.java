/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ModeloDB;

import ModeloUML.Equipo;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

/**
 *
 * @author Imanol Urquijo
 */
public class TablaEquipo {
    
        private BaseDatos bd;
        private TablaPersona tp;

    public TablaEquipo() {
        bd = new BaseDatos();
    }
    
    
     public void insertar(Equipo e) throws Exception
    {
        bd.conectar();
        
        String plantilla = "INSERT INTO equipo VALUES (?,?,?,?,?);";
        PreparedStatement ps = bd.getCon().prepareStatement(plantilla);
        ps.setInt(1, e.getId());
        ps.setString(2,e.getNombre());
        ps.setString(3, e.getPaginaWeb());
        ps.setInt(4, e.getPuntos());
        ps.setInt(5,e.getId_calendario());
      
        int n = ps.executeUpdate();
        ps.close();
        if (n != 1)
            throw new Exception("El número de filas actualizadas no es uno");
        
        bd.desconectar();
    }
     
     
     public void actualizarNombreYWebCalendario(Equipo e) throws Exception
    {
        bd.conectar();
        
        String plantilla = "UPDATE Equipo SET Nombre =?, Pagina_Web =?,  "
                + "ID_Calendario WHERE ID =?";
        PreparedStatement ps = bd.getCon().prepareStatement(plantilla);
        
        ps.setInt(4, e.getId());
        ps.setString(1, e.getNombre());
        ps.setString(2, e.getPaginaWeb());
        ps.setInt(3, e.getId_calendario());
      
        int n = ps.executeUpdate();
        ps.close();
        if (n != 1)
            throw new Exception("El número de filas actualizadas no es uno");
        
        bd.desconectar();
    }
     
      public void actualizarPuntos(Equipo e) throws Exception
    {
        bd.conectar();
        
        String plantilla = "UPDATE Equipo SET Puntos=?  WHERE ID=?";
        PreparedStatement ps = bd.getCon().prepareStatement(plantilla);
        
        ps.setInt(2, e.getId());
        ps.setInt(1, e.getPuntos());
      
        int n = ps.executeUpdate();
        ps.close();
        if (n != 1)
            throw new Exception("El número de filas actualizadas no es uno");
        
        bd.desconectar();
    }
     
     
      public void borrar(Equipo e) throws Exception
    {
        bd.conectar();
        
        String plantilla = "DELETE FROM Equipo WHERE ID=?";
        PreparedStatement ps = bd.getCon().prepareStatement(plantilla);
        ps.setInt(1, e.getId());
      
        int n = ps.executeUpdate();
        ps.close();
        if (n != 1)
            throw new Exception("El número de filas actualizadas no es uno");
        
        bd.desconectar();
    }
        
    public ArrayList<Equipo>  seleccionarTodosLosEquipos() throws Exception
    {
        bd.conectar();
        
        ArrayList<Equipo> lista = new ArrayList();
      
        String plantilla = "SELECT * FROM Equipo";
        PreparedStatement ps = bd.getCon().prepareStatement(plantilla);
       
        ResultSet resultado = ps.executeQuery();

       while(resultado.next())
       {
                Equipo e = new Equipo();
                
                e.setId(resultado.getInt("ID"));
                e.setNombre(resultado.getString("Nombre"));
                e.setPaginaWeb(resultado.getString("Pagina_Web"));
                e.setPuntos(resultado.getInt("Puntos"));
                e.setId_calendario(resultado.getInt("ID_Calendario"));
                
                lista.add(e);
       }
       bd.desconectar();
       return lista;
    }
    
    public ArrayList<Equipo>  seleccionarEquiposPorCalendario(int id) 
            throws Exception
    {
        bd.conectar();
        
        ArrayList<Equipo> lista = new ArrayList();
        String plantilla = "SELECT * FROM Equipo WHERE ID_Calendario=?";
        PreparedStatement ps = bd.getCon().prepareStatement(plantilla);
        ResultSet resultado = ps.executeQuery();

       while(resultado.next())
       {
                Equipo e = new Equipo();
                
                e.setId(resultado.getInt("ID"));
                e.setNombre(resultado.getString("Nombre"));
                e.setPaginaWeb(resultado.getString("Pagina_Web"));
                e.setPuntos(resultado.getInt("Puntos"));
                e.setId_calendario(resultado.getInt("ID_Calendario"));
                
                lista.add(e);
       }
       bd.desconectar();
       return lista;
    }
    
    public Equipo  seleccionarUnEquipo(int id) throws Exception
    {
        bd.conectar();
        
        String plantilla = "SELECT * FROM Equipo WHERE ID=?";
        PreparedStatement ps = bd.getCon().prepareStatement(plantilla);
        ps.setInt(1, id);
       
        ResultSet resultado = ps.executeQuery();

       if (resultado.next())
       {
           Equipo e = new Equipo();
           
           e.setId(resultado.getInt("ID"));
           e.setNombre(resultado.getString("Nombre"));
           e.setPaginaWeb(resultado.getString("Pagina_Web"));
           e.setPuntos(resultado.getInt("Puntos"));
           e.setId_calendario(resultado.getInt("ID_Calendario"));
           
           bd.desconectar();
           return e;
       }
       else
           return null;
       
    }
    
    
    public Equipo  seleccionarEquipoConIntegrantes(int id) throws Exception
    {
        bd.conectar();
        
        String plantilla = "SELECT * FROM Equipo WHERE ID=?";
        PreparedStatement ps = bd.getCon().prepareStatement(plantilla);
        ps.setInt(1, id);
       
        ResultSet resultado = ps.executeQuery();

       if (resultado.next())
       {
           Equipo e = new Equipo();
           
           e.setId(resultado.getInt("ID"));
           e.setNombre(resultado.getString("Nombre"));
           e.setPaginaWeb(resultado.getString("Pagina_Web"));
           e.setPuntos(resultado.getInt("Puntos"));
           e.setId_calendario(resultado.getInt("ID_Calendario"));
           e.setPersonas(tp.seleccionarPersonasPorEquipos(id));
           
           bd.desconectar();
           return e;
       }
       else
           return null;
    }
    
    public Equipo  seleccionarPuntosPorEquipo(int id) throws Exception
    {
        bd.conectar();
        
        String plantilla = "SELECT Puntos FROM Equipo WHERE ID=?";
        PreparedStatement ps = bd.getCon().prepareStatement(plantilla);
        ps.setInt(1, id);
       
        ResultSet resultado = ps.executeQuery();

       if (resultado.next())
       {
           Equipo e = new Equipo();
           
           e.setPuntos(resultado.getInt("Puntos"));
           
           bd.desconectar();
           return e;
       }
       else
           return null;
    }
    
    public ArrayList<Equipo>  seleccionarPuntosPorEquipos() 
            throws Exception
    {
        bd.conectar();
        
        ArrayList<Equipo> lista = new ArrayList();
        String plantilla = "SELECT Puntos FROM Equipo GROUP BY Punutos";
        PreparedStatement ps = bd.getCon().prepareStatement(plantilla);
        ResultSet resultado = ps.executeQuery();

       while(resultado.next())
       {
                Equipo e = new Equipo();
                
                e.setPuntos(resultado.getInt("Puntos"));
                
                lista.add(e);
       }
       bd.desconectar();
       return lista;
    }    
    
    
}
