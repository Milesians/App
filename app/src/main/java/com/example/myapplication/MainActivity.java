package com.example.myapplication;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private static String TAG;
    private TextView mTxvUser;
    private static boolean toInitTXvUser = true;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        TAG = getLocalClassName();

        Log.d(TAG, "onCreate：黄涛+38");
        Log.d(TAG, "toInitTxvUser" + toInitTXvUser);

        initView();
        initData();

        findViewById(R.id.toActivityConstaint).setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                Intent intent = new Intent();
                intent.setClass( MainActivity.this, ConstraintLayoutActivity.class);
                MainActivity.this.startActivity(intent);
            }
        });

    }

    @Override
    protected void onStart() {
        super.onStart();
        Log.d(TAG, "onStart：黄涛+38");

    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.d(TAG, "onPause：黄涛+38");

    }


    @Override
    protected void onStop() {
        super.onStop();
        Log.d(TAG, "onStop：黄涛+38");

    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.d(TAG, "onDestroy：黄涛+38");

    }

    @Override
    protected void onSaveInstanceState(@NonNull Bundle outState) {
        super.onSaveInstanceState(outState);
        Log.d(TAG, "onSaveInstanceState：黄涛+38");

        outState.putString("user_key", mTxvUser.getText().toString());
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.d(TAG, "onResume：黄涛+38");

    }

    @Override
    protected void onRestoreInstanceState(@NonNull Bundle savedInstanceState) {
        super.onRestoreInstanceState(savedInstanceState);
        Log.d(TAG, "onRestoreInstanceState：黄涛+38");

        mTxvUser.setText(savedInstanceState.getString("user_key"));

    }

    void initView() {
        mTxvUser = findViewById(R.id.txvContent);
    }

    void initData() {
        if (toInitTXvUser) {
            mTxvUser.setText("test");
            toInitTXvUser = false;
        }
    }

}