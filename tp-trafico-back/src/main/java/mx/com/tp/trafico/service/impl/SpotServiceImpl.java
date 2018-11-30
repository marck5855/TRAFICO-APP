package mx.com.tp.trafico.service.impl;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.expression.ParseException;
import org.springframework.stereotype.Service;

import mx.com.tp.trafico.dao.ClienteDAO;
import mx.com.tp.trafico.dao.SpotDAO;
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
import mx.com.tp.trafico.entity.TpTraficoCliente;
import mx.com.tp.trafico.entity.TpTraficoSpot;
import mx.com.tp.trafico.service.SpotService;

@Service
public class SpotServiceImpl implements SpotService {
	final static Logger log = Logger.getLogger(CanalServiceImpl.class);

	@Autowired
	public SpotDAO spotDAO;

	@Autowired
	public ClienteDAO clienteDao;

	@Override
	public ActualizaSpotDTOResponse actualizarSpot(ActualizaSpotDTORequest request, Long idspot) {
		boolean success = false;
		TpTraficoSpot spot = null;
		try {
			boolean existe = false;
			existe = spotDAO.existsById(idspot);
			if (existe == true) {
				spot = spotDAO.findById(idspot).orElse(null);
				spot.setAlias(request.getAlias());
				spot.setCampania(request.getCampania());
				spot.setClasificacion(request.getClasificacion());
				spot.setDuracion(request.getDuracion());
				spot.setEstatus(request.getEstatus());
				spot.setFechaCreacion(request.getFechaCreacion());
				spot.setFechaEstreno(request.getFechaEstreno());
				spot.setFechaModificacion(request.getFechaModificacion());
				spot.setFechaRegistro(request.getFechaRegistro());
				spot.setFechaVigencia(request.getFechaVigencia());
				spot.setPrecio1a(request.getPrecio1a());
				spot.setPrecio1aa(request.getPrecio1aa());
				spot.setPrecio1aaa(request.getPrecio1aaa());
				spot.setPrecio1b(request.getPrecio1b());
				spot.setPrecio2a(request.getPrecio2a());
				spot.setPrecio2aa(request.getPrecio2aa());
				spot.setPrecio2aaa(request.getPrecio2aaa());
				spot.setPrecio2b(request.getPrecio2b());
				spot.setPrecio3a(request.getPrecio3a());
				spot.setPrecio3aa(request.getPrecio3aa());
				spot.setPrecio3aaa(request.getPrecio3aaa());
				spot.setPrecio3b(request.getPrecio3b());
				spot.setPrecio4a(request.getPrecio4a());
				spot.setPrecio4aa(request.getPrecio4aa());
				spot.setPrecio4aaa(request.getPrecio4aaa());
				spot.setPrecio4b(request.getPrecio4b());
				spot.setSeparador(request.getSeparador());
				spot.setVersion(request.getVersion());
				spot.setTpTraficoCliente(request.getTpTraficoCliente());
				spot.setCatPrefijo(request.getCatPrefijo());
				spotDAO.save(spot);
				success = true;
			}
		} catch (ParseException e) {
			e.printStackTrace();
		}
		return new ActualizaSpotDTOResponse(success);
	}

	@Override
	public ConsultaSpotDTOResponse listaSpots() {
		List<TpTraficoSpot> listaSpots = null;
		try {
			listaSpots = spotDAO.findAll();
		} catch (ParseException e) {
			e.printStackTrace();
		}
		return new ConsultaSpotDTOResponse(listaSpots);
	}

	@Override
	public BusquedaSpotDTOResponse busquedaSpotId(Long idspot) {
		boolean busqueda = false;
		TpTraficoSpot spot = null;
		try {
			boolean existe = false;
			existe = spotDAO.existsById(idspot);
			if (existe == true) {
				spot = spotDAO.findById(idspot).orElse(null);
				busqueda = true;
			}
		} catch (ParseException e) {
			e.printStackTrace();
		}
		return new BusquedaSpotDTOResponse(busqueda, spot);

	}

	@Override
	public EliminaSpotDTOResponse eliminarSpotId(Long idspot) {
		boolean eliminado = false;
		try {
			boolean existe = false;
			existe = spotDAO.existsById(idspot);
			if (existe == true) {
				spotDAO.deleteById(idspot);
				eliminado = true;
			}
		} catch (ParseException e) {
			e.printStackTrace();
		}
		return new EliminaSpotDTOResponse(eliminado);
	}

	@Override
	public GuardaSpotDTOResponse guardarSpot(GuardaSpotDTORequest request) {
		boolean guardado = false;
		try {
			spotDAO.save(request.getSpot());
			guardado = true;
		} catch (ParseException e) {
			e.printStackTrace();
		}
		return new GuardaSpotDTOResponse(guardado);
	}

	@Override
	public BusquedaSpotIngestadoDTOResponse busquedaSpotIngesta() {
		boolean guardado = false;
		List<TpTraficoSpot> listSpots = null;
		List<TpTraficoSpot> listaIngestados = new ArrayList<>();
		try {
			listSpots = spotDAO.findAll();
			for (TpTraficoSpot spot : listSpots) {
				if (spot.getEstatus().equals("INGESTADO")) {
					listaIngestados.add(spot);

				}
			}
		} catch (ParseException e) {
			e.printStackTrace();
		}
		return new BusquedaSpotIngestadoDTOResponse(listaIngestados, guardado);
	}

	@Override
	public BusquedaSpotClienteDTOResponse busquedaSpotCliente(BusquedaSpotClienteDTORequest request) {
		boolean busqueda = false;
		List<TpTraficoCliente> listClientes = new ArrayList<>();
		List<TpTraficoSpot> listSpots = null;
		List<TpTraficoSpot> listaSpotsClientes = null;
		try {
			listClientes = clienteDao.findAll();
			for (TpTraficoCliente cliente : listClientes) {
				if (cliente.getNombre().equals(request.getNombreCliente())) {
					listSpots = spotDAO.findAll();
					for (TpTraficoSpot spot : listSpots) {
						if (spot.getTpTraficoCliente().equals(cliente));
							listaSpotsClientes.add(spot);
							busqueda = true;
					}
				}
			}

		} catch (ParseException e) {
			e.printStackTrace();
		}
		return new BusquedaSpotClienteDTOResponse(listaSpotsClientes, busqueda);
	}

}
