package mx.com.tp.trafico.dto.response;


public class GuardaClienteDTOResponse extends SerealizableResponse {

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
