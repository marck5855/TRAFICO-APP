package mx.com.tp.trafico.dto.response;

import java.io.Serializable;
import java.util.List;

import mx.com.tp.trafico.entity.TpTraficoSpot;

public class BusquedaSpotIngestadoDTOResponse implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = -3740642834851924423L;

	public List<TpTraficoSpot> listSpots;
	boolean busqueda = false;

	public BusquedaSpotIngestadoDTOResponse(List<TpTraficoSpot> listSpots, boolean busqueda) {
		this.listSpots = listSpots;
		this.busqueda = busqueda;
	}

	public List<TpTraficoSpot> getListSpots() {
		return listSpots;
	}

	public void setListSpots(List<TpTraficoSpot> listSpots) {
		this.listSpots = listSpots;
	}

	public boolean isBusqueda() {
		return busqueda;
	}

	public void setBusqueda(boolean busqueda) {
		this.busqueda = busqueda;
	}

}
