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

public class LyHFragment extends Fragment {
    static public int lyh_selector;

    ListView listv;
    ArrayAdapter<String> adapter;
    String[] lyh = {"Americano", "Chai", "Tisana", "Vietnamita", "Mocha", "Matcha", "Latte"};


    public LyHFragment() {
        // Required empty public constructor
    }

    // TODO: Rename and change types and number of parameters
    public static LyHFragment newInstance(String param1, String param2) {
        LyHFragment fragment = new LyHFragment();
        return fragment;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        View root=  inflater.inflate(R.layout.fragment_ly_h, container, false);

        listv = (ListView) root.findViewById(R.id.lv_lyh);
        adapter = new ArrayAdapter<String>(getActivity(), android.R.layout.simple_list_item_1,lyh);
        listv.setAdapter(adapter);
        listv.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                Toast.makeText(getContext(), lyh[i], Toast.LENGTH_SHORT).show();

                FyVFragment.seleccion_prod = -1;
                CarnesFragment.car_selection = -1;
                lyh_selector = i;
                Intent intent = new Intent(getContext(),DetallesProducto.class );
                startActivity(intent);

            }
        });
        return root;
    }
}