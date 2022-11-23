package com.example.idnp_lab07;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button btnPrimerEjercicio = findViewById(R.id.btnPrimerEjercicio);
        btnPrimerEjercicio.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), Ejercicio1.class);
                startActivity(intent);
            }
        });


        Button btnSegundoEjercicio = findViewById(R.id.btnSegundoEjercicio);
        btnSegundoEjercicio.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), Ejercicio2.class);
                startActivity(intent);
            }
        });
    }
}