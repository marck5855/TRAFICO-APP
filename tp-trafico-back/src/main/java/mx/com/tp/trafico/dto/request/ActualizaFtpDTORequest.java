package mx.com.tp.trafico.dto.request;

import java.io.Serializable;

public class ActualizaFtpDTORequest implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = -4533419799219845064L;
	private String ipServidor;
	private String password;
	private String usuario;
	
	public String getIpServidor() {
		return ipServidor;
	}
	public void setIpServidor(String ipServidor) {
		this.ipServidor = ipServidor;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getUsuario() {
		return usuario;
	}
	public void setUsuario(String usuario) {
		this.usuario = usuario;
	}

	
}
