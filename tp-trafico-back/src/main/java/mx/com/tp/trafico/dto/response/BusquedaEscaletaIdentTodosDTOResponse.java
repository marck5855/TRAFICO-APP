package mx.com.tp.trafico.dto.response;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonInclude;

import mx.com.tp.trafico.entity.TpTraficoCanal;
import mx.com.tp.trafico.entity.TpTraficoEscaleta;
import mx.com.tp.trafico.entity.TpTraficoSpot;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class BusquedaEscaletaIdentTodosDTOResponse {
	
	List<TpTraficoEscaleta> listEscaleta;
	
	public BusquedaEscaletaIdentTodosDTOResponse(List<TpTraficoEscaleta> listEscaleta) {
		this.listEscaleta = listEscaleta;
	}

	public List<TpTraficoEscaleta> getListEscaleta() {
		return listEscaleta;
	}

	public void setListEscaleta(List<TpTraficoEscaleta> listEscaleta) {
		this.listEscaleta = listEscaleta;
	}

}
