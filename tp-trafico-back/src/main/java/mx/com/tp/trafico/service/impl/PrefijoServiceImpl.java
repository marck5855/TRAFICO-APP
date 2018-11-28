package mx.com.tp.trafico.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import mx.com.tp.trafico.dao.PrefijoDAO;
import mx.com.tp.trafico.entity.CatPrefijo;
import mx.com.tp.trafico.service.PrefijoService;

@Service
public class PrefijoServiceImpl implements PrefijoService{

	@Autowired
	public PrefijoDAO prefijoDAO;
	
	@Override
	public List<CatPrefijo> finAll() {
		// TODO Auto-generated method stub
		return (List<CatPrefijo>) prefijoDAO.findAll();
	}

	@Override
	public CatPrefijo findById(Long id) {
		// TODO Auto-generated method stub
		return prefijoDAO.findById(id).orElse(null);
	}
}
