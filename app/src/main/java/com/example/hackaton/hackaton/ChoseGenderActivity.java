package com.example.hackaton.hackaton;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class ChoseGenderActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_chose_gender);
    }

    public void onClickFamily(View view) {
        globalVariables.size = familySize.family;
        Intent intent = new Intent(this, JobEduActivity.class);
        startActivity(intent);
    }

    public void onClickCouple(View view) {
        globalVariables.size = familySize.couple;
        Intent intent = new Intent(this, JobEduActivity.class);
        startActivity(intent);
    }

    public void onClickSingle(View view) {
        globalVariables.size = familySize.single;
        Intent intent = new Intent(this, JobEduActivity.class);
        startActivity(intent);
    }
}
