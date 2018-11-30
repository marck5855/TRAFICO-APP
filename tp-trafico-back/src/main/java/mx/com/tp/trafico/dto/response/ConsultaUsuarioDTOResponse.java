package mx.com.tp.trafico.dto.response;

import java.io.Serializable;
import java.util.List;

import mx.com.tp.trafico.entity.TpTraficoUsuario;

public class ConsultaUsuarioDTOResponse implements Serializable{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1782283496781984957L;
	private List<TpTraficoUsuario> usuario;

	public ConsultaUsuarioDTOResponse(List<TpTraficoUsuario> usuario) {
		this.usuario = usuario;
	}

	public List<TpTraficoUsuario> getUsuario() {
		return usuario;
	}

	public void setUsuario(List<TpTraficoUsuario> usuario) {
		this.usuario = usuario;
	}
}
