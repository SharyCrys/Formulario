package com.example.quiz;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class Pregunta5 extends AppCompatActivity implements View.OnClickListener {

    Button a,b,c,d;
    int calificacion= 0;
    Intent i, recibe;
    Bundle bolsa;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.pregunta5);

        i = new Intent(Pregunta5.this,resultado.class);
        a = (Button)findViewById(R.id.a5);
        b = (Button)findViewById(R.id.b5);
        c = (Button)findViewById(R.id.c5);
        d = (Button)findViewById(R.id.d5);

        try {
            recibe = getIntent();
            bolsa = recibe.getExtras();
            calificacion = bolsa.getInt("calificacion");

        } catch (Exception e) {

            Toast.makeText(this,"Error al recibir datos", Toast.LENGTH_SHORT).show();

        }


        a.setOnClickListener(this);
        b.setOnClickListener(this);
        c.setOnClickListener(this);
        d.setOnClickListener(this);

    }

    @Override
    public void onClick(View v) {

        switch (v.getId()){

            case R.id.a5:

                calificacion += 0;

                break;

            case R.id.b5:

                calificacion += 0;

                break;

            case R.id.c5:

                calificacion += 0;


                break;

            case R.id.d5: // Respuesta correcta

                calificacion += 20;


                break;

            default:
                break;
        }
        i.putExtra("calificacion",calificacion);
        startActivity(i);
    }
}
