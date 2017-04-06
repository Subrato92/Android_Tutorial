package com.example.android.androidtutorial;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

public class Unit08 extends AppCompatActivity {

    ArrayAdapter<String> adapter;
    String[] array = {"1. Link List",
            "2. Stack",
            "3. Queue",
            "4. Tree",
            "5. Priority Queues"
    };
    ListView list;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_unit08);

        list = (ListView) findViewById(R.id.unit08_algoTopics);
        adapter = new ArrayAdapter<String>(this,R.layout.listview_custom_layout01,R.id.listlayout01_ele01, array);
        list.setAdapter(adapter);
        list.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Toast.makeText(getBaseContext(), parent.getItemAtPosition(position)+" is Selected", Toast.LENGTH_SHORT).show();
                view.setSelected(true);
            }
        });
    }
}
