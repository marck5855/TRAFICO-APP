package mx.com.tp.trafico.entity;

import java.io.Serializable;
import javax.persistence.*;
import java.util.List;


/**
 * The persistent class for the TP_TRAFICO_USUARIO database table.
 * 
 */
@Entity
@Table(name="TP_TRAFICO_USUARIO")
@NamedQuery(name="TpTraficoUsuario.findAll", query="SELECT t FROM TpTraficoUsuario t")
public class TpTraficoUsuario implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name="ID_USUARIO")
	private Long idUsuario;

	@Column(name="NOMBRE")
	private String nombre;

	@Column(name="NUM_EMPLEADO")
	private int numEmpleado;

	@Column(name="PASSWORD")
	private String password;

	@Column(name="TURNO")
	private String turno;

	//bi-directional many-to-one association to TpTraficoPauta
//	@OneToMany(mappedBy="tpTraficoUsuario")
//	private List<TpTraficoPauta> tpTraficoPautas;

	//bi-directional many-to-many association to CatRol
//	@ManyToMany
//	@JoinTable(
//		name="TP_TRAFICO_USER_ROL"
//		, joinColumns={
//			@JoinColumn(name="ID_USUARIO")
//			}
//		, inverseJoinColumns={
//			@JoinColumn(name="ID_ROL")
//			}
//		)
//	private List<CatRol> catRols;

	public TpTraficoUsuario() {
	}

	public Long getIdUsuario() {
		return this.idUsuario;
	}

	public void setIdUsuario(Long idUsuario) {
		this.idUsuario = idUsuario;
	}

	public String getNombre() {
		return this.nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public int getNumEmpleado() {
		return this.numEmpleado;
	}

	public void setNumEmpleado(int numEmpleado) {
		this.numEmpleado = numEmpleado;
	}

	public String getPassword() {
		return this.password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getTurno() {
		return this.turno;
	}

	public void setTurno(String turno) {
		this.turno = turno;
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
//		tpTraficoPauta.setTpTraficoUsuario(this);
//
//		return tpTraficoPauta;
//	}
//
//	public TpTraficoPauta removeTpTraficoPauta(TpTraficoPauta tpTraficoPauta) {
//		getTpTraficoPautas().remove(tpTraficoPauta);
//		tpTraficoPauta.setTpTraficoUsuario(null);
//
//		return tpTraficoPauta;
//	}
//
//	public List<CatRol> getCatRols() {
//		return this.catRols;
//	}
//
//	public void setCatRols(List<CatRol> catRols) {
//		this.catRols = catRols;
//	}

}