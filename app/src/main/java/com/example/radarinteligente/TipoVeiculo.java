package com.example.radarinteligente;

public enum TipoVeiculo {

    Carro_PEQUENO("Carro Pequeno"),
    CARRO_MEDIO("Carro Médio"),
    CARRO_GRANDE("Carro Grande");

    private final String valor;

    TipoVeiculo(String valor) {
        this.valor = valor;
    }

    public String getValor() {
        return valor;
    }

    public static TipoVeiculo fromString(String tipo) {
        for (TipoVeiculo t : TipoVeiculo.values()) {
            if (t.getValor().equalsIgnoreCase(tipo)) {
                return t;
            }
        }
        throw new IllegalArgumentException("Tipo de veículo inválido: " + tipo);
    }

}
