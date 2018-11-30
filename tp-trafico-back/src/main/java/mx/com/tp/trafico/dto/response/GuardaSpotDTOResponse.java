package mx.com.tp.trafico.dto.response;

import java.io.Serializable;

public class GuardaSpotDTOResponse implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 3637392170279778565L;
	private boolean guardo;

	public GuardaSpotDTOResponse(boolean guardo) {
		this.guardo = guardo;
	}
	public boolean isGuardo() {
		return guardo;
	}

	public void setGuardo(boolean guardo) {
		this.guardo = guardo;
	}
}
