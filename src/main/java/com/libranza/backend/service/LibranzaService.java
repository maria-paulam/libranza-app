package com.libranza.backend.service;

import com.libranza.backend.model.CuotaDetalle;
import com.libranza.backend.model.SimulacionResponse;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class LibranzaService {

    public SimulacionResponse simular(double monto, double tasaAnual, int plazo) {
        double tasaMensual = tasaAnual / 100 / 12;
        double cuota = monto * (tasaMensual * Math.pow(1 + tasaMensual, plazo))
                / (Math.pow(1 + tasaMensual, plazo) - 1);

        List<CuotaDetalle> tabla = new ArrayList<>();
        double saldo = monto;

        for (int i = 1; i <= plazo; i++) {
            double interes = saldo * tasaMensual;
            double capital = cuota - interes;
            saldo -= capital;
            tabla.add(new CuotaDetalle(i, Math.round(capital * 100.0) / 100.0,
                    Math.round(interes * 100.0) / 100.0,
                    Math.round(saldo * 100.0) / 100.0));
        }

        return new SimulacionResponse(Math.round(cuota * 100.0) / 100.0, tabla);
    }
}