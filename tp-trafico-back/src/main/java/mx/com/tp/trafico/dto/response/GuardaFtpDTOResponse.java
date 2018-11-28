package mx.com.tp.trafico.dto.response;


public class GuardaFtpDTOResponse extends SerealizableResponse {

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
