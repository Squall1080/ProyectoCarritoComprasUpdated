package smart.service;

import smart.dao.UsuarioDAO;

public class UsuarioServiceImpl implements UsuarioService {
	UsuarioDAO usuarioDAO = new UsuarioDAO();
	@Override
	public String obtenerUsuarioByRFC(String rfcUsuario) {
		// TODO Auto-generated method stub
		return this.usuarioDAO.getNombreUsuarioByRFC(rfcUsuario);
	}

}
