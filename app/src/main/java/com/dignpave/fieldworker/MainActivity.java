package com.dignpave.fieldworker;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    public static final String EXTRA_MESSAGE = "com.dingpave.fieldworker.MESSAGE";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void toFuelLogActivity(View view) {
        Intent intent = new Intent(this, FuelLogActivity.class);
        startActivity(intent);
    }

    public void toFuelLogManualEntryActivity(View view) {
        Intent intent = new Intent(this, FuelLogManualEntryActivity.class);
        startActivity(intent);
    }
}
