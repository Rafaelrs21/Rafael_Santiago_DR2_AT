package begin.fretes;

import begin.interfaces.CalculadoraFrete;

public class FreteExpresso implements CalculadoraFrete {
    @Override
    public double calcular(double peso) {
        return peso * 1.5 + 10;
    }
}

