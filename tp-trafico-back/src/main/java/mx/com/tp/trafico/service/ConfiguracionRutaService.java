package mx.com.tp.trafico.service;

import java.util.List;

import mx.com.tp.trafico.entity.TpTraficoConfiguracionRuta;

public interface ConfiguracionRutaService {

	public List<TpTraficoConfiguracionRuta> findAll();

	public TpTraficoConfiguracionRuta save(TpTraficoConfiguracionRuta ruta);

	public TpTraficoConfiguracionRuta findById(Long id);

	public void delete(Long id);
}
