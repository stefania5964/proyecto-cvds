package edu.eci.cvds.managedbeans;
import edu.eci.cvds.entities.*;
import edu.eci.cvds.services.serviciosResource;
import javax.inject.Inject;
import javax.faces.bean.RequestScoped;
import javax.faces.bean.ManagedBean;
import java.util.ArrayList;
import java.util.List;

@ManagedBean(name = "BuscarRecursoBean")

public class BuscarRecursoBean extends PageBean {
    @Inject
    private serviciosResource serviciosResource;
    TipoRecurso tipoRecurso;
    List<Resource> consultarResource;
    public List<Resource> consultarResource() throws Exception {
        try {
            return serviciosResource.consultarResource();
        } catch (Exception e) {
            System.out.println(e.getMessage());
            return null;
        }
    }
    public TipoRecurso getTipoRecurso() {
        return tipoRecurso;
    }

}
