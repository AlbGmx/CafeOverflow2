package com.hfad.marketstore;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import java.util.List;

public class Pedidos extends AppCompatActivity {

    TextView txt_nombre_usuario_final, txt_tota_pagar, txt_no_pedido;
    EditText txt_correo_enviar_pedido;
    Button btn_enviar, btn_maps;
    int no_pedido=0, precio, cantidad;
    String Pedido_lista ="PEDIDO ACTUAL:\n";

    List<prod_carrito> lst2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pedidos);

        txt_nombre_usuario_final = findViewById(R.id.txt_nombre_usuario_final);
        txt_tota_pagar = findViewById(R.id.txt_tota_pagar);
        txt_no_pedido = findViewById(R.id.txt_no_pedido);
        txt_correo_enviar_pedido = findViewById(R.id.txt_correo_enviar_pedido);
        btn_enviar = findViewById(R.id.btn_emviar_pedido);
        btn_maps = findViewById(R.id.btn_maps);

        txt_nombre_usuario_final.setText(MainActivity.name_user);
        txt_tota_pagar.setText("$"+Integer.toString(CarritoAdapter.totals)+".00");

        no_pedido= (int) (Math.random() * 10000000 + 1000);
        txt_no_pedido.setText("#"+String.valueOf(no_pedido));


        btn_enviar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("mailto:"+txt_correo_enviar_pedido.getText().toString()));
                intent.putExtra(Intent.EXTRA_SUBJECT, "Pedido No."+txt_no_pedido.getText().toString()+" - Market Store");

               CarritoAdapter car = new CarritoAdapter(getBaseContext(), CarritoAdapter.lst);

               for (int i=0; i<car.getCount();i++){
                   prod_carrito c = CarritoAdapter.lst.get(i);
                   precio = Integer.parseInt(c.precio);
                   cantidad = c.cantidad;
                   Pedido_lista = (Pedido_lista + c.nombre +"\nCant: "+ c.cantidad +"\nP/unitario: $"+c.precio+".00\nSubtotal: $"+cantidad*precio+".00\n\n");
               }

               Pedido_lista = Pedido_lista + "Total a pagar: $"+txt_tota_pagar.getText().toString();
                intent.putExtra(Intent.EXTRA_TEXT,Pedido_lista);
                startActivity(intent);

            }
        });

        btn_maps.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Uri mercadosIntent = Uri.parse("geo:0,0?q=wallmart");
                Intent intent = new Intent(Intent.ACTION_VIEW, mercadosIntent);
                intent.setPackage("com.google.android.apps.maps");
                startActivity(intent);
            }
        });
    }
}