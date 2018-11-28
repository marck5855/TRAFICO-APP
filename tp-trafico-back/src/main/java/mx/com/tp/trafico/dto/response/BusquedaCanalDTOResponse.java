package mx.com.tp.trafico.dto.response;

import com.fasterxml.jackson.annotation.JsonInclude;

import mx.com.tp.trafico.entity.TpTraficoCanal;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class BusquedaCanalDTOResponse {
	
	TpTraficoCanal canal;
	protected boolean busqueda;
	
	public BusquedaCanalDTOResponse(boolean busqueda, TpTraficoCanal canal) {
		this.busqueda = busqueda;
		this.canal = canal;
	}

	public TpTraficoCanal getCanal() {
		return canal;
	}

	public void setCanal(TpTraficoCanal canal) {
		this.canal = canal;
	}

	public boolean isSuccess() {
		return busqueda;
	}

	public void setSuccess(boolean busqueda) {
		this.busqueda = busqueda;
	}
	
	
}
