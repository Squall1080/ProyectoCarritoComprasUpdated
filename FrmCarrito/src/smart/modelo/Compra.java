package smart.modelo;

public class Compra {
	private Usuario usuario;
	private Integer id_Compra;
	private Double subtotal;
	private Double total;
	private Integer id_Usuario;
	private Integer id_Carrito;
	private String fecha_Compra;
	private CarritoCompras carritocompras;

	public Compra() {

	}

	public Compra(Usuario usuario, Integer id_Compra, Double subtotalCompra, Double totalCompra, Integer id_Usuario,
			Integer id_Carrito, String fecha_Compra, CarritoCompras carritocompras) {
		super();
		this.usuario = usuario;
		this.id_Compra = id_Compra;
		this.subtotal = subtotalCompra;
		this.total = totalCompra;
		this.id_Usuario = id_Usuario;
		this.id_Carrito = id_Carrito;
		this.fecha_Compra = fecha_Compra;
		this.carritocompras = carritocompras;
	}

	public Usuario getUsuario() {
		return usuario;
	}

	public void setUsuario(Usuario usuario) {
		this.usuario = usuario;
	}

	public Integer getId_Compra() {
		return id_Compra;
	}

	public void setId_Compra(Integer id_Compra) {
		this.id_Compra = id_Compra;
	}

	public Double getSubtotalCompra() {
		return subtotal;
	}

	public void setSubtotalCompra(Double subtotalCompra) {
		this.subtotal = subtotalCompra;
	}

	public Double getTotalCompra() {
		return total;
	}

	public void setTotalCompra(Double totalCompra) {
		this.total = totalCompra;
	}

	public Integer getId_Usuario() {
		return id_Usuario;
	}

	public void setId_Usuario(Integer id_Usuario) {
		this.id_Usuario = id_Usuario;
	}

	public Integer getId_Carrito() {
		return id_Carrito;
	}

	public void setId_Carrito(Integer id_Carrito) {
		this.id_Carrito = id_Carrito;
	}

	public String getFecha_Compra() {
		return fecha_Compra;
	}

	public void setFecha_Compra(String fecha_Compra) {
		this.fecha_Compra = fecha_Compra;
	}

	public CarritoCompras getCarritocompras() {
		return carritocompras;
	}

	public void setCarritocompras(CarritoCompras carritocompras) {
		this.carritocompras = carritocompras;
	}

	
}
