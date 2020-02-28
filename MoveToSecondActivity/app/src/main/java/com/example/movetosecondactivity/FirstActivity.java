package com.example.movetosecondactivity;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class FirstActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_first);
    }

    public void openSecondActivity(View view) {
        //From First to Second Activity
        Intent openSecondActivity=new Intent(getApplicationContext(),SecondActivity.class);
        startActivity(openSecondActivity);
    }
}
