package com.sms.carm.model;

import java.util.Date;

public class Servicio {

    private Long idService;
    private String nameService;
    private Date fechaInicio;
    private Date fechaFin;
    private double price;

    public Servicio( ) {

    }

    public Servicio(Long idService, String nameService) {
        this.idService = idService;
        this.nameService = nameService;

    }

    public Long getIdService() {
        return idService;
    }

    public void setIdService(Long idService) {
        this.idService = idService;
    }

    public String getNameService() {
        return nameService;
    }

    public void setNameService(String nameService) {
        this.nameService = nameService;
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

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }
}
