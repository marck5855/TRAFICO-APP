package mx.com.tp.trafico.entity;

import java.io.Serializable;
import javax.persistence.*;
import java.sql.Time;
import java.util.Date;


/**
 * The persistent class for the TP_TRAFICO_SPOT database table.
 * 
 */
@Entity
@Table(name="TP_TRAFICO_SPOT")
@NamedQuery(name="TpTraficoSpot.findAll", query="SELECT t FROM TpTraficoSpot t")
public class TpTraficoSpot implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name="ID_SPOT")
	private Long idSpot;

	@Column(name="ALIAS")
	private String alias;

	@Column(name="CAMPANIA")
	private String campania;

	@Column(name="CLASIFICACION")
	private String clasificacion;

	@Column(name="DURACION")
	private Time duracion;

	@Column(name="ESTATUS")
	private int estatus;

	@Temporal(TemporalType.DATE)
	@Column(name="FECHA_CREACION")
	private Date fechaCreacion;

	@Temporal(TemporalType.DATE)
	@Column(name="FECHA_ESTRENO")
	private Date fechaEstreno;

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name="FECHA_MODIFICACION")
	private Date fechaModificacion;

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name="FECHA_REGISTRO")
	private Date fechaRegistro;

	@Temporal(TemporalType.DATE)
	@Column(name="FECHA_VIGENCIA")
	private Date fechaVigencia;

	@ManyToOne
	@JoinColumn(name="ID_CLIENTE")
	private TpTraficoCliente tpTraficoCliente;

	@ManyToOne
	@JoinColumn(name="ID_PREFIJO")
	private CatPrefijo catPrefijo;

	@Column(name="PATHPROXY")
	private String pathproxy;

	@Column(name="PATHTARGET")
	private String pathtarget;

	@Column(name="PRECIO1A")
	private int precio1a;

	@Column(name="PRECIO1AA")
	private int precio1aa;

	@Column(name="PRECIO1AAA")
	private int precio1aaa;

	@Column(name="PRECIO1B")
	private int precio1b;

	@Column(name="PRECIO2A")
	private int precio2a;

	@Column(name="PRECIO2AA")
	private int precio2aa;

	@Column(name="PRECIO2AAA")
	private int precio2aaa;

	@Column(name="PRECIO2B")
	private int precio2b;

	@Column(name="PRECIO3A")
	private int precio3a;

	@Column(name="PRECIO3AA")
	private int precio3aa;

	@Column(name="PRECIO3AAA")
	private int precio3aaa;

	@Column(name="PRECIO3B")
	private int precio3b;

	@Column(name="PRECIO4A")
	private int precio4a;

	@Column(name="PRECIO4AA")
	private int precio4aa;

	@Column(name="PRECIO4AAA")
	private int precio4aaa;

	@Column(name="PRECIO4B")
	private int precio4b;

	@Column(name="SEPARADOR")
	private String separador;

	@Column(name="VERSION")
	private String version;

	public TpTraficoSpot() {
	}

	public Long getIdSpot() {
		return this.idSpot;
	}

	public void setIdSpot(Long idSpot) {
		this.idSpot = idSpot;
	}

	public String getAlias() {
		return this.alias;
	}

	public void setAlias(String alias) {
		this.alias = alias;
	}

	public String getCampania() {
		return this.campania;
	}

	public void setCampania(String campania) {
		this.campania = campania;
	}

	public String getClasificacion() {
		return this.clasificacion;
	}

	public void setClasificacion(String clasificacion) {
		this.clasificacion = clasificacion;
	}

	public Time getDuracion() {
		return this.duracion;
	}

	public void setDuracion(Time duracion) {
		this.duracion = duracion;
	}

	public int getEstatus() {
		return this.estatus;
	}

	public void setEstatus(int estatus) {
		this.estatus = estatus;
	}

	public Date getFechaCreacion() {
		return this.fechaCreacion;
	}

	public void setFechaCreacion(Date fechaCreacion) {
		this.fechaCreacion = fechaCreacion;
	}

	public Date getFechaEstreno() {
		return this.fechaEstreno;
	}

	public void setFechaEstreno(Date fechaEstreno) {
		this.fechaEstreno = fechaEstreno;
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

	public Date getFechaVigencia() {
		return this.fechaVigencia;
	}

	public void setFechaVigencia(Date fechaVigencia) {
		this.fechaVigencia = fechaVigencia;
	}

	public TpTraficoCliente getTpTraficoCliente() {
		return tpTraficoCliente;
	}

	public void setTpTraficoCliente(TpTraficoCliente tpTraficoCliente) {
		this.tpTraficoCliente = tpTraficoCliente;
	}

	public CatPrefijo getCatPrefijo() {
		return catPrefijo;
	}

	public void setCatPrefijo(CatPrefijo catPrefijo) {
		this.catPrefijo = catPrefijo;
	}

	public String getPathproxy() {
		return this.pathproxy;
	}

	public void setPathproxy(String pathproxy) {
		this.pathproxy = pathproxy;
	}

	public String getPathtarget() {
		return this.pathtarget;
	}

	public void setPathtarget(String pathtarget) {
		this.pathtarget = pathtarget;
	}

	public int getPrecio1a() {
		return this.precio1a;
	}

	public void setPrecio1a(int precio1a) {
		this.precio1a = precio1a;
	}

	public int getPrecio1aa() {
		return this.precio1aa;
	}

	public void setPrecio1aa(int precio1aa) {
		this.precio1aa = precio1aa;
	}

	public int getPrecio1aaa() {
		return this.precio1aaa;
	}

	public void setPrecio1aaa(int precio1aaa) {
		this.precio1aaa = precio1aaa;
	}

	public int getPrecio1b() {
		return this.precio1b;
	}

	public void setPrecio1b(int precio1b) {
		this.precio1b = precio1b;
	}

	public int getPrecio2a() {
		return this.precio2a;
	}

	public void setPrecio2a(int precio2a) {
		this.precio2a = precio2a;
	}

	public int getPrecio2aa() {
		return this.precio2aa;
	}

	public void setPrecio2aa(int precio2aa) {
		this.precio2aa = precio2aa;
	}

	public int getPrecio2aaa() {
		return this.precio2aaa;
	}

	public void setPrecio2aaa(int precio2aaa) {
		this.precio2aaa = precio2aaa;
	}

	public int getPrecio2b() {
		return this.precio2b;
	}

	public void setPrecio2b(int precio2b) {
		this.precio2b = precio2b;
	}

	public int getPrecio3a() {
		return this.precio3a;
	}

	public void setPrecio3a(int precio3a) {
		this.precio3a = precio3a;
	}

	public int getPrecio3aa() {
		return this.precio3aa;
	}

	public void setPrecio3aa(int precio3aa) {
		this.precio3aa = precio3aa;
	}

	public int getPrecio3aaa() {
		return this.precio3aaa;
	}

	public void setPrecio3aaa(int precio3aaa) {
		this.precio3aaa = precio3aaa;
	}

	public int getPrecio3b() {
		return this.precio3b;
	}

	public void setPrecio3b(int precio3b) {
		this.precio3b = precio3b;
	}

	public int getPrecio4a() {
		return this.precio4a;
	}

	public void setPrecio4a(int precio4a) {
		this.precio4a = precio4a;
	}

	public int getPrecio4aa() {
		return this.precio4aa;
	}

	public void setPrecio4aa(int precio4aa) {
		this.precio4aa = precio4aa;
	}

	public int getPrecio4aaa() {
		return this.precio4aaa;
	}

	public void setPrecio4aaa(int precio4aaa) {
		this.precio4aaa = precio4aaa;
	}

	public int getPrecio4b() {
		return this.precio4b;
	}

	public void setPrecio4b(int precio4b) {
		this.precio4b = precio4b;
	}

	public String getSeparador() {
		return this.separador;
	}

	public void setSeparador(String separador) {
		this.separador = separador;
	}

	public String getVersion() {
		return this.version;
	}

	public void setVersion(String version) {
		this.version = version;
	}

}