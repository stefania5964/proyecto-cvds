package edu.eci.cvds.persistence;

import edu.eci.cvds.entities.Resource;

import java.util.List;

public interface DAOResource {
    public void save(Resource resource) throws ExceptionPersistence;
    List<Resource>  consultarResource() throws ExceptionPersistence;
    public void updateResource(Resource resource);

    public List<Resource> loadListActiveResources();
}
