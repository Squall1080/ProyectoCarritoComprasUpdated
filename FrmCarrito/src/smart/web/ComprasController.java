package smart.web;

import smart.service.ComprasService;
import smart.service.ComprasServiceImpl;

public class ComprasController {

		ComprasService comprasService;
		
		public String getobtenerComprasByFechas(String fechaInicio, String fechaFin){
			comprasService= new ComprasServiceImpl();
			return comprasService.obtenerComprasByFechas(fechaInicio, fechaFin);
			
			
		}
	
		
	}

	
	

