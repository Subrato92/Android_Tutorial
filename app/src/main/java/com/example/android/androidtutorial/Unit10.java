package com.example.android.androidtutorial;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.PopupMenu;
import android.view.MenuInflater;
import android.view.View;

public class Unit10 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_unit10);
    }

    public void popupMethod (View view){
        PopupMenu popupMenu = new PopupMenu(this, view);

        MenuInflater menuInflater = popupMenu.getMenuInflater();
        menuInflater.inflate(R.menu.popup_menu, popupMenu.getMenu());

        unit10_popup popup_calss = new unit10_popup(getApplicationContext());
        popupMenu.setOnMenuItemClickListener(popup_calss);

        popupMenu.show();
    }
}
