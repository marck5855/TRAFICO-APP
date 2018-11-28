package mx.com.tp.trafico.dto.response;

import java.io.Serializable;

public class EliminarRutaDTOResponse implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = -4282548177383814971L;

	private boolean eliminado;
	
	public EliminarRutaDTOResponse(boolean eliminado) {
		// TODO Auto-generated constructor stub
		this.eliminado = eliminado;
	}

	public boolean isEliminado() {
		return eliminado;
	}
	
	public void setEliminado(boolean eliminado) {
		this.eliminado = eliminado;
	}
}
