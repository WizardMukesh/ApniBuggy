package com.example.sonu.burgerbuggy.activity;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.TextView;

import com.example.sonu.burgerbuggy.R;

/**
 * Created by Nishant on 9/28/2017.
 */

public class ActivityRegistration2 extends AppCompatActivity{
    TextView btn_alread_hv_ac;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register2);

        btn_alread_hv_ac = (TextView)findViewById(R.id.btn_already_have_ac);

        btn_alread_hv_ac.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent =new Intent(ActivityRegistration2.this,LoginActivity.class);
                startActivity(intent);

            }
        });
    }
}
