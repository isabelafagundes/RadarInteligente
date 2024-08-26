package com.example.radarinteligente;


public class VelocidadeVeiculo {
    private float velocidade;
    private boolean acidente;
    private TipoVeiculo tipoVeiculo;

    public VelocidadeVeiculo(float velocidade, boolean acidente, TipoVeiculo tipoVeiculo) {
        this.velocidade = velocidade;
        this.acidente = acidente;
        this.tipoVeiculo = tipoVeiculo;
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

    public TipoVeiculo getTipoVeiculo() {
        return tipoVeiculo;
    }

    public void setTipoVeiculo(TipoVeiculo tipoVeiculo) {
        this.tipoVeiculo = tipoVeiculo;
    }
}
