package edu.eci.cvds.persistence.mybatisimpl.mappers;

import edu.eci.cvds.entities.Roles;
import edu.eci.cvds.entities.Usuario;

import java.util.List;

import org.apache.ibatis.annotations.Param;

public interface UsuarioMapper {
    public Usuario getUser();

    public void createUser(
            @Param("id") int id,
            @Param("nombres") String nombres,
            @Param("programa") String programa,
            @Param("rol")Roles rol
            );

    public List<Usuario> getU(String correo, String contrasena);

}
