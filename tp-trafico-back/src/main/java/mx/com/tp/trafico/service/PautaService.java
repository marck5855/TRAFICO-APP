package mx.com.tp.trafico.service;

import mx.com.tp.trafico.dto.request.ActualizaPautaDTORequest;
import mx.com.tp.trafico.dto.request.BusquedaFechasPautaDTORequest;
import mx.com.tp.trafico.dto.request.BusquedaPautaFechaDTORequeat;
import mx.com.tp.trafico.dto.request.GuardaPautaDTORequest;
import mx.com.tp.trafico.dto.response.ActualizaPautaTOResponse;
import mx.com.tp.trafico.dto.response.BusquedaFechaPautaDTOResponse;
import mx.com.tp.trafico.dto.response.BusquedaPautaDTOResponse;
import mx.com.tp.trafico.dto.response.BusquedaPautaFechaDTOResponse;
import mx.com.tp.trafico.dto.response.ConsultaPautaDTOResponse;
import mx.com.tp.trafico.dto.response.EliminaPautaDTOResponse;
import mx.com.tp.trafico.dto.response.GuardaPautaDTOResponse;

public interface PautaService {

	public ActualizaPautaTOResponse actualizarPauta(ActualizaPautaDTORequest request, Long idPauta);

	public ConsultaPautaDTOResponse listaPautas();

	public BusquedaPautaDTOResponse busquedaPautaId(Long idPauta);

	public EliminaPautaDTOResponse eliminarPautaId(Long idPauta);

	public GuardaPautaDTOResponse guardarPauta(GuardaPautaDTORequest request);

	public BusquedaFechaPautaDTOResponse busquedaFechaPauta(BusquedaFechasPautaDTORequest request);

	public BusquedaPautaFechaDTOResponse busquedaPautaFecha(BusquedaPautaFechaDTORequeat request);
}
