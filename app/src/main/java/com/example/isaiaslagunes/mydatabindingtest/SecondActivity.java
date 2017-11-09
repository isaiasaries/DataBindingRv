package com.example.isaiaslagunes.mydatabindingtest;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import java.util.Arrays;
import java.util.List;

public class SecondActivity extends AppCompatActivity {
    private RecyclerView recyclerView;
    private RecyclerView.Adapter adapter;
    private RecyclerView.LayoutManager layoutManager;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);
        recyclerView = findViewById(R.id.my_recycler_view);
        recyclerView.setHasFixedSize(true);

        layoutManager = new LinearLayoutManager(this);
        recyclerView.setLayoutManager(layoutManager);
        List<TemperatureData> items =
                Arrays.asList(new TemperatureData("Atlanta", "5"),
                        new TemperatureData("Marrieta", "6"),
                        new TemperatureData("Smirna", "61"),
                        new TemperatureData("Collins", "62"),
                        new TemperatureData("Denver", "63"),
                        new TemperatureData("Chattatooche", "64"));

        adapter = new MyAdapter(items);
        recyclerView.setAdapter(adapter);
    }
}
