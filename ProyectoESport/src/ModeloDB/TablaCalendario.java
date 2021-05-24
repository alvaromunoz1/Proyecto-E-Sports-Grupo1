/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ModeloDB;

import ModeloUML.Calendario;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

/**
 *
 * @author Imanol Urquijo
 */
public class TablaCalendario {
    
    private BaseDatos bd;
    private TablaJornada tj;

    public TablaCalendario() {
        bd = new BaseDatos();
    }
    
    
     public void insertar(Calendario c) throws Exception
    {
        bd.conectar();
        
        String plantilla = "INSERT INTO Calendario VALUES (?,?);";
        PreparedStatement ps = bd.getCon().prepareStatement(plantilla);
        ps.setInt(1, c.getId());
        ps.setString(2,c.getNombre());
      
        int n = ps.executeUpdate();
        ps.close();
        if (n != 1)
            throw new Exception("El número de filas actualizadas no es uno");
        
        bd.desconectar();
    }
     
     public void activarProcedimientoCalendario(int id, String nombre) throws Exception
    {
        bd.conectar();
        
        String plantilla = "EXECUTE CrearCalendario(?,?);";
        PreparedStatement ps = bd.getCon().prepareStatement(plantilla);
        ps.setInt(1, id);
        ps.setString(2, nombre);;
        
        ps.execute();
        
        ps.close();
        
        bd.desconectar();
    }    
     
     public void actualizar(Calendario c) throws Exception
    {
        bd.conectar();
        
        String plantilla = "UPDATE tpersonas SET Nombre =?  WHERE ID =?";
        PreparedStatement ps = bd.getCon().prepareStatement(plantilla);
        ps.setInt(2, c.getId());
        ps.setString(1,c.getNombre());
      
        int n = ps.executeUpdate();
        ps.close();
        if (n != 1)
            throw new Exception("El número de filas actualizadas no es uno");
        
        bd.desconectar();
    }
     
     
      public void borrar(Calendario c) throws Exception
    {
        bd.conectar();
        
        String plantilla = "DELET FROM Calendario WHERE ID=?;";
        PreparedStatement ps = bd.getCon().prepareStatement(plantilla);
        ps.setInt(1, c.getId());
      
        int n = ps.executeUpdate();
        ps.close();
        if (n != 1)
            throw new Exception("El número de filas actualizadas no es uno");
        
        bd.desconectar();
    }
        
    public ArrayList<Calendario>  seleccionarTodo() throws Exception
    {
        bd.conectar();
        
        ArrayList<Calendario> lista = new ArrayList();
      
        String plantilla = "SELECT * FROM Calendario;";
        PreparedStatement ps = bd.getCon().prepareStatement(plantilla);
       
        ResultSet resultado = ps.executeQuery();

       while(resultado.next())
       {
                Calendario c = new Calendario();
                
                c.setId(resultado.getInt("ID"));
                c.setNombre(resultado.getString("Nombre"));
                
                lista.add(c);
       }
       bd.desconectar();
       return lista;
    }
    
    
    public Calendario  seleccionarUnCalendario(int id) throws Exception
    {
        bd.conectar();
        
        String plantilla = "SELECT * FROM Calendario WHERE ID=?;";
        PreparedStatement ps = bd.getCon().prepareStatement(plantilla);
        ps.setInt(1, id);
       
        ResultSet resultado = ps.executeQuery();

       if (resultado.next())
       {
           Calendario c = new Calendario();
           
           c.setId(resultado.getInt("ID"));
           c.setNombre(resultado.getString("Nombre"));
           
           bd.desconectar();
           return c;
       }
       else
           return null;
    }
    
        
    public Calendario seleccionarCalendarioConJornada(int id) throws Exception
    {
        bd.conectar();
        
        String plantilla = "SELECT * FROM Calendario WHERE ID=?;";
        PreparedStatement ps = bd.getCon().prepareStatement(plantilla);
        ps.setInt(1, id);
       
        ResultSet resultado = ps.executeQuery();
        
        if (resultado.next())
       {
          Calendario c = new Calendario();
           c.setId(resultado.getInt("ID"));
           c.setNombre(resultado.getString("Nombre"));
           c.setJornadas(tj.seleccionarJornadasPorCalendario(id));
           
           bd.desconectar();
           return c;
       }
           return null;
    }    
}
