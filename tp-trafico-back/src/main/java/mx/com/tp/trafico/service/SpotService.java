package mx.com.tp.trafico.service;

import java.util.List;

import mx.com.tp.trafico.entity.TpTraficoSpot;

public interface SpotService {

	public List<TpTraficoSpot> findAll();
	
	public TpTraficoSpot save(TpTraficoSpot spot);
	
	public TpTraficoSpot findById(Long id);
	
	public void delete(Long id);
}
