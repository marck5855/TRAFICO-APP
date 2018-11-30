package mx.com.tp.trafico.dto.request;

import java.io.Serializable;

public class BusquedaSpotClienteDTORequest implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 6885431839008011417L;

	public String nombreCliente;

	public String getNombreCliente() {
		return nombreCliente;
	}

	public void setNombreCliente(String nombreCliente) {
		this.nombreCliente = nombreCliente;
	}

}
