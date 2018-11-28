package mx.com.tp.trafico.manager;

import java.util.List;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import mx.com.tp.trafico.dto.request.ActualizaClienteDTORequest;
import mx.com.tp.trafico.dto.request.GuardaClienteDTORequest;
import mx.com.tp.trafico.dto.response.ActualizaClienteDTOResponse;
import mx.com.tp.trafico.dto.response.BusquedaClienteDTOResponse;
import mx.com.tp.trafico.dto.response.ConsultaClienteDTOResponse;
import mx.com.tp.trafico.dto.response.EliminaClienteDTOResponse;
import mx.com.tp.trafico.dto.response.GuardaClienteDTOResponse;
import mx.com.tp.trafico.entity.TpTraficoCliente;
import mx.com.tp.trafico.service.ClienteService;

@Component
public class ClienteManager {

	@Autowired
	private ClienteService clienteService;

	public ConsultaClienteDTOResponse listaClientes() {
		final Logger log = Logger.getLogger(ConsultaClienteDTOResponse.class);
		List<TpTraficoCliente> listaClientes = null;
		try {
			listaClientes = clienteService.finAll();

		} catch (Exception ex) {
			log.error("Error:" + ex);
		}

		return new ConsultaClienteDTOResponse(listaClientes);
	}

	public GuardaClienteDTOResponse guardarCanal(GuardaClienteDTORequest request) {
		boolean guardado = false;
		try {
			clienteService.saveCliente(request.getCliente());
			guardado = true;
		} catch (Exception ex) {

		}
		return new GuardaClienteDTOResponse(guardado);
	}

	public BusquedaClienteDTOResponse busquedaClienteId(Long id) {
		boolean busqueda = false;
		TpTraficoCliente cliente = null;
		try {
			if (id != null) {
				cliente = clienteService.findByIidCliente(id);
				busqueda = true;
			}
		} catch (Exception ex) {

		}
		return new BusquedaClienteDTOResponse(busqueda, cliente);
	}

	public EliminaClienteDTOResponse eliminarClienteId(Long id) {
		boolean succes = false;
		try {
			if (id != null) {
				clienteService.deleteCliente(id);
				succes = true;
			}
		} catch (Exception ex) {

		}
		return new EliminaClienteDTOResponse(succes);

	}

	public ActualizaClienteDTOResponse actualizaCliente(ActualizaClienteDTORequest request, Long id) {
		boolean succes = false;
		try {
			System.out.println("id-->" + id);
			TpTraficoCliente cliente = clienteService.findByIidCliente(id);
			cliente.setNombre(request.getNombre());
			cliente.setFechaModificacion(request.getFechaModificacion());
			cliente.setFechaRegistro(request.getFechaRegistro());
			clienteService.saveCliente(cliente);
			succes = true;
		} catch (Exception e) {

		}
		return new ActualizaClienteDTOResponse(succes);

	}
}
