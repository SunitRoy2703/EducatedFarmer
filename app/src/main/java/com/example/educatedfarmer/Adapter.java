package com.example.educatedfarmer;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class Adapter extends BaseAdapter {

    List<String> titles;
    List<Integer> images;
    LayoutInflater inflater;
    Context context;


    public Adapter (Context context, List<String> titles, List<Integer> images){
        this.titles = titles;
        this.images = images;
        this.inflater = LayoutInflater.from(context);
    }


    @Override
    public int getCount() {
        return titles.size();
    }

    @Override
    public Object getItem(int i) {
        return null;
    }

    @Override
    public long getItemId(int i) {
        return 0;
    }

    @Override
    public View getView(int position, View view, ViewGroup viewGroup) {

        TextView crops;
        ImageView gridIcons;

        View icons = view;
        if (icons == null) {
            icons = inflater.inflate(R.layout.grid_layout, viewGroup, false);
        }

        crops = (TextView) icons.findViewById(R.id.crops);
        crops.setText(titles.get(position));
        crops.setPadding(0, 8, 0, 0);

        gridIcons = (ImageView) icons.findViewById(R.id.imageView);
        gridIcons.setImageResource(images.get(position));
        gridIcons.setAdjustViewBounds(true);
        gridIcons.setScaleType(ImageView.ScaleType.CENTER_CROP);
        gridIcons.setPadding(8, 8, 8, 8);


        return icons;
    }


    }

