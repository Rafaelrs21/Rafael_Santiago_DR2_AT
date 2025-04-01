package refact.services;

import refact.entity.Entrega;
import refact.factory.FreteFactory;
import refact.interfaces.EtiquetaFormatter;

import java.util.Objects;

public class EtiquetaService {
    private final EtiquetaFormatter etiquetaFormatter;

    public EtiquetaService(EtiquetaFormatter etiquetaFormatter) {
        this.etiquetaFormatter = Objects.requireNonNull(etiquetaFormatter);
    }

    public String gerarEtiqueta(Entrega entrega) {
        double frete = FreteFactory.obterCalculadora(entrega.getTipoFrete()).calcular(entrega.getPeso());
        return etiquetaFormatter.formatar(entrega, frete);
    }
}
