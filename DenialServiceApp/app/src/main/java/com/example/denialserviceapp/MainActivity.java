package com.example.denialserviceapp;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

import com.example.denialserviceapp.entity.PUser;
import com.example.denialserviceapp.entity.SUser;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    private Button btnSerial;
    private Button btnParcel;

    private Button btnArrayList, btnClassCast, btnIntentGetAction;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initViews();
        initListeners();

    }

    private void initListeners() {
        btnSerial.setOnClickListener(v -> {
            SUser user1 = new SUser("user1", "123456", 123);
//            Intent intent = new Intent(MainActivity.this, SerialActivity.class);

            Intent intent = new Intent();
            intent.setClassName("com.example.denialserviceapp", "com.example.denialserviceapp.SerialActivity");

            intent.putExtra("user", user1);
            startActivity(intent);

        });
        btnParcel.setOnClickListener(v -> {
            PUser user2 = new PUser("user2", "123456", 456);
            Intent intent = new Intent(MainActivity.this, ParcelActivity.class);

            intent.putExtra("user", user2);
            startActivity(intent);
        });

        btnArrayList.setOnClickListener(v -> {
            Intent intent = new Intent(this, ArrayListActivity.class);
            ArrayList<Integer> userIds = new ArrayList<>();
            userIds.add(123);
            userIds.add(456);
            intent.putIntegerArrayListExtra("user_id", userIds);
            startActivity(intent);
        });
        btnClassCast.setOnClickListener(v -> {
            Intent intent = new Intent(MainActivity.this, ClassCastActivity.class);
            intent.putExtra("serializable_key", "asd");
            startActivity(intent);
        });
        btnIntentGetAction.setOnClickListener(v -> {
            Intent intent = new Intent(MainActivity.this, IntentGetActionActivity.class);
            intent.setAction("a");
            startActivity(intent);
        });
    }

    private void initViews() {
        btnSerial = findViewById(R.id.btn_serial);
        btnParcel = findViewById(R.id.btn_parcel);
        btnArrayList = findViewById(R.id.btn_arraylist);
        btnClassCast = findViewById(R.id.btn_classcast);
        btnIntentGetAction = findViewById(R.id.btn_intent_get_action);
    }
}