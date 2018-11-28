package mx.com.tp.trafico.dao;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import mx.com.tp.trafico.entity.TpTraficoUsuario;

@Repository
public interface UsuarioDAO extends CrudRepository<TpTraficoUsuario, Long>{

}
