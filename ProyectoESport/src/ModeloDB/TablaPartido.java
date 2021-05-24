/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ModeloDB;

import ModeloUML.Partido;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.time.LocalTime;
import java.util.ArrayList;

/**
 *
 * @author Imanol Urquijo
 */
public class TablaPartido {
    
        private BaseDatos bd;
        private TablaEquipo te;

    public TablaPartido() {
        bd = new BaseDatos();
    }
    
    public static java.sql.Time convertirHora(LocalTime hora)
    {
        return java.sql.Time.valueOf(hora);
    }
        
     public void insertarSinResultado(Partido p) throws Exception
    {
        bd.conectar();
        
        String plantilla = "INSERT INTO(ID,Nombre,ID_Local,ID_Visitante,Hora"
                + ",ID_Jornada) Partido VALUES (?,?,?,?,?,?);";
        PreparedStatement ps = bd.getCon().prepareStatement(plantilla);
        ps.setInt(1, p.getId());
        ps.setString(2,p.getNombre());
        ps.setInt(3, p.getLocal().getId());
        ps.setInt(4,p.getVisitante().getId());
        ps.setTime(5, convertirHora(p.getHora()));
        ps.setInt(6, p.getId_jornada());
      
        int n = ps.executeUpdate();
        ps.close();
        if (n != 1)
            throw new Exception("El número de filas actualizadas no es uno");
        
        bd.desconectar();
    }
     

     public void insertarPartidoBasico(Partido p) throws Exception
    {
        bd.conectar();
        
        String plantilla = "INSERT INTO(ID,ID_Jornada) Partido VALUES (?,?);";
        PreparedStatement ps = bd.getCon().prepareStatement(plantilla);
        ps.setInt(1, p.getId());
        ps.setInt(2, p.getId_jornada());
      
        int n = ps.executeUpdate();
        ps.close();
        if (n != 1)
            throw new Exception("El número de filas actualizadas no es uno");
        
        bd.desconectar();
    }     

     public void insertarPartidoSoloID(Partido p) throws Exception
    {
        bd.conectar();
        
        String plantilla = "INSERT INTO(ID) Partido VALUES (?);";
        PreparedStatement ps = bd.getCon().prepareStatement(plantilla);
        ps.setInt(1, p.getId());
        int n = ps.executeUpdate();
        ps.close();
        if (n != 1)
            throw new Exception("El número de filas actualizadas no es uno");
        
        bd.desconectar();
    }

     public void insertarPartidoSoloJornada(Partido p) throws Exception
    {
        bd.conectar();
        
        String plantilla = "INSERT INTO(ID_Jornada) Partido VALUES (?);";
        PreparedStatement ps = bd.getCon().prepareStatement(plantilla);
        ps.setInt(1, p.getId_jornada());
        int n = ps.executeUpdate();
        ps.close();
        if (n != 1)
            throw new Exception("El número de filas actualizadas no es uno");
        
        bd.desconectar();
    }
     
    public void insertarConResultado(Partido p) throws Exception
    {
        bd.conectar();
        
        String plantilla = "INSERT INTO Partido VALUES (?,?,?,?,?,?,?,?);";
        PreparedStatement ps = bd.getCon().prepareStatement(plantilla);
        ps.setInt(1, p.getId());
        ps.setString(2,p.getNombre());
        ps.setInt(3, p.getLocal().getId());
        ps.setInt(4,p.getVisitante().getId());
        ps.setTime(5, convertirHora(p.getHora()));
        ps.setInt(6, p.getRes_local());
        ps.setInt(7, p.getRes_visit());
        ps.setInt(8, p.getId_jornada());
      
        int n = ps.executeUpdate();
        ps.close();
        if (n != 1)
            throw new Exception("El número de filas actualizadas no es uno");
        
        bd.desconectar();
    }
     
     
     public void CambiarResultado(Partido p) throws Exception
    {
        bd.conectar();
        
        String plantilla = "UPDATE Partido SET Resultado_Local=?, "
                + "Resultado_Visitante=?  WHERE ID =?";
        PreparedStatement ps = bd.getCon().prepareStatement(plantilla);
        
        ps.setInt(3, p.getId());
        ps.setInt(1, p.getRes_local());
        ps.setInt(2, p.getRes_visit());
      
        int n = ps.executeUpdate();
        ps.close();
        if (n != 1)
            throw new Exception("El número de filas actualizadas no es uno");
        
        bd.desconectar();
    }
     
     
     public void emparejarEquipos(Partido p) throws Exception
    {
        bd.conectar();
        
        String plantilla = "UPDATE Partido SET Nombre=? ID_Local=?, ID_Visitante  WHERE (ID=?) AND (ID_Jornada=?)";
        PreparedStatement ps = bd.getCon().prepareStatement(plantilla);
        
        ps.setInt(4, p.getId());
        ps.setInt(5, p.getId_jornada());
        ps.setString(1, p.getNombre());
        ps.setInt(2, p.getLocal().getId());
        ps.setInt(3, p.getVisitante().getId());
      
        int n = ps.executeUpdate();
        ps.close();
        if (n != 1)
            throw new Exception("El número de filas actualizadas no es uno");
        
        bd.desconectar();
    }
     
     
    public void CambiarHoraDePartido(Partido p) throws Exception
    {
        bd.conectar();
        
        String plantilla = "UPDATE Partido SET Hora=?  WHERE ID =?";
        PreparedStatement ps = bd.getCon().prepareStatement(plantilla);
        
        ps.setInt(3, p.getId());
        ps.setTime(0, convertirHora(p.getHora()));
      
        int n = ps.executeUpdate();
        ps.close();
        if (n != 1)
            throw new Exception("El número de filas actualizadas no es uno");
        
        bd.desconectar();
    }
     
      public void borrar(Partido p) throws Exception
    {
        bd.conectar();
        
        String plantilla = "DELETE FROM Partido WHERE ID=?;";
        PreparedStatement ps = bd.getCon().prepareStatement(plantilla);
        ps.setInt(1, p.getId());
      
        int n = ps.executeUpdate();
        ps.close();
        if (n != 1)
            throw new Exception("El número de filas actualizadas no es uno");
        
        bd.desconectar();
    }
    
      
      public void borrarPorJornada(Partido p) throws Exception
    {
        bd.conectar();
        
        String plantilla = "DELETE FROM Partido WHERE ID_Jornada=?;";
        PreparedStatement ps = bd.getCon().prepareStatement(plantilla);
        ps.setInt(1, p.getId_jornada());
      
        int n = ps.executeUpdate();
        ps.close();
        if (n != 1)
            throw new Exception("El número de filas actualizadas no es uno");
        
        bd.desconectar();
    }
      
    public ArrayList<Partido>  seleccionarPartidos() throws Exception
    {
        bd.conectar();
        
        ArrayList<Partido> lista = new ArrayList();
      
        String plantilla = "SELECT * FROM Partido;";
        PreparedStatement ps = bd.getCon().prepareStatement(plantilla);
       
        ResultSet resultado = ps.executeQuery();

       while(resultado.next())
       {
                Partido p = new Partido();
                
                p.setId(resultado.getInt("ID"));
                p.setNombre(resultado.getString("Nombre"));
                p.getLocal().setId(resultado.getInt("ID_Local"));
                p.getVisitante().setId(resultado.getInt("ID_Visitante"));
                p.setHora(resultado.getTime("Hora").toLocalTime());
                p.setRes_local(resultado.getInt("Resultado_Local"));
                p.setRes_visit(resultado.getInt("Resultado_Visitante"));
                p.setId_jornada(resultado.getInt("ID_Jornada"));
                
                lista.add(p);
       }
       bd.desconectar();
       return lista;
    }
    
    public ArrayList<Partido>  seleccionarResultadoComoVisitante(int id) throws Exception
    {
        bd.conectar();
        
        ArrayList<Partido> lista = new ArrayList();
      
        String plantilla = "SELECT Resultado_Local, Resultado_Visitante FROM Partido WHERE ID_Visitante=?;";
        PreparedStatement ps = bd.getCon().prepareStatement(plantilla);
        ps.setInt(1, id);
        
        ResultSet resultado = ps.executeQuery();

       while(resultado.next())
       {
                Partido p = new Partido();
                
                p.setRes_local(resultado.getInt("Resultado_Local"));
                p.setRes_visit(resultado.getInt("Resultado_Visitante"));

                lista.add(p);
       }
       bd.desconectar();
       return lista;
    } 
    
    
    public ArrayList<Partido>  seleccionarResultadoComoLocal(int id) throws Exception
    {
        bd.conectar();
        
        ArrayList<Partido> lista = new ArrayList();
      
        String plantilla = "SELECT Resultado_Local, Resultado_Visitante FROM Partido WHERE ID_Local=?;";
        PreparedStatement ps = bd.getCon().prepareStatement(plantilla);
        ps.setInt(1, id);
        
        ResultSet resultado = ps.executeQuery();

       while(resultado.next())
       {
                Partido p = new Partido();
                
                p.setRes_local(resultado.getInt("Resultado_Local"));
                p.setRes_visit(resultado.getInt("Resultado_Visitante"));

                lista.add(p);
       }
       bd.desconectar();
       return lista;
    }    
    
    public ArrayList<Partido>  seleccionarPartidosPorJornada(int id) 
            throws Exception
    {
        bd.conectar();
        
        ArrayList<Partido> lista = new ArrayList();
        String plantilla = "SELECT * FROM Partido WHERE ID_Jornada =?;";
        PreparedStatement ps = bd.getCon().prepareStatement(plantilla);
        ps.setInt(1, id);
       
      ResultSet resultado = ps.executeQuery();
       while(resultado.next())
       {
                Partido p = new Partido();
                
                p.setId(resultado.getInt("ID"));
                p.setNombre(resultado.getString("Nombre"));
                p.getLocal().setId(resultado.getInt("ID_Local"));
                p.getVisitante().setId(resultado.getInt("ID_Visitante"));
                p.setHora(resultado.getTime("Hora").toLocalTime());
                p.setRes_local(resultado.getInt("Resultado_Local"));
                p.setRes_visit(resultado.getInt("Resultado_Visitante"));
                p.setId_jornada(resultado.getInt("ID_Jornada"));
                
                lista.add(p);
       }
       bd.desconectar();
       return lista;
    }
    
    public Partido  seleccionarUnPartidoBasico(int id) throws Exception
    {
        bd.conectar();
        
        String plantilla = "SELECT * FROM Partido WHERE ID=?;";
        PreparedStatement ps = bd.getCon().prepareStatement(plantilla);
        ps.setInt(1, id);
       
        ResultSet resultado = ps.executeQuery();

       if (resultado.next())
       {
           Partido p = new Partido();
           
           p.setId(resultado.getInt("ID"));
           p.setNombre(resultado.getString("Nombre"));
           p.setHora(resultado.getTime("Hora").toLocalTime());
           p.setId_jornada(resultado.getInt("ID_Jornada"));
           
           bd.desconectar();
           return p;
       }
       else
           return null;
    }   
    
    public Partido  seleccionarUnPartidoSinResultado(int id) throws Exception
    {
        bd.conectar();
        
        String plantilla = "SELECT * FROM Partido WHERE ID=?;";
        PreparedStatement ps = bd.getCon().prepareStatement(plantilla);
        ps.setInt(1, id);
       
        ResultSet resultado = ps.executeQuery();

       if (resultado.next())
       {
           Partido p = new Partido();
           
           p.setId(resultado.getInt("ID"));
           p.setNombre(resultado.getString("Nombre"));
           p.getLocal().setId(resultado.getInt("ID_Local"));
           p.getVisitante().setId(resultado.getInt("ID_Visitante"));
           p.setHora(resultado.getTime("Hora").toLocalTime());
           p.setId_jornada(resultado.getInt("ID_Jornada"));
           
           bd.desconectar();
           return p;
       }
       else
           return null;
    }     
    
    public Partido  seleccionarIDdePartido(String nombre) throws Exception
    {
        bd.conectar();
        
        String plantilla = "SELECT ID FROM Partido WHERE Nombre=?;";
        PreparedStatement ps = bd.getCon().prepareStatement(plantilla);
        ps.setString(1, nombre);
       
        ResultSet resultado = ps.executeQuery();

       if (resultado.next())
       {
           Partido p = new Partido();
           
           p.setId(resultado.getInt("ID"));
           
           bd.desconectar();
           return p;
       }
       else
           return null;
    }    
    
}
