package com.example.radarinteligente;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioGroup;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    // Variáveis sendo inicializadas
    EditText editVelocidade;
    Button btnVerificar;
    TextView textResultado;
    RadioGroup radioGroup;

    // Instanciar classe
    RadarInteligente radarInteligente;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Inicialização dos componentes, xml
        editVelocidade = findViewById(R.id.editVelocidade);
        radioGroup = findViewById(R.id.radioGroup);
        btnVerificar = findViewById(R.id.btnVerificar);
        textResultado = findViewById(R.id.textResultado);

        // Carregar as velocidades existentes
        VelocidadeDao.carregarVelocidades();

        // Instância
        radarInteligente = new RadarInteligente();
        radarInteligente.calcularVelocidadeMediaSemAcidente();

        // Configurando o botão
        btnVerificar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                String velocidadeStr = editVelocidade.getText().toString();

                // Função para verificar se os campos não estão vazios
                if (!velocidadeStr.isEmpty()) {
                    float velocidade = Float.parseFloat(velocidadeStr);

                    // Obtém o ID do RadioButton selecionado
                    int selectedId = radioGroup.getCheckedRadioButtonId();
                    boolean acidente;

                    // Verifica qual RadioButton foi selecionado
                    if (selectedId == R.id.radioButton2) {
                        acidente = true; // Sim
                    } else if (selectedId == R.id.radioButton) {
                        acidente = false; // Não
                    } else {
                        textResultado.setText("Por favor, selecione se houve acidente.");
                        return;
                    }

                    // Cadastrar a nova velocidade e o acidente
                    VelocidadeDao.cadastrarVelocidade(velocidade, acidente);

                    // Atualizando a média de velocidade sem acidente
                    radarInteligente.calcularVelocidadeMediaSemAcidente();

                    // Função para verificar se a velocidade é permitida
                    if (radarInteligente.velocidadePermitida(velocidade)) {
                        textResultado.setText("Velocidade permitida. Velocidade média permitida: " + radarInteligente.getVelocidadeMediaFormatada() + " Km/h");
                    } else {
                        textResultado.setText("Multado! Velocidade excedida. Velocidade média permitida: " + radarInteligente.getVelocidadeMediaFormatada() + " Km/h");
                    }
                } else {
                    textResultado.setText("Por favor, insira a velocidade.");
                }
            }
        });
    }
}
