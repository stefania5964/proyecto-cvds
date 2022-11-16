package edu.eci.cvds.managedbeans;
import edu.eci.cvds.entities.Resource;
import edu.eci.cvds.entities.TipoRecurso;
import edu.eci.cvds.services.ServiceResourceFactory;

import javax.faces.bean.SessionScoped;
import javax.inject.Inject;
import javax.faces.bean.ManagedBean;
import java.time.LocalTime;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
@ManagedBean(name = "BuscarRecursoBean")
@SessionScoped
public class BuscarRecursoBean {
    TipoRecurso tipoRecurso;
    List<Resource> BuscarRecurso;
    public void obtenerRecurso(Integer id_recurso,String Nombre){
        try {
            BuscarRecurso = ServiceResourceFactory.getInstance().getForumsServices().consultarResource(id_recurso,Nombre);
        } catch (Exception e){
            e.printStackTrace();
        }
    }

}
