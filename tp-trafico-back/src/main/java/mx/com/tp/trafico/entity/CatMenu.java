package mx.com.tp.trafico.entity;

import java.io.Serializable;
import javax.persistence.*;
import java.util.List;


/**
 * The persistent class for the CAT_MENU database table.
 * 
 */
@Entity
@Table(name="CAT_MENU")
@NamedQuery(name="CatMenu.findAll", query="SELECT c FROM CatMenu c")
public class CatMenu implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name="ID_MENU")
	private int idMenu;

	@Column(name="DESCRIPCION")
	private String descripcion;

	@Column(name="ID_SUBMENU")
	private int idSubmenu;

	@Column(name="NOMBRE")
	private String nombre;

	@Column(name="PHATH")
	private String phath;

	@Column(name="TITULO_PRINCIPAL")
	private String tituloPrincipal;

	//bi-directional many-to-one association to TpTraficoMenuRol
	@OneToMany(mappedBy="catMenu")
	private List<TpTraficoMenuRol> tpTraficoMenuRols;

	public CatMenu() {
	}

	public int getIdMenu() {
		return this.idMenu;
	}

	public void setIdMenu(int idMenu) {
		this.idMenu = idMenu;
	}

	public String getDescripcion() {
		return this.descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

	public int getIdSubmenu() {
		return this.idSubmenu;
	}

	public void setIdSubmenu(int idSubmenu) {
		this.idSubmenu = idSubmenu;
	}

	public String getNombre() {
		return this.nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getPhath() {
		return this.phath;
	}

	public void setPhath(String phath) {
		this.phath = phath;
	}

	public String getTituloPrincipal() {
		return this.tituloPrincipal;
	}

	public void setTituloPrincipal(String tituloPrincipal) {
		this.tituloPrincipal = tituloPrincipal;
	}

	public List<TpTraficoMenuRol> getTpTraficoMenuRols() {
		return this.tpTraficoMenuRols;
	}

	public void setTpTraficoMenuRols(List<TpTraficoMenuRol> tpTraficoMenuRols) {
		this.tpTraficoMenuRols = tpTraficoMenuRols;
	}

	public TpTraficoMenuRol addTpTraficoMenuRol(TpTraficoMenuRol tpTraficoMenuRol) {
		getTpTraficoMenuRols().add(tpTraficoMenuRol);
		tpTraficoMenuRol.setCatMenu(this);

		return tpTraficoMenuRol;
	}

	public TpTraficoMenuRol removeTpTraficoMenuRol(TpTraficoMenuRol tpTraficoMenuRol) {
		getTpTraficoMenuRols().remove(tpTraficoMenuRol);
		tpTraficoMenuRol.setCatMenu(null);

		return tpTraficoMenuRol;
	}

}