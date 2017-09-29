package com.example.sonu.burgerbuggy.fragments;


import android.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.GridView;
import android.widget.ListView;

import com.example.sonu.burgerbuggy.R;
import com.example.sonu.burgerbuggy.adapter.ProductAdapter;
import com.example.sonu.burgerbuggy.model.Product;

import java.util.ArrayList;

/**
 * A simple {@link Fragment} subclass.
 */
public class FragmentProductList extends Fragment {
    GridView productGrid;
    ArrayList<Product> productArrayList;
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragments_products, container, false);
        productGrid = (GridView)view.findViewById(R.id.grid_products);
//        ProductAdapter productAdapter = new ProductAdapter()
        productGrid.setAdapter(new ProductAdapter(getActivity(),R.layout.product_single_row,productArrayList));

        return view;
    }

}
