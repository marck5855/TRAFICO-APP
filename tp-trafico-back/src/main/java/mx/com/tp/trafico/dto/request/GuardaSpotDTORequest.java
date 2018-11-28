package mx.com.tp.trafico.dto.request;

import java.io.Serializable;

import mx.com.tp.trafico.entity.TpTraficoCanal;
import mx.com.tp.trafico.entity.TpTraficoConfiguracionFtp;
import mx.com.tp.trafico.entity.TpTraficoSpot;

public class GuardaSpotDTORequest implements Serializable {

	private static final long serialVersionUID = -8354259175603930632L;

	private TpTraficoSpot spot;

	public TpTraficoSpot getSpot() {
		return spot;
	}

	public void setSpot(TpTraficoSpot spot) {
		this.spot = spot;
	}

}
