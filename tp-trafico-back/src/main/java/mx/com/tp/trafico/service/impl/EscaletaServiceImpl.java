package mx.com.tp.trafico.service.impl;

import java.util.ArrayList;
import java.util.List;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.expression.ParseException;
import org.springframework.stereotype.Service;

import mx.com.tp.trafico.dao.EscaletaDAO;
import mx.com.tp.trafico.dto.request.ActualizaEscaletaDTORequest;
import mx.com.tp.trafico.dto.request.GuardaEscaletaDTORequest;
import mx.com.tp.trafico.dto.response.ActualizaEscaletaDTOResponse;
import mx.com.tp.trafico.dto.response.BusquedaEscaletaDTOResponse;
import mx.com.tp.trafico.dto.response.BusquedaEscaletaIdentTodosDTOResponse;
import mx.com.tp.trafico.dto.response.ConsultaEscaletaDTOResponse;
import mx.com.tp.trafico.dto.response.EliminaEscaletaDTOResponse;
import mx.com.tp.trafico.dto.response.GuardaEscaletaDTOResponse;
import mx.com.tp.trafico.entity.TpTraficoEscaleta;
import mx.com.tp.trafico.service.EscaletaService;

@Service
public class EscaletaServiceImpl implements EscaletaService {
	final Logger log = Logger.getLogger(EscaletaServiceImpl.class);

	@Autowired
	public EscaletaDAO escaletaDAO;

	@Override
	public ActualizaEscaletaDTOResponse actualizarEscaleta(ActualizaEscaletaDTORequest request, Long idEscaleta) {
		boolean success = false;
		TpTraficoEscaleta Escaleta = null;
		try {
			boolean existe = false;
			existe = escaletaDAO.existsById(idEscaleta);
			if (existe == true) {
				Escaleta = escaletaDAO.findById(idEscaleta).orElse(null);
				Escaleta.setBreack(request.getBreack());
				Escaleta.setCortes(request.getCortes());
				Escaleta.setFechaRegistro(request.getFechaRegistro());
				Escaleta.setFranja(request.getFranja());
				Escaleta.setHoraOrd(request.getHoraOrd());
				Escaleta.setHorario(request.getHorario());
				Escaleta.setIdentificador(request.getIdentificador());
				Escaleta.setPosicion(request.getPosicion());
				Escaleta.setTpTraficoSpot(request.getTpTraficoSpot());
				escaletaDAO.save(Escaleta);
				success = true;
			}
		} catch (ParseException e) {
			e.printStackTrace();
		}
		return new ActualizaEscaletaDTOResponse(success);
	}

	@Override
	public ConsultaEscaletaDTOResponse listaEscaletas() {
		List<TpTraficoEscaleta> listaEscaleta = null;
		try {
			listaEscaleta = escaletaDAO.findAll();
		} catch (ParseException e) {
			e.printStackTrace();
		}
		return new ConsultaEscaletaDTOResponse(listaEscaleta);
	}

	@Override
	public BusquedaEscaletaDTOResponse busquedaEscaletaId(Long idEscaleta) {
		boolean busqueda = false;
		TpTraficoEscaleta escaleta = null;
		try {
			boolean existe = false;
			existe = escaletaDAO.existsById(idEscaleta);
			if (existe == true) {
				escaleta = escaletaDAO.findById(idEscaleta).orElse(null);
				busqueda = true;
			}
		} catch (ParseException e) {
			e.printStackTrace();
		}
		return new BusquedaEscaletaDTOResponse(busqueda, escaleta);
	}

	@Override
	public EliminaEscaletaDTOResponse eliminarEscaletaId(Long idEscaleta) {
		boolean eliminado = false;
		try {
			escaletaDAO.deleteById(idEscaleta);
			eliminado = true;
		} catch (ParseException e) {
			e.printStackTrace();
		}
		return new EliminaEscaletaDTOResponse(eliminado);
	}

	@Override
	public GuardaEscaletaDTOResponse guardarEscaleta(GuardaEscaletaDTORequest request) {
		boolean guardado = false;
		try {
			escaletaDAO.save(request.getEscaleta());
			guardado = true;
		} catch (ParseException e) {
			e.printStackTrace();
		}
		return new GuardaEscaletaDTOResponse(guardado);
	}

	@Override
	public BusquedaEscaletaIdentTodosDTOResponse busquedaEscaletaIdentTodos(String identificador) {
		List<TpTraficoEscaleta> listEscaleta = null;
		List<TpTraficoEscaleta> listEsc = new ArrayList<TpTraficoEscaleta>();
		try {
			listEscaleta = escaletaDAO.findAll();

			for (TpTraficoEscaleta escaleta : listEscaleta) {
				if (escaleta.getIdentificador().equals(identificador)) {
					listEsc.add(escaleta);
				}
			}
		} catch (ParseException e) {
			e.printStackTrace();
		}
		return new BusquedaEscaletaIdentTodosDTOResponse(listEsc);
	}
}
