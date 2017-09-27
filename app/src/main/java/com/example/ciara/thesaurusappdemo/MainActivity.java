package com.example.ciara.thesaurusappdemo;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import java.util.ArrayList;
import java.util.HashMap;

public class MainActivity extends AppCompatActivity {
    HashMap<String, ArrayList<String>> multiMap = new HashMap<String, ArrayList<String>>();
    HashMap<String, ArrayList<String>> multiMapf = new HashMap<String, ArrayList<String>>();


    String url = "http://words.bighugelabs.com/api/2/aa7afde174fb2b90161624065fd57222";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        final EditText etEnterWord = (EditText) findViewById(R.id.editText);
        Button bFindword = (Button) findViewById(R.id.button2);
        Button bCancel = (Button) findViewById(R.id.button3)
        bFindword.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String sEnterWord = etEnterWord.getText().toString();


            }
         /*   String part 1 =
                    "https://words.bighugelabs.com/api/2/aa7afde174fb2b90161624065fd57222/";
            String part 2 = //Read test box
            String part 3 = "/json";

            String url = part1 + part2 + part3;



            String url = "http://my-json-feed";

            JsonObjectRequest jsObjRequest = new JsonObjectRequest
                    (Request.Method.GET, url, null, new Response.Listener<JSONObject>() {

                        @Override
                        public void onResponse(JSONObject response) {
//Open new screen with answers
                        }
                    }, new Response.ErrorListener() {

                        @Override
                        public void onErrorResponse(VolleyError error) {
//Show error messages on screen
    }
}
