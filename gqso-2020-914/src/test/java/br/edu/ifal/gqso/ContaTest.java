package br.edu.ifal.gqso;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

import br.edu.ifal.gqso.Conta.SaldoInsulficiente;

public class ContaTest {
    
    @Test
    public void contaTest() throws SaldoInsulficiente{
        Conta conta = new Conta("Sâmela Tenório", "000000000-00",123, 0.0);   
        assertEquals(0.0, conta.getSaldo());
        conta.deposito(100.0);
        assertEquals(100.0, conta.getSaldo());
        conta.saque(50.0);
        assertEquals(50.0, conta.getSaldo());
        conta.saque(55.0);
    }
}
