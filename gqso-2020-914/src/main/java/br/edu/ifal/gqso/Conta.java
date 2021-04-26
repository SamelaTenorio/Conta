package br.edu.ifal.gqso;

public class Conta{

    //atributos

    private String nome;
    private String cpf;
    private int numero;
    private double saldo = 0.0;

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
    public double deposito(double valor) throws ParametroInvalido{
        if(valor == 0){
            throw new ParametroInvalido();
        }
        saldo += valor;
        return saldo;
    }

    public double saque(double valor) throws ParametroInvalido, SaldoInsuficiente{
        if (valor == 0) {
            throw new ParametroInvalido();
        }
        if (valor > saldo) {
            throw new SaldoInsuficiente();
        }
        saldo -= valor;
        return saldo;
        }
}
