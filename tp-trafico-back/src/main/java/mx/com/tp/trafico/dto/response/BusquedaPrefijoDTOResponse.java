package mx.com.tp.trafico.dto.response;

import java.io.Serializable;

import mx.com.tp.trafico.entity.CatPrefijo;

public class BusquedaPrefijoDTOResponse implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = -5163798720069723068L;
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
