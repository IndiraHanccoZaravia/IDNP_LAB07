package com.example.idnp_lab07;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Ejercicio2 extends AppCompatActivity {
    Button fragmentbtn,fragment2btn;

    Fragment1 fragment1 = new Fragment1();
    Fragment2 fragment2 = new Fragment2();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ejercicio2);

        getSupportFragmentManager().beginTransaction().replace(R.id.framelayout, fragment1).commit();

        fragmentbtn = findViewById(R.id.fragmentbtn);
        fragment2btn = findViewById(R.id.fragment2btn);

        fragment2btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                getSupportFragmentManager().beginTransaction().replace(R.id.framelayout, fragment2).commit();

            }
        });

        fragmentbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                getSupportFragmentManager().beginTransaction().replace(R.id.framelayout, fragment1).commit();

            }
        });
    }
}