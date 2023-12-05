package com.hfad.marketstore;

import android.content.Intent;
import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentTransaction;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;


public class SoporteFragment extends Fragment {

    public SoporteFragment() {
        // Required empty public constructor
    }


    public static SoporteFragment newInstance(String param1, String param2) {
        SoporteFragment fragment = new SoporteFragment();
        return fragment;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    private Button btn_mensaje, btn_logout2, btn_pedidos;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        View root = inflater.inflate(R.layout.fragment_soporte, container, false);

        btn_mensaje = root.findViewById(R.id.btn_msg);
        btn_logout2 = root.findViewById(R.id.btn_logout_set);
        btn_pedidos = root.findViewById(R.id.btn_pedidos);

        btn_mensaje.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getContext(),MensajeSoporte.class );
                startActivity(intent);
            }
        });

        btn_logout2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getContext(),login.class );
                startActivity(intent);
            }
        });

        btn_pedidos.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent intent = new Intent(getContext(),Pedidos.class );
                startActivity(intent);

            }
        });

        // Inflate the layout for this fragment
        return root;
    }
}