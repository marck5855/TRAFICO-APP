package mx.com.tp.trafico.dto.request;

import java.io.Serializable;

import mx.com.tp.trafico.entity.TpTraficoUsuario;

public class GuardaUsuarioDTORequest implements Serializable{

	private static final long serialVersionUID = -8354259175603930632L;
	
	private TpTraficoUsuario usuario;

	public TpTraficoUsuario getUsuario() {
		return usuario;
	}

	public void setUsuario(TpTraficoUsuario usuario) {
		this.usuario = usuario;
	}

}
