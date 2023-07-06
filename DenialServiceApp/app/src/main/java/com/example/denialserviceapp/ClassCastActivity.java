package com.example.denialserviceapp;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class ClassCastActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_class_cast);
        Intent intent = getIntent();
        String test = (String) intent.getSerializableExtra("serializable_key");
        Toast.makeText(this, "test="+test, Toast.LENGTH_SHORT).show();
    }
}