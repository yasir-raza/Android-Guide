package com.example.yasir.listview;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ArrayList<String> alphabets = new ArrayList<String>();
        alphabets.add("Apple");
        alphabets.add("Ball");
        alphabets.add("Cat");
        alphabets.add("Dog");
        alphabets.add("Elephant");
        alphabets.add("Frog");
        alphabets.add("Garden");
        alphabets.add("Horse");
        alphabets.add("Ice Cream");
        alphabets.add("Jacket");
        alphabets.add("Kite");
        alphabets.add("Lamp");
        alphabets.add("Monkey");
        alphabets.add("Nest");
        alphabets.add("Orange");
        alphabets.add("Parrot");
        alphabets.add("Queen");
        alphabets.add("Rice");
        alphabets.add("Sorrow");
        alphabets.add("Turkey");
        alphabets.add("Umbrella");
        alphabets.add("Van");
        alphabets.add("Watch");
        alphabets.add("XXX");
        alphabets.add("Yasir");
        alphabets.add("Zebra");

        ListView alphabetsListView = findViewById(R.id.list);
        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this,android.R.layout.simple_list_item_1,alphabets);
        alphabetsListView.setAdapter(adapter);

    }
}
