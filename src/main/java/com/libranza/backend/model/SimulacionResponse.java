package com.libranza.backend.model;

import java.util.List;

public class SimulacionResponse {
    private double cuotaMensual;
    private List<CuotaDetalle> tablaPagos;

    public SimulacionResponse(double cuotaMensual, List<CuotaDetalle> tablaPagos) {
        this.cuotaMensual = cuotaMensual;
        this.tablaPagos = tablaPagos;
    }

    public double getCuotaMensual() { return cuotaMensual; }
    public List<CuotaDetalle> getTablaPagos() { return tablaPagos; }
}