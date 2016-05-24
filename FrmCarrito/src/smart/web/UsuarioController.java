package smart.web;

import smart.service.UsuarioService;
import smart.service.UsuarioServiceImpl;

public class UsuarioController {
	UsuarioService usuarioService;
	
	public String getNombreUsuarioByRFC(String rfc){
		usuarioService=new UsuarioServiceImpl();
		return usuarioService.obtenerUsuarioByRFC(rfc);
	}

}
