package edu.eci.cvds.services;

import edu.eci.cvds.entities.Resource;
import java.util.List;
public interface serviciosResource {
    public List<Resource> consultarResource(Integer id,String name ) throws ExceptionServices;

    serviciosResource getForumsServices();
}
