package mx.com.tp.trafico.entity;

import java.io.Serializable;
import javax.persistence.*;
import java.util.Date;


/**
 * The persistent class for the TP_TRAFICO_CLIENTE database table.
 * 
 */
@Entity
@Table(name="TP_TRAFICO_CLIENTE")
@NamedQuery(name="TpTraficoCliente.findAll", query="SELECT t FROM TpTraficoCliente t")
public class TpTraficoCliente implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name="ID_CLIENTE")
	private Long idCliente;

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name="FECHA_MODIFICACION")
	private Date fechaModificacion;

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name="FECHA_REGISTRO")
	private Date fechaRegistro;

	@Column(name="NOMBRE")
	private String nombre;

	public TpTraficoCliente() {
	}

	public Long getIdCliente() {
		return this.idCliente;
	}

	public void setIdCliente(Long idCliente) {
		this.idCliente = idCliente;
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

	public String getNombre() {
		return this.nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

}