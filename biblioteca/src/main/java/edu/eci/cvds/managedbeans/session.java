package edu.eci.cvds.managedbeans;
import edu.eci.cvds.security.login;
import edu.eci.cvds.services.ExceptionServices;
import edu.eci.cvds.services.serviciosResource;
import org.apache.shiro.SecurityUtils;
import edu.eci.cvds.entities.*;
import javax.faces.application.FacesMessage;
import javax.faces.context.FacesContext;
import javax.inject.Inject;
import java.io.IOException;

public class session implements login{
    @Inject
    private serviciosResource userServices;

    public serviciosResource getUserServices() {
        return userServices;
    }

    public void setUserServices(serviciosResource userServices) {
        this.userServices = userServices;
    }

    public void paginaUser(String correo, String contrasena) throws ExceptionServices, IOException {
        Usuario usuario = userServices.getUser(correo, contrasena);
        if(usuario != null){
            if(usuario.getRoles().equals("admin")){
                FacesContext.getCurrentInstance().getExternalContext().redirect("/faces/paginaAdministrador.xhtml?faces-redirect=true");
            }else{
                FacesContext.getCurrentInstance().getExternalContext().redirect("/faces/paginaUser.xhtml?faces-redirect=true");
            }
        }else{
            FacesContext.getCurrentInstance().addMessage(null, new FacesMessage(FacesMessage.SEVERITY_WARN, "Aviso", "Credenciales incorrectas"));
        }
    }



    @Override
    public boolean isLogged() {
        return SecurityUtils.getSubject().isAuthenticated();
    }

    @Override
    public void logout(){
        SecurityUtils.getSubject().logout();
    }

}
