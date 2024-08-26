package com.example.radarinteligente;

import java.util.HashMap;
import java.util.Map;
import com.example.radarinteligente.TipoVeiculo;

public class VelocidadeDao {
    static Map<Integer, VelocidadeVeiculo> velocidadesPorId = new HashMap<>();

    static void carregarVelocidades() {
        velocidadesPorId.put(1, new VelocidadeVeiculo(50.00F, false, TipoVeiculo.CARRO_MEDIO));
        velocidadesPorId.put(2, new VelocidadeVeiculo(60.00F, false, TipoVeiculo.CARRO_MEDIO));
        velocidadesPorId.put(3, new VelocidadeVeiculo(70.00F, false, TipoVeiculo.CARRO_MEDIO));
        velocidadesPorId.put(4, new VelocidadeVeiculo(80.00F, true, TipoVeiculo.CARRO_MEDIO));
        velocidadesPorId.put(5, new VelocidadeVeiculo(90.00F, false, TipoVeiculo.CARRO_MEDIO));
        velocidadesPorId.put(6, new VelocidadeVeiculo(50.00f, false, TipoVeiculo.CARRO_MEDIO));
        velocidadesPorId.put(7, new VelocidadeVeiculo(50.00f, true, TipoVeiculo.CARRO_MEDIO));
    }

    static void cadastrarVelocidade(Float velocidade, Boolean acidente, String tipoVeiculo) {
        Integer proximoId = velocidadesPorId.size() + 1;
        TipoVeiculo tipo = TipoVeiculo.fromString(tipoVeiculo);
        VelocidadeVeiculo velocidadeVeiculo = new VelocidadeVeiculo(velocidade, acidente, tipo);
        velocidadesPorId.put(proximoId, velocidadeVeiculo);
    }


}
