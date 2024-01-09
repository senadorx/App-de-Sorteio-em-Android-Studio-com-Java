package com.example.appdesorteio;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

import java.util.Random;


public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void sortear(View view) {
        TextView txtResultado;

        txtResultado = findViewById(R.id.txtResultado);

        int numero = new Random().nextInt(11);

        txtResultado.setText("O número sorteado foi " + numero);

        Toast.makeText(this, "Sorteio gerado com Sucesso!",
                Toast.LENGTH_SHORT).show();


    }


}