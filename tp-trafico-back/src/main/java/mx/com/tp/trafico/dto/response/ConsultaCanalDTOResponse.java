package mx.com.tp.trafico.dto.response;

import java.util.List;

import mx.com.tp.trafico.entity.TpTraficoCanal;

public class ConsultaCanalDTOResponse{
	
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
