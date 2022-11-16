package edu.eci.cvds.entities;

public class Resource {
    private Integer id_recurso;
    private Integer Tipo;
    private String Ubicacion;
    private String Nombre;
    private String Estado;
    private Integer Capacidad;
    public Resource(Integer id_recurso, Integer tipo, String ubicacion, String nombreRecurso, String estado, Integer capacidad) {
        this.id_recurso = id_recurso;
        this.Tipo = tipo;
        this.Ubicacion = ubicacion;
        this.Nombre = nombreRecurso;
        this.Estado = estado;
        this.Capacidad = capacidad;
    }
    public Resource getResource(){
        return this;
    }

    public Integer getId_recurso() {
        return id_recurso;
    }
    public Integer getTipo() {
        return Tipo;
    }
    public String getUbicacion() {
        return Ubicacion;
    }
    public String getNombre() {
        return Nombre;
    }
    public String getEstado() {
        return Estado;
    }
    public Integer getCapacidad() {
        return Capacidad;
    }

    public void setId_recurso(Integer id_recurso) {
        this.id_recurso = id_recurso;
    }
    public void setTipo(Integer Tipo) {
        this.Tipo = Tipo;
    }
    public void setUbicacion(String Ubicacion) {
        this.Ubicacion = Ubicacion;
    }
    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }
    public void setEstado(String Estado) {
        this.Estado = Estado;
    }
    public void setCapacidad(Integer Capacidad) {
        this.Capacidad = Capacidad;
    }
}
