package mx.com.tp.trafico.dto.response;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public class BusquedaFechaPautaDTOResponse implements Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = -4980906265107138888L;


	public Stream<String> distint = null;
	boolean busqueda = false;	
	public BusquedaFechaPautaDTOResponse(Stream<String> distint, boolean busqueda) {
		this.distint = distint;
		this.busqueda = busqueda;
	}

	public Stream<String> getDistint() {
		return distint;
	}



	public void setDistint(Stream<String> distint) {
		this.distint = distint;
	}



	public boolean isBusqueda() {
		return busqueda;
	}

	public void setBusqueda(boolean busqueda) {
		this.busqueda = busqueda;
	}
	
}
