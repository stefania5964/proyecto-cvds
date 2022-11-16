package edu.eci.cvds.entities;

public class Usuario {
    private int id;
    private String nombre;
    private String programa;
    private String rol;
    private String correo;
    private String contraseña;
    public Usuario(int id, String nombre, String programa, String rol, String correo, String contraseña) {
        this.id = id;
        this.nombre = nombre;
        this.programa = programa;
        this.correo = correo;
        this.rol = rol;
        this.contraseña = contraseña;
    }

    /**
     * obtiene valores
     * @return
     */
    public int getId() {
        return id;
    }
    public String getNombre() {return nombre;}
    public String getPrograma() {
        return programa;
    }
    public String getRol() {
        return rol;
    }
    public String getCorreo() {
        return correo;
    }
    public String getContraseña() {
        return contraseña;
    }

    /**
     * cambia valores
     * @param id
     */
    public void setId(int id) {
        this.id = id;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public void setPrograma(String programa) {
        this.programa = programa;
    }
    public void setRol(String rol) {
        this.rol = rol;
    }
    public void setCorreo(String correo) {
        this.correo = correo;
    }
    public void setContraseña(String contraseña) {
        this.contraseña = contraseña;
    }

}
