package mx.com.tp.trafico.dto.request;

import java.io.Serializable;
import java.sql.Time;
import java.util.Date;

import mx.com.tp.trafico.entity.TpTraficoCanal;
import mx.com.tp.trafico.entity.TpTraficoSpot;
import mx.com.tp.trafico.entity.TpTraficoUsuario;

public class ActualizaPautaDTORequest implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 7754092597482981396L;
	private Long idPauta;
	private int breack;
	private Time cortes;
	private Date fecha;
	private Date fechaModificacion;
	private Date fechaRegistro;
	private String franja;
	private Time horaOrd;
	private Time horario;
	private int idCanal;
	private int idUsuario;
	private String identificador;
	private int posicion;
	private TpTraficoCanal tpTraficoCanal;
	private TpTraficoUsuario tpTraficoUsuario;
	private TpTraficoSpot tpTraficoSpot;
	public Long getIdPauta() {
		return idPauta;
	}
	public void setIdPauta(Long idPauta) {
		this.idPauta = idPauta;
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
	public Date getFecha() {
		return fecha;
	}
	public void setFecha(Date fecha) {
		this.fecha = fecha;
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
	public int getIdCanal() {
		return idCanal;
	}
	public void setIdCanal(int idCanal) {
		this.idCanal = idCanal;
	}
	public int getIdUsuario() {
		return idUsuario;
	}
	public void setIdUsuario(int idUsuario) {
		this.idUsuario = idUsuario;
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
	public TpTraficoSpot getTpTraficoSpot() {
		return tpTraficoSpot;
	}
	public void setTpTraficoSpot(TpTraficoSpot tpTraficoSpot) {
		this.tpTraficoSpot = tpTraficoSpot;
	}
	public TpTraficoCanal getTpTraficoCanal() {
		return tpTraficoCanal;
	}
	public void setTpTraficoCanal(TpTraficoCanal tpTraficoCanal) {
		this.tpTraficoCanal = tpTraficoCanal;
	}
	public TpTraficoUsuario getTpTraficoUsuario() {
		return tpTraficoUsuario;
	}
	public void setTpTraficoUsuario(TpTraficoUsuario tpTraficoUsuario) {
		this.tpTraficoUsuario = tpTraficoUsuario;
	}
	
}
