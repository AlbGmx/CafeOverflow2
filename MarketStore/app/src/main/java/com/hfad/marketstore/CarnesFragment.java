package com.hfad.marketstore;

import android.content.Intent;
import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

public class CarnesFragment extends Fragment {

    static public int car_selection = -1;
    ListView listv;
    ArrayAdapter<String> adapter;
    String[] carnes = {"Filete de RES (kg)", "Filete de CERDO (kg)", "Filete de PESCADO (kg)", "Nuggets de POLLO (pza)", "Pollo (kg)", "Salchicha (KG)", "Jamon (kg)" };


    public CarnesFragment() {
        // Required empty public constructor
    }

    public static CarnesFragment newInstance(String param1, String param2) {
        CarnesFragment fragment = new CarnesFragment();
        return fragment;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
       View root =  inflater.inflate(R.layout.fragment_carnes, container, false);

        listv = (ListView) root.findViewById(R.id.lv_carnes);
        adapter = new ArrayAdapter<String>(getActivity(), android.R.layout.simple_list_item_1,carnes);
        listv.setAdapter(adapter);
        listv.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                Toast.makeText(getContext(), carnes[i], Toast.LENGTH_SHORT).show();

                    FyVFragment.seleccion_prod =-1;
                    car_selection = i;
                    Intent intent = new Intent(getContext(),DetallesProducto.class );
                    startActivity(intent);


            }
        });

       return root;
    }
}