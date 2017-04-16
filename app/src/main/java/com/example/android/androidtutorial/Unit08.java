package com.example.android.androidtutorial;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.ContextMenu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

import java.util.ArrayList;

public class Unit08 extends AppCompatActivity {

    ArrayAdapter<String> adapter;
    //Need to transfer all the array elements to arrayLst
    ArrayList<String> arrayLst = new ArrayList<String>();

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
        registerForContextMenu(list);

        for(String chapter : array){
            arrayLst.add(chapter);
        }

        adapter = new ArrayAdapter<String>(getApplicationContext(),R.layout.listview_custom_layout01,R.id.listlayout01_ele01, arrayLst);
        list.setAdapter(adapter);
        list.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Toast.makeText(getBaseContext(), parent.getItemAtPosition(position)+" is Selected", Toast.LENGTH_SHORT).show();
                view.setSelected(true);
            }
        });
    }

    @Override
    public void onCreateContextMenu(ContextMenu menu, View v, ContextMenu.ContextMenuInfo menuInfo) {

        super.onCreateContextMenu(menu, v, menuInfo);

        MenuInflater inflater = getMenuInflater();
        inflater.inflate(R.menu.contextual_menu01 , menu);
    }

    @Override
    public boolean onContextItemSelected(MenuItem item) {
        AdapterView.AdapterContextMenuInfo info = (AdapterView.AdapterContextMenuInfo) item.getMenuInfo();
        switch(item.getItemId()) {
            case R.id.context_Delete:
                arrayLst.remove(info.position);
                adapter.notifyDataSetChanged();
                return true;
            default:
                return super.onContextItemSelected(item);
        }
    }
}
