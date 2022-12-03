package edu.eci.cvds.persistence.mybatisimpl;

import com.google.inject.Inject;
import edu.eci.cvds.entities.Resource;
import edu.eci.cvds.persistence.DAOResource;
import edu.eci.cvds.persistence.ExceptionPersistence;
import edu.eci.cvds.persistence.mybatisimpl.mappers.ResourceMapper;
import java.util.List;

import edu.eci.cvds.persistence.Report;
public class MyBatisDAOResource implements DAOResource {
    @Inject
    ResourceMapper recursoMapper;



    @Override
    public List<Resource>  consultarResource( ) throws ExceptionPersistence {
        try{
            return recursoMapper.getResource();
        }
        catch(Exception e){
            throw new ExceptionPersistence("Error al consultar :"+ e.getLocalizedMessage(), e);
        }
    }
    /*nos muestra el estado del recurso */
    @Override
    public void updateResource(Resource resource) {
        try{

            if (resource.getEstado().equals("Activo")) {
                resource.setEstado("Inactivo");
            }
            else if (resource.getEstado().equals("Inactivo")){
                //System.out.println("entra");
                resource.setEstado("Activo");}
            recursoMapper.updateResource(resource);
            Report.loadReport("pasa ");
        }catch (Exception e){
            Report.loadReport(e.getMessage());
        }
    }



    @Override
    public void save(Resource resource) throws ExceptionPersistence {
        try {
            Report.loadReport("paso");
            recursoMapper.createResource(resource);
        }
        catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
    @Override
    public List<Resource> loadListActiveResources() {
        try{
            return recursoMapper.getListActiveResources();
        }catch (Exception e){
            System.out.println(e.getMessage());
            return null;
        }
    }
}
