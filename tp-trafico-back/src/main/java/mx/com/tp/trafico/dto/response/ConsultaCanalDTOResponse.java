package mx.com.tp.trafico.dto.response;

import java.io.Serializable;
import java.util.List;

import mx.com.tp.trafico.entity.TpTraficoCanal;

public class ConsultaCanalDTOResponse implements Serializable{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 8789210432879195045L;
	private List<TpTraficoCanal> canales;

	public ConsultaCanalDTOResponse(List<TpTraficoCanal> canales) {
		this.canales = canales;
	}
	public List<TpTraficoCanal> getCanal() {
		return canales;
	}

	public void setCanales(List<TpTraficoCanal> canales) {
		this.canales = canales;
	}
}
