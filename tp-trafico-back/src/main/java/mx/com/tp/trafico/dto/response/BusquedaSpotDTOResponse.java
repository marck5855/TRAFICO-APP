package mx.com.tp.trafico.dto.response;

import com.fasterxml.jackson.annotation.JsonInclude;

import mx.com.tp.trafico.entity.TpTraficoCanal;
import mx.com.tp.trafico.entity.TpTraficoSpot;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class BusquedaSpotDTOResponse {
	
	TpTraficoSpot spot;
	protected boolean busqueda;
	
	public BusquedaSpotDTOResponse(boolean busqueda, TpTraficoSpot spot) {
		this.busqueda = busqueda;
		this.spot = spot;
	}

	public TpTraficoSpot getSpot() {
		return spot;
	}

	public void setSpot(TpTraficoSpot spot) {
		this.spot = spot;
	}

	public boolean isBusqueda() {
		return busqueda;
	}

	public void setBusqueda(boolean busqueda) {
		this.busqueda = busqueda;
	}
	
	
}
