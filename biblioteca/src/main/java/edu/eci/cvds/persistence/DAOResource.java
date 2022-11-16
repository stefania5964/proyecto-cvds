package edu.eci.cvds.persistence;

import edu.eci.cvds.entities.Resource;

import java.util.List;

public interface DAOResource {
    List<Resource>  consultarResource(Integer id, String name ) throws ExceptionPersistence;

}
