package com.example.denialserviceapp;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import com.example.denialserviceapp.entity.SUser;

public class SafeSerialActivity extends AppCompatActivity {
    private static final String TAG = "SafeSerialActivity";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_safe_serial);

        Intent intent = getIntent();
        SUser SUser = null;
        try {
            SUser = (SUser) intent.getSerializableExtra("user");
            Toast.makeText(this, SUser.toString(), Toast.LENGTH_SHORT).show();
        } catch (Exception e) {
            Log.d(TAG, String.valueOf(e.getClass()) + ": " + e.getMessage());
            e.printStackTrace();
        }
    }
}