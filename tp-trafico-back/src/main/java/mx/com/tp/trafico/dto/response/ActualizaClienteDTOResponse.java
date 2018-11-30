package mx.com.tp.trafico.dto.response;

import java.io.Serializable;

public class ActualizaClienteDTOResponse implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = -2966185182136433932L;
	protected boolean success;
	
	public ActualizaClienteDTOResponse(boolean success) {
		this.success = success;
	}

	public boolean isSuccess() {
		return success;
	}

	public void setSuccess(boolean success) {
		this.success = success;
	}
}
