package smart.dao;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;

public class CarritoComprasDAO extends DAOGeneral{
	 Connection conexion = null;
	 Statement sentencia = null;
	 ResultSet resultado = null;
	 
	 public CarritoComprasDAO(){
		 this.conexion=getConnection();
	 }
	 
	 public Integer getCarritoById(Integer idCarrito){
         try{
        	 sentencia = conexion.createStatement();
        	 String consultaSQL = "select * from \"CARRITO_COMPRAS\" where \"idCarrito\"='"+idCarrito+"'";
        	 System.out.println(consultaSQL);
        	 resultado = sentencia.executeQuery(consultaSQL);
        	 //String carrito="N/E";
        	 while (resultado.next()) {
        		 idCarrito = resultado.getInt("ID_CARRITO");
        		 System.out.println("Resultado:"+idCarrito);
        	 }
        	 return idCarrito;
         }
         catch(Exception error){
        	 error.printStackTrace();
         }
         return idCarrito;
 
	 }
}
