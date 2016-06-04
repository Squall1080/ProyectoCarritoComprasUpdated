package smart.service;

import java.util.ArrayList;
import java.util.List;

import smart.dao.CarritoComprasDAO;
import smart.modelo.CarritoCompras;
import smart.modelo.Producto;

public class ProductoServiceImpl implements ProductoService{

	@Override
	public Producto obtenerProductosByIdCarrito(CarritoCompras idCarrito) {
		
		
		return null;
	}

	@Override
	public Producto verTodosLosProductos() {
		List<Producto> todosLosProductos = new ArrayList<Producto>();
		todosLosProductos = Producto.getTodosLosProductos();
		return (Producto) todosLosProductos;
	}
	
}
