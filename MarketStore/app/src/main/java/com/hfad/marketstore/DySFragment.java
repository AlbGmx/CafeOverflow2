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

public class DySFragment extends Fragment {

    static public int dys_selector =-1;
    ListView listv;
    ArrayAdapter<String> adapter;
    String[] dys = {"Galletas (Paquete)", "Empanadas de cajeta", "Papitas mixtas", "Cacahuates", "Sodas Mixtas", "Pan Dulce"};


    public DySFragment() {
        // Required empty public constructor
    }


    public static DySFragment newInstance(String param1, String param2) {
        DySFragment fragment = new DySFragment();
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
        View root = inflater.inflate(R.layout.fragment_dy_s, container, false);


        listv = (ListView) root.findViewById(R.id.lv_dys);
        adapter = new ArrayAdapter<String>(getActivity(), android.R.layout.simple_list_item_1,dys);
        listv.setAdapter(adapter);
        listv.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                Toast.makeText(getContext(), dys[i], Toast.LENGTH_SHORT).show();

                FyVFragment.seleccion_prod = -1;
                CarnesFragment.car_selection = -1;
                LyHFragment.lyh_selector = -1;
                JugueteriaFragment.jugue_selector =-1;
                FarmaciaFragment.farm_selector = -1;
                AlimentosFragment.alim_selector=-1;
                dys_selector = i;
                Intent intent = new Intent(getContext(),DetallesProducto.class );
                startActivity(intent);

            }
        });
        return root;
    }
}