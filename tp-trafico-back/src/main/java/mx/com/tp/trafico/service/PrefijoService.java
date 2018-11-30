package mx.com.tp.trafico.service;

import mx.com.tp.trafico.dto.response.BusquedaPrefijoDTOResponse;
import mx.com.tp.trafico.dto.response.ConsultaPrefijoDTOResponse;

public interface PrefijoService {

	public ConsultaPrefijoDTOResponse consultaPrefijo();

	public BusquedaPrefijoDTOResponse buscarPrefijo(Long id);

}
