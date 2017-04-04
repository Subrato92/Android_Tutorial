package com.example.android.androidtutorial;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class Unit02 extends AppCompatActivity {

    //Made Same Message Key as in Unit04, to receive message to this target activity
    public final static String MESSAGE_KEY = "com.example.android.helloworld.message_key";
    String message;
    TextView txtview;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_unit02);

        Intent frmActivity_Unit04 = getIntent();
        message = frmActivity_Unit04.getStringExtra(MESSAGE_KEY);
        txtview = (TextView) findViewById(R.id.unit2_txtView);
        txtview.setText(message);
    }
}
