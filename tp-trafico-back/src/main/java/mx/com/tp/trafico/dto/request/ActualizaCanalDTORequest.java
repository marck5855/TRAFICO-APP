package mx.com.tp.trafico.dto.request;

import java.io.Serializable;
import java.sql.Time;
import java.util.Date;

public class ActualizaCanalDTORequest implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = -5946103926870338217L;
	private Long idCanal;
	private Time cortes;
	private int estatus;
	private Date fechaModificacion;
	private int idTp;
	private String nombre;
	private String tipoCanal;
	private String tipoVideo;
	
	public Time getCortes() {
		return cortes;
	}
	
	public void setCortes(Time cortes) {
		this.cortes = cortes;
	}

	public int getEstatus() {
		return estatus;
	}

	public void setEstatus(int estatus) {
		this.estatus = estatus;
	}

	public Date getFechaModificacion() {
		return fechaModificacion;
	}

	public void setFechaModificacion(Date fechaModificacion) {
		this.fechaModificacion = fechaModificacion;
	}

	public int getIdTp() {
		return idTp;
	}

	public void setIdTp(int idTp) {
		this.idTp = idTp;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getTipoCanal() {
		return tipoCanal;
	}

	public void setTipoCanal(String tipoCanal) {
		this.tipoCanal = tipoCanal;
	}

	public String getTipoVideo() {
		return tipoVideo;
	}

	public void setTipoVideo(String tipoVideo) {
		this.tipoVideo = tipoVideo;
	}

	public Long getId() {
		return idCanal;
	}

	public void setId(Long idCanal) {
		this.idCanal = idCanal;
	}
}
