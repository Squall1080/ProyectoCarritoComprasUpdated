
public class Usuario {

	String nombreUsuario;
	String apPaternoUsuario;
	String apMaternoUsuario;
	String rfcUsuario;
	String calleUsuario;
	//Creamos un constructor de tipoCadena
	public Usuario(String nombreUsuario) {		
		this.nombreUsuario = nombreUsuario;		
		
}
	
	//Constructor de tipo Usuario
	public Usuario(Usuario usuario ) {
		this.nombreUsuario = usuario.nombreUsuario;
		this.apPaternoUsuario = usuario.apPaternoUsuario;
		this.apMaternoUsuario = usuario.apMaternoUsuario;
		this.rfcUsuario = usuario.rfcUsuario;
		this.calleUsuario = usuario.calleUsuario;
	}

	public Usuario(){
		
	}
}
