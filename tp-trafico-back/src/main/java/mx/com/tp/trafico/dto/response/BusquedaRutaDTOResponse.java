package mx.com.tp.trafico.dto.response;

import com.fasterxml.jackson.annotation.JsonInclude;

import mx.com.tp.trafico.entity.TpTraficoCanal;
import mx.com.tp.trafico.entity.TpTraficoCliente;
import mx.com.tp.trafico.entity.TpTraficoConfiguracionRuta;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class BusquedaRutaDTOResponse {

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
