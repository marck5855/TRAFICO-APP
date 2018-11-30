package mx.com.tp.trafico.dto.response;

import java.io.Serializable;
import java.util.List;

import mx.com.tp.trafico.entity.TpTraficoSpot;

public class ConsultaSpotDTOResponse implements Serializable{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 4342169604251727400L;
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
