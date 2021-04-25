package br.edu.ifal.gqso;

public class Conta{

    //atributos

    private String nome;
    private String cpf;
    private int numero;
    private double saldo;

    //construtor

    public Conta(String nome, String cpf, int numero, double saldo) {
        this.setNome(nome);
        this.setCpf(cpf);
        this.setNumero(numero);
        this.setSaldo(saldo);
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

}