package mx.com.tp.trafico.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import mx.com.tp.trafico.entity.TpTraficoConfiguracionFtp;

@Repository
public interface ConfiguracionFtpDAO extends JpaRepository<TpTraficoConfiguracionFtp, Long>{

}
