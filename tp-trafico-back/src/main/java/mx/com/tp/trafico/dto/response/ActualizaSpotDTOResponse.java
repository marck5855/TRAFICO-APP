package mx.com.tp.trafico.dto.response;

import java.io.Serializable;

public class ActualizaSpotDTOResponse implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1281888196301158869L;
	protected boolean success;
	
	public ActualizaSpotDTOResponse(boolean success) {
		this.success = success;
	}

	public boolean isSuccess() {
		return success;
	}

	public void setSuccess(boolean success) {
		this.success = success;
	}
}
