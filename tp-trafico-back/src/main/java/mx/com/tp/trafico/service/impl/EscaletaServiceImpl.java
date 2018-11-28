package mx.com.tp.trafico.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import mx.com.tp.trafico.dao.EscaletaDAO;
import mx.com.tp.trafico.entity.TpTraficoEscaleta;
import mx.com.tp.trafico.service.EscaletaService;

@Service
public class EscaletaServiceImpl implements EscaletaService{

	@Autowired
	public EscaletaDAO escaletaDAO;
	
	@Override
	public List<TpTraficoEscaleta> findAll() {
		// TODO Auto-generated method stub
		return escaletaDAO.findAll();
	}

	@Override
	public TpTraficoEscaleta save(TpTraficoEscaleta escaleta) {
		// TODO Auto-generated method stub
		return escaletaDAO.save(escaleta);
	}

	@Override
	public TpTraficoEscaleta findById(Long id) {
		// TODO Auto-generated method stub
		return escaletaDAO.findById(id).orElse(null);
	}

	@Override
	public void delete(Long id) {
		// TODO Auto-generated method stub
		escaletaDAO.deleteById(id);
	}

//	@Override
//	public TpTraficoEscaleta findByIdentificador(String identificador) {
//		// TODO Auto-generated method stub
//		return escaletaDAO.findbyIdentificador(identificador);
//	}
//
//	@Override
//	public List<TpTraficoEscaleta> findAllIdentificador(String identificador) {
//		// TODO Auto-generated method stub
//		return escaletaDAO.findAllIdentificador(identificador);
//	}
}
