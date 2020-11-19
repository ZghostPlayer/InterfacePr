package com.zghoststudios.aninterface;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import java.text.DecimalFormat;

public class Mesomorfo extends AppCompatActivity {

    TextView textDig, textR, textB, textC;
    Button buttonCal;
    EditText editCal;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_endormorfo);

        textDig = findViewById(R.id.textDigite);
        textR = findViewById(R.id.textRun);
        textB = findViewById(R.id.textBurpees);
        textC = findViewById(R.id.textCorda);
        buttonCal = findViewById(R.id.buttonCalcular);
        editCal = findViewById(R.id.editCalorias);

        buttonCal.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Double cal, corrida, burpee, corda, mesomorfo;
                cal = Double.parseDouble(editCal.getText().toString());
                /* O valor aproximado foi calculado com base em uma pessoa mesomorfa que é a base,
               a partir dai sabe-se que o biotipo base não necessita de intensidade nem a mais
               nem a menos*/
                mesomorfo = cal;

                // uma pessoa gasta aproximadamente 10 calorias por minuto correndo
                corrida = mesomorfo/10;
                //uma pessoa gasta aproximadamente 1.43 calorias por burpee
                burpee = mesomorfo/1.43;
                //Uma pessoa gasta aproximadamente 12 calorias por minuto pulando corda
                corda = mesomorfo/12;

                DecimalFormat df = new DecimalFormat("0.0");

                textR.setText(df.format(corrida));
                textB.setText(df.format(burpee));
                textC.setText(df.format(corda));



            }
        });


    }
}