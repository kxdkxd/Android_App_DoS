package com.example.denialserviceattack;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.widget.Toast;

public class DispatchTestActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dispatch_test);

        Intent intent = getIntent();
        String type = null;

        try {
            type = (String) intent.getSerializableExtra("type");

            //Toast.makeText(this, SUser.toString(), Toast.LENGTH_SHORT).show();
        } catch (Exception e) {
            String TAG = "Attack_DispatchTest";
            Log.d(TAG, String.valueOf(e.getClass()) + ": " + e.getMessage());
            e.printStackTrace();
        }
    }
}