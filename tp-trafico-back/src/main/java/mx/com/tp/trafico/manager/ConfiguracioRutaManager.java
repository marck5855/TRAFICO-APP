package mx.com.tp.trafico.manager;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import mx.com.tp.trafico.dto.request.ActualizaRutaDTORequest;
import mx.com.tp.trafico.dto.request.GuardaRutaDTORequest;
import mx.com.tp.trafico.dto.response.ActualizaRutaDTOResponse;
import mx.com.tp.trafico.dto.response.BusquedaRutaDTOResponse;
import mx.com.tp.trafico.dto.response.ConsultaRutaDTOResponse;
import mx.com.tp.trafico.dto.response.EliminarRutaDTOResponse;
import mx.com.tp.trafico.dto.response.GuardaRutaDTOResponse;
import mx.com.tp.trafico.entity.TpTraficoConfiguracionRuta;
import mx.com.tp.trafico.service.ConfiguracionRutaService;

@Component
public class ConfiguracioRutaManager {

	@Autowired
	public ConfiguracionRutaService configuracionRutaService;

	public ConsultaRutaDTOResponse consultaRuta() {
		List<TpTraficoConfiguracionRuta> listRuta = null;
		try {
			listRuta = configuracionRutaService.findAll();
		} catch (Exception ex) {

		}
		return new ConsultaRutaDTOResponse(listRuta);
	}

	public GuardaRutaDTOResponse guardaRuta(GuardaRutaDTORequest request) {
		boolean success = false;
		try {
			configuracionRutaService.save(request.getRuta());
			success = true;
		} catch (Exception ex) {

		}
		return new GuardaRutaDTOResponse(success);

	}

	public BusquedaRutaDTOResponse buscaRuta(Long id) {
		boolean success = false;
		TpTraficoConfiguracionRuta ruta = null;
		try {
			ruta = configuracionRutaService.findById(id);
			success = true;
		} catch (Exception ex) {

		}
		return new BusquedaRutaDTOResponse(success, ruta);

	}

	public ActualizaRutaDTOResponse actualizaRuta(ActualizaRutaDTORequest request, Long id) {
		TpTraficoConfiguracionRuta ruta = null;
		boolean success = false;
		try {
			ruta = configuracionRutaService.findById(id);
			ruta.setPhat(request.getPhat());
			ruta.setDescripcion(request.getDescripcion());
			configuracionRutaService.save(ruta);
			if (ruta != null) {
				success = true;
			}
		} catch (Exception ex) {

		}
		return new ActualizaRutaDTOResponse(success);

	}

	public EliminarRutaDTOResponse eliminaRuta(Long id) {
		boolean success = false;
		try {
			configuracionRutaService.delete(id);
			success = true;
		} catch (Exception ex) {

		}
		return new EliminarRutaDTOResponse(success);

	}
}
