package com.terryyamg.mvptest;

//Model
public class MainActivityModelImpl implements MainActivityModel {

    @Override
    public void setData(MainActivityView view) {
        String[] data = {"A", "B", "C", "D", "E"};

        //放入資訊
        view.setAdapter(data);
        view.setSpinner(data);
        view.setListViewAdapter(data);
        view.setListView(data);
    }
}
