package mx.com.tp.trafico.dto.response;

import java.util.List;

import mx.com.tp.trafico.entity.TpTraficoCanal;
import mx.com.tp.trafico.entity.TpTraficoEscaleta;
import mx.com.tp.trafico.entity.TpTraficoSpot;

public class ConsultaEscaletaDTOResponse{
	
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
