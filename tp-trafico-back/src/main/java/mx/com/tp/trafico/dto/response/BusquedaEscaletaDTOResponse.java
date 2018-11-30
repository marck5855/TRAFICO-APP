package mx.com.tp.trafico.dto.response;

import java.io.Serializable;

import mx.com.tp.trafico.entity.TpTraficoEscaleta;

public class BusquedaEscaletaDTOResponse implements Serializable{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 586236742210437347L;
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
