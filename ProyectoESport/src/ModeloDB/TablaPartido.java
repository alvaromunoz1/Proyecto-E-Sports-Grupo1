/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ModeloDB;

import ModeloUML.Partido;
import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

/**
 *
 * @author Imanol Urquijo
 */
public class TablaPartido {
    
        private Connection con;
        private TablaEquipo te;

    public TablaPartido(Connection con, TablaPartido tp) {
        this.con = con;
        this.te = te;
    }
    
     public void insertarSinResultado(Partido p) throws Exception
    {
    
        
        String plantilla = "INSERT INTO Partido VALUES (?,?,?,?,?,NULL,NULL,?);";
        PreparedStatement ps = con.prepareStatement(plantilla);
        ps.setInt(1, p.getId());
        ps.setString(2,p.getNombre());
        ps.setInt(3, p.getLocal().getId());
        ps.setInt(4,p.getVisitante().getId());
        ps.setTime(5, p.getHora());
        ps.setInt(6, p.getId_jornada());
      
        int n = ps.executeUpdate();
        ps.close();
        if (n != 1)
            throw new Exception("El número de filas actualizadas no es uno");
    }
     
    
    public void insertarConResultado(Partido p) throws Exception
    {
    
        
        String plantilla = "INSERT INTO Partido VALUES (?,?,?,?,?,?,?,?);";
        PreparedStatement ps = con.prepareStatement(plantilla);
        ps.setInt(1, p.getId());
        ps.setString(2,p.getNombre());
        ps.setInt(3, p.getLocal().getId());
        ps.setInt(4,p.getVisitante().getId());
        ps.setTime(5, p.getHora());
        ps.setInt(6, p.getRes_local());
        ps.setInt(7, p.getRes_visit());
        ps.setInt(8, p.getId_jornada());
      
        int n = ps.executeUpdate();
        ps.close();
        if (n != 1)
            throw new Exception("El número de filas actualizadas no es uno");
    }
     
     
     public void CambiarResultado(Partido p) throws Exception
    {
        
        String plantilla = "UPDATE Partido SET Resultado_Local=?, Resultado_Visitante=?  WHERE ID =?";
        PreparedStatement ps = con.prepareStatement(plantilla);
        
        ps.setInt(3, p.getId());
        ps.setInt(1, p.getRes_local());
        ps.setInt(2, p.getRes_visit());
      
        int n = ps.executeUpdate();
        ps.close();
        if (n != 1)
            throw new Exception("El número de filas actualizadas no es uno");
    }
     
     
     public void CambiarDeJornada(Partido p) throws Exception
    {
        
        String plantilla = "UPDATE Partido SET ID_Jornada=?  WHERE ID =?";
        PreparedStatement ps = con.prepareStatement(plantilla);
        
        ps.setInt(3, p.getId());
        ps.setInt(1, p.getId_jornada());
      
        int n = ps.executeUpdate();
        ps.close();
        if (n != 1)
            throw new Exception("El número de filas actualizadas no es uno");
    }
     
     
    public void CambiarHoraDePartido(Partido p) throws Exception
    {
        
        String plantilla = "UPDATE Partido SET Hora=?  WHERE ID =?";
        PreparedStatement ps = con.prepareStatement(plantilla);
        
        ps.setInt(3, p.getId());
        ps.setTime(0, p.getHora());
      
        int n = ps.executeUpdate();
        ps.close();
        if (n != 1)
            throw new Exception("El número de filas actualizadas no es uno");
    }
     
      public void borrar(Partido p) throws Exception
    {
        // no es necesario todo el objeto con el dni es suficiente
        
        String plantilla = "DELETE FROM Partido WHERE ID=?;";
        PreparedStatement ps = con.prepareStatement(plantilla);
        ps.setInt(1, p.getId());
      
        int n = ps.executeUpdate();
        ps.close();
        if (n != 1)
            throw new Exception("El número de filas actualizadas no es uno");
    }
    
      
      public void borrarPorJornada(Partido p) throws Exception
    {
        // no es necesario todo el objeto con el dni es suficiente
        
        String plantilla = "DELETE FROM Partido WHERE ID_Jornada=?;";
        PreparedStatement ps = con.prepareStatement(plantilla);
        ps.setInt(1, p.getId_jornada());
      
        int n = ps.executeUpdate();
        ps.close();
        if (n != 1)
            throw new Exception("El número de filas actualizadas no es uno");
    }
      
    public ArrayList<Partido>  seleccionarPartidos() throws Exception
    {
        ArrayList<Partido> lista = new ArrayList();
      
        String plantilla = "SELECT * FROM Partido;";
        PreparedStatement ps = con.prepareStatement(plantilla);
       
        ResultSet resultado = ps.executeQuery();

       while(resultado.next())
       {
                Partido p = new Partido();
                
                p.setId(resultado.getInt("ID"));
                p.setNombre(resultado.getString("Nombre"));
                p.getLocal().setId(resultado.getInt("ID_Local"));
                p.getVisitante().setId(resultado.getInt("ID_Visitante"));
                p.setHora(resultado.getTime("Hora"));
                p.setRes_local(resultado.getInt("Resultado_Local"));
                p.setRes_visit(resultado.getInt("Resultado_Visitante"));
                p.setId_jornada(resultado.getInt("ID_Jornada"));
                
                lista.add(p);
       }
       return lista;
    }
    
    
    public ArrayList<Partido>  seleccionarPartidosPorJornada(int id) throws Exception
    {
        ArrayList<Partido> lista = new ArrayList();
        String plantilla = "SELECT * FROM Partido WHERE ID_Jornada =?;";
        PreparedStatement ps = con.prepareStatement(plantilla);
        ps.setInt(1, id);
       
      ResultSet resultado = ps.executeQuery();
       while(resultado.next())
       {
                Partido p = new Partido();
                
                p.setId(resultado.getInt("ID"));
                p.setNombre(resultado.getString("Nombre"));
                p.getLocal().setId(resultado.getInt("ID_Local"));
                p.getVisitante().setId(resultado.getInt("ID_Visitante"));
                p.setHora(resultado.getTime("Hora"));
                p.setRes_local(resultado.getInt("Resultado_Local"));
                p.setRes_visit(resultado.getInt("Resultado_Visitante"));
                p.setId_jornada(resultado.getInt("ID_Jornada"));
                
                lista.add(p);
       }
       return lista;
    }
    
    public Partido  seleccionarUnaPartido(int id) throws Exception
    {
        
        String plantilla = "SELECT * FROM Partido WHERE ID=?;";
        PreparedStatement ps = con.prepareStatement(plantilla);
        ps.setInt(1, id);
       
        ResultSet resultado = ps.executeQuery();

       if (resultado.next())
       {
           Partido p = new Partido();
           
           p.setId(resultado.getInt("ID"));
           p.setNombre(resultado.getString("Nombre"));
           p.getLocal().setId(resultado.getInt("ID_Local"));
           p.getVisitante().setId(resultado.getInt("ID_Visitante"));
           p.setHora(resultado.getTime("Hora"));
           p.setRes_local(resultado.getInt("Resultado_Local"));
           p.setRes_visit(resultado.getInt("Resultado_Visitante"));
           p.setId_jornada(resultado.getInt("ID_Jornada"));
           
           return p;
       }
       else
           return null;
    }
    
}
