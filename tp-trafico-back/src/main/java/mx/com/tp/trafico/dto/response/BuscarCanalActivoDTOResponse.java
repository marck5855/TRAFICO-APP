package mx.com.tp.trafico.dto.response;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

public class BuscarCanalActivoDTOResponse implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 7918557273945380868L;
	public List<String> listNombCanales = new ArrayList<String>();
	
	public BuscarCanalActivoDTOResponse(List<String> listNombCanales) {
		this.listNombCanales = listNombCanales;
	}

	public List<String> getListNombCanales() {
		return listNombCanales;
	}

	public void setListNombCanales(List<String> listNombCanales) {
		this.listNombCanales = listNombCanales;
	}
	
	
}
