package smart.capacitacion.dao;


import java.sql.Connection;
import java.sql.DriverManager;
 

public class DAOGeneral {
 
    static String cadenaConexion = "jdbc:postgresql://127.0.0.1/carrito?" + "user=postgres&password=admin";
    Connection conexion = null;

    public Connection getConnection() {
        try {
            Class.forName("org.postgresql.Driver");
            Connection conexion = DriverManager.getConnection(cadenaConexion);
            return conexion;
        }
        catch (Exception error){
        	error.printStackTrace();
        }
        return null;
    }
}