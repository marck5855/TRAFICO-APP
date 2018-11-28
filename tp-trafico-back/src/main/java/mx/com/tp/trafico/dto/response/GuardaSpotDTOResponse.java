package mx.com.tp.trafico.dto.response;


public class GuardaSpotDTOResponse extends SerealizableResponse {

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
