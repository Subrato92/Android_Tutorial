package com.example.android.androidtutorial;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.AutoCompleteTextView;
import android.R.array;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.TextView;

import java.util.ArrayList;

public class Unit06 extends AppCompatActivity {

    AutoCompleteTextView actv;
    String[] country;
    ArrayAdapter<String> adapter;
    ArrayList<String> selection = new ArrayList<String>();

    TextView Response ;
    EditText name ;
    EditText title ;
    EditText age ;
    EditText sex ;
    EditText Country ;

    String string ;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_unit06);

        actv = (AutoCompleteTextView) findViewById(R.id.unit06_country);
        country = getResources().getStringArray(R.array.ch06_country);
        adapter = new ArrayAdapter<String>(this,android.R.layout.simple_list_item_1,country);
        actv.setAdapter(adapter);
        Response = (TextView) findViewById(R.id.unit06_tv_response);
        name = (EditText) findViewById(R.id.unit06_UsrName);
        title = (EditText) findViewById(R.id.unit06_usrTitle);
        age = (EditText) findViewById(R.id.unit06_age);
        sex = (EditText) findViewById(R.id.unit06_sex);
        Country = (EditText) findViewById(R.id.unit06_country);

        Response.setEnabled(false);
    }

    public void ut06_selection (View view){
        boolean checked = ((CheckBox) view).isChecked();
        switch(view.getId()){
            case R.id.unit06_cb01 :
                if(checked)
                    selection.add("Algorithm");
                else
                    selection.remove("Algorithm");
                break;
            case R.id.unit06_cb02 :
                if(checked)
                    selection.add("Machine Learning");
                else
                    selection.remove("Machine Learning");
                break;
            case R.id.unit06_cb03 :
                if(checked)
                    selection.add("Android");
                else
                    selection.remove("Android");
                break;
            case R.id.unit06_cb04 :
                if(checked)
                    selection.add("Data Analytics");
                else
                    selection.remove("Data Analytics");
                break;
            default:
                break;
        }
    }

    public void ut06_submit (View view){
        string = "Name: " + name.getText().toString() + " " + title.getText().toString() + "\n";
        string += "Age: " + age.getText().toString() + ",  " + sex.getText().toString() + "\n";
        string += "and You are From " + Country.getText().toString() + "\n";
        string += "You Selected >> \n";

        for (String str:selection){
            string += str + "\n";
        }

        Response.setText(string);
        Response.setEnabled(true);
    }

}
