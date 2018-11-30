package mx.com.tp.trafico.dto.response;

import java.io.Serializable;

public class GuardaEscaletaDTOResponse implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = -6980344680410773149L;
	private boolean guardo;

	public GuardaEscaletaDTOResponse(boolean guardo) {
		this.guardo = guardo;
	}
	public boolean isGuardo() {
		return guardo;
	}

	public void setGuardo(boolean guardo) {
		this.guardo = guardo;
	}
}
