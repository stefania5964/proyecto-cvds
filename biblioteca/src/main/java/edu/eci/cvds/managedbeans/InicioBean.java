package edu.eci.cvds.managedbeans;
import javax.faces.bean.ApplicationScoped;
import javax.faces.bean.ManagedBean;
import edu.eci.cvds.entities.*;
import edu.eci.cvds.security.Inicio;
import com.google.inject.Inject;
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
    Inicio sessionLogger;


    @RequiresGuest
    public void iniciar() throws ExceptionPersistence, IOException, ExceptionServices {

        try {

            sessionLogger.inicio(nombreUsuario, Contraseña);

        } catch (ExceptionServices | IOException e){
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
