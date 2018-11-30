package mx.com.tp.trafico.service;

import mx.com.tp.trafico.dto.request.ActualizaRutaDTORequest;
import mx.com.tp.trafico.dto.request.GuardaRutaDTORequest;
import mx.com.tp.trafico.dto.response.ActualizaRutaDTOResponse;
import mx.com.tp.trafico.dto.response.BusquedaRutaDTOResponse;
import mx.com.tp.trafico.dto.response.ConsultaRutaDTOResponse;
import mx.com.tp.trafico.dto.response.EliminarRutaDTOResponse;
import mx.com.tp.trafico.dto.response.GuardaRutaDTOResponse;

public interface ConfiguracionRutaService {

	public ConsultaRutaDTOResponse consultaRuta();

	public GuardaRutaDTOResponse guardaRuta(GuardaRutaDTORequest request);

	public BusquedaRutaDTOResponse buscaRuta(Long id);

	public ActualizaRutaDTOResponse actualizaRuta(ActualizaRutaDTORequest request, Long id);

	public EliminarRutaDTOResponse eliminaRuta(Long id);

}
