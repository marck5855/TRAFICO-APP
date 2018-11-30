package mx.com.tp.trafico.dto.response;

import java.io.Serializable;

import mx.com.tp.trafico.entity.TpTraficoSpot;

public class BusquedaSpotDTOResponse implements Serializable{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = -2898733372161801274L;

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
