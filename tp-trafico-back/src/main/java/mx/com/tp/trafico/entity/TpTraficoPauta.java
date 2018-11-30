package mx.com.tp.trafico.entity;

import java.io.Serializable;
import javax.persistence.*;

import java.sql.Time;
import java.util.Date;

/**
 * The persistent class for the TP_TRAFICO_PAUTA database table.
 * 
 */
@Entity
@Table(name = "TP_TRAFICO_PAUTA")
@NamedQuery(name = "TpTraficoPauta.findAll", query = "SELECT t FROM TpTraficoPauta t")
public class TpTraficoPauta implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name = "ID_PAUTA")
	private Long idPauta;

	@Column(name = "BREACK")
	private int breack;

	@Column(name = "CORTES")
	private Time cortes;

	@Temporal(TemporalType.DATE)
	@Column(name = "FECHA")
	private Date fecha;

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "FECHA_MODIFICACION")
	private Date fechaModificacion;

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "FECHA_REGISTRO")
	private Date fechaRegistro;

	@Column(name = "FRANJA")
	private String franja;

	@Column(name = "HORA_ORD")
	private Time horaOrd;

	@Column(name = "HORARIO")
	private Time horario;

	// bi-directional many-to-one association to TpTraficoCanal
	@ManyToOne
	@JoinColumn(name = "ID_CANAL")
	private TpTraficoCanal tpTraficoCanal;

	// bi-directional many-to-one association to TpTraficoUsuario

	@ManyToOne
	@JoinColumn(name = "ID_USUARIO")
	private TpTraficoUsuario tpTraficoUsuario;

	@Column(name = "IDENTIFICADOR")
	private String identificador;

	@Column(name = "POSICION")
	private int posicion;

	// bi-directional many-to-one association to TpTraficoSpot
	@ManyToOne
	@JoinColumn(name = "ID_SPOT")
	private TpTraficoSpot tpTraficoSpot;

	public TpTraficoPauta() {
	}

	public Long getIdPauta() {
		return this.idPauta;
	}

	public void setIdPauta(Long idPauta) {
		this.idPauta = idPauta;
	}

	public int getBreack() {
		return this.breack;
	}

	public void setBreack(int breack) {
		this.breack = breack;
	}

	public Time getCortes() {
		return this.cortes;
	}

	public void setCortes(Time cortes) {
		this.cortes = cortes;
	}

	public Date getFecha() {
		return this.fecha;
	}

	public void setFecha(Date fecha) {
		this.fecha = fecha;
	}

	public Date getFechaModificacion() {
		return this.fechaModificacion;
	}

	public void setFechaModificacion(Date fechaModificacion) {
		this.fechaModificacion = fechaModificacion;
	}

	public Date getFechaRegistro() {
		return this.fechaRegistro;
	}

	public void setFechaRegistro(Date fechaRegistro) {
		this.fechaRegistro = fechaRegistro;
	}

	public String getFranja() {
		return this.franja;
	}

	public void setFranja(String franja) {
		this.franja = franja;
	}

	public Time getHoraOrd() {
		return this.horaOrd;
	}

	public void setHoraOrd(Time horaOrd) {
		this.horaOrd = horaOrd;
	}

	public Time getHorario() {
		return this.horario;
	}

	public void setHorario(Time horario) {
		this.horario = horario;
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

	public String getIdentificador() {
		return this.identificador;
	}

	public void setIdentificador(String identificador) {
		this.identificador = identificador;
	}

	public int getPosicion() {
		return this.posicion;
	}

	public void setPosicion(int posicion) {
		this.posicion = posicion;
	}

	public TpTraficoSpot getTpTraficoSpot() {
		return this.tpTraficoSpot;
	}

	public void setTpTraficoSpot(TpTraficoSpot tpTraficoSpot) {
		this.tpTraficoSpot = tpTraficoSpot;
	}

}