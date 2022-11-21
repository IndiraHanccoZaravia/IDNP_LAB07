package com.example.idnp_lab07;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.MenuItem;

import com.google.android.material.bottomnavigation.BottomNavigationItemView;
import com.google.android.material.bottomnavigation.BottomNavigationView;
import com.google.android.material.navigation.NavigationBarView;

public class Ejercicio1 extends AppCompatActivity {

    BottomNavigationView bottomNavigationView;
    InicioFragment inicioFragment = new InicioFragment();
    FinalFragment finalFragment = new FinalFragment();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ejercicio1);

        bottomNavigationView = findViewById(R.id.menu);
        getSupportFragmentManager().beginTransaction().replace(R.id.container, inicioFragment).commit();

        bottomNavigationView.setOnItemSelectedListener(new NavigationBarView.OnItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(MenuItem item) {
                switch (item.getItemId()) {
                    case R.id.fragment1:
                        getSupportFragmentManager().beginTransaction().replace(R.id.container, inicioFragment).commit();
                        return true;
                    case R.id.fragment2:
                        getSupportFragmentManager().beginTransaction().replace(R.id.container, finalFragment).commit();
                        return true;
                }
                return false;
            }
        });
    }
}