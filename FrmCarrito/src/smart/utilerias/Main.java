package smart.utilerias;

import smart.dao.CarritoComprasDAO;
import smart.dao.ProductoDAO;
import smart.dao.UsuarioDAO;

public class Main {

	public static void main(String arg[]) {
		CarritoComprasDAO idCarrito = new CarritoComprasDAO();
		idCarrito.getCarritoById(1);
		
		UsuarioDAO nombreUsuario = new UsuarioDAO();
		nombreUsuario.getNombreUsuarioById("1");
		
		ProductoDAO idProducto = new ProductoDAO();
		idProducto.getProductoById(1);
		
		
	}
}
