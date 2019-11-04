package com.example.quiz;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class resultado extends AppCompatActivity {

    Intent i,recibe;
    Bundle bolsa;
    int calificacion = 0;
    Button empezar;
    TextView txt;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.resultado);

        empezar = (Button) findViewById(R.id.empezar);
        txt = (TextView)findViewById(R.id.resultado);
        i = new Intent(resultado.this,MainActivity.class);
        try {
            recibe = getIntent();
            bolsa = recibe.getExtras();
            calificacion = bolsa.getInt("calificacion");

            if (calificacion==20){

                txt.setText("Tu puntuación ha sido muy baja. Al parecer no tienes nada de cultura.");

            } else if (calificacion == 40){

                txt.setText("Tu puntación ha sido baja. Hay que repasar un poco más.");

            } else if (calificacion == 60){

                txt.setText("Tu puntación es regular. Nada mal, se puede mejorar");

            } else if (calificacion == 80){

                txt.setText("Tu puntación es alta. Ave Caesar!");

            } else if (calificacion == 100){

                txt.setText("¡Has acertado todas! Parece ser que has vivido en la época romana.");

            }

        } catch (Exception e) {

            Toast.makeText(this,"Error al recibir datos", Toast.LENGTH_SHORT).show();

        }

        empezar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(i);
            }
        });


    }
}
