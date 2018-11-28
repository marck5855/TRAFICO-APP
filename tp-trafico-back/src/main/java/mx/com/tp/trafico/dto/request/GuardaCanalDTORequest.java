package mx.com.tp.trafico.dto.request;

import java.io.Serializable;

import mx.com.tp.trafico.entity.TpTraficoCanal;

public class GuardaCanalDTORequest implements Serializable{

	private static final long serialVersionUID = -8354259175603930632L;
	
	private TpTraficoCanal canal;

	public TpTraficoCanal getCanal() {
		return canal;
	}

	public void setCanal(TpTraficoCanal canal) {
		this.canal = canal;
	}
}
