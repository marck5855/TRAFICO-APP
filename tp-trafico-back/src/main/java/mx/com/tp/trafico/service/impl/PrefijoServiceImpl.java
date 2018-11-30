package mx.com.tp.trafico.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.expression.ParseException;
import org.springframework.stereotype.Service;

import mx.com.tp.trafico.dao.PrefijoDAO;
import mx.com.tp.trafico.dto.response.BusquedaPrefijoDTOResponse;
import mx.com.tp.trafico.dto.response.ConsultaPrefijoDTOResponse;
import mx.com.tp.trafico.entity.CatPrefijo;
import mx.com.tp.trafico.service.PrefijoService;

@Service
public class PrefijoServiceImpl implements PrefijoService {

	@Autowired
	public PrefijoDAO prefijoDAO;

	@Override
	public ConsultaPrefijoDTOResponse consultaPrefijo() {
		List<CatPrefijo> listPrefijo = null;
		try {
			listPrefijo = prefijoDAO.findAll();
		} catch (ParseException e) {
			e.printStackTrace();
		}
		return new ConsultaPrefijoDTOResponse(listPrefijo);

	}

	@Override
	public BusquedaPrefijoDTOResponse buscarPrefijo(Long id) {
		Boolean success = false;
		CatPrefijo prefijo = null;
		try {
			boolean existe = false;
			existe = prefijoDAO.existsById(id);
			if (existe == true) {
				prefijo = prefijoDAO.findById(id).orElse(null);
				success = true;
			}
		} catch (ParseException e) {
			e.printStackTrace();
		}
		return new BusquedaPrefijoDTOResponse(success, prefijo);

	}

}
