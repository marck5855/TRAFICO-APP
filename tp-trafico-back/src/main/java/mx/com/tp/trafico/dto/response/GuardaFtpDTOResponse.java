package mx.com.tp.trafico.dto.response;

import java.io.Serializable;

public class GuardaFtpDTOResponse implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 7070803382386957569L;
	private boolean guardo;

	public GuardaFtpDTOResponse(boolean guardo) {
		this.guardo = guardo;
	}
	public boolean isGuardo() {
		return guardo;
	}

	public void setGuardo(boolean guardo) {
		this.guardo = guardo;
	}
}
