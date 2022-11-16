package edu.eci.cvds.managedbeans;
import javax.faces.bean.ApplicationScoped;
import javax.faces.bean.ManagedBean;

import com.google.inject.Inject;
import edu.eci.cvds.persistence.ExceptionPersistence;
import edu.eci.cvds.security.Inicio;
import edu.eci.cvds.services.ExceptionServices;
import org.apache.shiro.authz.annotation.RequiresGuest;

import java.io.IOException;

@ManagedBean(name = "InicioBean")
@ApplicationScoped
public class InicioBean {
    private String username;
    private String password;
    private String rol;
    @Inject
    Inicio sessionLogger;


    @RequiresGuest
    public void login() throws ExceptionPersistence, IOException, ExceptionServices {

        try {

            sessionLogger.inicio(username, password);

        } catch (ExceptionServices | IOException e){
            throw e;
        }
    }
    public String getUsername() {
        return username;
    }
    public String getRol() {
        return rol;
    }
    public String getPassword() {
        return password;
    }
    public void setUsername(String username) {
        this.username = username;
    }
    public void setPassword(String password) {
        this.password = password;
    }
    public void setRol(String rol) {
        this.rol = rol;
    }


}
