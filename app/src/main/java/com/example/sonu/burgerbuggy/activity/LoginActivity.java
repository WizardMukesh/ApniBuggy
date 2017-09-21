package com.example.sonu.burgerbuggy.activity;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ListView;
import android.widget.TextView;

import com.example.sonu.burgerbuggy.R;
import com.example.sonu.burgerbuggy.adapter.CategoryAdapter;
import com.example.sonu.burgerbuggy.model.Category;

import java.util.ArrayList;

public class LoginActivity extends AppCompatActivity {
    EditText editEmail,editPassword;
    TextView btnRegister,btnForgetPassword;
    private Button btnLogIn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        findViewsByID();

        btnRegister.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent =new Intent(LoginActivity.this,ActivityRegister.class);
                startActivity(intent);
            }
        });

        btnLogIn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent =new Intent(LoginActivity.this,MainActivity.class);
                startActivity(intent);
            }
        });
    }
    public void findViewsByID(){
        editEmail = (EditText)findViewById(R.id.edit_email);
        editPassword = (EditText)findViewById(R.id.edit_password);
        btnRegister = (TextView)findViewById(R.id.btn_register_account);
        btnForgetPassword = (TextView)findViewById(R.id.btn_forget_password);
        btnLogIn = (Button)findViewById(R.id.btn_login);
    }

}
