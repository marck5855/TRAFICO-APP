package mx.com.tp.trafico.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import mx.com.tp.trafico.dao.ClienteDAO;
import mx.com.tp.trafico.entity.TpTraficoCliente;
import mx.com.tp.trafico.service.ClienteService;

@Service
public class ClienteServiceImpl implements ClienteService {

	@Autowired
	public ClienteDAO clienteDAO;

	@Override
	public List<TpTraficoCliente> finAll() {
		// TODO Auto-generated method stub
		return (List<TpTraficoCliente>) clienteDAO.findAll();
	}

	@Override
	public void deleteCliente(Long id) {
		// TODO Auto-generated method stub
		clienteDAO.deleteById(id);
	}

	@Override
	public TpTraficoCliente findByIidCliente(Long id) {
		// TODO Auto-generated method stub
		return clienteDAO.findById(id).orElse(null);
	}

	@Override
	public TpTraficoCliente saveCliente(TpTraficoCliente cliente) {
		// TODO Auto-generated method stub
		return clienteDAO.save(cliente);
	}
}
