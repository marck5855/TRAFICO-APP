package mx.com.tp.trafico.dto.response;

import java.io.Serializable;
import java.util.List;

public class BusquedaClienteSpotDTOResponse implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 2312541893350679629L;
	
	public List<String> clientes = null;
	boolean busqueda = false;
	
	public BusquedaClienteSpotDTOResponse(List<String> clientes, boolean busqueda) {
		this.busqueda = busqueda;
		this.clientes = clientes;
	}
	
	public List<String> getClientes() {
		return clientes;
	}
	public void setClientes(List<String> clientes) {
		this.clientes = clientes;
	}
	public boolean isBusqueda() {
		return busqueda;
	}
	public void setBusqueda(boolean busqueda) {
		this.busqueda = busqueda;
	}
	
	
}
