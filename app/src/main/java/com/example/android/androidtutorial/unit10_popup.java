package com.example.android.androidtutorial;

import android.content.Context;
import android.support.v7.widget.PopupMenu;
import android.view.MenuItem;
import android.widget.Toast;

/**
 * Created by subra on 17-04-2017.
 */

public class unit10_popup implements PopupMenu.OnMenuItemClickListener {

    Context context;
    public unit10_popup( Context context){
        this.context = context;
    }

    @Override
    public boolean onMenuItemClick(MenuItem item) {
        if( item.getItemId() == R.id.id_Admin){
            Toast.makeText(context,"Login As Admin",Toast.LENGTH_SHORT).show();
            return true;
        }
        else if(item.getItemId() == R.id.id_User){
            Toast.makeText(context,"Login As User",Toast.LENGTH_SHORT).show();
            return true;
        }
        return false;
    }
}
