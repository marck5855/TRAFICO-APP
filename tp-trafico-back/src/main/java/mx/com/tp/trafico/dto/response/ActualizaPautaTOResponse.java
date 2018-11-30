package mx.com.tp.trafico.dto.response;

import java.io.Serializable;

public class ActualizaPautaTOResponse implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 6419712289023377076L;
	protected boolean success;
	
	public ActualizaPautaTOResponse(boolean success) {
		this.success = success;
	}

	public boolean isSuccess() {
		return success;
	}

	public void setSuccess(boolean success) {
		this.success = success;
	}
}
