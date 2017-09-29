package com.example.sonu.burgerbuggy.activity;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import com.example.sonu.burgerbuggy.R;

/**
 * Created by Nishant on 9/21/2017.
 */

public class ActivityRegister extends AppCompatActivity {
    private TextView btnAlreadyAc;
    private Button btnNext;
    @Override
    protected void onCreate( Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register);
        findViewsByID();
        btnAlreadyAc.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent =new Intent(ActivityRegister.this,LoginActivity.class);
                startActivity(intent);

            }
        });

        btnNext.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent =new Intent(ActivityRegister.this,ActivityRegistration2.class);
                startActivity(intent);

            }
        });
    }
    public void findViewsByID(){
        btnAlreadyAc = (TextView)findViewById(R.id.btn_already_have_ac);
        btnNext = (Button) findViewById(R.id.btn_next);
    }
}
