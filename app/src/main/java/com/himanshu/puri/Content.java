package com.himanshu.puri;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.widget.ScrollView;
import android.widget.TextView;

import java.io.IOException;
import java.io.InputStream;

public class Content extends AppCompatActivity {
    Toolbar toolbar = null;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_content);
        TextView textView=(TextView)findViewById(R.id.textView);
        toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        // Get a support ActionBar corresponding to this toolbar
        android.support.v7.app.ActionBar ab = getSupportActionBar();

        ab.setHomeButtonEnabled(true);
        ab.setTitle("In search of the divine");
        // Enable the Up button
        ab.setDisplayHomeAsUpEnabled(true);
        String text="";
        try {
            InputStream is =getAssets().open("first.txt");
            int size =is.available();
            byte[] buffer=new byte[size];
            is.read(buffer);
            is.close();
            text=new String(buffer);
        }
        catch (IOException e){
            e.printStackTrace();
        }
        textView.setText(text);
    }
}
