/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ModeloDB;

import java.sql.Connection;
import java.sql.DriverManager;

/**
 *
 * @author Imanol Urquijo
 */
public class BaseDatos {
    
    private Connection conexion;

    public BaseDatos() {
    }
    
   public void conectar(){
       try{
            Class.forName("oracle.jdbc.OracleDriver");

            String bd="eqdaw01";
            String url = "jdbc:oracle:thin:@SrvOracle:1521:eqdaw01"+bd;
            String login="eqdaw01";
            String password = "eqdaw01";
            conexion = DriverManager.getConnection(url,login,password);
 
            if (conexion==null){
                throw new Exception("Problemas al iniciar la conexión");
            }
          }
       catch(Exception e)
       {
           System.out.println(e.getMessage());
       }
   }
   
   public void desconectar(){
       try
       {
            conexion.close();
       }
       catch(Exception e)
       {
           System.out.println("Problemas cerrando la conexión");
       }
   }
   
   public Connection getCon()
   {
       return conexion;
   }
}
