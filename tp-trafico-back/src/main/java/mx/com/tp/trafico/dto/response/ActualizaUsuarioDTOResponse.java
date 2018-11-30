package mx.com.tp.trafico.dto.response;

import java.io.Serializable;

public class ActualizaUsuarioDTOResponse implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 5062373491205442350L;
	protected boolean success;
	
	public ActualizaUsuarioDTOResponse(boolean success) {
		this.success = success;
	}

	public boolean isSuccess() {
		return success;
	}

	public void setSuccess(boolean success) {
		this.success = success;
	}
}
