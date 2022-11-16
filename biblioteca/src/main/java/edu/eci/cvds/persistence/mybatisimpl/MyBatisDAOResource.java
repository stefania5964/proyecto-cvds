package edu.eci.cvds.persistence.mybatisimpl;

import com.google.inject.Inject;
import edu.eci.cvds.entities.Resource;
import edu.eci.cvds.persistence.DAOResource;
import edu.eci.cvds.persistence.ExceptionPersistence;
import edu.eci.cvds.persistence.mybatisimpl.mappers.ResourceMapper;
import java.time.LocalTime;
import java.util.List;

public class MyBatisDAOResource implements DAOResource {
    @Inject
    ResourceMapper recursoMapper;



    @Override
    public List<Resource>  consultarResource(Integer id,String name ) throws ExceptionPersistence {
        try{
            return recursoMapper.getResource(id,name);
        }
        catch(Exception e){
            throw new ExceptionPersistence("Error al consultar :"+ e.getLocalizedMessage(), e);
        }
    }
}
