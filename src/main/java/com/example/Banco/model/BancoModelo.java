package com.example.Banco.model;

public class BancoModelo {
    private String nombre;
    private double saldoAnterior;
    private double compras;
    private double pago;
    private double saldoActual;
    private double pagoMinimo;
    private double pagoNoIntereses;
    private double interesGenerado;
    private boolean moroso;

    // Getters y setters
    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getSaldoAnterior() {
        return saldoAnterior;
    }
    public void setSaldoAnterior(double saldoAnterior) {
        this.saldoAnterior = saldoAnterior;
    }

    public double getCompras() {
        return compras;
    }
    public void setCompras(double compras) {
        this.compras = compras;
    }

    public double getPago() {
        return pago;
    }
    public void setPago(double pago) {
        this.pago = pago;
    }

    public double getSaldoActual() {
        return saldoActual;
    }
    public void setSaldoActual(double saldoActual) {
        this.saldoActual = saldoActual;
    }

    public double getPagoMinimo() {
        return pagoMinimo;
    }
    public void setPagoMinimo(double pagoMinimo) {
        this.pagoMinimo = pagoMinimo;
    }

    public double getPagoNoIntereses() {
        return pagoNoIntereses;
    }
    public void setPagoNoIntereses(double pagoNoIntereses) {
        this.pagoNoIntereses = pagoNoIntereses;
    }

    public double getInteresGenerado() { return interesGenerado; }
    public void setInteresGenerado(double interesGenerado) { this.interesGenerado = interesGenerado; }

    public boolean isMoroso() { return moroso; }
    public void setMoroso(boolean moroso) { this.moroso = moroso; }
}
