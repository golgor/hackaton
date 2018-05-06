package com.example.hackaton.hackaton;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;

public class JobEduActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_job_edu);
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

    }
    public void onClickEducation(View view) {
        Intent intent = new Intent(this, SummaryProfileActivity.class);
        globalVariables.occupation = Occupation.education;
        startActivity(intent);
    }
    public void onClickJob(View view) {
        Intent intent = new Intent(this, SummaryProfileActivity.class);
        globalVariables.occupation = Occupation.job;
        startActivity(intent);
    }

}
