package com.example.mateapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MKm extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_m_km);

        final EditText edtMProg = (EditText) findViewById(R.id.edtMetro);
        final EditText edtKmProg = (EditText) findViewById(R.id.edtKm);
        Button btnConverterProg = (Button) findViewById(R.id.btnConverter);

        btnConverterProg.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                float m, km;
                m = Float.parseFloat(edtMProg.getText().toString());
                km = m / 1000;
                edtKmProg.setText(String.valueOf(km));
            }
        });

    }
}