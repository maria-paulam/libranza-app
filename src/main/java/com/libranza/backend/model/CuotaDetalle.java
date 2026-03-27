package com.libranza.backend.model;

public class CuotaDetalle {
    private int numeroCuota;
    private double abonoCapital;
    private double interes;
    private double saldoRestante;

    public CuotaDetalle(int numeroCuota, double abonoCapital, double interes, double saldoRestante) {
        this.numeroCuota = numeroCuota;
        this.abonoCapital = abonoCapital;
        this.interes = interes;
        this.saldoRestante = saldoRestante;
    }

    public int getNumeroCuota() { return numeroCuota; }
    public double getAbonoCapital() { return abonoCapital; }
    public double getInteres() { return interes; }
    public double getSaldoRestante() { return saldoRestante; }
}