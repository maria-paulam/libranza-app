package com.libranza.backend.model;

public class SimulacionRequest {
    private double monto;
    private double tasaAnual;
    private int plazo;

    public double getMonto() { return monto; }
    public void setMonto(double monto) { this.monto = monto; }

    public double getTasaAnual() { return tasaAnual; }
    public void setTasaAnual(double tasaAnual) { this.tasaAnual = tasaAnual; }

    public int getPlazo() { return plazo; }
    public void setPlazo(int plazo) { this.plazo = plazo; }
}


