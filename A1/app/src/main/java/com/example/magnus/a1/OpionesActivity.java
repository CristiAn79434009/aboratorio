package com.example.magnus.a1;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class OpionesActivity extends AppCompatActivity {

    Button casa, departamento, condominio, publicidad;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_opiones);

        casa = (Button) findViewById(R.id.registro_casa);
        condominio = (Button) findViewById(R.id.registro_departamneto);
        departamento = (Button) findViewById(R.id.registro_condominio);
        publicidad = (Button) findViewById(R.id.publicados);
        publicidad.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intentpubli=new Intent(getApplicationContext(), PublicidadesActivity.class);
                startActivity(intentpubli);
            }
        });




    }

    public void CasaAlquiler(View view) {
        switch (view.getId()) {
            case R.id.registro_casa:
                Intent miIntent = new Intent(OpionesActivity.this, RegistarVentaActivity.class);
                startActivity(miIntent);
                break;
            case R.id.registro_departamneto:
                Intent dosIntent = new Intent(OpionesActivity.this, RegistarVentaActivity.class);
                startActivity(dosIntent);
                break;
            case R.id.registro_condominio:
                Intent tresIntent = new Intent(OpionesActivity.this, RegistarVentaActivity.class);
                startActivity(tresIntent);
                break;
        }
    }


}

