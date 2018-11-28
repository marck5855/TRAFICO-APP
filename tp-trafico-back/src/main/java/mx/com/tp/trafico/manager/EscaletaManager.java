package mx.com.tp.trafico.manager;

import java.util.List;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import mx.com.tp.trafico.dto.request.ActualizaEscaletaDTORequest;
import mx.com.tp.trafico.dto.request.ActualizaSpotDTORequest;
import mx.com.tp.trafico.dto.request.GuardaEscaletaDTORequest;
import mx.com.tp.trafico.dto.request.GuardaSpotDTORequest;
import mx.com.tp.trafico.dto.response.ActualizaEscaletaDTOResponse;
import mx.com.tp.trafico.dto.response.ActualizaSpotDTOResponse;
import mx.com.tp.trafico.dto.response.BusquedaEscaletaDTOResponse;
import mx.com.tp.trafico.dto.response.BusquedaEscaletaIdentDTOResponse;
import mx.com.tp.trafico.dto.response.BusquedaEscaletaIdentTodosDTOResponse;
import mx.com.tp.trafico.dto.response.BusquedaSpotDTOResponse;
import mx.com.tp.trafico.dto.response.ConsultaEscaletaDTOResponse;
import mx.com.tp.trafico.dto.response.ConsultaSpotDTOResponse;
import mx.com.tp.trafico.dto.response.EliminaEscaletaDTOResponse;
import mx.com.tp.trafico.dto.response.EliminaSpotDTOResponse;
import mx.com.tp.trafico.dto.response.GuardaEscaletaDTOResponse;
import mx.com.tp.trafico.dto.response.GuardaSpotDTOResponse;
import mx.com.tp.trafico.entity.TpTraficoEscaleta;
import mx.com.tp.trafico.entity.TpTraficoSpot;
import mx.com.tp.trafico.service.EscaletaService;
import mx.com.tp.trafico.service.SpotService;

@Component
public class EscaletaManager {
	final static Logger log = Logger.getLogger(EscaletaManager.class);

	@Autowired
	private EscaletaService escaletaService;

	public ActualizaEscaletaDTOResponse actualizarEscaleta(ActualizaEscaletaDTORequest request, Long idEscaleta) {
		boolean success = false;
		TpTraficoEscaleta Escaleta = null;
		try {
			Escaleta = escaletaService.findById(idEscaleta);
			Escaleta.setBreack(request.getBreack());
			Escaleta.setCortes(request.getCortes());
			Escaleta.setFechaModificacion(request.getFechaModificacion());
			Escaleta.setFechaRegistro(request.getFechaRegistro());
			Escaleta.setFranja(request.getFranja());
			Escaleta.setHoraOrd(request.getHoraOrd());
			Escaleta.setHorario(request.getHorario());
			Escaleta.setIdentificador(request.getIdentificador());
			Escaleta.setPosicion(request.getPosicion());
			escaletaService.save(Escaleta);
			success = true;
		} catch (Exception ex) {
			log.error("Error:" + ex);
		}
		return new ActualizaEscaletaDTOResponse(success);
	}

	public ConsultaEscaletaDTOResponse listaEscaletas() {
		List<TpTraficoEscaleta> listaEscaleta = null;
		try {
			listaEscaleta = escaletaService.findAll();
		} catch (Exception ex) {
			log.error(ex);
		}
		return new ConsultaEscaletaDTOResponse(listaEscaleta);
	}

	public BusquedaEscaletaDTOResponse busquedaEscaletaId(Long idEscaleta) {
		boolean busqueda = false;
		TpTraficoEscaleta escaleta = null;
		try {
			escaleta = escaletaService.findById(idEscaleta);
			busqueda = true;
		} catch (Exception ex) {
			log.error(ex);
		}
		return new BusquedaEscaletaDTOResponse(busqueda, escaleta);

	}

	public EliminaEscaletaDTOResponse eliminarEscaletaId(Long idEscaleta) {
		boolean eliminado = false;
		try {
			escaletaService.delete(idEscaleta);
			eliminado = true;
		} catch (Exception ex) {
			log.error(ex);
		}
		return new EliminaEscaletaDTOResponse(eliminado);
	}

	public GuardaEscaletaDTOResponse guardarEscaleta(GuardaEscaletaDTORequest request) {
		boolean guardado = false;
		try {
			escaletaService.save(request.getEscaleta());
			guardado = true;
		} catch (Exception ex) {
			log.error(ex);
		}
		return new GuardaEscaletaDTOResponse(guardado);
	}
	
//	public BusquedaEscaletaIdentDTOResponse busquedaEscaletaIdent(String identificador) {
//		TpTraficoEscaleta escaleta = null;
//		boolean busqueda = false;
//		try {
//			escaleta = escaletaService.findByIdentificador(identificador);
//			busqueda = true;
//		}catch(Exception ex){
//			
//		}
//		
//		return new BusquedaEscaletaIdentDTOResponse(busqueda, escaleta);
//	}
//
//	public BusquedaEscaletaIdentTodosDTOResponse busquedaEscaletaIdentTodos(String identificador) {
//		List<TpTraficoEscaleta> listEscaletaIdentificador = null;
//		try {
//			listEscaletaIdentificador = escaletaService.findAllIdentificador(identificador);
//		}catch(Exception ex){
//			
//		}
//		return new BusquedaEscaletaIdentTodosDTOResponse(listEscaletaIdentificador);
//		
//	}
}
