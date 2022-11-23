package edu.eci.cvds.managedbeans;
import java.io.IOException;
import java.io.Serializable;

import edu.eci.cvds.entities.Roles;
import edu.eci.cvds.entities.Usuario;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;
import javax.faces.context.FacesContext;
@ManagedBean(name = "navegar",eager = true)

public class navegar {
    public void Inicio() throws IOException {
        FacesContext.getCurrentInstance().getExternalContext().redirect("log.xhtml");
    }
    public void paginaUser() throws IOException {
        FacesContext.getCurrentInstance().getExternalContext().redirect("paginaUser.xhtml");
    }
    public void paginaReservas() throws IOException {
        FacesContext.getCurrentInstance().getExternalContext().redirect("Reservas.xhtml");
    }
    public void paginaConsultaReserva() throws IOException {
        FacesContext.getCurrentInstance().getExternalContext().redirect("consultarReserva.xhtml");
    }
    public void Iniciar() throws IOException {

        if (Usuario.getRoles().equals(Roles.Administrador)) {
            FacesContext.getCurrentInstance().getExternalContext().redirect("paginaAdministrador.xhtml");}
        else if (Usuario.getRoles().equals(Roles.Usuario)){
            FacesContext.getCurrentInstance().getExternalContext().redirect("paginaUser.xhtml");}
    }
}
