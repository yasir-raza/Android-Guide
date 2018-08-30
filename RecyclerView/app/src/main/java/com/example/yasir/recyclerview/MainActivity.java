package com.example.yasir.recyclerview;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    private RecyclerView recyclerView;
    private RecyclerView.Adapter adapter;

    private List<ListItem> listItems;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        recyclerView = findViewById(R.id.recycler_view);
        recyclerView.setHasFixedSize(true);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));


        listItems = new ArrayList<>();
        for(int i = 0; i<10; i++){
            ListItem listItem = new ListItem(
                    "Heading " + (i+1),
                    "Lorem Ipsum Dummy Data"
            );
            listItems.add(listItem);
        }
        adapter = new MyAdapter(listItems,this);
        recyclerView.setAdapter(adapter);
    }
}
