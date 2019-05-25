package com.himanshu.puri;

import android.content.Intent;
import android.content.res.AssetManager;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.View;
import android.widget.TextView;
import android.support.v7.widget.Toolbar;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.List;

public class English extends AppCompatActivity {
    Toolbar toolbar = null;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_english);
        toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        // Get a support ActionBar corresponding to this toolbar
        android.support.v7.app.ActionBar ab = getSupportActionBar();

        ab.setHomeButtonEnabled(true);
        ab.setTitle("Lord Jagannath Tales");
        // Enable the Up button
        ab.setDisplayHomeAsUpEnabled(true);
        RecyclerView StoryList=(RecyclerView)findViewById(R.id.recyclerView);
        StoryList.setLayoutManager(new LinearLayoutManager(this));
        String[] story={"In Search of the Divine","The Tale of Mania Das","The saga of Salbeg","The Anecdote of Arjun Mishra"
                         ,"The Experience of Goswami Tulsidas","The Legend of Bandhu Mohanty","The Story of Dasia Bauri",
                          "Margashira Guruvar Puja","The Royal Sweeper","Notes for Parents/Teachers",
                          "Values Behind Tales","A Father and a Patriot"};
        StoryList.setAdapter(new StoryAdapter(story));


    }

}
