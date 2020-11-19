package com.zghoststudios.aninterface;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    TextView textSel;
    Button buttonEc, buttonMe, buttonEn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        buttonEc = findViewById(R.id.buttonEcto);
        buttonMe = findViewById(R.id.buttonMeso);
        buttonEn = findViewById(R.id.buttonEndo);

        buttonEn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent intent = new Intent(MainActivity.this, Endormorfo.class);
                startActivity(intent);
            }
        });

        buttonMe.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent intent2 = new Intent(MainActivity.this, Mesomorfo.class);
                startActivity(intent2);
            }
        });

        buttonEc.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent intent3 = new Intent(MainActivity.this, Ectomorfo.class);
                startActivity(intent3);
            }
        });

    }
}