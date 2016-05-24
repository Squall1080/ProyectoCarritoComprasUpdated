package smart.modelo;

public class Producto {

	private String claveProducto;
	private Integer idProducto;
	private String colorProducto;
	private String precioProducto;
	private String tamañoProducto;
	private String nombreProducto;
	private String marcaProducto;

	public Producto() {
		
		
	}

	public Producto(String claveProducto, Integer idProducto, String colorProducto, String precioProducto,
			String tamañoProducto, String nombreProducto, String marcaProducto) {
		super();
		this.claveProducto = claveProducto;
		this.idProducto = idProducto;
		this.colorProducto = colorProducto;
		this.precioProducto = precioProducto;
		this.tamañoProducto = tamañoProducto;
		this.nombreProducto = nombreProducto;
		this.marcaProducto = marcaProducto;
	}

	public String getClaveProducto() {
		return claveProducto;
	}

	public void setClaveProducto(String claveProducto) {
		this.claveProducto = claveProducto;
	}

	public Integer getIdProducto() {
		return idProducto;
	}

	public void setIdProducto(Integer idProducto) {
		this.idProducto = idProducto;
	}

	public String getColorProducto() {
		return colorProducto;
	}

	public void setColorProducto(String colorProducto) {
		this.colorProducto = colorProducto;
	}

	public String getPrecioProducto() {
		return precioProducto;
	}

	public void setPrecioProducto(String precioProducto) {
		this.precioProducto = precioProducto;
	}

	public String getTamañoProducto() {
		return tamañoProducto;
	}

	public void setTamañoProducto(String tamañoProducto) {
		this.tamañoProducto = tamañoProducto;
	}

	public String getNombreProducto() {
		return nombreProducto;
	}

	public void setNombreProducto(String nombreProducto) {
		this.nombreProducto = nombreProducto;
	}

	public String getMarcaProducto() {
		return marcaProducto;
	}

	public void setMarcaProducto(String marcaProducto) {
		this.marcaProducto = marcaProducto;
	}

}
