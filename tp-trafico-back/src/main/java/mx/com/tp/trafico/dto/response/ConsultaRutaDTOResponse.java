package mx.com.tp.trafico.dto.response;

import java.util.List;

import mx.com.tp.trafico.entity.TpTraficoCanal;
import mx.com.tp.trafico.entity.TpTraficoConfiguracionRuta;

public class ConsultaRutaDTOResponse {

	private List<TpTraficoConfiguracionRuta> rutas;

	public ConsultaRutaDTOResponse(List<TpTraficoConfiguracionRuta> rutas) {
		this.rutas = rutas;

	}

	public List<TpTraficoConfiguracionRuta> getRutas() {
		return rutas;
	}

	public void setRutas(List<TpTraficoConfiguracionRuta> rutas) {
		this.rutas = rutas;
	}
}