package mx.com.tp.trafico.dto.request;

import java.io.Serializable;

import mx.com.tp.trafico.entity.TpTraficoEscaleta;

public class GuardaEscaletaDTORequest implements Serializable {

	private static final long serialVersionUID = -8354259175603930632L;

	private TpTraficoEscaleta escaleta;

	public TpTraficoEscaleta getEscaleta() {
		return escaleta;
	}

	public void setEscaleta(TpTraficoEscaleta escaleta) {
		this.escaleta = escaleta;
	}
}
