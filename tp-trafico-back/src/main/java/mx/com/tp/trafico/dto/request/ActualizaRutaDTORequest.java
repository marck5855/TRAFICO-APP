package mx.com.tp.trafico.dto.request;

import java.sql.Time;
import java.util.Date;

public class ActualizaRutaDTORequest extends SerializableRequest{

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
