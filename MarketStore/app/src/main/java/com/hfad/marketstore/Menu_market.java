package com.hfad.marketstore;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentTransaction;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;

public class Menu_market extends AppCompatActivity {
     Button logout_btn, carrito_btn, btn_infor, btn_ops;
    ImageButton img_btn;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu_market);

        logout_btn = findViewById(R.id.btn_logout);
        carrito_btn = findViewById(R.id.btn_carrito);
        btn_infor = findViewById(R.id.btn_informacion);
        btn_ops = findViewById(R.id.btn_ops);
        img_btn = findViewById(R.id.btni_setting);


        logout_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(),login.class );
                startActivity(intent);
            }
        });

        carrito_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent intent = new Intent(getApplicationContext(), Carrito.class);
                startActivity(intent);
                CarritoAdapter.totals = 0;
            /*    DetallesFragment detallesFragment = new DetallesFragment();
                FragmentTransaction ft = getSupportFragmentManager().beginTransaction();
                ft.replace(R.id.fragmentView,detallesFragment);
                ft.commit();
                */
            }
        });

        btn_ops.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                MenuFragment menuFragment = new MenuFragment();
                FragmentTransaction ft = getSupportFragmentManager().beginTransaction();
                ft.replace(R.id.fragmentView,menuFragment);
                ft.commit();
            }
        });

        btn_infor.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                InformacionFragment informacionFragment = new InformacionFragment();
                FragmentTransaction ft = getSupportFragmentManager().beginTransaction();
                ft.replace(R.id.fragmentView,informacionFragment);
                ft.commit();
            }
        });

        img_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                SoporteFragment soporteFragment = new SoporteFragment();
                FragmentTransaction ft = getSupportFragmentManager().beginTransaction();
                ft.replace(R.id.fragmentView,soporteFragment);
                ft.commit();
            }
        });
    }
}