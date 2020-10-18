package com.example.mateapp;

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

        // Botão de KM para Mt
        Button btnKmMtProg = (Button) findViewById(R.id.btnKmMt);
        //Botão de Mt para KM
        Button btnMtKmProg = (Button) findViewById(R.id.btnMtKm);

        btnKmMtProg.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, KmM.class);
                startActivity(intent);
            }
        });

        btnMtKmProg.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, MKm.class);
                startActivity(intent);
            }
        });
    }
}