package smart.modelo;
import java.util.List;

public class CarritoCompras {
	
	private Integer idCarrito;
	private Double subTotal;
	private Double total;
	private static List<Producto> productos;
	private static List<Producto> productosEnCarrito;
	public Integer getIdCarrito() {
		return idCarrito;
	}
	public void setIdCarrito(Integer idCarrito) {
		this.idCarrito = idCarrito;
	}
	public Double getSubTotal() {
		return subTotal;
	}
	public void setSubTotal(Double subTotal) {
		this.subTotal = subTotal;
	}
	public Double getTotal() {
		return total;
	}
	public void setTotal(Double total) {
		this.total = total;
	}
	public static List<Producto> getProductos() {
		return productos;
	}
	public static void setProductos(List<Producto> productos) {
		CarritoCompras.productos = productos;
	}
	public static List<Producto> getProductosEnCarrito() {
		return productosEnCarrito;
	}
	public static void setProductosEnCarrito(List<Producto> productosEnCarrito) {
		CarritoCompras.productosEnCarrito = productosEnCarrito;
	}
}
