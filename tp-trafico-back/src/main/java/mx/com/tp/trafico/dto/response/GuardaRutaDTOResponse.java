package mx.com.tp.trafico.dto.response;

import java.io.Serializable;

public class GuardaRutaDTOResponse implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 6522868011042791160L;
	private boolean guardo;

	public GuardaRutaDTOResponse(boolean guardo) {
		this.guardo = guardo;
	}
	public boolean isGuardo() {
		return guardo;
	}

	public void setGuardo(boolean guardo) {
		this.guardo = guardo;
	}
}
