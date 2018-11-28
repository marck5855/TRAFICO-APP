package mx.com.tp.trafico.dto.response;

import java.util.List;

import mx.com.tp.trafico.entity.CatPrefijo;
import mx.com.tp.trafico.entity.TpTraficoUsuario;

public class ConsultaUsuarioDTOResponse{
	
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
