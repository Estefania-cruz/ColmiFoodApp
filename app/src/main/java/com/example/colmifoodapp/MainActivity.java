package com.example.colmifoodapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.content.Intent;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    Button btnIniciarSesion;
    EditText txtCorreo;
    EditText txtContrasennia;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnIniciarSesion = this.findViewById(R.id.btnIniciarSesion);
        txtCorreo = this.findViewById(R.id.txtCorreo);
        txtContrasennia = this.findViewById(R.id.txtContrasennia);

        btnIniciarSesion.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String t = txtCorreo.getText().toString();
                String tt = txtContrasennia.getText().toString();

                Intent intent = new Intent(MainActivity.this, Bienvenido.class);
                intent.putExtra("correo", t);
                intent.putExtra("contrasennia", tt);
                startActivity(intent);
                //Toast.makeText(MainActivity.this, t, Toast.LENGTH_SHORT).show();
            }
        });

    }

}