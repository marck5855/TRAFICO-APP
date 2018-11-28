package mx.com.tp.trafico.dto.response;


public class GuardaCanalDTOResponse extends SerealizableResponse {

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
