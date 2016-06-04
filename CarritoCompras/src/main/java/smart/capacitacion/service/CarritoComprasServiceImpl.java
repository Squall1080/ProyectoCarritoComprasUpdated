package smart.capacitacion.service;

import java.util.List;

import smart.capacitacion.dao.CarritoComprasDAO;
import smart.capacitacion.dao.ProductoDAO;
import smart.capacitacion.dao.UsuarioDAO;
import smart.capacitacion.modelo.CarritoCompras;
import smart.capacitacion.modelo.Producto;

public class CarritoComprasServiceImpl implements CarritoComprasService {
	
	CarritoComprasDAO carritoComprasDAO = new CarritoComprasDAO();
	ProductoDAO productoDAO = new ProductoDAO();
	UsuarioDAO usuarioDAO = new UsuarioDAO();
	
	@Override
	public boolean crearCarrito(CarritoCompras carritoCompras) {
		
		return carritoComprasDAO.crearCarrito(carritoCompras);
	}

	@Override
	public boolean eliminarProductoDelCarrito(CarritoCompras carritoCompras) {
		// TODO Auto-generated method stub
		return this.carritoComprasDAO.eliminarProductoDelCarrito(carritoCompras);
	}

	@Override
	public Producto agregarProductoAlCarrito(CarritoCompras carritoCompras) {
			return this.carritoComprasDAO.agregarProductoAlCarrito(carritoCompras);
		}
	}
