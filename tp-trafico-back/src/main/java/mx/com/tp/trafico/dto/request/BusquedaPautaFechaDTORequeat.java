package mx.com.tp.trafico.dto.request;

import java.io.Serializable;

public class BusquedaPautaFechaDTORequeat implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1182872660232940291L;
	public String fecha= null;
	public String idCanal = null;

	
	public String getIdCanal() {
		return idCanal;
	}

	public void setIdCanal(String idCanal) {
		this.idCanal = idCanal;
	}

	public String getFecha() {
		return fecha;
	}

	public void setFecha(String fecha) {
		this.fecha = fecha;
	}

}
