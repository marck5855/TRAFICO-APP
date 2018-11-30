package mx.com.tp.trafico.dto.response;

import java.io.Serializable;
import java.util.List;

import mx.com.tp.trafico.entity.CatPrefijo;

public class ConsultaPrefijoDTOResponse implements Serializable{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 8031444698967670581L;
	private List<CatPrefijo> prefijo;

	public ConsultaPrefijoDTOResponse(List<CatPrefijo> prefijo) {
		this.prefijo = prefijo;
	}

	public List<CatPrefijo> getPrefijo() {
		return prefijo;
	}

	public void setPrefijo(List<CatPrefijo> prefijo) {
		this.prefijo = prefijo;
	}
	
}
