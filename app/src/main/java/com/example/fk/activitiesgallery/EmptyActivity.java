package com.example.fk.activitiesgallery;

import android.os.Bundle;
import android.support.design.widget.NavigationView;

public class EmptyActivity extends NavigationDrawerActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_empty);

        // connect NavigationDrawerActivity actions
        NavigationView navigationView = (NavigationView) findViewById(R.id.nav_view);
        navigationView.setNavigationItemSelectedListener(this);
    }
}
