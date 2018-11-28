package mx.com.tp.trafico.service;

import java.util.List;

import mx.com.tp.trafico.entity.TpTraficoConfiguracionFtp;

public interface ConfiguracionFtpService {

	public List<TpTraficoConfiguracionFtp> findAll();
	
	public TpTraficoConfiguracionFtp save(TpTraficoConfiguracionFtp ftp);
	
	public TpTraficoConfiguracionFtp findById(Long id);
	
	public void delete (Long id);
}
