package smart.service;

import java.util.ArrayList;
import java.util.List;
import smart.dao.CarritoComprasDAO;
import smart.dao.UsuarioDAO;
import smart.modelo.CarritoCompras;
import smart.modelo.Producto;
import smart.modelo.Usuario;

public class CarritoComprasServiceImpl implements CarritoComprasService {
	
	CarritoComprasDAO carritoComprasDAO = new CarritoComprasDAO();
	UsuarioDAO usuario = new UsuarioDAO();

	@Override
	public Usuario crearCarrito(Usuario usuario) {
		
		while(usuario != null){
			CarritoCompras nuevoCarrito = new CarritoCompras();
		}
		return null;
		
	}

	@Override
	public Usuario obtenerCarritoActual(Usuario usuario) {
		
		List<Producto> carritoActual = new ArrayList<Producto>();
		carritoActual = CarritoCompras.getProductosEnCarrito();
		return (Usuario) carritoActual;
	}

	@Override
	public Producto eliminarProductoDelCarrito(Producto producto) {
		
		List<Producto> productosAEliminar = new ArrayList<Producto>();
		productosAEliminar = CarritoCompras.getProductosEnCarrito();
		productosAEliminar.remove(producto);
		return (Producto) productosAEliminar;
		
	}

	@Override
	public Producto agregarProductoAlCarrito(Producto producto) {
		
		List<Producto> productosAAgregar = new ArrayList<Producto>();
		productosAAgregar = CarritoCompras.getProductosEnCarrito();
		productosAAgregar.add(producto);
		return (Producto) productosAAgregar;
		
	}
}
