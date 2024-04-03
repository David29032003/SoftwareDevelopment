package Capa_Logica_Negocios.Services;

import Capa_Logica_Negocios.Models.Entity.Usuario;

public interface IUsuario {

    Usuario save(Usuario usuario);

    Usuario findById(Integer Id);

    void delete(Usuario usuario);
}
