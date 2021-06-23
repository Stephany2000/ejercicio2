package com.example.datosejercicio3;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.EditText;

public class SecondActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        Intent pantalla = getIntent();
        String n = pantalla.getStringExtra("NOMBRE");
        String a = pantalla.getStringExtra("APELLIDO");
        String e = pantalla.getStringExtra("EDAD");
        String c = pantalla.getStringExtra("CORREO");

        EditText informacion1 = (EditText) findViewById(R.id.txtinformacion1);
        EditText informacion2 = (EditText) findViewById(R.id.txtinformacion2);
        EditText informacion3 = (EditText) findViewById(R.id.txtinformacion3);
        EditText informacion4 = (EditText) findViewById(R.id.txtinformacion4);

        informacion1.setText("NOMBRE:"+n);
        informacion2.setText("APELLIDO:"+a);
        informacion3.setText("EDAD:"+e);
        informacion4.setText("CORREO:"+c);




    }
}