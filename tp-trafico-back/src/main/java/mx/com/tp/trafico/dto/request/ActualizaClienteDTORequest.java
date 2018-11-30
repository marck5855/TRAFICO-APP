package mx.com.tp.trafico.dto.request;

import java.io.Serializable;
import java.util.Date;

public class ActualizaClienteDTORequest implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = -8876081383871944186L;
	private Date fechaModificacion;
	private Date fechaRegistro;
	private String nombre;

	public Date getFechaModificacion() {
		return fechaModificacion;
	}

	public void setFechaModificacion(Date fechaModificacion) {
		this.fechaModificacion = fechaModificacion;
	}

	public Date getFechaRegistro() {
		return fechaRegistro;
	}

	public void setFechaRegistro(Date fechaRegistro) {
		this.fechaRegistro = fechaRegistro;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
}
