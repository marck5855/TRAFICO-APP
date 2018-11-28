package mx.com.tp.trafico.dto.response;


public class GuardaRutaDTOResponse extends SerealizableResponse {

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
