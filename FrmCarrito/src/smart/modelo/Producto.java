package smart.modelo;

import java.util.List;

public class Producto {
//test
	private Integer idProducto;
	private String nombreProducto;
	private String precioProducto;
	private String colorProducto;
	private String marcaProducto;
	private static List<Producto> todosLosProductos;
	public Integer getIdProducto() {
		return idProducto;
	}
	public void setIdProducto(Integer idProducto) {
		this.idProducto = idProducto;
	}
	public String getNombreProducto() {
		return nombreProducto;
	}
	public void setNombreProducto(String nombreProducto) {
		this.nombreProducto = nombreProducto;
	}
	public String getPrecioProducto() {
		return precioProducto;
	}
	public void setPrecioProducto(String precioProducto) {
		this.precioProducto = precioProducto;
	}
	public String getColorProducto() {
		return colorProducto;
	}
	public void setColorProducto(String colorProducto) {
		this.colorProducto = colorProducto;
	}
	public String getMarcaProducto() {
		return marcaProducto;
	}
	public void setMarcaProducto(String marcaProducto) {
		this.marcaProducto = marcaProducto;
	}
	public static List<Producto> getTodosLosProductos() {
		return todosLosProductos;
	}
	public static void setTodosLosProductos(List<Producto> todosLosProductos) {
		Producto.todosLosProductos = todosLosProductos;
	}
}
