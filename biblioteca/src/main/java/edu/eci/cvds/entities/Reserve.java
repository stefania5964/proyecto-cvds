package edu.eci.cvds.entities;

import java.sql.Date;
import java.sql.Time;

public class Reserve {
    private Integer codigo;
    private Integer recurso;
    private Integer usuario;
    private Time horaInicial;
    private Time horaFinal;
    private String periodicidad;
    private String recursoS;
    private String nombres;
    private String apellidos;
    private Date fechaFinal;
    private String programa;
    public Reserve(Integer codigo,Integer recurso, Integer usuario, Time horaInicial, Time horaFinal, String periodicidad, Date fechaFinal) {
        this.recurso = recurso;
        this.usuario = usuario;
        this.horaInicial = horaInicial;
        this.horaFinal = horaFinal;
        this.periodicidad = periodicidad;
        this.fechaFinal = fechaFinal;
        this.codigo = codigo;
    }
    public Reserve(Integer codigo,String recursoS, String nombres, String apellidos, Time horaInicial, Time horaFinal, String periodicidad, Date fechaFinal, String programa) {
        this.horaInicial = horaInicial;
        this.horaFinal = horaFinal;
        this.periodicidad = periodicidad;
        this.fechaFinal = fechaFinal;
        this.programa = programa;
        this.recursoS = recursoS;
        this.nombres = nombres;
        this.apellidos = apellidos;
        this.codigo = codigo;
    }

    public Reserve getReserve(){
        return this;
    }

    public Integer getCodigo() {
        return codigo;
    }

    public void setCodigo(Integer codigo) {
        this.codigo = codigo;
    }

    public Integer getRecurso() {
        return recurso;
    }

    public void setRecurso(Integer recurso) {
        this.recurso = recurso;
    }

    public Integer getUsuario() {
        return usuario;
    }

    public void setUsuario(Integer usuario) {
        this.usuario = usuario;
    }

    public Time getHoraInicial() {
        return horaInicial;
    }

    public void setHoraInicial(Time horaInicial) {
        this.horaInicial = horaInicial;
    }

    public Time getHoraFinal() {
        return horaFinal;
    }

    public void setHoraFinal(Time horaFinal) {
        this.horaFinal = horaFinal;
    }

    public String getPeriodicidad() {
        return periodicidad;
    }

    public void setPeriodicidad(String periodicidad) {
        this.periodicidad = periodicidad;
    }

    public Date getFechaFinal() {
        return fechaFinal;
    }

    public void setFechaFinal(Date fechaFinal) {
        this.fechaFinal = fechaFinal;
    }

}
