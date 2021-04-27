package br.edu.ifal.gqso;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class ContaTest {

    private Conta conta;

    @BeforeEach
    public void setUp() {
        this.conta = new Conta("Sâmela Tenório","000000000-00",123, 0.0);
    }

    @Test
    public void ParametroInvalidoException(){
        assertThrows(ParametroInvalido.class, () -> conta.deposito(0.0));
        assertThrows(ParametroInvalido.class, () -> conta.saque(0.0));
    }

    @Test
    public void saqueSaldoInsuficiente(){
        assertThrows(SaldoInsuficiente.class, () -> conta.saque(74.0));
    }

    @Test
    public void getSaldoTest() throws ParametroInvalido, SaldoInsuficiente{
        conta.deposito(100.0);
        conta.saque(95.0);
        assertEquals(5.0, conta.getSaldo());
    }

    @Test
    public void depositoTest() throws ParametroInvalido{
        assertEquals(100.0, conta.deposito(100.0));
    }
    
    @Test
    public void saqueTest() throws ParametroInvalido, SaldoInsuficiente{
        conta.deposito(100.0);
        conta.saque(50.0);
        assertEquals(50.0, conta.getSaldo());
    }

}
