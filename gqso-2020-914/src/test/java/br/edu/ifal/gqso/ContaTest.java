package br.edu.ifal.gqso;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;


public class ContaTest {

    private Conta conta;

    @BeforeEach
    public void setUp() {
        this.conta = new Conta("Sâmela Tenório","000000000-00",123, 0.0);
    }

    @Test
    public void getSaldoTest(){
        assertEquals(0.0, conta.getSaldo());
    }

    @Test
    public void depositoTest(){
        conta.deposito(100.0);
    }
    
    @Test
    public void saqueTest(){
        conta.saque(50.0);
    }

    @Test
    public void exceptionTest(){
        
    }
}
