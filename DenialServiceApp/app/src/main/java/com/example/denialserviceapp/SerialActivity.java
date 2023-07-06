package com.example.denialserviceapp;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import com.example.denialserviceapp.entity.SUser;

public class SerialActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_serial);
        Intent intent = getIntent();
        SUser SUser = (SUser) intent.getSerializableExtra("user");
        Toast.makeText(this, SUser.toString(), Toast.LENGTH_SHORT).show();
    }
}