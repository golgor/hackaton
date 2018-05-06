package com.example.hackaton.hackaton;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class QuestInfoLast extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_quest_info_last);
    }
    public void finish(View view){
        Intent intent = new Intent(this, MainActivity.class);
        globalVariables.occupation = Occupation.job;
        Toast.makeText(this, "NOT FINISH! Swedish, eller?",
                Toast.LENGTH_LONG).show();
        startActivity(intent);
    }

}
