package edu.eci.cvds.managedbeans;

import edu.eci.cvds.entities.Usuario;

import edu.eci.cvds.security.login;
import javax.inject.Inject;
import edu.eci.cvds.services.serviciosResource;
public class usuarioBean extends PageBean {

    @Inject
    private serviciosResource serviciosResource;
    @Inject
    private login session;
    public Usuario loadUser() throws Exception {
        try {
            return serviciosResource.getUser();
        } catch (Exception e) {
            return null;
        }
    }
    public void signIn(String nombre, String clave) throws Exception {
        try {
            session.paginaUser(nombre, clave);
        } catch (Exception e) {

        }
    }
}
