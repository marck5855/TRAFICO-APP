package mx.com.tp.trafico.dto.request;

import java.io.Serializable;

import mx.com.tp.trafico.entity.TpTraficoCliente;
import mx.com.tp.trafico.vo.ClienteVO;

public class GuardaClienteDTORequest implements Serializable{

	private static final long serialVersionUID = -8354259175603930632L;
	
//	private ClienteVO cliente;
	private TpTraficoCliente cliente;

	public TpTraficoCliente getCliente() {
		return cliente;
	}

	public void setCliente(TpTraficoCliente cliente) {
		this.cliente = cliente;
	}
}
