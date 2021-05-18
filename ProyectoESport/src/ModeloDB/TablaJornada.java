/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ModeloDB;

import ModeloUML.Jornada;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

/**
 *
 * @author Imanol Urquijo
 */
public class TablaJornada {
    
        private BaseDatos bd;
        private TablaPartido tp;

    public TablaJornada() {
        bd = new BaseDatos();
    }
    
     public void insertar(Jornada j) throws Exception
    {
        bd.conectar();
        
        String plantilla = "INSERT INTO Jornada VALUES (?,?,?,?);";
        PreparedStatement ps = bd.getCon().prepareStatement(plantilla);
        ps.setInt(1, j.getId());
        ps.setString(2,j.getNombre());
        ps.setDate(3, (Date) j.getFecha());
        ps.setInt(4,j.getId_calendario());
      
        int n = ps.executeUpdate();
        ps.close();
        if (n != 1)
            throw new Exception("El número de filas actualizadas no es uno");
        
        bd.desconectar();
    }
     
     
     public void CambiarCalendario(Jornada j) throws Exception
    {
        bd.conectar();
        
        String plantilla = "UPDATE Jornada SET ID_Calendario=?  WHERE ID =?";
        PreparedStatement ps = bd.getCon().prepareStatement(plantilla);
        
        ps.setInt(2, j.getId());
        ps.setInt(1, j.getId_calendario());
      
        int n = ps.executeUpdate();
        ps.close();
        if (n != 1)
            throw new Exception("El número de filas actualizadas no es uno");
        
        bd.desconectar();
    }
     
      public void CambiarFecha(Jornada j) throws Exception
    {
        bd.conectar();
        
        String plantilla = "UPDATE Jornada SET Fecha =?  WHERE ID =?";
        PreparedStatement ps = bd.getCon().prepareStatement(plantilla);
        
        ps.setInt(3, j.getId());
        ps.setDate(2, (Date) j.getFecha());
      
        int n = ps.executeUpdate();
        ps.close();
        if (n != 1)
            throw new Exception("El número de filas actualizadas no es uno");
        
        bd.desconectar();
    }
     
      public void borrar(Jornada j) throws Exception
    {
        bd.conectar();
        
        String plantilla = "DELET FROM Jornada WHERE ID=?;";
        PreparedStatement ps = bd.getCon().prepareStatement(plantilla);
        ps.setInt(1, j.getId());
      
        int n = ps.executeUpdate();
        ps.close();
        if (n != 1)
            throw new Exception("El número de filas actualizadas no es uno");
        
        bd.desconectar();
    }
      
      
    public void borrarPorCalendario(Jornada j) throws Exception
    {
        bd.conectar();
        
        String plantilla = "DELET FROM Jornada WHERE ID_Calendario=?;";
        PreparedStatement ps = bd.getCon().prepareStatement(plantilla);
        ps.setInt(1, j.getId_calendario());
      
        int n = ps.executeUpdate();
        ps.close();
        if (n != 1)
            throw new Exception("El número de filas actualizadas no es uno");
        
        bd.desconectar();
    }
      
    public ArrayList<Jornada>  seleccionarTodo() throws Exception
    {
        bd.conectar();
        
        ArrayList<Jornada> lista = new ArrayList();
      
        String plantilla = "SELECT * FROM Jornada;";
        PreparedStatement ps = bd.getCon().prepareStatement(plantilla);
       
        ResultSet resultado = ps.executeQuery();

       while(resultado.next())
       {
                Jornada j = new Jornada();
                
                j.setId(resultado.getInt("ID"));
                j.setNombre(resultado.getString("Nombre"));
                j.setFecha(resultado.getDate("Fecha"));
                j.setId_calendario(resultado.getInt("ID_Calendario"));
                
                lista.add(j);
       }
       bd.desconectar();
       return lista;
    }
    
    
    public ArrayList<Jornada>  seleccionarJornadasPorCalendario(int id) 
            throws Exception
    {
        bd.conectar();
        
        ArrayList<Jornada> lista = new ArrayList();
        String plantilla = "SELECT * FROM Jornada WHERE ID_Calendario =?;";
        PreparedStatement ps = bd.getCon().prepareStatement(plantilla);
        ps.setInt(1, id);
       
      ResultSet resultado = ps.executeQuery();
       while(resultado.next())
       {
                Jornada j = new Jornada();
                j.setId(resultado.getInt("ID"));
                j.setNombre(resultado.getString("Nombre"));
                j.setFecha(resultado.getDate("Fecha"));
                j.setId_calendario(resultado.getInt("ID_Calendario"));
                
                lista.add(j);
       }
       bd.desconectar();
       return lista;
    }
    
    public Jornada  seleccionarUnaJornada(int id) throws Exception
    {
        bd.conectar();
        
        String plantilla = "SELECT * FROM Jornada WHERE ID=?;";
        PreparedStatement ps = bd.getCon().prepareStatement(plantilla);
        ps.setInt(1, id);
       
        ResultSet resultado = ps.executeQuery();

       if (resultado.next())
       {
           Jornada j = new Jornada();
           
           j.setId(resultado.getInt("ID"));
           j.setNombre(resultado.getString("Nombre"));
           j.setFecha(resultado.getDate("Fecha"));
           j.setId_calendario(resultado.getInt("ID_Calendario"));
           
           bd.desconectar();
           return j;
       }
       else
           return null;
    }
    
        
    public Jornada  seleccionarUnaJornadaConPartidos(int id) throws Exception
    {
        bd.conectar();
        
        String plantilla = "SELECT * FROM Jornada WHERE ID=?;";
        PreparedStatement ps = bd.getCon().prepareStatement(plantilla);
        ps.setInt(1, id);
       
        ResultSet resultado = ps.executeQuery();

       if (resultado.next())
       {
           Jornada j = new Jornada();
           
           j.setId(resultado.getInt("ID"));
           j.setNombre(resultado.getString("Nombre"));
           j.setFecha(resultado.getDate("Fecha"));
           j.setId_calendario(resultado.getInt("ID_Calendario"));
           j.setPartidos(tp.seleccionarPartidosPorJornada(id));
           
           bd.desconectar();
           return j;
       }
       else
           return null;
    }     
}
