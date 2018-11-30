package mx.com.tp.trafico.dto.request;

import java.io.Serializable;

import mx.com.tp.trafico.entity.TpTraficoCliente;

public class GuardaClienteDTORequest implements Serializable{

	private static final long serialVersionUID = -8354259175603930632L;
	
	private TpTraficoCliente cliente;

	public TpTraficoCliente getCliente() {
		return cliente;
	}

	public void setCliente(TpTraficoCliente cliente) {
		this.cliente = cliente;
	}
}
