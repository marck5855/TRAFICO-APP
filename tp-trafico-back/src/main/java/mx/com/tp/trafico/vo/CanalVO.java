package mx.com.tp.trafico.vo;

import java.util.Date;
import java.sql.Time;

public class CanalVO {

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

	
}
