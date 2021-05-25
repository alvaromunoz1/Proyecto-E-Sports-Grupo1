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
            Class.forName("oracle.jdbc.driver.OracleDriver");

            String bd="[eqdaw01 on EQDAW01]";
            String login="eqdaw01";
            String password = "eqdaw01";
            String url = "jdbc:oracle:thin:@172.20.225.114:1521:orcl";
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
