package com.dacti;

public class CalculoHoraValorInicial implements Calculo {
    private int valorInicial;
    private int limHorasInicial;
    private int valorHoraExcedente;

    public CalculoHoraValorInicial(int valorInicial, int limHorasInicial, int valorHoraExcedente) {
        this.valorInicial = valorInicial;
        this.limHorasInicial = limHorasInicial;
        this.valorHoraExcedente = valorHoraExcedente;
    }

    @Override
    public int calcularTarifa(int qtdHoras) {
        int valor = this.valorInicial;
        valor += (qtdHoras - this.limHorasInicial) * this.valorHoraExcedente;
        return valor;
    }
}
