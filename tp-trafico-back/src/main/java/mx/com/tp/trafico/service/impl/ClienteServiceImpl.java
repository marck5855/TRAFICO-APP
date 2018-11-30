package mx.com.tp.trafico.service.impl;

import java.util.ArrayList;
import java.util.List;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.expression.ParseException;
import org.springframework.stereotype.Service;

import mx.com.tp.trafico.dao.ClienteDAO;
import mx.com.tp.trafico.dao.SpotDAO;
import mx.com.tp.trafico.dto.request.ActualizaClienteDTORequest;
import mx.com.tp.trafico.dto.request.GuardaClienteDTORequest;
import mx.com.tp.trafico.dto.response.ActualizaClienteDTOResponse;
import mx.com.tp.trafico.dto.response.BusquedaClienteDTOResponse;
import mx.com.tp.trafico.dto.response.BusquedaClienteSpotDTOResponse;
import mx.com.tp.trafico.dto.response.ConsultaClienteDTOResponse;
import mx.com.tp.trafico.dto.response.EliminaClienteDTOResponse;
import mx.com.tp.trafico.dto.response.GuardaClienteDTOResponse;
import mx.com.tp.trafico.entity.TpTraficoCliente;
import mx.com.tp.trafico.entity.TpTraficoSpot;
import mx.com.tp.trafico.service.ClienteService;

@Service
public class ClienteServiceImpl implements ClienteService {
	final Logger log = Logger.getLogger(ClienteServiceImpl.class);

	@Autowired
	public ClienteDAO clienteDAO;

	@Autowired
	public SpotDAO spotDAO;

	@Override
	public ConsultaClienteDTOResponse listaClientes() {
		List<TpTraficoCliente> listaClientes = null;
		try {
			listaClientes = clienteDAO.findAll();

		} catch (ParseException e) {
			e.printStackTrace();
		}

		return new ConsultaClienteDTOResponse(listaClientes);
	}

	@Override
	public GuardaClienteDTOResponse guardarCanal(GuardaClienteDTORequest request) {
		boolean guardado = false;
		try {
			clienteDAO.save(request.getCliente());
			guardado = true;
		} catch (ParseException e) {
			e.printStackTrace();
		}
		return new GuardaClienteDTOResponse(guardado);
	}

	@Override
	public BusquedaClienteDTOResponse busquedaClienteId(Long id) {
		boolean busqueda = false;
		TpTraficoCliente cliente = null;
		boolean existe = false;
		try {
			existe = clienteDAO.existsById(id);
			if (existe == true) {
				cliente = clienteDAO.findById(id).orElse(null);
				busqueda = true;
			}
		} catch (ParseException e) {
			e.printStackTrace();
		}
		return new BusquedaClienteDTOResponse(busqueda, cliente);
	}

	@Override
	public EliminaClienteDTOResponse eliminarClienteId(Long id) {
		boolean succes = false;
		boolean existe = false;
		try {
			existe = clienteDAO.existsById(id);
			if (existe == true) {
				clienteDAO.deleteById(id);
				succes = true;
			}
		} catch (ParseException e) {
			e.printStackTrace();
		}
		return new EliminaClienteDTOResponse(succes);

	}

	@Override
	public ActualizaClienteDTOResponse actualizaCliente(ActualizaClienteDTORequest request, Long id) {
		boolean succes = false;
		boolean existe = false;
		try {
			existe = clienteDAO.existsById(id);
			if (existe == true) {
				TpTraficoCliente cliente = clienteDAO.findById(id).orElse(null);
				cliente.setNombre(request.getNombre());
				cliente.setFechaModificacion(request.getFechaModificacion());
				cliente.setFechaRegistro(request.getFechaRegistro());
				clienteDAO.save(cliente);
				succes = true;
			}
		} catch (ParseException e) {
			e.printStackTrace();
		}
		return new ActualizaClienteDTOResponse(succes);
	}

	@Override
	public BusquedaClienteSpotDTOResponse busquedaClienteSpot() {
		boolean busqueda = false;
		List<TpTraficoSpot> listaSpots = null;
		List<String> nombreClientes = new ArrayList<>();
		TpTraficoCliente cliente = null;
		
		try {
			listaSpots = spotDAO.findAll();
			for (TpTraficoSpot spot : listaSpots) {
				cliente = spot.getTpTraficoCliente();
				nombreClientes.add(cliente.getNombre());
				busqueda = true;
			}

		} catch (

		ParseException e) {
			e.printStackTrace();
		}
		return new BusquedaClienteSpotDTOResponse(nombreClientes, busqueda);
	}
}
