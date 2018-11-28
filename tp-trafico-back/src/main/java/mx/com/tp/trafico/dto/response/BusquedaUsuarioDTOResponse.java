package mx.com.tp.trafico.dto.response;

import java.io.Serializable;

import mx.com.tp.trafico.entity.TpTraficoUsuario;

public class BusquedaUsuarioDTOResponse implements Serializable{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	protected TpTraficoUsuario usuario;
	protected boolean busqueda;
	
	public BusquedaUsuarioDTOResponse(boolean busqueda, TpTraficoUsuario usuario) {
		System.out.println("BusquedaUsuarioDTOResponse-----"+ usuario);
		this.busqueda = busqueda;
		this.usuario = usuario;
	}

	public TpTraficoUsuario getUsuario() {
		return usuario;
	}

	public void setUsuario(TpTraficoUsuario usuario) {
		this.usuario = usuario;
	}

	public boolean isBusqueda() {
		return busqueda;
	}

	public void setBusqueda(boolean busqueda) {
		this.busqueda = busqueda;
	}

}
