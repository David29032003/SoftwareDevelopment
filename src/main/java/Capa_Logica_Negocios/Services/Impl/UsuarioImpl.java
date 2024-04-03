package Capa_Logica_Negocios.Services.Impl;

import Capa_Logica_Negocios.Models.Dao.UsuarioDao;
import Capa_Logica_Negocios.Models.Entity.Usuario;
import Capa_Logica_Negocios.Services.IUsuario;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UsuarioImpl implements IUsuario {

    @Autowired
    private UsuarioDao usuarioDao;

    @Transactional
    @Override
    public Usuario save(Usuario usuario) {
        return usuarioDao.save(usuario);
    }

    @Transactional
    @Override
    public Usuario findById(Integer Id) {
        return usuarioDao.findById(Id).orElse(null);
    }

    @Transactional
    @Override
    public void delete(Usuario usuario) {
        usuarioDao.delete(usuario);
    }
}
