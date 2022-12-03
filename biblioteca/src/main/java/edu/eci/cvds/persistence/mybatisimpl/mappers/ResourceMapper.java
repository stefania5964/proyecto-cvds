package edu.eci.cvds.persistence.mybatisimpl.mappers;

import edu.eci.cvds.entities.Resource;
import org.apache.ibatis.annotations.Param;
import edu.eci.cvds.entities.Usuario;
import java.util.List;

public interface ResourceMapper {

    public List<Resource> getResource();

    public void createResource(Resource resource);

    public List<Resource> getListResources();

    public void updateResource(Resource resource);

    public List<Resource> getListActiveResources();
}
