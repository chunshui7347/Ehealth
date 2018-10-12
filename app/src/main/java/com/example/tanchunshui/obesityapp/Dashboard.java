package com.example.tanchunshui.obesityapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;

public class Dashboard extends AppCompatActivity {

    private Button feedbackbtn;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dashboard);
        ImageButton food = (ImageButton) findViewById(R.id.imageButton2);
        ImageButton exercise = (ImageButton) findViewById(R.id.imageButton3);
        ImageButton assessment = (ImageButton) findViewById(R.id.imageButton4);

        feedbackbtn = (Button) findViewById(R.id.feedbackBtn);

        food.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                Intent i = new Intent(Dashboard.this,FoodSection.class);
                startActivity(i);
            }
        });
        exercise.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                Intent i = new Intent(Dashboard.this,ActivitySession.class);
                startActivity(i);
            }
        });
        assessment.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                Intent i = new Intent(Dashboard.this,Assessment.class);
                startActivity(i);
            }
        });

        feedbackbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(Dashboard.this, Feedback.class);
                startActivity(i);
            }
        });

    }
}
