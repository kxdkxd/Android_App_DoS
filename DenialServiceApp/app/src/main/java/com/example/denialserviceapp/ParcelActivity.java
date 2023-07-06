package com.example.denialserviceapp;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import com.example.denialserviceapp.entity.PUser;

public class ParcelActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_parcel);
        Intent intent = getIntent();
        PUser user = intent.getParcelableExtra("user");
        Toast.makeText(this, user.toString(), Toast.LENGTH_SHORT).show();
    }
}