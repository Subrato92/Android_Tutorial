package com.example.android.androidtutorial;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.RelativeLayout;
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
    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater menuInflater = getMenuInflater();
        menuInflater.inflate(R.menu.custom_menu02, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        RelativeLayout layout = (RelativeLayout) findViewById(R.id.activity_unit07);
        switch(item.getItemId()){
            case R.id.m01_blue:
                layout.setBackgroundColor(getResources().getColor(R.color.m02_blue));
                break;
            case R.id.m01_green:
                layout.setBackgroundColor(getResources().getColor(R.color.m02_green));
                break;
            case R.id.m01_yellow:
                layout.setBackgroundColor(getResources().getColor(R.color.m02_yellow));
                break;
        }

        return true;
    }

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