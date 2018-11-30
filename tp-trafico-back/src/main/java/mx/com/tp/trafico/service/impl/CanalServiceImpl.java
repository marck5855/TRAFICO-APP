package mx.com.tp.trafico.service.impl;

import java.util.ArrayList;
import java.util.List;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.expression.ParseException;
import org.springframework.stereotype.Service;

import mx.com.tp.trafico.dao.CanalDAO;
import mx.com.tp.trafico.dto.request.ActualizaCanalDTORequest;
import mx.com.tp.trafico.dto.request.GuardaCanalDTORequest;
import mx.com.tp.trafico.dto.response.ActualizaCanalDTOResponse;
import mx.com.tp.trafico.dto.response.BuscarCanalActivoDTOResponse;
import mx.com.tp.trafico.dto.response.BusquedaCanalDTOResponse;
import mx.com.tp.trafico.dto.response.ConsultaCanalDTOResponse;
import mx.com.tp.trafico.dto.response.EliminaCanalDTOResponse;
import mx.com.tp.trafico.dto.response.GuardaCanalDTOResponse;
import mx.com.tp.trafico.entity.TpTraficoCanal;
import mx.com.tp.trafico.service.CanalService;

@Service
public class CanalServiceImpl implements CanalService {
	final static Logger log = Logger.getLogger(CanalServiceImpl.class);

	@Autowired
	private CanalDAO canalDAO;

	@Override
	public ActualizaCanalDTOResponse actualizarCanal(ActualizaCanalDTORequest request, Long idCanal) {
		boolean success = false;
		TpTraficoCanal Ecanal = null;
		try {
			boolean existe = false;
			existe = canalDAO.existsById(idCanal);
			if (existe == true) {
				Ecanal = canalDAO.findById(idCanal).orElse(null);
				Ecanal.setCortes(request.getCortes());
				Ecanal.setEstatus(request.getEstatus());
				Ecanal.setFechaModificacion(request.getFechaModificacion());
				Ecanal.setIdTp(request.getIdTp());
				Ecanal.setNombre(request.getNombre());
				Ecanal.setTipoCanal(request.getTipoCanal());
				Ecanal.setTipoVideo(request.getTipoVideo());
				canalDAO.save(Ecanal);
				success = true;
			}
		} catch (ParseException e) {
			e.printStackTrace();
		}
		return new ActualizaCanalDTOResponse(success);
	}

	@Override
	public ConsultaCanalDTOResponse listaCanales() {
		List<TpTraficoCanal> listaCanales = null;
		try {
			listaCanales = canalDAO.findAll();
		} catch (ParseException e) {
			e.printStackTrace();
		}
		return new ConsultaCanalDTOResponse(listaCanales);
	}

	@Override
	public BusquedaCanalDTOResponse busquedaCanalId(Long idCanal) {
		boolean busqueda = false;
		TpTraficoCanal Ecanal = null;
		try {
			boolean existe = false;
			existe = canalDAO.existsById(idCanal);
			if (existe == true) {
				Ecanal = canalDAO.findById(idCanal).orElse(null);
				busqueda = true;
			}
		} catch (ParseException e) {
			e.printStackTrace();
		}
		return new BusquedaCanalDTOResponse(busqueda, Ecanal);

	}

	@Override
	public EliminaCanalDTOResponse eliminarCanalId(Long idCanal) {
		boolean eliminado = false;
		try {
			boolean existe = false;
			existe = canalDAO.existsById(idCanal);
			if (existe == true) {
				canalDAO.deleteById(idCanal);
				eliminado = true;
			}
		} catch (ParseException e) {
			e.printStackTrace();
		}
		return new EliminaCanalDTOResponse(eliminado);
	}

	@Override
	public GuardaCanalDTOResponse guardarCanal(GuardaCanalDTORequest request) {
		boolean guardado = false;
		try {
			canalDAO.save(request.getCanal());
			guardado = true;
		} catch (ParseException e) {
			e.printStackTrace();
		}
		return new GuardaCanalDTOResponse(guardado);
	}

	@Override
	public BuscarCanalActivoDTOResponse busqudaCanalActivo() {
		List<TpTraficoCanal> listaCanales = new ArrayList<TpTraficoCanal>();
		List<String> activos = new ArrayList<String>();
		try {
			listaCanales = canalDAO.findAll();
			for (TpTraficoCanal canal : listaCanales) {
				if (canal.getEstatus() == 1) {
					activos.add(canal.getNombre());
				}
			}
		} catch (ParseException e) {
			e.printStackTrace();
		}
		return new BuscarCanalActivoDTOResponse(activos);
	}
}
