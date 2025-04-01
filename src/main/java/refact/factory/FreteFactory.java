package refact.factory;

import refact.interfaces.CalculadoraFrete;

import java.util.HashMap;
import java.util.Map;

public class FreteFactory {
    private static final Map<String, CalculadoraFrete> FRETE_MAP = new HashMap<>();

    static {
        registrarFrete("EXP", peso -> peso * 1.5 + 10);
        registrarFrete("PAD", peso -> peso * 1.2);
        registrarFrete("ECO", peso -> peso * 1.1 - 5);
    }

    public static void registrarFrete(String tipo, CalculadoraFrete estrategia) {
        FRETE_MAP.put(tipo, estrategia);
    }

    public static CalculadoraFrete obterCalculadora(String tipo) {
        return FRETE_MAP.getOrDefault(tipo, peso -> 0);
    }
}
