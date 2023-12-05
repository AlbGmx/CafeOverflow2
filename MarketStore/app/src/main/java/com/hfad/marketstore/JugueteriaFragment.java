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

public class JugueteriaFragment extends Fragment {

    static public int jugue_selector = -1;
    ListView listv;
    ArrayAdapter<String> adapter;
    String[] juguetes = {"Muñeca Barbie", "Oso de peluche", "Carritos Hotweels", "Legos", "Rompecabezas de Perritos"};

    public JugueteriaFragment() {
        // Required empty public constructor
    }


    public static JugueteriaFragment newInstance(String param1, String param2) {
        JugueteriaFragment fragment = new JugueteriaFragment();
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
        View root = inflater.inflate(R.layout.fragment_jugueteria, container, false);
        listv = (ListView) root.findViewById(R.id.lv_juguetes);
        adapter = new ArrayAdapter<String>(getActivity(), android.R.layout.simple_list_item_1,juguetes);
        listv.setAdapter(adapter);
        listv.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                Toast.makeText(getContext(), juguetes[i], Toast.LENGTH_SHORT).show();

                FyVFragment.seleccion_prod = -1;
                CarnesFragment.car_selection = -1;
                LyHFragment.lyh_selector = -1;
                jugue_selector = i;
                Intent intent = new Intent(getContext(),DetallesProducto.class );
                startActivity(intent);

            }
        });
        return root;
    }
}