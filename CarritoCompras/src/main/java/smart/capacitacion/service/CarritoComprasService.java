package smart.capacitacion.service;

import java.util.List;

import smart.capacitacion.modelo.CarritoCompras;
import smart.capacitacion.modelo.Producto;


public interface CarritoComprasService {
	
	public boolean crearCarrito(CarritoCompras carritoCompras);
		
	public boolean eliminarProductoDelCarrito(CarritoCompras carritoCompras);

	public Producto agregarProductoAlCarrito(CarritoCompras carritoCompras);
}