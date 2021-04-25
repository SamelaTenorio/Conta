package br.edu.ifal.gqso;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class ContaTest {
    
    @Test
    public void contaTest(){
        Conta conta = new Conta("Sâmela Tenório", "000000000-00",123, 0.0);   
        assertEquals(0.0, conta.getSaldo());
        conta.deposito(100.0);
    }
}
