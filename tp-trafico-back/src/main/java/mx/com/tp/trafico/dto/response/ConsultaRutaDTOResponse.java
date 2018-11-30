package mx.com.tp.trafico.dto.response;

import java.io.Serializable;
import java.util.List;

import mx.com.tp.trafico.entity.TpTraficoConfiguracionRuta;

public class ConsultaRutaDTOResponse implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = -7217678511246518810L;
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