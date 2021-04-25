package br.edu.ifal.gqso;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import br.edu.ifal.gqso.Calculadora.DivisaoPorZero;
import br.edu.ifal.gqso.Calculadora.ParametroInvalido;

public class CalculadoraTest {

    private Calculadora calc;

    @BeforeEach
    public void setUp() {
        this.calc = new Calculadora();
    }

    @Test
    public void somaTest() {
        assertEquals(2, calc.soma(1, 1));
        assertEquals(1, calc.soma(2, -1));
    }

    @Test
    public void execTest() throws ParametroInvalido {
        // Soma
        assertEquals(11, calc.exec("10+1"));
        assertThrows(
            ParametroInvalido.class,
            () -> calc.exec("1.5+1"));
        assertThrows(
            ParametroInvalido.class,
            () -> calc.exec("teste+1"));

        // Divisão
        // TODO(danielfireman): modificar o método
        // exec para suportar divisões.
        assertEquals(2, calc.exec("4/2"));
    }

    @Test
    public void divideTest() throws DivisaoPorZero{
        assertEquals(2, calc.divide(4,2));
        assertEquals(0.5, calc.divide(2,4));
        assertThrows(
            DivisaoPorZero.class,
            () -> calc.divide(2,0));
    }
}
