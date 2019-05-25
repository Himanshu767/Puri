package com.himanshu.puri;

import android.content.Intent;
import android.support.design.widget.NavigationView;
import android.support.v4.view.ViewPager;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBarDrawerToggle;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class Front extends AppCompatActivity {
    private Toolbar toolbar;
    private DrawerLayout mDrawerLayout;
    private ActionBarDrawerToggle abdt;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_front);
        toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        mDrawerLayout=(DrawerLayout)findViewById(R.id.drawer_layout);
        NavigationView navigationView = findViewById(R.id.nav_view);
        abdt = new ActionBarDrawerToggle(this,mDrawerLayout,toolbar,R.string.open_drawer,R.string.close_drawer);
        abdt.setDrawerIndicatorEnabled(true);
        mDrawerLayout.addDrawerListener(abdt);
        abdt.syncState();
        navigationView.setNavigationItemSelectedListener(
                new NavigationView.OnNavigationItemSelectedListener() {
                    @Override
                    public boolean onNavigationItemSelected(MenuItem item) {
                        int id = item.getItemId();
                        switch(id)
                        {
                            case R.id.language:
                                Toast.makeText(Front.this, "My Account",Toast.LENGTH_SHORT).show();
                            case R.id.feedback:
                                Toast.makeText(Front.this, "Settings",Toast.LENGTH_SHORT).show();
                            case R.id.rate:
                                Toast.makeText(Front.this, "My Cart",Toast.LENGTH_SHORT).show();
                            case R.id.nav_share:
                                Toast.makeText(Front.this, "My Cart",Toast.LENGTH_SHORT).show();

                            default:
                                return true;
                        }
                    }
                });
        Button  story=(Button)findViewById(R.id.story);
        story.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(Front.this,English.class);
                startActivity(intent);
            }
        });
    }
}
