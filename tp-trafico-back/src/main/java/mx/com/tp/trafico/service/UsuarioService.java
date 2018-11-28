package mx.com.tp.trafico.service;

import java.util.List;

import mx.com.tp.trafico.entity.TpTraficoUsuario;

public interface UsuarioService {

	public List<TpTraficoUsuario> finAll();
	
	public TpTraficoUsuario saveUsuario (TpTraficoUsuario usuario); 

	public void deleteUsuario (Long id);
	
	public TpTraficoUsuario findByIidUsuario (Long id);
}

