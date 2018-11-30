package mx.com.tp.trafico.service;

import mx.com.tp.trafico.dto.request.ActualizaSpotDTORequest;
import mx.com.tp.trafico.dto.request.BusquedaSpotClienteDTORequest;
import mx.com.tp.trafico.dto.request.GuardaSpotDTORequest;
import mx.com.tp.trafico.dto.response.ActualizaSpotDTOResponse;
import mx.com.tp.trafico.dto.response.BusquedaSpotClienteDTOResponse;
import mx.com.tp.trafico.dto.response.BusquedaSpotDTOResponse;
import mx.com.tp.trafico.dto.response.BusquedaSpotIngestadoDTOResponse;
import mx.com.tp.trafico.dto.response.ConsultaSpotDTOResponse;
import mx.com.tp.trafico.dto.response.EliminaSpotDTOResponse;
import mx.com.tp.trafico.dto.response.GuardaSpotDTOResponse;

public interface SpotService {

	public ActualizaSpotDTOResponse actualizarSpot(ActualizaSpotDTORequest request, Long idspot);

	public ConsultaSpotDTOResponse listaSpots();

	public BusquedaSpotDTOResponse busquedaSpotId(Long idspot);

	public EliminaSpotDTOResponse eliminarSpotId(Long idspot);

	public GuardaSpotDTOResponse guardarSpot(GuardaSpotDTORequest request);
	
	public BusquedaSpotIngestadoDTOResponse busquedaSpotIngesta();
	
	public BusquedaSpotClienteDTOResponse busquedaSpotCliente(BusquedaSpotClienteDTORequest request);
}
