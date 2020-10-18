package com.example.mateapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class KmM extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_km_m);

        final EditText edtKmProg = (EditText) findViewById(R.id.edtKm);
        final EditText edtMProg = (EditText) findViewById(R.id.edtMetro);
        Button btnConverterProg = (Button) findViewById(R.id.btnConverter);

        btnConverterProg.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                float km, m;
                km = Float.parseFloat(edtKmProg.getText().toString());
                m = km * 1000;
                edtMProg.setText(String.valueOf(m));
            }
        });
    }
}