package edu.eci.cvds.entities;

public class Resource {
    private Integer id_recurso;
    private TipoRecurso Tipo;
    private String Ubicacion;
    private String Estado;
    private Integer Capacidad;
    public Resource(Integer id_recurso, TipoRecurso tipo, String ubicacion, String estado, Integer capacidad) {
        this.id_recurso = id_recurso;
        this.Tipo = tipo;
        this.Ubicacion = ubicacion;
        this.Estado = estado;
        this.Capacidad = capacidad;
    }
    public Resource getResource(){
        return this;
    }

    public Integer getId_recurso() {
        return id_recurso;
    }
    public TipoRecurso getTipo() {
        return Tipo;
    }
    public String getUbicacion() {
        return Ubicacion;
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
    public void setTipo(TipoRecurso Tipo) {
        this.Tipo = Tipo;
    }
    public void setUbicacion(String Ubicacion) {
        this.Ubicacion = Ubicacion;
    }
    public void setEstado(String Estado) {
        this.Estado = Estado;
    }
    public void setCapacidad(Integer Capacidad) {
        this.Capacidad = Capacidad;
    }
}
