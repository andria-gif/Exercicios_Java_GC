package Exercicio06;

import java.util.Scanner;

public class ContaBancaria {
    private double saldo;

    public ContaBancaria(double saldoInicial) {
        this.saldo = saldoInicial;
    }

    public void saca(double valor) throws SaldoInsuficiente {
        if (saldo < valor) {
            throw new
                    SaldoInsuficiente("Saldo insuficiente");
        }
        saldo -= valor;

    }
}
