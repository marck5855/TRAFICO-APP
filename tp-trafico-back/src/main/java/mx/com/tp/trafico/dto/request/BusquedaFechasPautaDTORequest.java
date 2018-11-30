package mx.com.tp.trafico.dto.request;

import java.io.Serializable;

public class BusquedaFechasPautaDTORequest implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1976902774184590767L;
	
	public String nombreCanal = null;

	public String getNombreCanal() {
		return nombreCanal;
	}

	public void setNombreCanal(String nombreCanal) {
		this.nombreCanal = nombreCanal;
	}
}
