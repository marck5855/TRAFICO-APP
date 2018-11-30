package mx.com.tp.trafico.dto.request;

import java.io.Serializable;

public class ActualizaRutaDTORequest implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = -2414057249508314791L;
	private String descripcion;
	private String phat;
	
	public String getDescripcion() {
		return descripcion;
	}
	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}
	public String getPhat() {
		return phat;
	}
	public void setPhat(String phat) {
		this.phat = phat;
	}

	
}
