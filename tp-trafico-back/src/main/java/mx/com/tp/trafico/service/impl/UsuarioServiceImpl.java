package mx.com.tp.trafico.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import mx.com.tp.trafico.dao.UsuarioDAO;
import mx.com.tp.trafico.entity.TpTraficoUsuario;
import mx.com.tp.trafico.service.UsuarioService;

@Service
public class UsuarioServiceImpl implements UsuarioService{

	@Autowired
	public UsuarioDAO usuarioDAO;
	
	@Override
	public List<TpTraficoUsuario> finAll() {
		// TODO Auto-generated method stub
		return (List<TpTraficoUsuario>) usuarioDAO.findAll();
	}

	@Override
	public TpTraficoUsuario saveUsuario(TpTraficoUsuario usuario) {
		// TODO Auto-generated method stub
		return usuarioDAO.save(usuario);
	}

	@Override
	public void deleteUsuario(Long id) {
		// TODO Auto-generated method stub
		usuarioDAO.deleteById(id);
	}

	@Override
	public TpTraficoUsuario findByIidUsuario(Long id) {
		// TODO Auto-generated method stub
		return usuarioDAO.findById(id).orElse(null);
	}
}
