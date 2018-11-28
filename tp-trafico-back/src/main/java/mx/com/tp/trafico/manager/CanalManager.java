package mx.com.tp.trafico.manager;

import java.util.List;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import mx.com.tp.trafico.dto.request.ActualizaCanalDTORequest;
import mx.com.tp.trafico.dto.request.GuardaCanalDTORequest;
import mx.com.tp.trafico.dto.response.ActualizaCanalDTOResponse;
import mx.com.tp.trafico.dto.response.BusquedaCanalDTOResponse;
import mx.com.tp.trafico.dto.response.ConsultaCanalDTOResponse;
import mx.com.tp.trafico.dto.response.EliminaCanalDTOResponse;
import mx.com.tp.trafico.dto.response.GuardaCanalDTOResponse;
import mx.com.tp.trafico.entity.TpTraficoCanal;
import mx.com.tp.trafico.service.CanalService;

@Component
public class CanalManager {
	final static Logger log = Logger.getLogger(CanalManager.class);

	@Autowired
	private CanalService canalService;

	public ActualizaCanalDTOResponse actualizarCanal(ActualizaCanalDTORequest request, Long idCanal) {
		boolean success = false;
		try {
			TpTraficoCanal Ecanal = canalService.findByIdCanal(idCanal);
			Ecanal.setCortes(request.getCortes());
			Ecanal.setEstatus(request.getEstatus());
			Ecanal.setFechaModificacion(request.getFechaModificacion());
			Ecanal.setIdTp(request.getIdTp());
			Ecanal.setNombre(request.getNombre());
			Ecanal.setTipoCanal(request.getTipoCanal());
			Ecanal.setTipoVideo(request.getTipoVideo());
			canalService.updateCanal(Ecanal);
			success = true;
		} catch (Exception ex) {
			log.error("Error:" + ex);
		}
		return new ActualizaCanalDTOResponse(success);
	}

	public ConsultaCanalDTOResponse listaCanales() {
		List<TpTraficoCanal> listaCanales = null;
		try {
			listaCanales = canalService.findAll();
		} catch (Exception ex) {
			log.error(ex);
		}
		return new ConsultaCanalDTOResponse(listaCanales);
	}

	public BusquedaCanalDTOResponse busquedaCanalId(Long idCanal) {
		boolean busqueda = false;
		TpTraficoCanal Ecanal = null;
		try {
			Ecanal = canalService.findByIdCanal(idCanal);
			if (Ecanal != null) {
				busqueda = true;
			}
		} catch (Exception ex) {
			log.error(ex);
		}
		return new BusquedaCanalDTOResponse(busqueda, Ecanal);

	}

	public EliminaCanalDTOResponse eliminarCanalId(Long id) {
		boolean eliminado = false;
		try {
			canalService.deleteCanal(id);
			eliminado = true;
		} catch (Exception ex) {
			log.error(ex);
		}
		return new EliminaCanalDTOResponse(eliminado);
	}

	public GuardaCanalDTOResponse guardarCanal(GuardaCanalDTORequest request) {
		boolean guardado = false;
		try {
			canalService.saveCanal(request.getCanal());
			guardado = true;
		} catch (Exception ex) {
			log.error(ex);
		}
		return new GuardaCanalDTOResponse(guardado);
	}
}
