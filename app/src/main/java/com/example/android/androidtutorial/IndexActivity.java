package com.example.android.androidtutorial;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class IndexActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_index);
    }

    public void toCourse(View view) {
        String course;
        Intent activity;
        course = ((Button) view).getText().toString();

        switch (course) {
            case "1. Hello World Application":
                activity = new Intent(this, Unit01.class);
                startActivity(activity);
                break;
            case "2. Working With Multiple Activities":
                activity = new Intent(this, Unit02.class);
                startActivity(activity);
                break;
            default:
                break;
        }
    }
}