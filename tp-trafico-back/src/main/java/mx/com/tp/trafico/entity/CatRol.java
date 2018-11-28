package mx.com.tp.trafico.entity;

import java.io.Serializable;
import javax.persistence.*;
import java.util.List;


/**
 * The persistent class for the CAT_ROL database table.
 * 
 */
@Entity
@Table(name="CAT_ROL")
@NamedQuery(name="CatRol.findAll", query="SELECT c FROM CatRol c")
public class CatRol implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name="ID_ROL")
	private int idRol;

	@Column(name="DESCRIPCION")
	private String descripcion;

	//bi-directional many-to-one association to TpTraficoMenuRol
	@OneToMany(mappedBy="catRol")
	private List<TpTraficoMenuRol> tpTraficoMenuRols;

	//bi-directional many-to-many association to TpTraficoUsuario
//	@ManyToMany(mappedBy="catRols")
//	private List<TpTraficoUsuario> tpTraficoUsuarios;

	public CatRol() {
	}

	public int getIdRol() {
		return this.idRol;
	}

	public void setIdRol(int idRol) {
		this.idRol = idRol;
	}

	public String getDescripcion() {
		return this.descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

	public List<TpTraficoMenuRol> getTpTraficoMenuRols() {
		return this.tpTraficoMenuRols;
	}

	public void setTpTraficoMenuRols(List<TpTraficoMenuRol> tpTraficoMenuRols) {
		this.tpTraficoMenuRols = tpTraficoMenuRols;
	}

	public TpTraficoMenuRol addTpTraficoMenuRol(TpTraficoMenuRol tpTraficoMenuRol) {
		getTpTraficoMenuRols().add(tpTraficoMenuRol);
		tpTraficoMenuRol.setCatRol(this);

		return tpTraficoMenuRol;
	}

	public TpTraficoMenuRol removeTpTraficoMenuRol(TpTraficoMenuRol tpTraficoMenuRol) {
		getTpTraficoMenuRols().remove(tpTraficoMenuRol);
		tpTraficoMenuRol.setCatRol(null);

		return tpTraficoMenuRol;
	}

//	public List<TpTraficoUsuario> getTpTraficoUsuarios() {
//		return this.tpTraficoUsuarios;
//	}
//
//	public void setTpTraficoUsuarios(List<TpTraficoUsuario> tpTraficoUsuarios) {
//		this.tpTraficoUsuarios = tpTraficoUsuarios;
//	}

}