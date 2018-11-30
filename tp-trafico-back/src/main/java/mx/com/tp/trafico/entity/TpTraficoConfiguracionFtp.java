package mx.com.tp.trafico.entity;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the TP_TRAFICO_CONFIGURACION_FTP database table.
 * 
 */
@Entity
@Table(name="TP_TRAFICO_CONFIGURACION_FTP")
@NamedQuery(name="TpTraficoConfiguracionFtp.findAll", query="SELECT t FROM TpTraficoConfiguracionFtp t")
public class TpTraficoConfiguracionFtp implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name="ID_CONFIGURACION_FTP")
	private Long idConfiguracionFtp;

	@Column(name="IP_SERVIDOR")
	private String ipServidor;

	@Column(name="PASSWORD")
	private String password;

	@Column(name="USUARIO")
	private String usuario;

	public TpTraficoConfiguracionFtp() {
	}

	public Long getIdConfiguracionFtp() {
		return this.idConfiguracionFtp;
	}

	public void setIdConfiguracionFtp(Long idConfiguracionFtp) {
		this.idConfiguracionFtp = idConfiguracionFtp;
	}

	public String getIpServidor() {
		return this.ipServidor;
	}

	public void setIpServidor(String ipServidor) {
		this.ipServidor = ipServidor;
	}

	public String getPassword() {
		return this.password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getUsuario() {
		return this.usuario;
	}

	public void setUsuario(String usuario) {
		this.usuario = usuario;
	}

}