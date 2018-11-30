package mx.com.tp.trafico.dto.response;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import mx.com.tp.trafico.entity.TpTraficoEscaleta;

public class BusquedaEscaletaIdentTodosDTOResponse implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = -2033098264207718723L;

	List<TpTraficoEscaleta> listEscaleta = new ArrayList<TpTraficoEscaleta>();

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
