package refact.etiqueta;

import refact.entity.Entrega;
import refact.interfaces.EtiquetaFormatter;

public class EtiquetaPadrao implements EtiquetaFormatter {
    @Override
    public String formatar(Entrega entrega, double valorFrete) {
        return "Destinatário: " + entrega.getDestinatario() +
                "\nEndereço: " + entrega.getEndereco() +
                "\nValor do Frete: R$" + valorFrete;
    }
}
