package com.hfad.marketstore;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.Toast;

public class login extends AppCompatActivity {

    EditText username, password;
    Button login_btn, register_btn;
    ImageButton info_btn;
    BDHelper DB;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        username = findViewById(R.id.txt_user);
        password = findViewById(R.id.txt_password);
        login_btn = findViewById(R.id.btn_login_1);
        register_btn = findViewById(R.id.btn_register_1);
        info_btn = findViewById(R.id.btn_info_1);
        DB=new BDHelper(this);

        login_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String user = username.getText().toString();
                String pass = password.getText().toString();

                if(TextUtils.isEmpty(user) || TextUtils.isEmpty(pass))
                    Toast.makeText(login.this, "All fields required", Toast.LENGTH_SHORT).show();
                else{
                    Boolean checkuserpass = DB.checkuserpassword(user,pass);
                    if(checkuserpass == true){
                        Toast.makeText(login.this,"Login Successful",Toast.LENGTH_SHORT).show();
                        MainActivity.name_user = user;
                        Intent intent = new Intent(getApplicationContext(), Menu_market.class);
                        startActivity(intent);
                    }else{
                        Toast.makeText(login.this,"Login Failed", Toast.LENGTH_SHORT).show();
                    }
                }
            }
        });

        register_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), MainActivity.class);
                startActivity(intent);
            }
        });

        info_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(),Allinformation.class );
                startActivity(intent);
            }
        });



    }

}