package mx.com.tp.trafico.entity;

import java.io.Serializable;
import javax.persistence.*;
import java.util.List;


/**
 * The persistent class for the CAT_PREFIJO database table.
 * 
 */
@Entity
@Table(name="CAT_PREFIJO")
@NamedQuery(name="CatPrefijo.findAll", query="SELECT c FROM CatPrefijo c")
public class CatPrefijo implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name="ID_PREFIJO")
	private Long idPrefijo;

	@Column(name="DESCRIPCION")
	private String descripcion;

	@Column(name="PREF")
	private String pref;

	//bi-directional many-to-one association to TpTraficoSpot
//	@OneToMany(mappedBy="catPrefijo")
//	private List<TpTraficoSpot> tpTraficoSpots;

	public CatPrefijo() {
	}

	public Long getIdPrefijo() {
		return this.idPrefijo;
	}

	public void setIdPrefijo(Long idPrefijo) {
		this.idPrefijo = idPrefijo;
	}

	public String getDescripcion() {
		return this.descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

	public String getPref() {
		return this.pref;
	}

	public void setPref(String pref) {
		this.pref = pref;
	}

//	public List<TpTraficoSpot> getTpTraficoSpots() {
//		return this.tpTraficoSpots;
//	}
//
//	public void setTpTraficoSpots(List<TpTraficoSpot> tpTraficoSpots) {
//		this.tpTraficoSpots = tpTraficoSpots;
//	}
//
//	public TpTraficoSpot addTpTraficoSpot(TpTraficoSpot tpTraficoSpot) {
//		getTpTraficoSpots().add(tpTraficoSpot);
//		tpTraficoSpot.setCatPrefijo(this);
//
//		return tpTraficoSpot;
//	}
//
//	public TpTraficoSpot removeTpTraficoSpot(TpTraficoSpot tpTraficoSpot) {
//		getTpTraficoSpots().remove(tpTraficoSpot);
//		tpTraficoSpot.setCatPrefijo(null);
//
//		return tpTraficoSpot;
//	}

}