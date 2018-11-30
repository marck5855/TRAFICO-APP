package mx.com.tp.trafico.dto.response;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import mx.com.tp.trafico.entity.TpTraficoPauta;

public class BusquedaPautaFechaDTOResponse implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 5688100022088163072L;

	public List<TpTraficoPauta> listPauta = new ArrayList<TpTraficoPauta>();
	boolean busqueda = false;

	public BusquedaPautaFechaDTOResponse(List<TpTraficoPauta> listPauta, boolean busqueda) {
		this.busqueda = busqueda;
		this.listPauta = listPauta;
	}

	public List<TpTraficoPauta> getListPauta() {
		return listPauta;
	}

	public void setListPauta(List<TpTraficoPauta> listPauta) {
		this.listPauta = listPauta;
	}

	public boolean isBusqueda() {
		return busqueda;
	}

	public void setBusqueda(boolean busqueda) {
		this.busqueda = busqueda;
	}

}
