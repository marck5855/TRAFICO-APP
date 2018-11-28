package mx.com.tp.trafico.dto.response;

import com.fasterxml.jackson.annotation.JsonInclude;

import mx.com.tp.trafico.entity.TpTraficoCanal;
import mx.com.tp.trafico.entity.TpTraficoCliente;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class BusquedaClienteDTOResponse {
	
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
