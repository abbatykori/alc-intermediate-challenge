package com.abbatykori.alcintermediatetrackchallenge;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void showDeveloperList(View view) {
        setContentView(R.layout.activity_developer_list);
    }
}
