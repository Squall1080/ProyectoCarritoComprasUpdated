package smart.service;

import smart.dao.ComprasDAO;
import smart.modelo.CarritoCompras;
import smart.modelo.Usuario;

public class ComprasServiceImpl implements ComprasService {

	ComprasDAO comprasDAO = new ComprasDAO();
	CarritoCompras carritoCompras = new CarritoCompras();

	@Override
	public CarritoCompras realizarCompra(CarritoCompras realizarCompra) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public CarritoCompras cancelarCompra(CarritoCompras cancelarCompra) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String obtenerComprasByFechas(String fechaInicio, String fechaFin) {
		// TODO Auto-generated method stub
		return obtenerComprasByFechas(fechaInicio, fechaFin);
	}

	

}
