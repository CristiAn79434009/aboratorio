package com.example.magnus.a1;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;


public class ContrasenaActivity extends AppCompatActivity {

    Button siguiente_opciones;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_contrasena);

        siguiente_opciones= (Button) findViewById(R.id.siguiente1);
        siguiente_opciones.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent opci=new Intent(getApplicationContext(), OpionesActivity.class);
                startActivity(opci);
            }
        });
    }
}
