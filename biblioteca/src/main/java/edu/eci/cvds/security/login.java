package edu.eci.cvds.security;

import edu.eci.cvds.services.ExceptionServices;

import java.io.IOException;

public interface login {
    public void paginaUser(String correo, String contrasena) throws ExceptionServices, IOException;

    public boolean isLogged() throws ExceptionServices;

    public void logout() throws ExceptionServices;

}
