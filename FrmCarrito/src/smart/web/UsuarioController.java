package smart.web;

import smart.service.UsuarioService;
import smart.service.UsuarioServiceImpl;

public class UsuarioController {
	UsuarioService usuarioService;
	
	public String getcrearCuenta(String crearCuentaUsuario){
		usuarioService=new UsuarioServiceImpl();
		return usuarioService.crearCuenta(crearCuentaUsuario);
	}
	public String getborrarCuenta(String borrarCuentaUsuario){
		
		return usuarioService.borrarCuenta(borrarCuentaUsuario);
	}

public String getlogin(String loginUsuario){
		
		return usuarioService.login(loginUsuario);
	}
}
