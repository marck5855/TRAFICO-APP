package mx.com.tp.trafico.dto.response;

import java.io.Serializable;
import java.util.List;

import mx.com.tp.trafico.entity.TpTraficoEscaleta;

public class ConsultaEscaletaDTOResponse implements Serializable{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = -3738896884706805768L;
	private List<TpTraficoEscaleta> Escaletas;

	public ConsultaEscaletaDTOResponse(List<TpTraficoEscaleta> Escaletas) {
		this.Escaletas = Escaletas;
	}

	public List<TpTraficoEscaleta> getEscaletas() {
		return Escaletas;
	}

	public void setEscaletas(List<TpTraficoEscaleta> escaletas) {
		Escaletas = escaletas;
	}
}
