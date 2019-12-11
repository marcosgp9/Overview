package com.example.overview;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class Activity2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_2);
    }

    public void mostrarMensaje1(View view){
        Toast.makeText(this,"¡Choosen: Same day messenger service!",Toast.LENGTH_LONG).show();
    }

    public void mostrarMensaje2(View view){
        Toast.makeText(this,"Next day ground delivery",Toast.LENGTH_LONG).show();
    }

    public void mostrarMensaje3(View view){
        Toast.makeText(this,"Pick up",Toast.LENGTH_LONG).show();
    }
}
