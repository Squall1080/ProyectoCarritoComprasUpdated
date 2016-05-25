package smart.dao;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import smart.modelo.Compra;
public class ComprasDAO extends DAOGeneral {
	
	Connection conexion = null;
	 Statement sentencia = null;
	 ResultSet resultado = null;
	 
	 public ComprasDAO(){
		 this.conexion=getConnection();
	 }
	 
	 public List<Compra> obtenerComprasByFechas(String fechaInicio, String fechaFin){
        try{
       	 sentencia = conexion.createStatement();
       	 String consultaSQL = "SELECT \"ID_COMPRAS\" FROM \"COMPRAS\" WHERE \"FECHA_COMPRA\" BETWEEN "+""+fechaInicio+""+"AND"+""+fechaFin+"";
       	// System.out.println(consultaSQL);
       	 resultado = sentencia.executeQuery(consultaSQL);
       	  
       	  List<Compra> compras = new ArrayList<>();
       	  Compra compra;
       	 while (compras != null) {
       		compra = new Compra();
       		compra.setId_Compra(resultado.getInt("ID_COMPRAS"));
       		compras.add(compra);
       		 //id_compras = resultado.getString("ID_COMPRAS");
       		 //System.out.println("Resultado:"+id_compras);
       	 }
       	 return compras;
        }
        catch(Exception error){
       	 error.printStackTrace();
        }
        return null; 

	 }
	
}
