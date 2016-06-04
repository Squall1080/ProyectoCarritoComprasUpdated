package smart.service;

import smart.modelo.Producto;
import smart.modelo.Usuario;

public interface CarritoComprasService {
	
	public Usuario crearCarrito(Usuario usuario);
	
	public Usuario obtenerCarritoActual(Usuario usuario);
	
	public Producto eliminarProductoDelCarrito(Producto producto);
	
	public Producto agregarProductoAlCarrito(Producto producto);
}