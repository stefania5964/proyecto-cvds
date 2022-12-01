package edu.eci.cvds.services.impl;
import com.google.inject.Inject;
import edu.eci.cvds.entities.Resource;
import edu.eci.cvds.persistence.DAOResource;
import edu.eci.cvds.persistence.ExceptionPersistence;
import edu.eci.cvds.services.ExceptionServices;
import edu.eci.cvds.services.serviciosResource;

import java.util.List;

public abstract class ServiciosResourceImpl implements serviciosResource {
    @Inject
    private DAOResource daoResource;

    @Override
    public List<Resource>  consultarResource() throws ExceptionServices {
        try {
            return daoResource.consultarResource();
        } catch (ExceptionPersistence ex) {
            throw new ExceptionServices("Error de consulta:"+ ex.getLocalizedMessage(), ex);
        }
    }




}
