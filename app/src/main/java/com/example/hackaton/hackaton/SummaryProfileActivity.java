package com.example.hackaton.hackaton;

import android.content.Context;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class SummaryProfileActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_summary_profile);

        TextView familyText = (TextView) findViewById(R.id.familyText);
        TextView genderText = (TextView) findViewById(R.id.genderText);
        TextView occupationText = (TextView) findViewById(R.id.occupationText);
        TextView countryText = (TextView) findViewById(R.id.countryText);

        familyText.setText(globalVariables.size.toString());
        genderText.setText(globalVariables.gender.toString());
        occupationText.setText(globalVariables.occupation.toString());

        Context context = SummaryProfileActivity.this;
        String locale = context.getResources().getConfiguration().locale.getDisplayCountry();
        countryText.setText(locale);
    }
}
