package com.example.movetosecondactivity;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class SecondActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);
    }

    public void openFirstActivity(View view) {
        //From Second Activity to Main Activity
        Intent openFirstActivity=new Intent(getApplicationContext(), FirstActivity.class);
        startActivity(openFirstActivity);
    }
}
