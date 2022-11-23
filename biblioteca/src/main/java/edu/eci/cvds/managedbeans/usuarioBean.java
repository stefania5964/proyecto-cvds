package edu.eci.cvds.managedbeans;

import edu.eci.cvds.entities.Usuario;
import edu.eci.cvds.entities.*;
import javax.inject.Inject;
import edu.eci.cvds.services.serviciosResource;
public class usuarioBean extends PageBean {
    @Inject
    private serviciosResource serviciosResource;

    public Usuario loadUser() throws Exception {
        try {
            return serviciosResource.getUser();
        } catch (Exception e) {
            return null;
        }
    }
}
