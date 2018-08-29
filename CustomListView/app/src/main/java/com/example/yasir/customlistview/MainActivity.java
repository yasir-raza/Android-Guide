package com.example.yasir.customlistview;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    List<Heroes> heroesList;
    ListView listView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        heroesList = new ArrayList<>();
        heroesList.add(new Heroes(R.drawable.quaideazam, "Quaid e Azam" , "Governor General Of Pakistan"));
        heroesList.add(new Heroes(R.drawable.allama_iqbal, "Allama iqbal" , "Poet, Philosopher & Politician"));
        heroesList.add(new Heroes(R.drawable.liaquat, "Liaquat ali Khan" , "First Prime Minister of Pakistan"));
        heroesList.add(new Heroes(R.drawable.syed, "Sir Syed Ahmad Khan" , "Magistrate, Educator and Islamic Reformer"));
        heroesList.add(new Heroes(R.drawable.rashid_minhas, "Rashid Minhas" , "Pilot Officer Shaheed"));
        heroesList.add(new Heroes(R.drawable.edhi, "Abdul Sattar Edhi" , "Head of the Edhi Foundation"));
        heroesList.add(new Heroes(R.drawable.qadeer, "Dr Abdul Qadeer" , "Founder of Pakistani Nuclear Bomb"));
        heroesList.add(new Heroes(R.drawable.imran, "Imran Khan" , "Pakistani politician and former cricketer"));

        listView = findViewById(R.id.list_view);

        CustomAdapter adapter = new CustomAdapter(this,R.layout.list_item,heroesList);
        listView.setAdapter(adapter);

    }
}
