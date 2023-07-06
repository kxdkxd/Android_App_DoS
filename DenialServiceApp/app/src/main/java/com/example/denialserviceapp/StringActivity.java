package com.example.denialserviceapp;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class StringActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_string);
        Intent intent = getIntent();
        String user = intent.getStringExtra("user");
        Toast.makeText(this, user, Toast.LENGTH_SHORT).show();
    }
}