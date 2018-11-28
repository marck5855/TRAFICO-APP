package mx.com.tp.trafico.dto.response;


public class GuardaEscaletaDTOResponse extends SerealizableResponse {

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
