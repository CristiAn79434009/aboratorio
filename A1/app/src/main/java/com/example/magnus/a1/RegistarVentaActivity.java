package com.example.magnus.a1;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class RegistarVentaActivity extends AppCompatActivity {


     Button Registro1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_registar_venta);

         Registro1 = (Button) findViewById(R.id.boton_siguiente_registro1);
    }
     public void CotinueACamara(View view) {
      switch (view.getId()){
        case R.id.boton_siguiente_registro1:
        Intent miIntent=new Intent(RegistarVentaActivity.this,CargarImagenActivity.class);
                startActivity(miIntent);
                break;

        }
   }
}
