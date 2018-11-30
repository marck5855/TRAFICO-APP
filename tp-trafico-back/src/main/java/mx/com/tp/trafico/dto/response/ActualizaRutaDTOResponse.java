package mx.com.tp.trafico.dto.response;

import java.io.Serializable;

public class ActualizaRutaDTOResponse implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 5992118217592622287L;
	protected boolean success;
	
	public ActualizaRutaDTOResponse(boolean success) {
		this.success = success;
	}

	public boolean isSuccess() {
		return success;
	}

	public void setSuccess(boolean success) {
		this.success = success;
	}
}
