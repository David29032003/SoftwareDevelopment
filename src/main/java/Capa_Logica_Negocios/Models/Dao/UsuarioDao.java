package Capa_Logica_Negocios.Models.Dao;

import Capa_Logica_Negocios.Models.Entity.Usuario;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.PagingAndSortingRepository;

public interface UsuarioDao extends CrudRepository<Usuario, Integer> {

}
