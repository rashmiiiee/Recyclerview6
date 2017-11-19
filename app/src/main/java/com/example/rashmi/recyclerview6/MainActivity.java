package com.example.rashmi.recyclerview6;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {
    private RecyclerView recyclerView;
    private RecyclerView.Adapter mAdapter;
    public List<ListItem> listItems;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        recyclerView=(RecyclerView)findViewById(R.id.recyclerView);
        recyclerView.setHasFixedSize(true);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));

            ListItem mlistItem;
            mlistItem= new ListItem("Heading","DummyText");
        listItems.add(mlistItem);
            mlistItem=new ListItem("Headings","DummText");
        listItems.add(mlistItem);
            mlistItem=new ListItem("NewHeading","DummyText");
            listItems.add(mlistItem);
            mAdapter=new MyAdapter(listItems,this);
            recyclerView.setAdapter(mAdapter);
        }
}

