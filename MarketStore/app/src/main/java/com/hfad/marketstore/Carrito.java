package com.hfad.marketstore;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.telephony.CarrierConfigManager;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.AdapterView;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;

public class Carrito extends AppCompatActivity {

    public static ListView listViewproductos;
    Button btn_finalizar;
    static public TextView txt_total_final;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_carrito);

        if(savedInstanceState != null){
            CarritoAdapter.totals = savedInstanceState.getInt("totals");
        }

        btn_finalizar = findViewById(R.id.btn_finalizar_compra);
        txt_total_final = findViewById(R.id.txt_total_final);

        listViewproductos = findViewById(R.id.lista_productos_carrito);
      //  CarritoAdapter adapter = new CarritoAdapter(this, GetData());
        CarritoAdapter adapter = new CarritoAdapter(this, DetallesProducto.lst);
        listViewproductos.setAdapter(adapter);

        listViewproductos.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {

            }
        });

        btn_finalizar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), Pedidos.class);
                startActivity(intent);
            }
        });
    }

    @Override
    public void onSaveInstanceState(Bundle savedInstanceState) {
        super.onSaveInstanceState(savedInstanceState);
        savedInstanceState.putInt("totals", CarritoAdapter.totals);
    }

}