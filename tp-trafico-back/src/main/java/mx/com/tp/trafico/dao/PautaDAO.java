package mx.com.tp.trafico.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import mx.com.tp.trafico.entity.TpTraficoPauta;

@Repository
public interface PautaDAO extends JpaRepository<TpTraficoPauta, Long>{

}
