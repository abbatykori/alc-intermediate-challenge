package com.abbatykori.alcintermediatetrackchallenge;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.LinearLayout;

public class DeveloperList extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_developer_list);

        LinearLayout singleDev = (LinearLayout) findViewById(R.id.singleDev);
        singleDev.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                setContentView(R.layout.activity_developer_full_profile);
            }
        });
    }
}
