package smart.service;

import smart.modelo.CarritoCompras;


public interface ComprasService {

	public CarritoCompras realizarCompra(CarritoCompras realizarCompra);
	public CarritoCompras cancelarCompra(CarritoCompras cancelarCompra);
	public String obtenerComprasByFechas(String fechaInicio, String fechaFin);
	
	
}
