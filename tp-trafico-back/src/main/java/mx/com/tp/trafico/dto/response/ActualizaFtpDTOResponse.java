package mx.com.tp.trafico.dto.response;

import java.io.Serializable;

public class ActualizaFtpDTOResponse implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = -7337073528328494386L;
	protected boolean success;
	
	public ActualizaFtpDTOResponse(boolean success) {
		this.success = success;
	}

	public boolean isSuccess() {
		return success;
	}

	public void setSuccess(boolean success) {
		this.success = success;
	}
}
