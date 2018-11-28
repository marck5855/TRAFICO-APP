package mx.com.tp.trafico.dto.request;

import java.sql.Time;
import java.util.Date;

public class ActualizaEscaletaDTORequest extends SerializableRequest {

	private Long idEscaleta;
	private int breack;
	private Time cortes;
	private Date fechaModificacion;
	private Date fechaRegistro;
	private String franja;
	private Time horaOrd;
	private Time horario;
	private String identificador;
	private int posicion;

	public Long getIdEscaleta() {
		return idEscaleta;
	}

	public void setIdEscaleta(Long idEscaleta) {
		this.idEscaleta = idEscaleta;
	}

	public int getBreack() {
		return breack;
	}

	public void setBreack(int breack) {
		this.breack = breack;
	}

	public Time getCortes() {
		return cortes;
	}

	public void setCortes(Time cortes) {
		this.cortes = cortes;
	}

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

	public String getFranja() {
		return franja;
	}

	public void setFranja(String franja) {
		this.franja = franja;
	}

	public Time getHoraOrd() {
		return horaOrd;
	}

	public void setHoraOrd(Time horaOrd) {
		this.horaOrd = horaOrd;
	}

	public Time getHorario() {
		return horario;
	}

	public void setHorario(Time horario) {
		this.horario = horario;
	}

	public String getIdentificador() {
		return identificador;
	}

	public void setIdentificador(String identificador) {
		this.identificador = identificador;
	}

	public int getPosicion() {
		return posicion;
	}

	public void setPosicion(int posicion) {
		this.posicion = posicion;
	}

}
