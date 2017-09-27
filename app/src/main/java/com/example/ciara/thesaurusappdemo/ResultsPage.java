package com.example.ciara.thesaurusappdemo;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class ResultsPage extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_results_page);
        TextView tvResult1 = (TextView) findViewById(R.id.textView2);
        TextView tvResult2 = (TextView) findViewById(R.id.textView3);
        TextView tvResult3 = (TextView) findViewById(R.id.textView4);

    }
}
