package com.example.hackaton.hackaton;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class QuestInfo extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_quest_info);
    }
    public void goNext(View view) {
        Intent intent = new Intent(this, QuestTwo.class);
        startActivity(intent);
    }
}
