package mx.com.tp.trafico.service;

import mx.com.tp.trafico.dto.request.ActualizaEscaletaDTORequest;
import mx.com.tp.trafico.dto.request.GuardaEscaletaDTORequest;
import mx.com.tp.trafico.dto.response.ActualizaEscaletaDTOResponse;
import mx.com.tp.trafico.dto.response.BusquedaEscaletaDTOResponse;
import mx.com.tp.trafico.dto.response.BusquedaEscaletaIdentTodosDTOResponse;
import mx.com.tp.trafico.dto.response.ConsultaEscaletaDTOResponse;
import mx.com.tp.trafico.dto.response.EliminaEscaletaDTOResponse;
import mx.com.tp.trafico.dto.response.GuardaEscaletaDTOResponse;

public interface EscaletaService {

	public ActualizaEscaletaDTOResponse actualizarEscaleta(ActualizaEscaletaDTORequest request, Long idEscaleta);

	public ConsultaEscaletaDTOResponse listaEscaletas();

	public BusquedaEscaletaDTOResponse busquedaEscaletaId(Long idEscaleta);

	public EliminaEscaletaDTOResponse eliminarEscaletaId(Long idEscaleta);

	public GuardaEscaletaDTOResponse guardarEscaleta(GuardaEscaletaDTORequest request);

	public BusquedaEscaletaIdentTodosDTOResponse busquedaEscaletaIdentTodos(String identificador);

}
