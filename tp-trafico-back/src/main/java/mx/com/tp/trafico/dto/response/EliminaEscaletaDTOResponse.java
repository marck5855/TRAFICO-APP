package mx.com.tp.trafico.dto.response;

import java.io.Serializable;

public class EliminaEscaletaDTOResponse implements Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = -4282548177383814971L;

	private boolean eliminado;
	
	public EliminaEscaletaDTOResponse(boolean eliminado) {
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
