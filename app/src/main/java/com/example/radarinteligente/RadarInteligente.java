package com.example.radarinteligente;

import java.util.Map;
public class RadarInteligente {
    private Map<Integer, VelocidadeVeiculo> velocidadesPorAcidente = VelocidadeDao.velocidadesPorId;
    private float velocidadeMediaSemAcidente;

    public float calcularVelocidadeMediaSemAcidente() {
        float somaVelocidades = 0;
        int quantidadeVelocidades = 0;

        for (int id : velocidadesPorAcidente.keySet()) {
            VelocidadeVeiculo velocidadeVeiculo = velocidadesPorAcidente.get(id);
            if (!velocidadeVeiculo.ocorreuAcidente()) {
                somaVelocidades += velocidadeVeiculo.getVelocidade();
                quantidadeVelocidades++;
            }
        }

        velocidadeMediaSemAcidente = somaVelocidades / quantidadeVelocidades;

        return velocidadeMediaSemAcidente;
    }

    public boolean velocidadePermitida(float velocidade) {
        return velocidade <= velocidadeMediaSemAcidente;
    }

    public Map<Integer, VelocidadeVeiculo> getVelocidadesPorAcidente() {
        return velocidadesPorAcidente;
    }

    public float getVelocidadeMediaSemAcidente() {
        return velocidadeMediaSemAcidente;
    }
}
