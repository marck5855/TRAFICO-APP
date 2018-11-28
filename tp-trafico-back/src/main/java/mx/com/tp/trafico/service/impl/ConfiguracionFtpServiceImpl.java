package mx.com.tp.trafico.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import mx.com.tp.trafico.entity.TpTraficoConfiguracionFtp;
import mx.com.tp.trafico.service.ConfiguracionFtpService;

@Service
public class ConfiguracionFtpServiceImpl implements ConfiguracionFtpService{

	@Autowired
	public ConfiguracionFtpService configuracionFtpService;
	
	@Override
	public List<TpTraficoConfiguracionFtp> findAll() {
		// TODO Auto-generated method stub
		return configuracionFtpService.findAll();
	}

	@Override
	public TpTraficoConfiguracionFtp save(TpTraficoConfiguracionFtp ftp) {
		// TODO Auto-generated method stub
		return configuracionFtpService.save(ftp);
	}

	@Override
	public TpTraficoConfiguracionFtp findById(Long id) {
		// TODO Auto-generated method stub
		return configuracionFtpService.findById(id);
	}

	@Override
	public void delete(Long id) {
		// TODO Auto-generated method stub
		configuracionFtpService.delete(id);
	}
}
