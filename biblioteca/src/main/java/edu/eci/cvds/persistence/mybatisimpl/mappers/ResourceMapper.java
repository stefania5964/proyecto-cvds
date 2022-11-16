package edu.eci.cvds.persistence.mybatisimpl.mappers;

import edu.eci.cvds.entities.Resource;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface ResourceMapper {
    List<Resource> getResource(@Param("id") Integer id, @Param("name") String name);

}
