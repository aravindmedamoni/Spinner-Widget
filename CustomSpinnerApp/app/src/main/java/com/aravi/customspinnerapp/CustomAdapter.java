package com.aravi.customspinnerapp;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

public class CustomAdapter extends ArrayAdapter {

    Context context;
    String[] names;
    int[] images;

    public CustomAdapter(Context context, String[] names, int[] images) {
        super(context, R.layout.spinner_items,names);
        this.context = context;
        this.names = names;
        this.images = images;
    }

    @Override
    public View getDropDownView(int position,  View convertView, ViewGroup parent) {

        if (convertView==null) {
            LayoutInflater layoutInflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
            convertView = layoutInflater.inflate(R.layout.spinner_items, null);
            ImageView imageView = convertView.findViewById(R.id.countryimage);
            TextView countryname = convertView.findViewById(R.id.countryname);

            imageView.setImageResource(images[position]);
            countryname.setText(names[position]);
        }
        return convertView;

    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        LayoutInflater layoutInflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        convertView = layoutInflater.inflate(R.layout.spinner_items, null);
        ImageView imageView = convertView.findViewById(R.id.countryimage);
        TextView countryname = convertView.findViewById(R.id.countryname);

        imageView.setImageResource(images[position]);
        countryname.setText(names[position]);
        return convertView;
    }
}
