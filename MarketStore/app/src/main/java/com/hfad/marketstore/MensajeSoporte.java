package com.hfad.marketstore;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MensajeSoporte extends AppCompatActivity {

    EditText txt_correo, txt_asunto, txt_mensaje;
    Button btn_enviar_msj;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mensaje_soporte);

        txt_correo = findViewById(R.id.etxt_correo_soporte);
        txt_asunto = findViewById(R.id.etxt_asunto_soporte);
        txt_mensaje = findViewById(R.id.etxt_mensaje);
        btn_enviar_msj = findViewById(R.id.btn_enviar_mensaje);

        btn_enviar_msj.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("mailto:"+txt_correo.getText().toString()));
                intent.putExtra(Intent.EXTRA_SUBJECT, txt_asunto.getText().toString());
                intent.putExtra(Intent.EXTRA_TEXT, txt_mensaje.getText().toString());

                startActivity(intent);
            }
        });
    }
}