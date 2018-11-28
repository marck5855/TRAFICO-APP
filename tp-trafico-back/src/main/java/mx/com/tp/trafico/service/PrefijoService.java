package mx.com.tp.trafico.service;

import java.util.List;

import mx.com.tp.trafico.entity.CatPrefijo;

public interface PrefijoService {

	public List<CatPrefijo> finAll();
	
	public CatPrefijo findById(Long id);
}
