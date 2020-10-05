package com.zghoststudios.aninterface;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class Endormorfo extends AppCompatActivity {

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
                Double cal, corrida, burpee, corda, endomorfo;
                cal = Double.parseDouble(editCal.getText().toString());
                /* O valor aproximado foi calculado com base em uma pessoa mesomorfa que é a base,
               a partir dai segundo pesquisas presupõe-se que um endomorfo precisa de 25
               a mais de intensidade*/
                endomorfo = cal+(25/100*cal);

                // uma pessoa gasta aproximadamente 10 calorias por minuto correndo
                corrida = endomorfo/10;
                //uma pessoa gasta aproximadamente 1.43 calorias por burpee
                burpee = endomorfo/1.43;
                //Uma pessoa gasta aproximadamente 12 calorias por minuto pulando corda
                corda = endomorfo/12;

                textR.setText(corrida.toString());
                textB.setText(burpee.toString());
                textC.setText(corda.toString());



            }
        });


    }
}