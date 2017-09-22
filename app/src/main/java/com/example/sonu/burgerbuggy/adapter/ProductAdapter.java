package com.example.sonu.burgerbuggy.adapter;

import android.content.Context;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;

import com.example.sonu.burgerbuggy.model.Category;
import com.example.sonu.burgerbuggy.model.Product;

import java.util.ArrayList;

/**
 * Created by SoNu on 6/6/2016.
 */

public class ProductAdapter extends ArrayAdapter<Product> {

    private int resourceId;
    private ArrayList<Product> productArrayList;
    private Context context;
    private ViewHolder viewHolder;
    private LayoutInflater vi;
    public int selectedPosition = 0;

    public ProductAdapter(Context context, int resourceId, ArrayList<Product> productArrayList) {
        // TODO Auto-generated constructor stub
        super(context,resourceId);
        this.productArrayList = productArrayList;
        this.context = context;
        this.resourceId=resourceId;
        vi = (LayoutInflater) context
                .getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        Log.e("SIZE", productArrayList.size()+"");
    }

    @Override
    public int getCount() {
        // TODO Auto-generated method stub
        return 20;
    }



    class ViewHolder
    {
        ImageView imageCategory;
    }

    @Override
    public View getView(final int position, View convertView, ViewGroup parent) {
        // TODO Auto-generated method stub
        View view=convertView;
        if(view==null)
        {
            viewHolder = new ViewHolder();
            view = vi.inflate(resourceId, parent, false);
            view.setTag(viewHolder);
        } else {
            viewHolder = (ViewHolder) view.getTag();
        }


        return view;
    }
}