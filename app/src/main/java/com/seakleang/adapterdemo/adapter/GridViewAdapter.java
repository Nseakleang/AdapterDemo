package com.seakleang.adapterdemo.adapter;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.seakleang.adapterdemo.Entity.Product;
import com.seakleang.adapterdemo.R;
import com.squareup.picasso.Picasso;

import java.util.List;

public class GridViewAdapter extends BaseAdapter {

    List<Product> products;

    public GridViewAdapter(List<Product> products) {
        this.products = products;
    }

    @Override
    public int getCount() {
        return products.size();
    }

    @Override
    public Object getItem(int position) {
        return products.get(position);
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        View view = null;
        if(convertView==null)
            view = LayoutInflater.from(parent.getContext()).inflate(R.layout.activity_grid_view_item_layout, parent, false);
        else
            view = convertView;

        //bind data
        Product product = products.get(position);
        ImageView thumb = view.findViewById(R.id.thump);
        ImageView btnFavorite = view.findViewById(R.id.favorite);
        TextView price = view.findViewById(R.id.price);

        Picasso.get()
                .load(product.getImage())
                .resize(100,100)
                .into(thumb);

        price.setText("$"+product.getPrice());

        return  view;
    }
}
