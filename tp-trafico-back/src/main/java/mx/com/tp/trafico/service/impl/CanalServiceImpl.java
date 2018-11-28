package mx.com.tp.trafico.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import mx.com.tp.trafico.dao.CanalDAO;
import mx.com.tp.trafico.entity.TpTraficoCanal;
import mx.com.tp.trafico.service.CanalService;

@Service
public class CanalServiceImpl implements CanalService {

	@Autowired
	private CanalDAO canalDAO;

	@Override
	public List<TpTraficoCanal> findAll() {
		// TODO Auto-generated method stub
		return (List<TpTraficoCanal>) canalDAO.findAll();
	}

	@Override
	public void updateCanal(TpTraficoCanal canal) {
		// TODO Auto-generated method stub
		canalDAO.save(canal);
	}

	@Override
	public TpTraficoCanal findByIdCanal(Long idCanal) {
		// TODO Auto-generated method stub
		return canalDAO.findById(idCanal).orElse(null);
	}

	@Override
	public void deleteCanal(Long id) {
		// TODO Auto-generated method stub
		canalDAO.deleteById(id);
	}

	@Override
	public TpTraficoCanal saveCanal(TpTraficoCanal canal) {
		// TODO Auto-generated method stub
		return canalDAO.save(canal);
	}
}
