package mx.com.tp.trafico.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import mx.com.tp.trafico.entity.TpTraficoEscaleta;

@Repository
public interface EscaletaDAO extends JpaRepository<TpTraficoEscaleta, Long>{
//
//	public TpTraficoEscaleta findbyIdentificador(String identificador);
//	
//	public List<TpTraficoEscaleta> findAllIdentificador(String identificador);
}
