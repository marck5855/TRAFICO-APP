package mx.com.tp.trafico.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.expression.ParseException;
import org.springframework.stereotype.Service;

import mx.com.tp.trafico.dao.UsuarioDAO;
import mx.com.tp.trafico.dto.request.ActualizaUsuarioDTORequest;
import mx.com.tp.trafico.dto.request.GuardaUsuarioDTORequest;
import mx.com.tp.trafico.dto.response.ActualizaUsuarioDTOResponse;
import mx.com.tp.trafico.dto.response.BusquedaUsuarioDTOResponse;
import mx.com.tp.trafico.dto.response.ConsultaUsuarioDTOResponse;
import mx.com.tp.trafico.dto.response.EliminaUsuarioDTOResponse;
import mx.com.tp.trafico.dto.response.GuardaUsuarioDTOResponse;
import mx.com.tp.trafico.entity.TpTraficoUsuario;
import mx.com.tp.trafico.service.UsuarioService;

@Service
public class UsuarioServiceImpl implements UsuarioService {

	@Autowired
	public UsuarioDAO usuarioDAO;

	@Override
	public ConsultaUsuarioDTOResponse consultaUsuario() {
		List<TpTraficoUsuario> listUsuario = null;
		try {
			listUsuario = usuarioDAO.findAll();
		} catch (ParseException e) {
			e.printStackTrace();
		}
		return new ConsultaUsuarioDTOResponse(listUsuario);

	}

	@Override
	public GuardaUsuarioDTOResponse guardarUsuario(GuardaUsuarioDTORequest request) {
		boolean success = false;
		try {
			usuarioDAO.save(request.getUsuario());
			success = true;
		} catch (ParseException e) {
			e.printStackTrace();
		}
		return new GuardaUsuarioDTOResponse(success);

	}

	@Override
	public BusquedaUsuarioDTOResponse buscarUsuarioId(Long id) {
		boolean success = false;
		TpTraficoUsuario usuario = null;
		try {
			boolean existe = false;
			existe = usuarioDAO.existsById(id);
			if (existe == true) {
				usuario = usuarioDAO.findById(id).orElse(null);
				success = true;
			}
		} catch (ParseException e) {
			e.printStackTrace();
		}

		return new BusquedaUsuarioDTOResponse(success, usuario);

	}

	@Override
	public EliminaUsuarioDTOResponse eliminarUsuario(Long id) {
		boolean success = false;
		try {
			boolean existe = false;
			existe = usuarioDAO.existsById(id);
			if (existe == true) {
				usuarioDAO.deleteById(id);
				success = true;
			}
		} catch (ParseException e) {
			e.printStackTrace();
		}
		return new EliminaUsuarioDTOResponse(success);

	}

	@Override
	public ActualizaUsuarioDTOResponse actualizaUsuario(ActualizaUsuarioDTORequest request, Long id) {
		boolean success = false;
		TpTraficoUsuario usuario = null;
		try {
			boolean existe = false;
			existe = usuarioDAO.existsById(id);
			if (existe == true) {
			usuario = usuarioDAO.findById(id).orElse(null);
			usuario.setNombre(request.getNombre());
			usuario.setPassword(request.getPassword());
			usuario.setNumEmpleado(request.getNumEmpleado());
			usuario.setTurno(request.getTurno());
			usuarioDAO.save(usuario);
			success = true;
			}
		} catch (ParseException e) {
			e.printStackTrace();
		}
		return new ActualizaUsuarioDTOResponse(success);

	}

}
