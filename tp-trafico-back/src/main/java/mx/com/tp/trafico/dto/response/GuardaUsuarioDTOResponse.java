package mx.com.tp.trafico.dto.response;

import java.io.Serializable;

public class GuardaUsuarioDTOResponse implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = -1634391933580392269L;
	private boolean guardo;

	public GuardaUsuarioDTOResponse(boolean guardo) {
		this.guardo = guardo;
	}
	public boolean isGuardo() {
		return guardo;
	}

	public void setGuardo(boolean guardo) {
		this.guardo = guardo;
	}
}
