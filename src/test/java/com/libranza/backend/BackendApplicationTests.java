package com.libranza.backend;

import com.libranza.backend.model.SimulacionResponse;
import com.libranza.backend.service.LibranzaService;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class BackendApplicationTests {

    private final LibranzaService service = new LibranzaService();

    @Test
    void cuotaMensualCorrecta() {
        SimulacionResponse response = service.simular(10000000, 12, 12);
        assertEquals(888487.89, response.getCuotaMensual(), 1.0);
    }

    @Test
    void saldoFinalCero() {
        SimulacionResponse response = service.simular(10000000, 12, 12);
        double saldoFinal = response.getTablaPagos().get(11).getSaldoRestante();
        assertTrue(Math.abs(saldoFinal) < 1.0);
    }
}