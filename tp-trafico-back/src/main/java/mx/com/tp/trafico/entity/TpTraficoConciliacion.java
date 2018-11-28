package mx.com.tp.trafico.entity;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the TP_TRAFICO_CONCILIACION database table.
 * 
 */
@Entity
@Table(name="TP_TRAFICO_CONCILIACION")
@NamedQuery(name="TpTraficoConciliacion.findAll", query="SELECT t FROM TpTraficoConciliacion t")
public class TpTraficoConciliacion implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name="ID_CONCILIACION")
	private int idConciliacion;

	public TpTraficoConciliacion() {
	}

	public int getIdConciliacion() {
		return this.idConciliacion;
	}

	public void setIdConciliacion(int idConciliacion) {
		this.idConciliacion = idConciliacion;
	}

}