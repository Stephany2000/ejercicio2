package com.example.datosejercicio3;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button btn = (Button) findViewById(R.id.boton);
        EditText nombre = (EditText) findViewById(R.id.txtnombre);
        EditText apellido = (EditText) findViewById(R.id.txtapellido);
        EditText edad = (EditText) findViewById(R.id.txtedad);
        EditText correo = (EditText) findViewById(R.id.txtcorreo);



        btn.setOnClickListener(

                new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        String n = nombre.getText().toString();
                        String a = apellido.getText().toString();
                        String e = edad.getText().toString();
                        String c = correo.getText().toString();


                      Intent pantalla = new Intent(getApplicationContext(),SecondActivity.class);
                      pantalla.putExtra("NOMBRE",n);
                      pantalla.putExtra("APELLIDO",a);
                      pantalla.putExtra("EDAD",e);
                      pantalla.putExtra("CORREO",c);

                      startActivity(pantalla);

                    }
                }

        );
    }
}