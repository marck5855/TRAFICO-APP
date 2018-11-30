package mx.com.tp.trafico.dto.response;

import java.io.Serializable;

public class ActualizaCanalDTOResponse implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 2659562354696891630L;
	protected boolean success;
	
	public ActualizaCanalDTOResponse(boolean success) {
		this.success = success;
	}

	public boolean isSuccess() {
		return success;
	}

	public void setSuccess(boolean success) {
		this.success = success;
	}
}
