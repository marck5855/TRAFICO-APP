package mx.com.tp.trafico.entity;

import java.io.Serializable;
import javax.persistence.*;
import java.sql.Time;
import java.util.Date;


/**
 * The persistent class for the TP_TRAFICO_ESCALETA database table.
 * 
 */
@Entity
@Table(name="TP_TRAFICO_ESCALETA")
@NamedQuery(name="TpTraficoEscaleta.findAll", query="SELECT t FROM TpTraficoEscaleta t")
public class TpTraficoEscaleta implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name="ID_ESCALETA")
	private Long idEscaleta;

	@Column(name="BREACK")
	private int breack;

	@Column(name="CORTES")
	private Time cortes;

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name="FECHA_REGISTRO")
	private Date fechaRegistro;

	@Column(name="FRANJA")
	private String franja;

	@Column(name="HORA_ORD")
	private Time horaOrd;

	@Column(name="HORARIO")
	private Time horario;

	@Column(name="IDENTIFICADOR")
	private String identificador;

	@Column(name="POSICION")
	private int posicion;

	//bi-directional many-to-one association to TpTraficoSpot
	@ManyToOne
	@JoinColumn(name="ID_SPOT")
	private TpTraficoSpot tpTraficoSpot;

	public TpTraficoEscaleta() {
	}

	public Long getIdEscaleta() {
		return this.idEscaleta;
	}

	public void setIdEscaleta(Long idEscaleta) {
		this.idEscaleta = idEscaleta;
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