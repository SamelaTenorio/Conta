package br.edu.ifal.gqso;

public class Calculadora {
    // Exceção lançada quando um parâmetro inválido
    // é passado.
    public class ParametroInvalido extends Exception {
    }

    public class DivisaoPorZero extends Exception {

    }

    public double soma(int parcela1, int parcela2) {
        return parcela1 + parcela2;
    }

    public double exec(String formula)
        throws ParametroInvalido {
        String[] parcelas = formula.split("\\+");
        try {
            int parc1 = Integer.parseInt(parcelas[0]);
            int parc2 = Integer.parseInt(parcelas[1]);
            return soma(parc1, parc2);
        } catch (NumberFormatException nfe) {
            throw new ParametroInvalido();
        }
    }

    public double divide(int div1, int div2) throws DivisaoPorZero {
        if (div2 == 0) {
            throw new DivisaoPorZero();
        }
        return (double)div1/(double)div2;
    }
}