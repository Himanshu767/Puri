package com.himanshu.puri;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    public int count=0;
    int tempInt = 0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Boolean isFirstRun = getSharedPreferences("PREFERENCE", MODE_PRIVATE)
                .getBoolean("isFirstRun", true);

        if (isFirstRun) {
            //show sign up activity
            startActivity(new Intent(MainActivity.this, Front.class));
            Toast.makeText(MainActivity.this, "Run only once", Toast.LENGTH_LONG)
                    .show();
        }
        getSharedPreferences("PREFERENCE", MODE_PRIVATE).edit()
                .putBoolean("isFirstRun", false).commit();
        TextView textView=(TextView)findViewById(R.id.textView);
        final Button English=(Button)findViewById(R.id.button1);
        Button Hindi=(Button)findViewById(R.id.button2);
        Button Bengali=(Button)findViewById(R.id.button3);
        Button Odia=(Button)findViewById(R.id.button4);
        English.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(MainActivity.this,Front.class);
                startActivity(intent);
            }
        });
        Hindi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(MainActivity.this,Front.class);
                startActivity(intent);
            }
        });
        Bengali.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(MainActivity.this,Front.class);
                startActivity(intent);
            }
        });
        Odia.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(MainActivity.this,Front.class);
                startActivity(intent);
            }
        });
    }
}
