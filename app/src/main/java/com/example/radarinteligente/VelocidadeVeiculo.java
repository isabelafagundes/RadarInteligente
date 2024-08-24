package com.example.radarinteligente;

public class VelocidadeVeiculo {
    private float velocidade;
    private boolean acidente;

    public VelocidadeVeiculo(float velocidade, boolean acidente) {
        this.velocidade = velocidade;
        this.acidente = acidente;
    }

    public float getVelocidade() {
        return velocidade;
    }

    public void setVelocidade(float velocidade) {
        this.velocidade = velocidade;
    }

    public boolean ocorreuAcidente() {
        return acidente;
    }

    public void setAcidente(boolean acidente) {
        this.acidente = acidente;
    }
}
