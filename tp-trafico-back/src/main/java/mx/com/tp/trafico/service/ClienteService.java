package mx.com.tp.trafico.service;

import java.util.List;

import mx.com.tp.trafico.entity.TpTraficoCliente;

public interface ClienteService {

	public List<TpTraficoCliente> finAll();
	
	public TpTraficoCliente saveCliente(TpTraficoCliente cliente); 

	public void deleteCliente (Long id);
	
	public TpTraficoCliente findByIidCliente (Long id);
 
}
