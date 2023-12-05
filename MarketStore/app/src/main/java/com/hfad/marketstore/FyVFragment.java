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

public class FyVFragment extends Fragment {

    static public int seleccion_prod = -1;

    ListView listv;
    ArrayAdapter<String> adapter;
    String[] fyv = {"Americano", "Espresso", "Espresso Cortado", "Chai", "Tisana","Vietnamita", "Mocha","Chocolate","Matcha","Capuchino","Latte"};


    public FyVFragment() {
        // Required empty public constructor
    }


    public static FyVFragment newInstance(String param1, String param2) {
        FyVFragment fragment = new FyVFragment();
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
        View root =  inflater.inflate(R.layout.fragment_fy_v, container, false);
        listv = (ListView) root.findViewById(R.id.lv_fyv);
        adapter = new ArrayAdapter<String>(getActivity(), android.R.layout.simple_list_item_1,fyv);
        listv.setAdapter(adapter);
        listv.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                Toast.makeText(getContext(), fyv[i], Toast.LENGTH_SHORT).show();

                seleccion_prod = i;
                Intent intent = new Intent(getContext(),DetallesProducto.class );
                startActivity(intent);

            }
        });
        return root;
    }
}