package smart.dao;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;

public class UsuarioDAO extends DAOGeneral{
	 Connection conexion = null;
	 Statement sentencia = null;
	 ResultSet resultado = null;
	 
	 public UsuarioDAO(){
		 this.conexion=getConnection();
	 }
	 
	 public String getNombreUsuarioById(String idUsuario){
         try{
        	 sentencia = conexion.createStatement();
        	 String consultaSQL = "select * from \"USUARIO\" where \"ID_USUARIO\"='"+idUsuario+"'";
        	 System.out.println(consultaSQL);
        	 resultado = sentencia.executeQuery(consultaSQL);
        	 String nombreUsuario="N/E";
        	 while (resultado.next()) {
        		 nombreUsuario = resultado.getString("NOMBRE_USUARIO");
        		 System.out.println("Resultado: "+nombreUsuario);
        	 }
        	 return nombreUsuario;
         }
         catch(Exception error){
        	 error.printStackTrace();
         }
         return "ERROR";
 
	 }
}
