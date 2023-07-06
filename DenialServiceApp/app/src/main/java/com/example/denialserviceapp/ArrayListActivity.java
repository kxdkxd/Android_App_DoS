package com.example.denialserviceapp;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import java.util.ArrayList;

public class ArrayListActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_array_list);
        Intent intent = getIntent();
        TextView textView = findViewById(R.id.my_text_view);

        ArrayList<Integer> intArray = intent.getIntegerArrayListExtra("user_id");
        if(intArray != null){
            for (int i=0; i<1;i++){ // hardcode iteration for a list, what if the list is null?
                textView.append(intArray.get(i) + "\n");
            }
        }
    }
}