package begin.services;

import begin.entity.Entrega;
import begin.interfaces.CalculadoraFrete;

import java.util.Objects;

public class EtiquetaService {
    private final CalculadoraFrete calculadoraFrete;

    public EtiquetaService(CalculadoraFrete calculadoraFrete) {
        this.calculadoraFrete = Objects.requireNonNull(calculadoraFrete);
    }

    public String gerarEtiqueta(Entrega entrega) {
        double frete = calculadoraFrete.calcular(entrega.getPeso());
        return "Destinatário: " + entrega.getDestinatario() +
                "\nEndereço: " + entrega.getEndereco() +
                "\nValor do Frete: R$" + frete;
    }

    public String gerarResumoPedido(Entrega entrega) {
        double frete = calculadoraFrete.calcular(entrega.getPeso());
        return "Pedido para " + entrega.getDestinatario() +
                " com frete tipo " + entrega.getTipoFrete() +
                " no valor de R$" + frete;
    }
}