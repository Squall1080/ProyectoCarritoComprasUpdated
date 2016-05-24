package smart.modelo;

public class Usuario {

	private String nombreUsuario;
	private String apPaternoUsuario;
	private String apMaternoUsuario;
	private String rfcUsuario;
	private String calleUsuario;
	
	public Usuario(String nombreUsuario, String apPaternoUsuario, String apMaternoUsuario, String rfcUsuario,
			String calleUsuario) {
		super();
		this.nombreUsuario = nombreUsuario;
		this.apPaternoUsuario = apPaternoUsuario;
		this.apMaternoUsuario = apMaternoUsuario;
		this.rfcUsuario = rfcUsuario;
		this.calleUsuario = calleUsuario;
	}
	
	public Usuario(){
		
	}

	public String getNombreUsuario() {
		return nombreUsuario;
	}

	public void setNombreUsuario(String nombreUsuario) {
		this.nombreUsuario = nombreUsuario;
	}

	public String getApPaternoUsuario() {
		return apPaternoUsuario;
	}

	public void setApPaternoUsuario(String apPaternoUsuario) {
		this.apPaternoUsuario = apPaternoUsuario;
	}

	public String getApMaternoUsuario() {
		return apMaternoUsuario;
	}

	public void setApMaternoUsuario(String apMaternoUsuario) {
		this.apMaternoUsuario = apMaternoUsuario;
	}

	public String getRfcUsuario() {
		return rfcUsuario;
	}

	public void setRfcUsuario(String rfcUsuario) {
		this.rfcUsuario = rfcUsuario;
	}

	public String getCalleUsuario() {
		return calleUsuario;
	}

	public void setCalleUsuario(String calleUsuario) {
		this.calleUsuario = calleUsuario;
	}
	
	
	
}
