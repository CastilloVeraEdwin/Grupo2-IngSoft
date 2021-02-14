package Conexion;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Conexion {
    public Connection Conexion()  { 
        Connection cn=null;    
        try {
            String url = "jdbc:oracle:thin:@localhost:1521:XE";  //@equipo:puerto:NombreServicio
            Class.forName("oracle.jdbc.driver.OracleDriver"); 
            cn = DriverManager.getConnection(url,"Ventas","ventas");     
        }catch(ClassNotFoundException ex) {
            System.err.println ("Error"+ex);       
        }catch (SQLException ex) {     
            Logger.getLogger(Conexion.class.getName()).log(Level.SEVERE, null, ex);
        }   
        return cn;
    } 
}
