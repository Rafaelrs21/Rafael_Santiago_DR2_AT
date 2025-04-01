package begin.fretes;

import begin.interfaces.CalculadoraFrete;

public class FretePadrao implements CalculadoraFrete {
    @Override
    public double calcular(double peso) {
        return peso * 1.2;
    }
}
