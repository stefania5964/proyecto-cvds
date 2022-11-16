package edu.eci.cvds.entities;

import java.sql.Time;

public class TipoRecurso {
    private int id_tipo;
    private String nombre;
    private String descripcion;
    private Time horaMinima;
    private Time horaMaxima;
    public TipoRecurso(int id_tipo, String nombre, String descripcion, Time horaMinima, Time horaMaxima){
        this.id_tipo = id_tipo;
        this.nombre = nombre;
        this.descripcion = descripcion;
        this.horaMinima = horaMinima;
        this.horaMaxima = horaMaxima;
    }
    public int getId_tipo() {
        return id_tipo;
    }

    public void setId_tipo(int id_tipo) {
        this.id_tipo = id_tipo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public Time getHoraMinima() {
        return horaMinima;
    }

    public void setHoraMinima(Time horaMinima) {
        this.horaMinima = horaMinima;
    }

    public Time getHoraMaxima() {
        return horaMaxima;
    }

    public void setHoraMaxima(Time horaMaxima) {
        this.horaMaxima = horaMaxima;
    }

}
