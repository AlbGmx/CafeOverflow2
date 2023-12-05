package com.hfad.marketstore;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

import java.sql.ClientInfoStatus;
import java.util.List;

public class CarritoAdapter extends BaseAdapter {
    Context context;
    static public List<prod_carrito> lst;
    static public int totals = 0;

    public CarritoAdapter(Context context, List<prod_carrito> lst) {
        this.context = context;
        this.lst = lst;
    }


    @Override
    public int getCount() {
        return lst.size();
    }

    @Override
    public Object getItem(int i) {
        return i;
    }

    @Override
    public long getItemId(int i) {
        return i;
    }

    @Override
    public View getView(int i, View view, ViewGroup viewGroup) {

        ImageView iv_producto_imagen, iv_add, iv_less;
        TextView txt_nombre_prod;
        TextView txt_precio_individual;
        TextView txt_cantidad;
        TextView txt_total;
        int subtotal;
        int cantidad;
        int precio;

        prod_carrito c = lst.get(i);
        if(view == null)
            view = LayoutInflater.from(context).inflate(R.layout.listview_producto_carrito,null);

        iv_producto_imagen =  view.findViewById(R.id.iv_producto_imagen);
        txt_nombre_prod = view.findViewById(R.id.txt_nombre_prod);
        txt_precio_individual = view.findViewById(R.id.txt_precio_individual);
        txt_cantidad = view.findViewById(R.id.txt_cantidad_edit);
        iv_less = view.findViewById(R.id.iv_menos);
        iv_add = view.findViewById(R.id.iv_mas);
        txt_total = view.findViewById(R.id.txt_total);

        iv_producto_imagen.setImageResource(c.imagen);
        iv_add.setImageResource(R.drawable.add_icon);
        iv_less.setImageResource(R.drawable.less_icon);

        cantidad = c.cantidad;
        precio = Integer.parseInt(c.precio);
        subtotal = cantidad * precio;

        totals = totals + subtotal;
      //  Carrito.txt_total_final.setText("$"+String.valueOf(totals)+".00");

        txt_nombre_prod.setText(c.nombre);
        txt_precio_individual.setText("$"+c.precio+".00");
        txt_cantidad.setText(String.valueOf(c.cantidad));
        txt_total.setText("$"+Integer.toString(subtotal)+".00");

        iv_add.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(c.cantidad >=1 && c.cantidad<=9) {
                    int subtotal;
                    int cant = c.cantidad + 1;
                    c.cantidad = cant;
                    txt_cantidad.setText(String.valueOf(cant));

                    subtotal = c.cantidad * Integer.parseInt(c.precio);
                    txt_total.setText("$" + String.valueOf(subtotal) + ".00");


                    totals = totals + Integer.parseInt(c.precio);
                    Carrito.txt_total_final.setText("$"+String.valueOf(totals)+".00");
                }
                else{
                Toast.makeText(context, "Solo hasta 10", Toast.LENGTH_SHORT).show();}
            }
        });

        iv_less.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(c.cantidad >1) {
                    int subtotal;
                    int cant = c.cantidad - 1;
                    c.cantidad = cant;
                    txt_cantidad.setText(String.valueOf(cant));

                    subtotal = c.cantidad * Integer.parseInt(c.precio);
                    txt_total.setText("$" + String.valueOf(subtotal) + ".00");

                    totals = totals - Integer.parseInt(c.precio);
                    Carrito.txt_total_final.setText("$"+String.valueOf(totals)+".00");

                }else {

                   CarritoAdapter adapter = new CarritoAdapter(context, lst);
                   Carrito.listViewproductos.setAdapter(adapter);
                   lst.remove(i);
                    adapter.notifyDataSetChanged();
                    Toast.makeText(context, "Se ha eliminado", Toast.LENGTH_SHORT).show();

                    totals = 0;
                   // totals = totals - Integer.parseInt(c.precio);
                    Carrito.txt_total_final.setText("$"+String.valueOf(totals)+".00");

                 }
            }


        });

        Carrito.txt_total_final.setText("$"+String.valueOf(totals)+".00");
        return view;
    }
}
