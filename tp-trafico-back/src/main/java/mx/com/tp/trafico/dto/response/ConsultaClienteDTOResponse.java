package mx.com.tp.trafico.dto.response;

import java.io.Serializable;
import java.util.List;

import mx.com.tp.trafico.entity.TpTraficoCliente;

public class ConsultaClienteDTOResponse implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 282523714955571306L;
	private List<TpTraficoCliente> clientes;

	public ConsultaClienteDTOResponse (List <TpTraficoCliente> clientes) {
		this.clientes = clientes;
	}
	
	public List<TpTraficoCliente> getListaClientes() {
		return clientes;
	}

	public void setListaClientes(List<TpTraficoCliente> clientes) {
		this.clientes = clientes;
	}
}
