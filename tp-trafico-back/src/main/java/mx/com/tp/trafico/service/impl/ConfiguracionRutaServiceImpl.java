package mx.com.tp.trafico.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import mx.com.tp.trafico.dao.ConfiguracionRutaDAO;
import mx.com.tp.trafico.entity.TpTraficoConfiguracionRuta;
import mx.com.tp.trafico.service.ConfiguracionRutaService;

@Service
public class ConfiguracionRutaServiceImpl implements ConfiguracionRutaService{

	@Autowired
	public ConfiguracionRutaDAO configuracionRutaDAO;
	
	@Override
	public List<TpTraficoConfiguracionRuta> findAll() {
		// TODO Auto-generated method stub
		return configuracionRutaDAO.findAll();
	}

	@Override
	public TpTraficoConfiguracionRuta save(TpTraficoConfiguracionRuta ruta) {
		// TODO Auto-generated method stub
		return configuracionRutaDAO.save(ruta);
	}

	@Override
	public TpTraficoConfiguracionRuta findById(Long id) {
		// TODO Auto-generated method stub
		return configuracionRutaDAO.findById(id).orElse(null);
	}

	@Override
	public void delete(Long id) {
		// TODO Auto-generated method stub
		configuracionRutaDAO.deleteById(id);
	}

}
