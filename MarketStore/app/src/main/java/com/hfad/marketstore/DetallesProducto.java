package com.hfad.marketstore;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;

public class DetallesProducto extends AppCompatActivity {

    Button btn_menu, btn_info, btn_logout;
    ImageView iv_producto;
    TextView lbl_producto, lbl_descripcion, txt_precio, txt_tipo;
    int indicador, tipo_verificado;
    String precio;
    Button btn_agregar;
    static public List<prod_carrito> lst;
    Spinner cant;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detalles_producto);

        btn_info = findViewById(R.id.btn_informacion_prod);
        btn_menu = findViewById(R.id.btn_menu_prod);
        btn_logout = findViewById(R.id.btn_logout_prod);
        iv_producto = findViewById(R.id.iv_prod);
        lbl_producto = findViewById(R.id.txt_nombre_producto);
        lbl_descripcion = findViewById(R.id.txt_descripcion);
        txt_precio = findViewById(R.id.txt_precio_edit);
        btn_agregar = findViewById(R.id.btn_agregar);
        cant = findViewById(R.id.snr_cant);



        if(FyVFragment.seleccion_prod == -1)
            if(CarnesFragment.car_selection == -1)
                if (LyHFragment.lyh_selector == -1)
                    if(JugueteriaFragment.jugue_selector == -1)
                        if (FarmaciaFragment.farm_selector == -1)
                                    indicador = 1; //PENDIENTE
                        else indicador = (FarmaciaFragment.farm_selector+28);
                    else indicador= (JugueteriaFragment.jugue_selector + 25);
                else indicador = (LyHFragment.lyh_selector+18);
            else indicador = (CarnesFragment.car_selection + 11);
        else indicador =  FyVFragment.seleccion_prod;

        Productos_details pd = Productos_details.productos[indicador];

        tipo_verificado = pd.getTipo();
        lbl_producto.setText(pd.getName());
        lbl_descripcion.setText(pd.getDescription());
        iv_producto.setImageResource(pd.getImageResourceId());
        precio = pd.getPrecio();
        txt_precio.setText(precio);
        if (lst == null) {
            lst = new ArrayList<>();
        }




        btn_agregar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                lst.add(new prod_carrito(1, pd.getImageResourceId(), pd.getName(), pd.getPrecio(), cant.getSelectedItemPosition()+1));
                Toast.makeText(getBaseContext(), "Añadido", Toast.LENGTH_SHORT).show();
            }
        });


        btn_info.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(),Allinformation.class );
                startActivity(intent);
            }
        });

        btn_logout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(),login.class );
                startActivity(intent);
            }
        });

        btn_menu.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(),Menu_market.class );
                startActivity(intent);
            }
        });
    }
}