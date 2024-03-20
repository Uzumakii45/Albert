package com.example.myapk;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
    Button inicio;
    Button Registro;

    @SuppressLint("ResourceType")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        inicio = findViewById(R.id.inicio);
        Registro = findViewById(R.id.Registro); // Inicializa Registro

        Registro.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                setRegistro();
            }
        }); // Cierra correctamente el método onClick()

    }

    public void setRegistro() {
        Intent intent = new Intent(this, SecondActivity.class);
        startActivity(intent);
    }
}
