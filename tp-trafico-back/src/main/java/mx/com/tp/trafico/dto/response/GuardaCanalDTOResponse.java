package mx.com.tp.trafico.dto.response;

import java.io.Serializable;

public class GuardaCanalDTOResponse implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = -1781302474217143408L;
	private boolean guardo;

	public GuardaCanalDTOResponse(boolean guardo) {
		this.guardo = guardo;
	}
	public boolean isGuardo() {
		return guardo;
	}

	public void setGuardo(boolean guardo) {
		this.guardo = guardo;
	}
}
