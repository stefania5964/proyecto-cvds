package edu.eci.cvds.security;

import java.io.IOException;

import edu.eci.cvds.services.ExceptionServices;
public interface Inicio {
    public void inicio(String correo, String contrasena) throws ExceptionServices, IOException;

}
