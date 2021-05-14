/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ModeloDB;

import ModeloUML.Equipo;
import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

/**
 *
 * @author Imanol Urquijo
 */
public class TablaEquipo {
    
        private Connection con;
        private TablaEntrenador te;
        private TablaAsistente ta;
        private TablaDueño td;
        private TablaJugador tj;

    public TablaEquipo(Connection con, TablaEntrenador te, TablaAsistente ta, TablaDueño td, TablaJugador tj) {
        this.con = con;
        this.te = te;
        this.ta = ta;
        this.td = td;
        this.tj = tj;
    }
    
     public void insertar(Equipo e) throws Exception
    {
        
        String plantilla = "INSERT INTO Equipo VALUES (?,?,?,?);";
        PreparedStatement ps = con.prepareStatement(plantilla);
        ps.setInt(1, e.getId());
        ps.setString(2,e.getNombre());
        ps.setString(3, e.getPaginaWeb());
        ps.setInt(4, e.getPuntos());
        ps.setInt(4,e.getId_calendario());
      
        int n = ps.executeUpdate();
        ps.close();
        if (n != 1)
            throw new Exception("El número de filas actualizadas no es uno");
    }
     
     
     public void actualizarNombreYWeb(Equipo e) throws Exception
    {
        
        String plantilla = "UPDATE Jornada SET Nombre =?, Pagina_Web =?  WHERE ID =?";
        PreparedStatement ps = con.prepareStatement(plantilla);
        
        ps.setInt(3, e.getId());
        ps.setString(1, e.getNombre());
        ps.setString(2, e.getPaginaWeb());
      
        int n = ps.executeUpdate();
        ps.close();
        if (n != 1)
            throw new Exception("El número de filas actualizadas no es uno");
    }
     
      public void actualizarPuntos(Equipo e) throws Exception
    {
        
        String plantilla = "UPDATE Jornada SET Punto=?  WHERE ID =?";
        PreparedStatement ps = con.prepareStatement(plantilla);
        
        ps.setInt(3, e.getId());
        ps.setInt(1, e.getPuntos());
      
        int n = ps.executeUpdate();
        ps.close();
        if (n != 1)
            throw new Exception("El número de filas actualizadas no es uno");
    }
     
     
      public void borrar(Equipo e) throws Exception
    {
        
        String plantilla = "DELETE FROM Equipo WHERE ID=?;";
        PreparedStatement ps = con.prepareStatement(plantilla);
        ps.setInt(1, e.getId());
      
        int n = ps.executeUpdate();
        ps.close();
        if (n != 1)
            throw new Exception("El número de filas actualizadas no es uno");
    }
        
    public ArrayList<Equipo>  seleccionarTodosLosEquipos() throws Exception
    {
        ArrayList<Equipo> lista = new ArrayList();
      
        String plantilla = "SELECT * FROM Equipo;";
        PreparedStatement ps = con.prepareStatement(plantilla);
       
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
       return lista;
    }
    
    public ArrayList<Equipo>  seleccionarEquiposPorCalendario(int id) throws Exception
    {
        ArrayList<Equipo> lista = new ArrayList();
        String plantilla = "SELECT * FROM Equipo WHERE ID_Calendario=?;";
        PreparedStatement ps = con.prepareStatement(plantilla);
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
       return lista;
    }
    
    public Equipo  seleccionarUnEquipo(int id) throws Exception
    {
        
        String plantilla = "SELECT * FROM Equipo WHERE ID=?;";
        PreparedStatement ps = con.prepareStatement(plantilla);
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
           
           return e;
       }
       else
           return null;
    }
    
    
    public Equipo  seleccionarEquipoConIntegrantes(int id) throws Exception
    {
        
        String plantilla = "SELECT * FROM Equipo WHERE ID=?;";
        PreparedStatement ps = con.prepareStatement(plantilla);
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
           e.setDueño(funcion dueños por equipo);
           e.setAsistente(funcion asis por equipo);
           e.setEntrenador(funcion entre por equipo);
           e.setJugadores(funcion jug por equipo);
           
           return e;
       }
       else
           return null;
    }
    
    public Equipo  seleccionarPuntosPorEquipo(int id) throws Exception
    {
        
        String plantilla = "SELECT Puntos FROM Equipo WHERE ID=?;";
        PreparedStatement ps = con.prepareStatement(plantilla);
        ps.setInt(1, id);
       
        ResultSet resultado = ps.executeQuery();

       if (resultado.next())
       {
           Equipo e = new Equipo();
           
           e.setPuntos(resultado.getInt("Puntos"));
           
           return e;
       }
       else
           return null;
    }
    
}
