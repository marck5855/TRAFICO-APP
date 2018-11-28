package mx.com.tp.trafico.dto.response;

import com.fasterxml.jackson.annotation.JsonInclude;

import mx.com.tp.trafico.entity.CatPrefijo;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class BusquedaPrefijoDTOResponse {

	CatPrefijo prefijo;
	protected boolean busqueda;

	public BusquedaPrefijoDTOResponse(boolean busqueda, CatPrefijo prefijo) {
		this.busqueda = busqueda;
		this.prefijo = prefijo;
	}

	public CatPrefijo getPrefijo() {
		return prefijo;
	}

	public void setPrefijo(CatPrefijo prefijo) {
		this.prefijo = prefijo;
	}

	public boolean isBusqueda() {
		return busqueda;
	}

	public void setBusqueda(boolean busqueda) {
		this.busqueda = busqueda;
	}

	
}
