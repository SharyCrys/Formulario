package com.example.quiz;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Pregunta1 extends AppCompatActivity implements View.OnClickListener {

    Button a,b,c,d;
    int calificacion= 0;
    Intent i;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.pregunta1);

        i = new Intent(Pregunta1.this,Pregunta2.class);
        a = (Button)findViewById(R.id.a1);
        b = (Button)findViewById(R.id.b1);
        c = (Button)findViewById(R.id.c1);
        d = (Button)findViewById(R.id.d1);
        a.setOnClickListener(this);
        b.setOnClickListener(this);
        c.setOnClickListener(this);
        d.setOnClickListener(this);

    }

    @Override
    public void onClick(View v) {

        switch (v.getId()){

            case R.id.a1:

                calificacion = 0;

                break;

            case R.id.b1: // Respuesta correcta

                calificacion = 20;

                break;

            case R.id.c1:

                calificacion = 0;


                break;

            case R.id.d1:

                calificacion = 0;


                break;

                default:
                    break;
        }
        i.putExtra("calificacion",calificacion);
        startActivity(i);
    }

}
