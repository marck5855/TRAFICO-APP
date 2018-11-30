package mx.com.tp.trafico.dto.response;

import java.io.Serializable;
import java.util.List;

import mx.com.tp.trafico.entity.TpTraficoSpot;

public class BusquedaSpotClienteDTOResponse implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 6377937352487639491L;

	public List<TpTraficoSpot> listSpots = null;
	boolean busqueda = false;

	public BusquedaSpotClienteDTOResponse(List<TpTraficoSpot> listSpots, boolean busqueda) {
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
