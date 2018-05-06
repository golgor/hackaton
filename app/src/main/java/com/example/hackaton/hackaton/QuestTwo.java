package com.example.hackaton.hackaton;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class QuestTwo extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_quest_two);
    }

    public void lastQuestion(View view) {
        Intent intent = new Intent(this, QuestInfoLast.class);
        startActivity(intent);
    }

}
