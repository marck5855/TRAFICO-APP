package mx.com.tp.trafico.service;

import java.util.List;

import mx.com.tp.trafico.entity.TpTraficoCanal;

public interface CanalService {

	//Listar Canales
	public List<TpTraficoCanal> findAll();

	//Guardar Canal
	public TpTraficoCanal saveCanal(TpTraficoCanal canal);
	
	//Eliminar Canal
	public void deleteCanal(Long id);
	
	//Actualizar Canal
	public void updateCanal (TpTraficoCanal canal);

	//Buscar Canal por id
	public TpTraficoCanal findByIdCanal(Long idCanal);

}
