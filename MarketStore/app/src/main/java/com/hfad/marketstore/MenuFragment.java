package com.hfad.marketstore;

import android.content.Intent;
import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentTransaction;
import androidx.fragment.app.ListFragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ListView;
import android.widget.Toast;

public class MenuFragment extends Fragment {
    static public int i_select ;
    ListView listv;
    ArrayAdapter<String> adapter;
    String[] opciones = {"Bebidas Calientes", "Frappes", "En las rocas", "Postres"};

    public MenuFragment() {
        // Required empty public constructor
    }

    public static MenuFragment newInstance(String param1, String param2) {
        MenuFragment fragment = new MenuFragment();
        return fragment;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {


       View root =  inflater.inflate(R.layout.fragment_menu, container, false);
        listv = (ListView) root.findViewById(R.id.list_options);
       adapter = new ArrayAdapter<String>(getActivity(), android.R.layout.simple_list_item_1,opciones);
        listv.setAdapter(adapter);
        listv.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                Toast.makeText(getContext(), opciones[i], Toast.LENGTH_SHORT).show();
                Intent intent;
                i_select = i;
                intent =  new Intent(getContext(), VentanaLista2.class);
                startActivity(intent);
            }
        });
       return root;
    }
}