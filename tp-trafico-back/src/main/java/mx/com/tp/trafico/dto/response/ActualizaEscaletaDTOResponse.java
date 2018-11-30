package mx.com.tp.trafico.dto.response;

import java.io.Serializable;

public class ActualizaEscaletaDTOResponse implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 3166159108082937L;
	protected boolean success;
	
	public ActualizaEscaletaDTOResponse(boolean success) {
		this.success = success;
	}

	public boolean isSuccess() {
		return success;
	}

	public void setSuccess(boolean success) {
		this.success = success;
	}
}
