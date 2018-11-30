package mx.com.tp.trafico.service;

import mx.com.tp.trafico.dto.request.ActualizaUsuarioDTORequest;
import mx.com.tp.trafico.dto.request.GuardaUsuarioDTORequest;
import mx.com.tp.trafico.dto.response.ActualizaUsuarioDTOResponse;
import mx.com.tp.trafico.dto.response.BusquedaUsuarioDTOResponse;
import mx.com.tp.trafico.dto.response.ConsultaUsuarioDTOResponse;
import mx.com.tp.trafico.dto.response.EliminaUsuarioDTOResponse;
import mx.com.tp.trafico.dto.response.GuardaUsuarioDTOResponse;

public interface UsuarioService {

	public ConsultaUsuarioDTOResponse consultaUsuario();

	public GuardaUsuarioDTOResponse guardarUsuario(GuardaUsuarioDTORequest request);

	public BusquedaUsuarioDTOResponse buscarUsuarioId(Long id);

	public EliminaUsuarioDTOResponse eliminarUsuario(Long id);

	public ActualizaUsuarioDTOResponse actualizaUsuario(ActualizaUsuarioDTORequest request, Long id);

}
