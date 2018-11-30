package mx.com.tp.trafico.service;

import mx.com.tp.trafico.dto.request.ActualizaClienteDTORequest;
import mx.com.tp.trafico.dto.request.GuardaClienteDTORequest;
import mx.com.tp.trafico.dto.response.ActualizaClienteDTOResponse;
import mx.com.tp.trafico.dto.response.BusquedaClienteDTOResponse;
import mx.com.tp.trafico.dto.response.BusquedaClienteSpotDTOResponse;
import mx.com.tp.trafico.dto.response.ConsultaClienteDTOResponse;
import mx.com.tp.trafico.dto.response.EliminaClienteDTOResponse;
import mx.com.tp.trafico.dto.response.GuardaClienteDTOResponse;

public interface ClienteService {

	public ConsultaClienteDTOResponse listaClientes();

	public GuardaClienteDTOResponse guardarCanal(GuardaClienteDTORequest request);

	public BusquedaClienteDTOResponse busquedaClienteId(Long id);

	public EliminaClienteDTOResponse eliminarClienteId(Long id);

	public ActualizaClienteDTOResponse actualizaCliente(ActualizaClienteDTORequest request, Long id);

	public BusquedaClienteSpotDTOResponse busquedaClienteSpot();
}
