package com.example.android.androidtutorial;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by subra on 06-04-2017.
 */

public class AlgorithmAdapter extends ArrayAdapter {

    List list = new ArrayList();

    public AlgorithmAdapter(Context context, int resource) {
        super(context, resource);
    }

    static class DataHandler{
        ImageView image;
        TextView data_chapter;
        TextView data_info;
    }

    @Override
    public void add(Object object) {
        list.add(object);
    }

    @Override
    public int getCount() {
        return this.list.size();
    }

    @Nullable
    @Override
    public Object getItem(int position) {
        return this.list.get(position);
    }

    @NonNull
    @Override
    public View getView(int position, View convertView, ViewGroup parent) {

        View row;
        row = convertView;
        DataHandler handler;

        if(convertView == null){
            //When Row Is Not Available
            LayoutInflater inflater = (LayoutInflater) this.getContext().getSystemService(Context.LAYOUT_INFLATER_SERVICE);
            row = inflater.inflate(R.layout.listview_custom_layout02, parent, false);

            handler = new DataHandler();
            handler.image = (ImageView) row.findViewById(R.id.custom_listview_02_image);
            handler.data_chapter = (TextView) row.findViewById(R.id.custom_listview_02_topic);
            handler.data_info = (TextView) row.findViewById(R.id.custom_listview_02_info);

            row.setTag(handler);
        }
        else{
            //When Row not Available
            handler = (DataHandler) row.getTag();
        }

        AlgorithmData data = (AlgorithmData) this.getItem(position);
        handler.image.setImageResource(data.getChapterdata());
        handler.data_chapter.setText(data.getTopicsData());
        handler.data_info.setText(data.getInfoData());

        return row;
    }
}
