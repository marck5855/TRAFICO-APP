package mx.com.tp.trafico.entity;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the TP_TRAFICO_MENU_ROL database table.
 * 
 */
@Entity
@Table(name="TP_TRAFICO_MENU_ROL")
@NamedQuery(name="TpTraficoMenuRol.findAll", query="SELECT t FROM TpTraficoMenuRol t")
public class TpTraficoMenuRol implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name="ID_MENU_ROL")
	private int idMenuRol;

	//bi-directional many-to-one association to CatMenu
	@ManyToOne
	@JoinColumn(name="ID_MENU")
	private CatMenu catMenu;

	//bi-directional many-to-one association to CatRol
	@ManyToOne
	@JoinColumn(name="ID_ROL")
	private CatRol catRol;

	public TpTraficoMenuRol() {
	}

	public int getIdMenuRol() {
		return this.idMenuRol;
	}

	public void setIdMenuRol(int idMenuRol) {
		this.idMenuRol = idMenuRol;
	}

	public CatMenu getCatMenu() {
		return this.catMenu;
	}

	public void setCatMenu(CatMenu catMenu) {
		this.catMenu = catMenu;
	}

	public CatRol getCatRol() {
		return this.catRol;
	}

	public void setCatRol(CatRol catRol) {
		this.catRol = catRol;
	}

}