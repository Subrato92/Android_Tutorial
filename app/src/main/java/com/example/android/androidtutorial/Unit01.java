package com.example.android.androidtutorial;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class Unit01 extends AppCompatActivity {

    String message;
    TextView txtview;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_unit01);

        txtview = (TextView) findViewById(R.id.unit01_tv_response);
    }

    public void show(View view){
        message = "Hello World";
        txtview.setTextSize(25);
        txtview.setText(message);
    }
}
