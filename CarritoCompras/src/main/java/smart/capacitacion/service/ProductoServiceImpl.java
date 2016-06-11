package smart.capacitacion.service;

import java.util.List;

import smart.capacitacion.dao.ProductoDAO;
import smart.capacitacion.modelo.CarritoCompras;
import smart.capacitacion.modelo.Producto;

public class ProductoServiceImpl implements ProductoService {
	ProductoDAO productoDAO = new ProductoDAO(); 
	
	@Override
	public List<Producto> obtenerProductosByCarrito(CarritoCompras idCarrito) {
		return this.obtenerProductosByCarrito(idCarrito);
	}

	@Override
	public List<Producto> obtenerTodosLosProductos() {
		return this.productoDAO.obtenerTodosLosProductos();
	}

}