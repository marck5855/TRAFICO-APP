package mx.com.tp.trafico.dto.response;

import com.fasterxml.jackson.annotation.JsonInclude;

import mx.com.tp.trafico.entity.TpTraficoCanal;
import mx.com.tp.trafico.entity.TpTraficoEscaleta;
import mx.com.tp.trafico.entity.TpTraficoSpot;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class BusquedaEscaletaDTOResponse {
	
	TpTraficoEscaleta Escaleta;
	protected boolean busqueda;
	
	public BusquedaEscaletaDTOResponse(boolean busqueda, TpTraficoEscaleta Escaleta) {
		this.busqueda = busqueda;
		this.Escaleta = Escaleta;
	}

	public TpTraficoEscaleta getEscaleta() {
		return Escaleta;
	}

	public void setEscaleta(TpTraficoEscaleta escaleta) {
		Escaleta = escaleta;
	}

	public boolean isBusqueda() {
		return busqueda;
	}

	public void setBusqueda(boolean busqueda) {
		this.busqueda = busqueda;
	}
}
