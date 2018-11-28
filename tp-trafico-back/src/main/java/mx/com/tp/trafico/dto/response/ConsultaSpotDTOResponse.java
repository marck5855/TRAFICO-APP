package mx.com.tp.trafico.dto.response;

import java.util.List;

import mx.com.tp.trafico.entity.TpTraficoCanal;
import mx.com.tp.trafico.entity.TpTraficoSpot;

public class ConsultaSpotDTOResponse{
	
	private List<TpTraficoSpot> spots;

	public ConsultaSpotDTOResponse(List<TpTraficoSpot> spots) {
		this.spots = spots;
	}

	public List<TpTraficoSpot> getSpots() {
		return spots;
	}

	public void setSpots(List<TpTraficoSpot> spots) {
		this.spots = spots;
	}

}
