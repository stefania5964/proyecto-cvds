package edu.eci.cvds.persistence;

import edu.eci.cvds.persistence.ExceptionPersistence;

import edu.eci.cvds.entities.Usuario;
import edu.eci.cvds.persistence.ExceptionPersistence;
import java.util.List;
public interface UsuarioDAO {
    public List<Usuario> getUser (String correo , String contrasena) throws ExceptionPersistence;
    public Usuario load() throws ExceptionPersistence;

    public void save(Usuario ur) throws ExceptionPersistence;

}
