package mx.com.tp.trafico.dto.response;

import java.io.Serializable;

public class GuardaClienteDTOResponse implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = -663431114438677857L;
	private boolean guardo;

	public GuardaClienteDTOResponse(boolean guardo) {
		this.guardo = guardo;
	}
	public boolean isGuardo() {
		return guardo;
	}

	public void setGuardo(boolean guardo) {
		this.guardo = guardo;
	}
}
