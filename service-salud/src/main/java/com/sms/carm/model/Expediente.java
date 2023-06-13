package com.sms.carm.model;

import java.util.Date;

public class Expediente {

    private Long idExpediente;
    private String nameExpediente;
    private int numeroExpediente;
    private Date fechaInicio;
    private Date fechaFin;

    public Expediente(Long idExpediente) {
        this.idExpediente = idExpediente;
    }

    public Expediente(Long idExpediente, String nameExpediente, int numeroExpediente) {
        this.idExpediente = idExpediente;
        this.nameExpediente = nameExpediente;
        this.numeroExpediente = numeroExpediente;

    }

    public Long getIdExpediente() {
        return idExpediente;
    }

    public void setIdExpediente(Long idExpediente) {
        this.idExpediente = idExpediente;
    }

    public String getNameExpediente() {
        return nameExpediente;
    }

    public void setNameExpediente(String nameExpediente) {
        this.nameExpediente = nameExpediente;
    }

    public int getNumeroExpediente() {
        return numeroExpediente;
    }

    public void setNumeroExpediente(int numeroExpediente) {
        this.numeroExpediente = numeroExpediente;
    }

    public Date getFechaInicio() {
        return fechaInicio;
    }

    public void setFechaInicio(Date fechaInicio) {
        this.fechaInicio = fechaInicio;
    }

    public Date getFechaFin() {
        return fechaFin;
    }

    public void setFechaFin(Date fechaFin) {
        this.fechaFin = fechaFin;
    }
}
