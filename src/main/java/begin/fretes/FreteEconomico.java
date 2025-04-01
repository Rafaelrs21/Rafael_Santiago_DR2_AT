package begin.fretes;

import begin.interfaces.CalculadoraFrete;

public class FreteEconomico implements CalculadoraFrete {
    @Override
    public double calcular(double peso) {
        return peso * 1.1 - 5;
    }
}
