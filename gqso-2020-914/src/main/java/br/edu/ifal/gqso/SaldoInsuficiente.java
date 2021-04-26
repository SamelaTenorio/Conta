package br.edu.ifal.gqso;

public class SaldoInsuficiente extends Exception {

    public SaldoInsuficiente() {
        super("Saldo insuficiente");
    }
}