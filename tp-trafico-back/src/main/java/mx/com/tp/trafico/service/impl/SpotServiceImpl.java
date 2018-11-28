package mx.com.tp.trafico.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import mx.com.tp.trafico.dao.SpotDAO;
import mx.com.tp.trafico.entity.TpTraficoSpot;
import mx.com.tp.trafico.service.SpotService;

@Service
public class SpotServiceImpl implements SpotService{
	
	@Autowired
	public SpotDAO spotDAO;

	@Override
	public List<TpTraficoSpot> findAll() {
		// TODO Auto-generated method stub
		return spotDAO.findAll();
	}

	@Override
	public TpTraficoSpot save(TpTraficoSpot spot) {
		// TODO Auto-generated method stub
		return spotDAO.save(spot);
	}

	@Override
	public TpTraficoSpot findById(Long id) {
		// TODO Auto-generated method stub
		return spotDAO.findById(id).orElse(null);
	}

	@Override
	public void delete(Long id) {
		// TODO Auto-generated method stub
		spotDAO.deleteById(id);
	}

}
