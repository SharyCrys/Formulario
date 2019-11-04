package com.example.quiz;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
    Intent i;
    Button iniciar;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        i = new Intent(MainActivity.this,Pregunta1.class);
        iniciar = (Button)findViewById(R.id.iniciar);
        iniciar.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {

                startActivity(i);

            }
        });

    }
}
