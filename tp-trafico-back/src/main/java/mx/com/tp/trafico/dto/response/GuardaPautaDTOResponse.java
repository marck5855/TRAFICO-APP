package mx.com.tp.trafico.dto.response;

import java.io.Serializable;

public class GuardaPautaDTOResponse implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = -2637074654012018093L;
	private boolean guardo;

	public GuardaPautaDTOResponse(boolean guardo) {
		this.guardo = guardo;
	}
	public boolean isGuardo() {
		return guardo;
	}

	public void setGuardo(boolean guardo) {
		this.guardo = guardo;
	}
}