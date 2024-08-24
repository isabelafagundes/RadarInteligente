package com.example.radarinteligente;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        VelocidadeDao.carregarVelocidades();
        RadarInteligente radarInteligente = new RadarInteligente();

    }
}