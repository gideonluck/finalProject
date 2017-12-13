package com.example.owner.finalproject;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import android.widget.TextView;

public class HistoryActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_history);

        Bundle b = this.getIntent().getExtras();
        String printStuff = b.getString("histList");

        TextView tv = (TextView)findViewById(R.id.textView1);

        tv.setText(printStuff);

    }


}
