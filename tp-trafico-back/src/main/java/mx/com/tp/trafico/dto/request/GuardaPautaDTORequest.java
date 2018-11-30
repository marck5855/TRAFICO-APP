package mx.com.tp.trafico.dto.request;

import java.io.Serializable;

import mx.com.tp.trafico.entity.TpTraficoPauta;

public class GuardaPautaDTORequest implements Serializable {

	private static final long serialVersionUID = -8354259175603930632L;

	private TpTraficoPauta pauta;

	public TpTraficoPauta getPauta() {
		return pauta;
	}

	public void setPauta(TpTraficoPauta pauta) {
		this.pauta = pauta;
	}

}
