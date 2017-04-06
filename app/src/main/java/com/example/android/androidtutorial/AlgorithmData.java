package com.example.android.androidtutorial;

/**
 * Created by subra on 06-04-2017.
 */

public class AlgorithmData {
    private int chapterdata;
    private String TopicsData;
    private String InfoData;

    //Constructor
    public AlgorithmData (int chapterdata, String TopicsData, String InfoData ){
        this.setChapterdata(chapterdata);
        this.setTopicsData(TopicsData);
        this.setInfoData(InfoData);
    }

    //By Pressing  Alt+Insert >> Getter and Setter
    public int getChapterdata() {
        return chapterdata;
    }

    public void setChapterdata(int chapterdata) {
        this.chapterdata = chapterdata;
    }

    public String getTopicsData() {
        return TopicsData;
    }

    public void setTopicsData(String topicsData) {
        TopicsData = topicsData;
    }

    public String getInfoData() {
        return InfoData;
    }

    public void setInfoData(String infoData) {
        InfoData = infoData;
    }
}
