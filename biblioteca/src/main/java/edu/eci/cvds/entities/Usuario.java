package edu.eci.cvds.entities;

public class Usuario {
    private int id;
    private String nombre;
    private String programa;
    private static Roles roles;
    private String correo;
    private String contraseña;
    public Usuario(int id, String nombre, String programa, Roles roles, String correo, String contraseña) {
        this.id = id;
        this.nombre = nombre;
        this.programa = programa;
        this.correo = correo;
        this.roles = Roles.valueOf(String.valueOf(roles));
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

    public Roles getRol() {return roles;}
    public String getPrograma() {
        return programa;
    }
    public static Roles getRoles() {
        return roles;
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
    public void setRol(Roles rol) {
        this.roles = roles;
    }
    public void setCorreo(String correo) {
        this.correo = correo;
    }
    public void setContraseña(String contraseña) {
        this.contraseña = contraseña;
    }

}
