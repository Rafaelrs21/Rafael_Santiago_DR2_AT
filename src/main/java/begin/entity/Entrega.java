package begin.entity;

import begin.enums.TipoFrete;

public final class Entrega {
    private final String endereco;
    private final double peso;
    private final TipoFrete tipoFrete;
    private final String destinatario;

    public Entrega(String endereco, double peso, TipoFrete tipoFrete, String destinatario) {
        if (endereco == null || endereco.isBlank()) {
            throw new IllegalArgumentException("Endereço não pode ser vazio.");
        }
        if (peso <= 0) {
            throw new IllegalArgumentException("Peso deve ser maior que zero.");
        }
        if (tipoFrete == null) {
            throw new IllegalArgumentException("Tipo de frete não pode ser nulo.");
        }
        if (destinatario == null || destinatario.isBlank()) {
            throw new IllegalArgumentException("Destinatário não pode ser vazio.");
        }
        this.endereco = endereco;
        this.peso = peso;
        this.tipoFrete = tipoFrete;
        this.destinatario = destinatario;
    }

    public String getEndereco() { return endereco; }
    public double getPeso() { return peso; }
    public TipoFrete getTipoFrete() { return tipoFrete; }
    public String getDestinatario() { return destinatario; }
}