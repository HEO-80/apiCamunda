package com.sms.carm.model;

import java.util.Date;

public class Procedimiento {

    private Long idProcedimiento;
    private String nameProcedimiento;
    private Date fechaInicio;
    private Date fechaFin;

    public Procedimiento( ) {

    }

    public Long getIdProcedimiento() {
        return idProcedimiento;
    }

    public void setIdProcedimiento(Long idProcedimiento) {
        this.idProcedimiento = idProcedimiento;
    }

    public String getNameProcedimiento() {
        return nameProcedimiento;
    }

    public void setNameProcedimiento(String nameProcedimiento) {
        this.nameProcedimiento = nameProcedimiento;
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

    public Procedimiento(Long idProcedimiento, String nameProcedimiento) {
        this.idProcedimiento = idProcedimiento;
        this.nameProcedimiento = nameProcedimiento;



    }
}
