package edu.eci.cvds.services.impl;
import com.google.inject.Inject;
import edu.eci.cvds.entities.Resource;
import edu.eci.cvds.persistence.DAOResource;
import edu.eci.cvds.persistence.UsuarioDAO;
import edu.eci.cvds.persistence.ExceptionPersistence;
import edu.eci.cvds.services.ExceptionServices;
import edu.eci.cvds.services.serviciosResource;
import edu.eci.cvds.entities.Usuario;
import java.util.List;

public abstract class ServiciosResourceImpl implements serviciosResource {
    @Inject
    private DAOResource daoResource;
    @Inject
    private UsuarioDAO userDAO;
    @Override
    public List<Resource>  consultarResource() throws ExceptionServices {
        try {
            return daoResource.consultarResource();
        } catch (ExceptionPersistence ex) {
            throw new ExceptionServices("Error de consulta:"+ ex.getLocalizedMessage(), ex);
        }
    }
    @Override
    public Usuario getUser() throws ExceptionServices {
        try {
            return userDAO.load();
        } catch (Exception e) {
            return null;
        }
    }

    @Override
    public Usuario getUser(String correo, String contrasena) throws ExceptionServices {

        Usuario usuario = null;
        try{
            List<Usuario> lista = userDAO.getUser(correo, contrasena);
            if(!lista.isEmpty()) {
                usuario = lista.get(0);
            }
        }catch (ExceptionPersistence e){
            throw new ExceptionServices("Error", e);
        }
        return usuario;
    }



}
