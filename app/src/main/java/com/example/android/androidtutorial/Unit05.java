package com.example.android.androidtutorial;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.Toast;

public class Unit05 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_unit05);
    }

    public void ToastIt (View view) {

        Button button01 = (Button) findViewById(R.id.unit05_b1);
        ImageButton button02 = (ImageButton) findViewById(R.id.unit05_b2);
        Button button03 = (Button) findViewById(R.id.unit05_b3);

        View.OnClickListener listener = new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                switch (v.getId()) {
                    case R.id.unit05_b1:
                        Toast.makeText(getBaseContext(), "You Pressed A Button", Toast.LENGTH_LONG).show();
                        break;
                    case R.id.unit05_b2:
                        Toast.makeText(getBaseContext(), "Yes!!! You Got The Garfield", Toast.LENGTH_LONG).show();
                        break;
                    case R.id.unit05_b3:
                        Toast.makeText(getBaseContext(), "Upgraded Huh???", Toast.LENGTH_LONG).show();
                        break;
                }
            }
        };

        button01.setOnClickListener(listener);
        button02.setOnClickListener(listener);
        button03.setOnClickListener(listener);
    }
}
