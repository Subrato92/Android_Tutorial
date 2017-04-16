package com.example.android.androidtutorial;

import android.content.Context;
import android.support.v4.content.ContextCompat;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.view.ActionMode;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.AbsListView;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.RelativeLayout;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class Unit07 extends AppCompatActivity {

    String[] array = {"1. Link List",
            "2. Stack",
            "3. Queue",
            "4. Tree",
            "5. Priority Queues"
    };
    ListView list;
    ArrayAdapter<String> adapter;
    List selection = new ArrayList();
    ArrayList arrayList = new ArrayList();

    int count = 0;

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
                //layout.setBackgroundColor(getResources().getColor(R.id.activity_unit07,) R.color.m02_blue);
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

        for (String str: array){
            arrayList.add(str);
        }

        list = (ListView) findViewById(R.id.unit07_algoTopics);
        adapter = new ArrayAdapter<String>(this,android.R.layout.simple_list_item_1,arrayList);
        list.setAdapter(adapter);

        list.setChoiceMode(AbsListView.CHOICE_MODE_MULTIPLE_MODAL);
        list.setMultiChoiceModeListener(new AbsListView.MultiChoiceModeListener(){
            @Override
            public void onItemCheckedStateChanged(android.view.ActionMode mode, int position, long id, boolean checked) {
                /*if User Select the item >> bool checked becomes true, and if user Un-select the item
                  the checked value becomes false
                 */
                if(checked){
                    selection.add(arrayList.get(position));
                    count++;
                    mode.setTitle(count + " Selected");
                }
                else{
                    selection.remove(arrayList.get(position));
                    count--;
                    mode.setTitle(count + " Selected");
                }

            }

            @Override
            public boolean onCreateActionMode(android.view.ActionMode mode, Menu menu) {
                // Here we create Contextual Action Mode
                MenuInflater m_inflater = getMenuInflater();
                m_inflater.inflate(R.menu.custom_menu03, menu);
                return true;
            }

            @Override
            public boolean onPrepareActionMode(android.view.ActionMode mode, Menu menu) {
                return false;
            }

            @Override
            public boolean onActionItemClicked(android.view.ActionMode mode, MenuItem item) {

                if(item.getItemId() == R.id.context_Delete){
                    for(Object obj: selection){
                        String ITEM = obj.toString();
                        arrayList.remove(ITEM);
                    }
                    //to Notify adapter regarding the change in the listView
                    adapter.notifyDataSetChanged();
                    mode.finish();
                    return true;
                }

                return false;
            }

            @Override
            public void onDestroyActionMode(android.view.ActionMode mode) {
                //This method gets invoked when user press the back button in the context Menu
                count = 0;
                selection.clear();
            }

        } );

        list.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Toast.makeText(getBaseContext(), parent.getItemAtPosition(position)+" is Selected", Toast.LENGTH_LONG).show();
                //view.setSelected(true);
            }
        });
    }
}