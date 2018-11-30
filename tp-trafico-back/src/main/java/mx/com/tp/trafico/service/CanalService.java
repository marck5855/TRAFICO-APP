package mx.com.tp.trafico.service;

import mx.com.tp.trafico.dto.request.ActualizaCanalDTORequest;
import mx.com.tp.trafico.dto.request.GuardaCanalDTORequest;
import mx.com.tp.trafico.dto.response.ActualizaCanalDTOResponse;
import mx.com.tp.trafico.dto.response.BuscarCanalActivoDTOResponse;
import mx.com.tp.trafico.dto.response.BusquedaCanalDTOResponse;
import mx.com.tp.trafico.dto.response.ConsultaCanalDTOResponse;
import mx.com.tp.trafico.dto.response.EliminaCanalDTOResponse;
import mx.com.tp.trafico.dto.response.GuardaCanalDTOResponse;

public interface CanalService {

	public ActualizaCanalDTOResponse actualizarCanal(ActualizaCanalDTORequest request, Long idCanal);
	
	public ConsultaCanalDTOResponse listaCanales();
	
	public BusquedaCanalDTOResponse busquedaCanalId(Long idCanal);
	
	public EliminaCanalDTOResponse eliminarCanalId(Long idCanal);
	
	public GuardaCanalDTOResponse guardarCanal(GuardaCanalDTORequest request);
	
	public BuscarCanalActivoDTOResponse busqudaCanalActivo();

}
