package mx.com.tp.trafico.manager;

import java.util.List;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import mx.com.tp.trafico.dto.request.ActualizaSpotDTORequest;
import mx.com.tp.trafico.dto.request.GuardaSpotDTORequest;
import mx.com.tp.trafico.dto.response.ActualizaSpotDTOResponse;
import mx.com.tp.trafico.dto.response.BusquedaSpotDTOResponse;
import mx.com.tp.trafico.dto.response.ConsultaSpotDTOResponse;
import mx.com.tp.trafico.dto.response.EliminaSpotDTOResponse;
import mx.com.tp.trafico.dto.response.GuardaSpotDTOResponse;
import mx.com.tp.trafico.entity.TpTraficoSpot;
import mx.com.tp.trafico.service.SpotService;

@Component
public class SpotManager {
	final static Logger log = Logger.getLogger(SpotManager.class);

	@Autowired
	private SpotService spotService;

	public ActualizaSpotDTOResponse actualizarSpot(ActualizaSpotDTORequest request, Long idspot) {
		boolean success = false;
		TpTraficoSpot spot = null;
		try {
			spot = spotService.findById(idspot);
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
			spot.setPathproxy(request.getPathproxy());
			spot.setPathtarget(request.getPathtarget());
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
			spotService.save(spot);
			success = true;
		} catch (Exception ex) {
			log.error("Error:" + ex);
		}
		return new ActualizaSpotDTOResponse(success);
	}

	public ConsultaSpotDTOResponse listaSpots() {
		List<TpTraficoSpot> listaSpots = null;
		try {
			listaSpots = spotService.findAll();
		} catch (Exception ex) {
			log.error(ex);
		}
		return new ConsultaSpotDTOResponse(listaSpots);
	}

	public BusquedaSpotDTOResponse busquedaSpotId(Long idspot) {
		boolean busqueda = false;
		TpTraficoSpot spot = null;
		try {
			spot = spotService.findById(idspot);
			busqueda = true;
		} catch (Exception ex) {
			log.error(ex);
		}
		return new BusquedaSpotDTOResponse(busqueda, spot);

	}

	public EliminaSpotDTOResponse eliminarSpotId(Long idspot) {
		boolean eliminado = false;
		try {
			spotService.delete(idspot);
			eliminado = true;
		} catch (Exception ex) {
			log.error(ex);
		}
		return new EliminaSpotDTOResponse(eliminado);
	}

	public GuardaSpotDTOResponse guardarSpot(GuardaSpotDTORequest request) {
		boolean guardado = false;
		try {
			spotService.save(request.getSpot());
			guardado = true;
		} catch (Exception ex) {
			log.error(ex);
		}
		return new GuardaSpotDTOResponse(guardado);
	}
	

}
