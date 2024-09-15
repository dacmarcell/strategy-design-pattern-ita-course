package com.dacti;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class TesteTarifaEstacionamento {
    @Test
    void tarifaFixaPorHora() {
        TarifaEstacionamento t = new TarifaEstacionamento(3, new CalculoHora(4));
        int valor = t.valor();
        assertEquals(12, valor);
    }

    @Test
    void tarifaComValorInicialDepoisFixaPorHora() {
        TarifaEstacionamento t = new TarifaEstacionamento(5, new CalculoHoraValorInicial(5, 3, 2));
        int valor = t.valor();
        assertEquals(9, valor);
    }

    @Test
    void tarifaComValorInicialDentroDoLimite() {
        TarifaEstacionamento t = new TarifaEstacionamento(2, new CalculoHoraValorInicial(5, 3, 2));
        int valor = t.valor();
        assertEquals(3, valor);
    }

    @Test
    void tarifaDiaria() {
        TarifaEstacionamento t = new TarifaEstacionamento(50, new CalculoDiaria(20));
        int valor = t.valor();
        assertEquals(60, valor);
    }

    @Test
    void tariaDiariaMenorQueUmDia() {
        TarifaEstacionamento t = new TarifaEstacionamento(10, new CalculoDiaria(20));
        int valor = t.valor();
        assertEquals(20, valor);
    }
}
