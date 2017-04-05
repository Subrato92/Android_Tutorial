package com.example.android.androidtutorial;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

public class Unit07 extends AppCompatActivity {

    String[] array = {"1. Link List",
            "2. Stack",
            "3. Queue",
            "4. Tree",
            "5. Priority Queues"
    };
    ListView list;
    ArrayAdapter<String> adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_unit07);

        list = (ListView) findViewById(R.id.unit07_algoTopics);
        adapter = new ArrayAdapter<String>(this,android.R.layout.simple_list_item_1,array);
        list.setAdapter(adapter);
        list.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Toast.makeText(getBaseContext(), parent.getItemAtPosition(position)+" is Selected", Toast.LENGTH_LONG).show();
                //view.setSelected(true);
            }
        });
    }
}
