package Entity;

import Conexion.Conexion;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;

public class ValidarEmpleado {
    Conexion cn = new Conexion();
    Connection con;
    PreparedStatement Ps;
    ResultSet Rs;
    
    public Empleado validar(String Usuario, String Dni){
        Empleado em = new Empleado();
        String sql= "select * from empleado where Usuario=? and Dni=?";
        try{
            con=cn.Conexion();
            Ps=con.prepareStatement(sql);
            Ps.setString(1, Usuario);
            Ps.setString(2, Dni);
            Rs=Ps.executeQuery();
            while (Rs.next()){
                em.setIdempleado(Rs.getBigDecimal("IdEmpleado"));
                em.setUsuario(Rs.getString("Usuario"));
                em.setDni(Rs.getString("Dni"));
                em.setNombres(Rs.getString("Nombres"));
            }
        }catch(SQLException e){
            java.util.logging.Logger.getLogger(ValidarEmpleado.class.getName()).log(Level.SEVERE, null, e);   
        }
        return em;
    }
    
}
