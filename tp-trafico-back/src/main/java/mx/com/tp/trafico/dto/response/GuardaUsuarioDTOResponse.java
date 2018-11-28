package mx.com.tp.trafico.dto.response;


public class GuardaUsuarioDTOResponse extends SerealizableResponse {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
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
