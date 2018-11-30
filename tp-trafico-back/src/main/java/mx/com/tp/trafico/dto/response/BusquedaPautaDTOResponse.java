package mx.com.tp.trafico.dto.response;

import java.io.Serializable;

import mx.com.tp.trafico.entity.TpTraficoPauta;

public class BusquedaPautaDTOResponse implements Serializable{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 3703278890607783347L;
	TpTraficoPauta pauta;
	protected boolean busqueda;
	
	public BusquedaPautaDTOResponse(boolean busqueda, TpTraficoPauta pauta) {
		this.busqueda = busqueda;
		this.pauta = pauta;
	}

	public TpTraficoPauta getPauta() {
		return pauta;
	}

	public void setPauta(TpTraficoPauta pauta) {
		this.pauta = pauta;
	}

	public boolean isBusqueda() {
		return busqueda;
	}

	public void setBusqueda(boolean busqueda) {
		this.busqueda = busqueda;
	}
}
