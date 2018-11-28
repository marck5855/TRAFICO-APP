package mx.com.tp.trafico.dto.request;

import java.sql.Time;
import java.util.Date;

public class ActualizaUsuarioDTORequest extends SerializableRequest {

	private String nombre;
	private int numEmpleado;
	private String password;
	private String turno;

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public int getNumEmpleado() {
		return numEmpleado;
	}

	public void setNumEmpleado(int numEmpleado) {
		this.numEmpleado = numEmpleado;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getTurno() {
		return turno;
	}

	public void setTurno(String turno) {
		this.turno = turno;
	}
}
