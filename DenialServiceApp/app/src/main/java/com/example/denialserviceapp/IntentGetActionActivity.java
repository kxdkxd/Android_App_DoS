package com.example.denialserviceapp;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class IntentGetActionActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_intent_get_action);

        Intent intent = getIntent();
        if (intent.getAction().equals("a")){
            Toast.makeText(this, "aa", Toast.LENGTH_SHORT).show();
        }
    }
}