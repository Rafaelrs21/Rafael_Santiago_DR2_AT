package refact.interfaces;

import refact.entity.Entrega;

public interface EtiquetaFormatter {
    String formatar(Entrega entrega, double valorFrete);
}