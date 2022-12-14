package edu.eci.cvds.managedbeans;
import javax.faces.bean.ApplicationScoped;
import javax.faces.bean.ManagedBean;
import edu.eci.cvds.entities.*;
import com.google.inject.Inject;

import edu.eci.cvds.security.login;
import edu.eci.cvds.persistence.ExceptionPersistence;
import edu.eci.cvds.services.ExceptionServices;
import org.apache.shiro.authz.annotation.RequiresGuest;

import java.io.IOException;

@ManagedBean(name = "InicioBean")
@ApplicationScoped
public class InicioBean {
    private String nombreUsuario;
    private String Contraseña;
    private Roles roles;
    @Inject
    login sessionLogger;


    @RequiresGuest
    public void iniciar() throws IOException, ExceptionServices {

        try {

            sessionLogger.paginaUser(nombreUsuario, Contraseña);

        } catch (IOException | ExceptionServices e){
            throw e;
        }
    }
    public String getnombreUsuario() {
        return nombreUsuario;
    }
    public Roles getRoles() {
        return roles;
    }
    public String getPassword() {
        return Contraseña;
    }
    public void setnombreUsuario(String nombreUsuario) {
        this.nombreUsuario = nombreUsuario;
    }
    public void setPassword(String password) {
        this.Contraseña = Contraseña;
    }
    public void setRoles(Roles roles) {
        this.roles = roles;
    }


}
