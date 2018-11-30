package mx.com.tp.trafico.dto.response;

import java.io.Serializable;
import java.util.List;

import mx.com.tp.trafico.entity.TpTraficoPauta;

public class ConsultaPautaDTOResponse implements Serializable{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = -279358245447560155L;
	private List<TpTraficoPauta> pautas;

	public ConsultaPautaDTOResponse(List<TpTraficoPauta> pautas) {
		this.pautas = pautas;
	}

	public List<TpTraficoPauta> getPautas() {
		return pautas;
	}

	public void setPautas(List<TpTraficoPauta> pautas) {
		this.pautas = pautas;
	}

}
