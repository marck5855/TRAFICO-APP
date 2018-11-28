package mx.com.tp.trafico.service;

import java.util.List;

import mx.com.tp.trafico.entity.TpTraficoEscaleta;

public interface EscaletaService {

	public List<TpTraficoEscaleta> findAll();

	public TpTraficoEscaleta save(TpTraficoEscaleta escaleta);
	
	public TpTraficoEscaleta findById(Long id);
	
	public void delete (Long id);
	
//	public TpTraficoEscaleta findByIdentificador(String identificador);
//	
//	public List<TpTraficoEscaleta> findAllIdentificador (String identificador);

}
