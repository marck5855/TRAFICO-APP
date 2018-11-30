package mx.com.tp.trafico.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.expression.ParseException;
import org.springframework.stereotype.Service;

import mx.com.tp.trafico.dao.ConfiguracionRutaDAO;
import mx.com.tp.trafico.dto.request.ActualizaRutaDTORequest;
import mx.com.tp.trafico.dto.request.GuardaRutaDTORequest;
import mx.com.tp.trafico.dto.response.ActualizaRutaDTOResponse;
import mx.com.tp.trafico.dto.response.BusquedaRutaDTOResponse;
import mx.com.tp.trafico.dto.response.ConsultaRutaDTOResponse;
import mx.com.tp.trafico.dto.response.EliminarRutaDTOResponse;
import mx.com.tp.trafico.dto.response.GuardaRutaDTOResponse;
import mx.com.tp.trafico.entity.TpTraficoConfiguracionRuta;
import mx.com.tp.trafico.service.ConfiguracionRutaService;

@Service
public class ConfiguracionRutaServiceImpl implements ConfiguracionRutaService {

	@Autowired
	public ConfiguracionRutaDAO configuracionRutaDAO;

	@Override
	public ConsultaRutaDTOResponse consultaRuta() {
		List<TpTraficoConfiguracionRuta> listRuta = null;
		try {
			listRuta = configuracionRutaDAO.findAll();
		} catch (ParseException e) {
			e.printStackTrace();
		}
		return new ConsultaRutaDTOResponse(listRuta);
	}

	@Override
	public GuardaRutaDTOResponse guardaRuta(GuardaRutaDTORequest request) {
		boolean success = false;
		try {
			configuracionRutaDAO.save(request.getRuta());
			success = true;
		} catch (ParseException e) {
			e.printStackTrace();
		}
		return new GuardaRutaDTOResponse(success);

	}

	@Override
	public BusquedaRutaDTOResponse buscaRuta(Long id) {
		boolean success = false;
		TpTraficoConfiguracionRuta ruta = null;
		try {
			boolean existe = false;
			existe = configuracionRutaDAO.existsById(id);
			if (existe == true) {
				ruta = configuracionRutaDAO.findById(id).orElse(null);
				success = true;
			}
		} catch (ParseException e) {
			e.printStackTrace();
		}
		return new BusquedaRutaDTOResponse(success, ruta);

	}

	@Override
	public ActualizaRutaDTOResponse actualizaRuta(ActualizaRutaDTORequest request, Long id) {
		TpTraficoConfiguracionRuta ruta = null;
		boolean success = false;
		try {
			boolean existe = false;
			existe = configuracionRutaDAO.existsById(id);
			if (existe == true) {
				ruta = configuracionRutaDAO.findById(id).orElse(null);
				ruta.setPhat(request.getPhat());
				ruta.setDescripcion(request.getDescripcion());
				configuracionRutaDAO.save(ruta);
				success = true;
			}
		} catch (ParseException e) {
			e.printStackTrace();
		}
		return new ActualizaRutaDTOResponse(success);

	}

	@Override
	public EliminarRutaDTOResponse eliminaRuta(Long id) {
		boolean success = false;
		try {
			boolean existe = false;
			existe = configuracionRutaDAO.existsById(id);
			if (existe == true) {
				configuracionRutaDAO.deleteById(id);
				success = true;
			}
		} catch (ParseException e) {
			e.printStackTrace();
		}
		return new EliminarRutaDTOResponse(success);

	}
}
