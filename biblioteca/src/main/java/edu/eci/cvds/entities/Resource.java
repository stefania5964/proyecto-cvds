package edu.eci.cvds.entities;

public class Resource {
    private Integer Codigo;
    private String Tipo;
    private String Ubicacion;
    private String Nombre;
    private String Estado;
    private Integer Capacidad;
    public Resource(Integer codigo, String tipo, String ubicacion, String nombreRecurso, String estado, Integer capacidad) {
        this.Codigo = codigo;
        this.Tipo = tipo;
        this.Ubicacion = ubicacion;
        this.Nombre = nombreRecurso;
        this.Estado = estado;
        this.Capacidad = capacidad;
    }
    public Resource getResource(){
        return this;
    }

    public Integer getCodigo() {
        return Codigo;
    }
    public String getTipo() {
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

    public void setCodigo(Integer Codigo) {
        this.Codigo = Codigo;
    }
    public void setTipo(String Tipo) {
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
