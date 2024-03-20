package com.example.myapk;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class SecondActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        Button volverButton = findViewById(R.id.volver);
        volverButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Crea un intent para volver a la actividad anterior
                Intent intent = new Intent(SecondActivity.this, MainActivity.class);
                startActivity(intent); // Inicia la actividad principal
                finish(); // Cierra la actividad actual
            }
        });
    }
}
