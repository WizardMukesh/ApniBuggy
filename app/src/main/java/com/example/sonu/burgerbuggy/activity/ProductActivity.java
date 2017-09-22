package com.example.sonu.burgerbuggy.activity;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.GridView;
import android.widget.ListView;

import com.example.sonu.burgerbuggy.R;
import com.example.sonu.burgerbuggy.adapter.CategoryAdapter;
import com.example.sonu.burgerbuggy.model.Category;

import java.util.ArrayList;

public class ProductActivity extends AppCompatActivity {

    private GridView gridProducts;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_products);

        gridProducts = (GridView) findViewById(R.id.grid_products);
        gridProducts.setAdapter(new CategoryAdapter(ProductActivity.this, R.layout.product_single_row, new ArrayList<Category>()));
    }
}
