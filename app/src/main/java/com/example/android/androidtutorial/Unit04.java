package com.example.android.androidtutorial;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class Unit04 extends AppCompatActivity {

    EditText response;
    String message;
    Intent toActivity_unit02;
    //Creating Unique Message Key among All Activities
    public final static String MESSAGE_KEY = "com.example.android.helloworld.message_key";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_unit04);

        response = (EditText) findViewById(R.id.unit04_Response);
    }

    public void tounit02 (View view){
        message = response.getText().toString();
        toActivity_unit02 = new Intent(this, Unit02.class);
        toActivity_unit02.putExtra(MESSAGE_KEY, message);
        startActivity(toActivity_unit02);
    }
}
