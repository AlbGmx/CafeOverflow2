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


public class FarmaciaFragment extends Fragment {

    static public int farm_selector=-1;
    ListView listv;
    ArrayAdapter<String> adapter;
    String[] farmacia = {"Aspirina", "Paracetamol", "Jarabe para la tos", "Pastillas Next", "Vendas", "Jeringas","Botiquin", "Gasas"};

    public FarmaciaFragment() {
        // Required empty public constructor
    }


    public static FarmaciaFragment newInstance(String param1, String param2) {
        FarmaciaFragment fragment = new FarmaciaFragment();
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
       View root = inflater.inflate(R.layout.fragment_farmacia, container, false);

        listv = (ListView) root.findViewById(R.id.lv_farmacia);
        adapter = new ArrayAdapter<String>(getActivity(), android.R.layout.simple_list_item_1,farmacia);
        listv.setAdapter(adapter);
        listv.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                Toast.makeText(getContext(), farmacia[i], Toast.LENGTH_SHORT).show();

                FyVFragment.seleccion_prod = -1;
                CarnesFragment.car_selection = -1;
                LyHFragment.lyh_selector = -1;
                JugueteriaFragment.jugue_selector =-1;
                farm_selector = i;
                Intent intent = new Intent(getContext(),DetallesProducto.class );
                startActivity(intent);

            }
        });
       return root;
    }
}