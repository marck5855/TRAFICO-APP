package mx.com.tp.trafico.dto.request;

import java.sql.Time;
import java.util.Date;

public class ActualizaFtpDTORequest extends SerializableRequest{

	private int ipServidor;
	private String password;
	private String usuario;
	
	public int getIpServidor() {
		return ipServidor;
	}
	public void setIpServidor(int ipServidor) {
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
