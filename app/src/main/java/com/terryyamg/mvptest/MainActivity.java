package com.terryyamg.mvptest;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Spinner;
import android.widget.Toast;

//View
public class MainActivity extends Activity implements MainActivityView {

    private Spinner spinner;
    private ArrayAdapter<String> listAdapter;

    private MainActivityPresenter presenter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        spinner = (Spinner) findViewById(R.id.spinner);

        presenter = new MainActivityPresenterImpl(this);
        presenter.guide(); //導向
    }

    //Override MainActivityView 設定Adapter
    @Override
    public void setAdapter(String[] data) {
        listAdapter = new ArrayAdapter<>(this,
                android.R.layout.simple_spinner_item, data);
        listAdapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
    }

    //Override MainActivityView 設定Spinner動作
    @Override
    public void setSpinner(final String[] data) {
        spinner.setAdapter(listAdapter);
        spinner.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> arg0, View arg1,
                                       int pos1, long arg3) {
                Toast.makeText(MainActivity.this, data[pos1], Toast.LENGTH_SHORT).show();
            }

            @Override
            public void onNothingSelected(AdapterView<?> arg0) {

            }
        });
    }
}
