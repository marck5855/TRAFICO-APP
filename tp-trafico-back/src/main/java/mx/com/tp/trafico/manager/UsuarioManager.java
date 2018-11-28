package mx.com.tp.trafico.manager;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import mx.com.tp.trafico.dto.request.ActualizaUsuarioDTORequest;
import mx.com.tp.trafico.dto.request.GuardaUsuarioDTORequest;
import mx.com.tp.trafico.dto.response.ActualizaUsuarioDTOResponse;
import mx.com.tp.trafico.dto.response.BusquedaUsuarioDTOResponse;
import mx.com.tp.trafico.dto.response.ConsultaUsuarioDTOResponse;
import mx.com.tp.trafico.dto.response.EliminaUsuarioDTOResponse;
import mx.com.tp.trafico.dto.response.GuardaUsuarioDTOResponse;
import mx.com.tp.trafico.entity.TpTraficoUsuario;
import mx.com.tp.trafico.service.UsuarioService;

@Component
public class UsuarioManager {

	@Autowired
	public UsuarioService UsuarioService;

	public ConsultaUsuarioDTOResponse consultaUsuario() {
		List<TpTraficoUsuario> listUsuario = null;
		try {
			listUsuario = UsuarioService.finAll();
		} catch (Exception ex) {

		}
		return new ConsultaUsuarioDTOResponse(listUsuario);

	}

	public GuardaUsuarioDTOResponse guardarUsuario(GuardaUsuarioDTORequest request) {
		boolean success = false;
		try {
			UsuarioService.saveUsuario(request.getUsuario());
			success = true;
		} catch (Exception ex) {

		}
		return new GuardaUsuarioDTOResponse(success);

	}

	public BusquedaUsuarioDTOResponse buscarUsuarioId(Long id) {
		boolean success = false;
		TpTraficoUsuario usuario = null;
		try {
			usuario = UsuarioService.findByIidUsuario(id);
			if (usuario != null) {
				success = true;
			}
		} catch (Exception ex) {

		}

		return new BusquedaUsuarioDTOResponse(success, usuario);

	}

	public EliminaUsuarioDTOResponse eliminarUsuario(Long id) {
		boolean success = false;

		try {
			UsuarioService.deleteUsuario(id);
			success = true;
		} catch (Exception ex) {

		}
		return new EliminaUsuarioDTOResponse(success);

	}

	public ActualizaUsuarioDTOResponse actualizaUsuario(ActualizaUsuarioDTORequest request, Long id) {
		boolean success = false;
		TpTraficoUsuario usuario = null;
		try {
			System.out.println("request------------------------->" + request.getNombre());
			usuario = UsuarioService.findByIidUsuario(id);
			usuario.setNombre(request.getNombre());
			usuario.setPassword(request.getPassword());
			usuario.setNumEmpleado(request.getNumEmpleado());
			usuario.setTurno(request.getTurno());
			System.out.println("request------------------------->" + request.getNombre());
			System.out.println("USUARIO getNombre------------------------->" + usuario.getNombre());
			UsuarioService.saveUsuario(usuario);
			success = true;
		} catch (Exception ex) {

		}
		return new ActualizaUsuarioDTOResponse(success);

	}
}
