package mx.com.tp.trafico.manager;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import mx.com.tp.trafico.dto.response.BusquedaPrefijoDTOResponse;
import mx.com.tp.trafico.dto.response.ConsultaPrefijoDTOResponse;
import mx.com.tp.trafico.entity.CatPrefijo;
import mx.com.tp.trafico.service.PrefijoService;

@Component
public class PrefijoManager {
	
	@Autowired
	public PrefijoService prefijoService;

	public ConsultaPrefijoDTOResponse consultaPrefijo() {
		List<CatPrefijo> listPrefijo = null;
		try {
			listPrefijo = prefijoService.finAll();
		}catch(Exception ex){
			
		}
		return new ConsultaPrefijoDTOResponse(listPrefijo);
		
	}
	public BusquedaPrefijoDTOResponse buscarPrefijo(Long id) {
		Boolean success = false;
		CatPrefijo prefijo = null;
		try {
			prefijo = prefijoService.findById(id);
			success = true;
		}catch(Exception ex){
			
		}
		return new BusquedaPrefijoDTOResponse(success, prefijo);
		
	}
}
