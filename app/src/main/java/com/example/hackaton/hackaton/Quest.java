package com.example.hackaton.hackaton;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class Quest extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_quest);
    }
    public void rightAnswer(View view) {
        Intent intent = new Intent(this, QuestInfo.class);
        startActivity(intent);
    }
}
