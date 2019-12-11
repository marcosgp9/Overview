package com.example.overview;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    private TextView view;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void seleccionarActividad(View view){
        switch (view.getId()){
            case R.id.boton1:
                mostrarMensaje1(view);
                abrirActividad(Activity2.class);
                break;
            case R.id.boton2:
                mostrarMensaje2(view);
                abrirActividad((Activity2.class));
                break;
            case R.id.boton3:
                mostrarMensaje3(view);
                abrirActividad((Activity2.class));
                break;
        }
    }

    public void abrirActividad(Class c){
        Intent intent = new Intent(this,c);
        startActivity(intent);
    }

    public void mostrarMensaje1(View view){
        Toast.makeText(this,"You ordered a Donut.",Toast.LENGTH_LONG).show();
    }

    public void mostrarMensaje2(View view){
        Toast.makeText(this,"You ordered an ice cream sandwich.",Toast.LENGTH_LONG).show();
    }

    public void mostrarMensaje3(View view){
        Toast.makeText(this,"You ordered a yogurt.",Toast.LENGTH_LONG).show();
    }

}
