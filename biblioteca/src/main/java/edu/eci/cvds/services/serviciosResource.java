package edu.eci.cvds.services;

import edu.eci.cvds.entities.Reserve;
import edu.eci.cvds.entities.Resource;
import edu.eci.cvds.entities.TipoRecurso;
import edu.eci.cvds.services.ExceptionServices;
import edu.eci.cvds.entities.*;

import java.util.List;
public interface serviciosResource {
    public Usuario getUser() throws ExceptionServices;

    public abstract Usuario getUser(String correo, String contrasena) throws ExceptionServices;

    public List<Resource> consultarResource() throws ExceptionServices;

    public void createResource(Resource resource) throws ExceptionServices;

    public List<TipoRecurso> getResourceType() throws ExceptionServices;


    public static List<Reserve> getListReserve() throws ExceptionServices {
        return null;
    }

    public List<Reserve> getListReserve1() throws ExceptionServices;

    public void createReserve(Reserve reserve) throws ExceptionServices;

    public void updateResource(Resource resource) throws ExceptionServices;

    public void deleteReserve(Reserve reserve) throws ExceptionServices;

    public List<Resource> getListActiveResources() throws ExceptionServices;

    List<Resource>  consultarResource(Integer id, String name) throws ExceptionServices;
}
