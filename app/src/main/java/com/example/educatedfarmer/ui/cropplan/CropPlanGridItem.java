package com.example.educatedfarmer.ui.cropplan;

import android.content.Intent;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.example.educatedfarmer.ExpandableAdapter;
import com.example.educatedfarmer.Movie;
import com.example.educatedfarmer.R;

import java.util.ArrayList;
import java.util.List;



public class CropPlanGridItem extends AppCompatActivity {
TextView name;
ImageView image;
    RecyclerView recyclerView;

    List<Movie> movieList;



    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.farming_instuction);

        name = findViewById(R.id.grid_data);
        image = findViewById(R.id.photo_view);
        recyclerView = findViewById(R.id.recyclerView);


        Intent intent = getIntent();
        name.setText(intent.getStringExtra("name"));
        image.setImageResource(intent.getIntExtra("image", 0));
        Bundle args = intent.getBundleExtra("BUNDLE");
        ArrayList<Movie> movieArrayList = (ArrayList<Movie>) args.getSerializable("ARRAYLIST");
        ExpandableAdapter expandableAdapter = new ExpandableAdapter(movieArrayList);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        recyclerView.setAdapter(expandableAdapter);
    }

}