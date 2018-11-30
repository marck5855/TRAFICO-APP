package mx.com.tp.trafico.dto.response;

import java.io.Serializable;


import mx.com.tp.trafico.entity.TpTraficoConfiguracionRuta;

public class BusquedaRutaDTOResponse implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = -978291585988093779L;
	TpTraficoConfiguracionRuta ruta;
	protected boolean busqueda;

	public BusquedaRutaDTOResponse(boolean busqueda, TpTraficoConfiguracionRuta ruta) {
		this.busqueda = busqueda;
		this.ruta = ruta;
	}

	public TpTraficoConfiguracionRuta getRuta() {
		return ruta;
	}

	public void setRuta(TpTraficoConfiguracionRuta ruta) {
		this.ruta = ruta;
	}

	public boolean isBusqueda() {
		return busqueda;
	}

	public void setBusqueda(boolean busqueda) {
		this.busqueda = busqueda;
	}
}
