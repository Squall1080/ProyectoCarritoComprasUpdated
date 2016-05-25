package smart.service;

import smart.modelo.CarritoCompras;
import smart.modelo.Producto;

public interface ProductoService {
	
	public Producto obtenerProductosByIdCarrito(CarritoCompras idCarrito);
	
	public Producto verTodosLosProductos();

}
