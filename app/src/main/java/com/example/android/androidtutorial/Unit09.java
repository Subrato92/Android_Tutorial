package com.example.android.androidtutorial;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.view.ActionMode;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.ListView;

public class Unit09 extends AppCompatActivity {

    //need 3 Arrays for 3 elements in each row
    int[] Pics = {R.drawable.linkedlist2, R.drawable.stack2
    , R.drawable.queue2, R.drawable.tree2, R.drawable.string2,
    R.drawable.graph2 , R.drawable.hash2};
    String[] Topics;
    String[] Info;

    ListView listview;
    AlgorithmAdapter adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_unit09);

        listview = (ListView) findViewById(R.id.unit09_listview);


        Topics = getResources().getStringArray(R.array.ch09_Chapters);
        Info = getResources().getStringArray(R.array.ch09_problems);

        adapter = new AlgorithmAdapter(getApplicationContext(), R.layout.listview_custom_layout02);
        listview.setAdapter(adapter);

        //Now We Need to Create
        int i = 0;
        for (String topic: Topics){
            AlgorithmData Data = new AlgorithmData(Pics[i], topic, Info[i]);
            adapter.add(Data);
            i++;
         }
    }



}
