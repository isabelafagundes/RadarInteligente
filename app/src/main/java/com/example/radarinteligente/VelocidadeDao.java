package com.example.radarinteligente;

import java.util.HashMap;
import java.util.Map;

public class VelocidadeDao {
    static Map<Integer, VelocidadeVeiculo> velocidadesPorId = new HashMap<>();

    static void carregarVelocidades() {
        velocidadesPorId.put(1, new VelocidadeVeiculo(50.00F, false));
        velocidadesPorId.put(2, new VelocidadeVeiculo(60.00F, false));
        velocidadesPorId.put(3, new VelocidadeVeiculo(70.00F, false));
        velocidadesPorId.put(4, new VelocidadeVeiculo(80.00F, true));
        velocidadesPorId.put(5, new VelocidadeVeiculo(90.00F, false));
        velocidadesPorId.put(6, new VelocidadeVeiculo(50.00f, false));
        velocidadesPorId.put(7, new VelocidadeVeiculo(50.00f, true));
    }

    static void cadastrarVelocidade(Float velocidade, Boolean acidente) {
        Integer proximoId = velocidadesPorId.size() + 1;
        VelocidadeVeiculo velocidadeVeiculo = new VelocidadeVeiculo(velocidade, acidente);
        velocidadesPorId.put(proximoId, velocidadeVeiculo);
    }


}
