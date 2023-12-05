package com.hfad.marketstore;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentTransaction;

import android.content.Intent;
import android.os.Bundle;
import android.provider.Settings;
import android.view.View;
import android.widget.Button;

public class VentanaLista2 extends AppCompatActivity {
    int i =  MenuFragment.i_select;
    Button btn_menu, btn_info, btn_carrito;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ventana_lista_2);

        btn_menu = findViewById(R.id.btn_menu_ventana);
        btn_info = findViewById(R.id.btn_info_ventana);
        btn_carrito = findViewById(R.id.btn_carrito_ventana);

        btn_menu.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(),Menu_market.class );
                startActivity(intent);
            }
        });

        btn_info.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(),Allinformation.class );
                startActivity(intent);
            }
        });

        btn_carrito.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), Carrito.class);
                startActivity(intent);

                CarritoAdapter.totals=0;
            }
        });

        if (i==0){
            FyVFragment fyvfra = new FyVFragment();
            FragmentTransaction ft = getSupportFragmentManager().beginTransaction();
            ft.replace(R.id.frag_prod,fyvfra);
            ft.commit();

        }else if(i == 1){
            CarnesFragment carnesFragment = new CarnesFragment();
            FragmentTransaction ft = getSupportFragmentManager().beginTransaction();
            ft.replace(R.id.frag_prod,carnesFragment);
            ft.commit();

        }else if(i ==  2){
            LyHFragment lyhfrag = new LyHFragment();
            FragmentTransaction ft = getSupportFragmentManager().beginTransaction();
            ft.replace(R.id.frag_prod,lyhfrag);
            ft.commit();

        }else if(i == 3){
            JugueteriaFragment jugueteria = new JugueteriaFragment();
            FragmentTransaction ft = getSupportFragmentManager().beginTransaction();
            ft.replace(R.id.frag_prod,jugueteria);
            ft.commit();

        }else if (i == 4){

            FarmaciaFragment Farmacia = new FarmaciaFragment();
            FragmentTransaction ft = getSupportFragmentManager().beginTransaction();
            ft.replace(R.id.frag_prod,Farmacia);
            ft.commit();

        } else if(i == 5){
            AlimentosFragment alimentos = new AlimentosFragment();
            FragmentTransaction ft = getSupportFragmentManager().beginTransaction();
            ft.replace(R.id.frag_prod,alimentos);
            ft.commit();

        } else {
            DySFragment dys = new DySFragment();
            FragmentTransaction ft = getSupportFragmentManager().beginTransaction();
            ft.replace(R.id.frag_prod,dys);
            ft.commit();
        }


    }
}