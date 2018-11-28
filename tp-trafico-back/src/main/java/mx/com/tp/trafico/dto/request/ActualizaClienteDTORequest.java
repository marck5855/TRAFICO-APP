package mx.com.tp.trafico.dto.request;

import java.sql.Time;
import java.util.Date;

public class ActualizaClienteDTORequest extends SerializableRequest {

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
