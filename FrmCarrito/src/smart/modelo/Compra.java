package smart.modelo;

public class Compra {
	Usuario usuario;
	Integer idCompra;
	Double subtotalCompra;
	Double totalCompra;
	CarritoCompras carritocompras;
	
	public Compra(){
		
	}

	public Compra(Usuario usuario, Integer idCompra, Double subtotalCompra, Double totalCompra,
			CarritoCompras carritocompras) {
		super();
		this.usuario = usuario;
		this.idCompra = idCompra;
		this.subtotalCompra = subtotalCompra;
		this.totalCompra = totalCompra;
		this.carritocompras = carritocompras;
	}

	public Usuario getUsuario() {
		return usuario;
	}

	public void setUsuario(Usuario usuario) {
		this.usuario = usuario;
	}

	public Integer getIdCompra() {
		return idCompra;
	}

	public void setIdCompra(Integer idCompra) {
		this.idCompra = idCompra;
	}

	public Double getSubtotalCompra() {
		return subtotalCompra;
	}

	public void setSubtotalCompra(Double subtotalCompra) {
		this.subtotalCompra = subtotalCompra;
	}

	public Double getTotalCompra() {
		return totalCompra;
	}

	public void setTotalCompra(Double totalCompra) {
		this.totalCompra = totalCompra;
	}

	public CarritoCompras getCarritocompras() {
		return carritocompras;
	}

	public void setCarritocompras(CarritoCompras carritocompras) {
		this.carritocompras = carritocompras;
	}
	
	
	

}
