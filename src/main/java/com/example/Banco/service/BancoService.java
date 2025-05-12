package com.example.Banco.service;

import com.example.Banco.model.BancoModelo;
import org.springframework.stereotype.Service;

@Service
public class BancoService {
    public void calcularDatos(BancoModelo cliente) {
        double saldoActual = cliente.getSaldoAnterior() + cliente.getCompras() - cliente.getPago();
        cliente.setSaldoActual(saldoActual);

        double pagoMinimo = saldoActual * 0.15;
        double pagoNoIntereses = saldoActual * 0.85;

        cliente.setPagoMinimo(pagoMinimo);
        cliente.setPagoNoIntereses(pagoNoIntereses);

        if (cliente.getPago() < pagoMinimo) {
            double interes = saldoActual * 0.12 + 200;
            cliente.setInteresGenerado(interes);
            cliente.setMoroso(true);
        } else {
            cliente.setInteresGenerado(0);
            cliente.setMoroso(false);
        }
    }
}
