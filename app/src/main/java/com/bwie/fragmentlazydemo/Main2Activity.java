package com.bwie.fragmentlazydemo;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class Main2Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
    }

    public void to1(View view) {
        Intent intent = new Intent(this,MainActivity.class);
//        intent.putExtra("hi","hi");

        startActivity(intent);
    }

    @Override
    protected void onResume() {
        super.onResume();
        System.out.println("getintent====="+getIntent().getExtras().getString("hi"));

    }
}
