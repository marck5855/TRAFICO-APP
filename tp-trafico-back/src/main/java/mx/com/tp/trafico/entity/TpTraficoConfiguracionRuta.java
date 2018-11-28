package mx.com.tp.trafico.entity;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the TP_TRAFICO_CONFIGURACION_RUTA database table.
 * 
 */
@Entity
@Table(name="TP_TRAFICO_CONFIGURACION_RUTA")
@NamedQuery(name="TpTraficoConfiguracionRuta.findAll", query="SELECT t FROM TpTraficoConfiguracionRuta t")
public class TpTraficoConfiguracionRuta implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name="ID_CONFIGURACION_RUTA")
	private Long idConfiguracionRuta;

	@Column(name="DESCRIPCION")
	private String descripcion;

	@Column(name="PHAT")
	private String phat;

	public TpTraficoConfiguracionRuta() {
	}

	public Long getIdConfiguracionRuta() {
		return this.idConfiguracionRuta;
	}

	public void setIdConfiguracionRuta(Long idConfiguracionRuta) {
		this.idConfiguracionRuta = idConfiguracionRuta;
	}

	public String getDescripcion() {
		return this.descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

	public String getPhat() {
		return this.phat;
	}

	public void setPhat(String phat) {
		this.phat = phat;
	}

}