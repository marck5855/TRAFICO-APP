package mx.com.tp.trafico.dto.response;


import java.io.Serializable;

import mx.com.tp.trafico.entity.TpTraficoCliente;

public class BusquedaClienteDTOResponse implements Serializable{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 415087003745988307L;
	TpTraficoCliente cliente;
	protected boolean busqueda;
	
	public BusquedaClienteDTOResponse(boolean busqueda, TpTraficoCliente cliente) {
		this.busqueda = busqueda;
		this.cliente = cliente;
	}

	public TpTraficoCliente getCliente() {
		return cliente;
	}

	public void setCliente(TpTraficoCliente cliente) {
		this.cliente = cliente;
	}

	public boolean isBusqueda() {
		return busqueda;
	}

	public void setBusqueda(boolean busqueda) {
		this.busqueda = busqueda;
	}
}
