package com.example.android.androidtutorial;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class Unit03 extends AppCompatActivity {

    EditText etext;
    TextView reply;
    String msg, Comp_msg;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_unit03);

        etext = (EditText) findViewById(R.id.unit03_msg);
        reply = (TextView) findViewById(R.id.unit03_response);
    }

    public void Response (View view){
        msg = etext.getText().toString();
        Comp_msg = "Your Query Is..." + msg ;
        reply.setText(Comp_msg);
        reply.setTextSize(18);
    }
}
