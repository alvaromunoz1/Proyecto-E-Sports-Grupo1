/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ModeloDB;

import ModeloUML.Calendario;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

/**
 *
 * @author Imanol Urquijo
 */
public class TablaCalendario {
    
    private Connection con;
    private TablaJornada tj;

    public TablaCalendario(Connection con, TablaJornada tj) {
        this.con = con;
        this.tj = tj;
    }
    
     public void insertar(Calendario c) throws Exception
    {
        // Preparar y ejecutar la sentencia sql.
        
        String plantilla = "INSERT INTO Calendario VALUES (?,?);";
        PreparedStatement ps = con.prepareStatement(plantilla);
        ps.setInt(1, c.getId());
        ps.setString(2,c.getNombre());
      
        int n = ps.executeUpdate();
        ps.close();
        if (n != 1)
            throw new Exception("El número de filas actualizadas no es uno");
    }
     
     
     public void actualizar(Calendario c) throws Exception
    {
        // Preparar y ejecutar la sentencia sql.
        
        String plantilla = "UPDATE tpersonas SET Nombre =?  WHERE ID =?";
        PreparedStatement ps = con.prepareStatement(plantilla);
        ps.setInt(2, c.getId());
        ps.setString(1,c.getNombre());
      
        int n = ps.executeUpdate();
        ps.close();
        if (n != 1)
            throw new Exception("El número de filas actualizadas no es uno");
    }
     
     
      public void borrar(Calendario c) throws Exception
    {
        // no es necesario todo el objeto con el dni es suficiente
        
        String plantilla = "DELET FROM Calendario WHERE ID=?;";
        PreparedStatement ps = con.prepareStatement(plantilla);
        ps.setInt(1, c.getId());
      
        int n = ps.executeUpdate();
        ps.close();
        if (n != 1)
            throw new Exception("El número de filas actualizadas no es uno");
    }
        
    public ArrayList<Calendario>  seleccionarTodo() throws Exception
    {
        ArrayList<Calendario> lista = new ArrayList();
      
        String plantilla = "SELECT * FROM Calendario;";
        PreparedStatement ps = con.prepareStatement(plantilla);
       
        ResultSet resultado = ps.executeQuery();

       while(resultado.next())
       {
                // Crear objeto
                Calendario c = new Calendario();
                
                c.setId(resultado.getInt("ID"));
                c.setNombre(resultado.getString("Nombre"));
                
                lista.add(c);
       }
       return lista;
    }
    
    
    public Calendario  seleccionarUnCalendario(int id) throws Exception
    {
        
        String plantilla = "SELECT * FROM Calendario WHERE ID=?;";
        PreparedStatement ps = con.prepareStatement(plantilla);
        ps.setInt(1, id);
       
        ResultSet resultado = ps.executeQuery();

       if (resultado.next())
       {
           Calendario c = new Calendario();
           
           c.setId(resultado.getInt("ID"));
           c.setNombre(resultado.getString("Nombre"));
           
           return c;
       }
       else
           return null;
    }
    
        
    public Calendario seleccionarCalendarioConJornada(int id) throws Exception
    {
        
        String plantilla = "SELECT * FROM Calendario WHERE ID=?;";
        PreparedStatement ps = con.prepareStatement(plantilla);
        ps.setInt(1, id);
       
        ResultSet resultado = ps.executeQuery();
        
        if (resultado.next())
       {
          Calendario c = new Calendario();
           c.setId(resultado.getInt("ID"));
           c.setNombre(resultado.getString("Nombre"));
           c.setJornadas(tj.seleccionarJornadasPorCalendario(id));
           return c;
       }
           return null;
    }    
}
