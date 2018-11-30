package mx.com.tp.trafico.entity;

import java.io.Serializable;
import javax.persistence.*;
import java.sql.Time;
import java.util.Date;
import java.util.List;


/**
 * The persistent class for the TP_TRAFICO_CANAL database table.
 * 
 */
@Entity
@Table(name="TP_TRAFICO_CANAL")
@NamedQuery(name="TpTraficoCanal.findAll", query="SELECT t FROM TpTraficoCanal t")
public class TpTraficoCanal implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name="ID_CANAL")
	private Long idCanal;

	@Column(name="CORTES")
	private Time cortes;

	@Column(name="ESTATUS")
	private int estatus;

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name="FECHA_MODIFICACION")
	private Date fechaModificacion;

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name="FECHA_REGISTRO")
	private Date fechaRegistro;

	@Column(name="ID_TP")
	private int idTp;

	@Column(name="NOMBRE")
	private String nombre;

	@Column(name="TIPO_CANAL")
	private String tipoCanal;

	@Column(name="TIPO_VIDEO")
	private String tipoVideo;

	//bi-directional many-to-one association to TpTraficoPauta
//	@OneToMany(mappedBy="tpTraficoCanal")
//	private List<TpTraficoPauta> tpTraficoPautas;

	public TpTraficoCanal() {
	}

	public Long getIdCanal() {
		return this.idCanal;
	}

	public void setIdCanal(Long idCanal) {
		this.idCanal = idCanal;
	}

	public Time getCortes() {
		return this.cortes;
	}

	public void setCortes(Time cortes) {
		this.cortes = cortes;
	}

	public int getEstatus() {
		return this.estatus;
	}

	public void setEstatus(int estatus) {
		this.estatus = estatus;
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

	public int getIdTp() {
		return this.idTp;
	}

	public void setIdTp(int idTp) {
		this.idTp = idTp;
	}

	public String getNombre() {
		return this.nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getTipoCanal() {
		return this.tipoCanal;
	}

	public void setTipoCanal(String tipoCanal) {
		this.tipoCanal = tipoCanal;
	}

	public String getTipoVideo() {
		return this.tipoVideo;
	}

	public void setTipoVideo(String tipoVideo) {
		this.tipoVideo = tipoVideo;
	}

//	public List<TpTraficoPauta> getTpTraficoPautas() {
//		return this.tpTraficoPautas;
//	}
//
//	public void setTpTraficoPautas(List<TpTraficoPauta> tpTraficoPautas) {
//		this.tpTraficoPautas = tpTraficoPautas;
//	}
//
//	public TpTraficoPauta addTpTraficoPauta(TpTraficoPauta tpTraficoPauta) {
//		getTpTraficoPautas().add(tpTraficoPauta);
//		tpTraficoPauta.setTpTraficoCanal(this);
//
//		return tpTraficoPauta;
//	}
//
//	public TpTraficoPauta removeTpTraficoPauta(TpTraficoPauta tpTraficoPauta) {
//		getTpTraficoPautas().remove(tpTraficoPauta);
//		tpTraficoPauta.setTpTraficoCanal(null);
//
//		return tpTraficoPauta;
//	}

}