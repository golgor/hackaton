package com.example.hackaton.hackaton;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.TextView;

import static com.example.hackaton.hackaton.MainActivity.EXTRA_MESSAGE;

public class StartProfileActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_start_profile);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();
            }
        });

        // Get the Intent that started this activity and extract the string
        Intent intent = getIntent();
    }

    public void onClickMars(View view) {
        Intent intent = new Intent(this, ChoseGenderActivity.class);
        globalVariables.gender = Gender.male;
        startActivity(intent);
    }

    public void onClickVenus(View view) {
        Intent intent = new Intent(this, ChoseGenderActivity.class);
        globalVariables.gender = Gender.female;
        startActivity(intent);
    }
}
