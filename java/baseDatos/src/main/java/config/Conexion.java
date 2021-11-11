
package config;

import java.sql.*;
import java.util.logging.Level;
import java.util.logging.Logger;


public class Conexion {
    public String driver = "com.mysql.jdbc.Driver";
    public Connection getConection(){
        Connection conexion=null;
        try{
            Class.forName(driver);
            conexion = DriverManager.getConnection("jdbc:mysql://localhost:3306/codoacodo",
                    "luis","123456");
        }catch(SQLException e){
            System.out.println(e.toString());
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(Conexion.class.getName()).log(Level.SEVERE, null, ex);
        }
        return conexion;
    }
    public static void main(String [] args) throws SQLException, ClassNotFoundException{
        Connection conexion =null;
        Conexion con = new Conexion();
        conexion = con.getConection();
        System.out.println("Hola");
    }
}
