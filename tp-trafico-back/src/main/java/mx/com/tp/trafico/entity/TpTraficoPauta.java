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
@Table(name="TP_TRAFICO_PAUTA")
@NamedQuery(name="TpTraficoPauta.findAll", query="SELECT t FROM TpTraficoPauta t")
public class TpTraficoPauta implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name="ID_PAUTA")
	private int idPauta;

	@Temporal(TemporalType.DATE)
	@Column(name="FECHA")
	private Date fecha;

	@Column(name="HORA_INICIAL")
	private Time horaInicial;

	@Column(name="IDENTIFICADOR")
	private String identificador;

	@Column(name="TIEMPO_SALTOS")
	private Time tiempoSaltos;

	@Column(name="TOTAL_IMPACTOS")
	private int totalImpactos;

	//bi-directional many-to-one association to TpTraficoCanal
	@ManyToOne
	@JoinColumn(name="ID_CANAL")
	private TpTraficoCanal tpTraficoCanal;

	//bi-directional many-to-one association to TpTraficoUsuario
	@ManyToOne
	@JoinColumn(name="ID_USUARIO")
	private TpTraficoUsuario tpTraficoUsuario;

	public TpTraficoPauta() {
	}

	public int getIdPauta() {
		return this.idPauta;
	}

	public void setIdPauta(int idPauta) {
		this.idPauta = idPauta;
	}

	public Date getFecha() {
		return this.fecha;
	}

	public void setFecha(Date fecha) {
		this.fecha = fecha;
	}

	public Time getHoraInicial() {
		return this.horaInicial;
	}

	public void setHoraInicial(Time horaInicial) {
		this.horaInicial = horaInicial;
	}

	public String getIdentificador() {
		return this.identificador;
	}

	public void setIdentificador(String identificador) {
		this.identificador = identificador;
	}

	public Time getTiempoSaltos() {
		return this.tiempoSaltos;
	}

	public void setTiempoSaltos(Time tiempoSaltos) {
		this.tiempoSaltos = tiempoSaltos;
	}

	public int getTotalImpactos() {
		return this.totalImpactos;
	}

	public void setTotalImpactos(int totalImpactos) {
		this.totalImpactos = totalImpactos;
	}

	public TpTraficoCanal getTpTraficoCanal() {
		return this.tpTraficoCanal;
	}

	public void setTpTraficoCanal(TpTraficoCanal tpTraficoCanal) {
		this.tpTraficoCanal = tpTraficoCanal;
	}

	public TpTraficoUsuario getTpTraficoUsuario() {
		return this.tpTraficoUsuario;
	}

	public void setTpTraficoUsuario(TpTraficoUsuario tpTraficoUsuario) {
		this.tpTraficoUsuario = tpTraficoUsuario;
	}

}