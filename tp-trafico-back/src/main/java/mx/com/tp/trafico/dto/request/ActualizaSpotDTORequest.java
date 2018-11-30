package mx.com.tp.trafico.dto.request;

import java.io.Serializable;
import java.sql.Time;
import java.util.Date;

import mx.com.tp.trafico.entity.CatPrefijo;
import mx.com.tp.trafico.entity.TpTraficoCliente;

public class ActualizaSpotDTORequest implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 6378290301275565161L;
	private String alias;
	private String campania;
	private String clasificacion;
	private Time duracion;
	private String estatus;
	private Date fechaCreacion;
	private Date fechaEstreno;
	private Date fechaModificacion;
	private Date fechaRegistro;
	private Date fechaVigencia;
	private int precio1a;
	private int precio1aa;
	private int precio1aaa;
	private int precio1b;
	private int precio2a;
	private int precio2aa;
	private int precio2aaa;
	private int precio2b;
	private int precio3a;
	private int precio3aa;
	private int precio3aaa;
	private int precio3b;
	private int precio4a;
	private int precio4aa;
	private int precio4aaa;
	private int precio4b;
	private String separador;
	private String version;
	private TpTraficoCliente tpTraficoCliente;
	private CatPrefijo catPrefijo;



	public String getAlias() {
		return alias;
	}

	public void setAlias(String alias) {
		this.alias = alias;
	}

	public String getCampania() {
		return campania;
	}

	public void setCampania(String campania) {
		this.campania = campania;
	}

	public String getClasificacion() {
		return clasificacion;
	}

	public void setClasificacion(String clasificacion) {
		this.clasificacion = clasificacion;
	}

	public Time getDuracion() {
		return duracion;
	}

	public void setDuracion(Time duracion) {
		this.duracion = duracion;
	}

	public Date getFechaCreacion() {
		return fechaCreacion;
	}

	public void setFechaCreacion(Date fechaCreacion) {
		this.fechaCreacion = fechaCreacion;
	}

	public Date getFechaEstreno() {
		return fechaEstreno;
	}

	public void setFechaEstreno(Date fechaEstreno) {
		this.fechaEstreno = fechaEstreno;
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

	public Date getFechaVigencia() {
		return fechaVigencia;
	}

	public void setFechaVigencia(Date fechaVigencia) {
		this.fechaVigencia = fechaVigencia;
	}

	public int getPrecio1a() {
		return precio1a;
	}

	public void setPrecio1a(int precio1a) {
		this.precio1a = precio1a;
	}

	public int getPrecio1aa() {
		return precio1aa;
	}

	public void setPrecio1aa(int precio1aa) {
		this.precio1aa = precio1aa;
	}

	public int getPrecio1aaa() {
		return precio1aaa;
	}

	public void setPrecio1aaa(int precio1aaa) {
		this.precio1aaa = precio1aaa;
	}

	public int getPrecio1b() {
		return precio1b;
	}

	public void setPrecio1b(int precio1b) {
		this.precio1b = precio1b;
	}

	public int getPrecio2a() {
		return precio2a;
	}

	public void setPrecio2a(int precio2a) {
		this.precio2a = precio2a;
	}

	public int getPrecio2aa() {
		return precio2aa;
	}

	public void setPrecio2aa(int precio2aa) {
		this.precio2aa = precio2aa;
	}

	public int getPrecio2aaa() {
		return precio2aaa;
	}

	public void setPrecio2aaa(int precio2aaa) {
		this.precio2aaa = precio2aaa;
	}

	public int getPrecio2b() {
		return precio2b;
	}

	public void setPrecio2b(int precio2b) {
		this.precio2b = precio2b;
	}

	public int getPrecio3a() {
		return precio3a;
	}

	public void setPrecio3a(int precio3a) {
		this.precio3a = precio3a;
	}

	public int getPrecio3aa() {
		return precio3aa;
	}

	public void setPrecio3aa(int precio3aa) {
		this.precio3aa = precio3aa;
	}

	public int getPrecio3aaa() {
		return precio3aaa;
	}

	public void setPrecio3aaa(int precio3aaa) {
		this.precio3aaa = precio3aaa;
	}

	public int getPrecio3b() {
		return precio3b;
	}

	public void setPrecio3b(int precio3b) {
		this.precio3b = precio3b;
	}

	public int getPrecio4a() {
		return precio4a;
	}

	public void setPrecio4a(int precio4a) {
		this.precio4a = precio4a;
	}

	public int getPrecio4aa() {
		return precio4aa;
	}

	public void setPrecio4aa(int precio4aa) {
		this.precio4aa = precio4aa;
	}

	public int getPrecio4aaa() {
		return precio4aaa;
	}

	public void setPrecio4aaa(int precio4aaa) {
		this.precio4aaa = precio4aaa;
	}

	public int getPrecio4b() {
		return precio4b;
	}

	public void setPrecio4b(int precio4b) {
		this.precio4b = precio4b;
	}

	public String getSeparador() {
		return separador;
	}

	public void setSeparador(String separador) {
		this.separador = separador;
	}

	public String getVersion() {
		return version;
	}

	public void setVersion(String version) {
		this.version = version;
	}

	public String getEstatus() {
		return estatus;
	}

	public void setEstatus(String estatus) {
		this.estatus = estatus;
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

	
}
