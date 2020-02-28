package com.example.activitylifecycle;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.widget.Toast;

import java.util.logging.Logger;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Log.i("Activity","On Create");
    }


    @Override
    protected void onStart() {
        super.onStart();
//        Toast.makeText(this,"Start", Toast.LENGTH_LONG).show();
        Log.i("Activity", "On Start");

    }

    @Override
    protected void onStop() {
        super.onStop();
//        Toast.makeText(this,"Stop",Toast.LENGTH_LONG).show();
        Log.i("Activity", "On Stop");
    }

    @Override
    protected void onPause() {
        super.onPause();
//        Toast.makeText(this,"Pause",Toast.LENGTH_LONG).show();
        Log.i("Activity", "On Pause");
    }

    @Override
    protected void onRestart() {
        super.onRestart();
//        Toast.makeText(this,"Restart",Toast.LENGTH_LONG).show();
        Log.i("Activity", "On Restart");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
//        Toast.makeText(this,"Destroy",Toast.LENGTH_LONG).show();
        Log.i("Activity", "On Destroy");
    }

    @Override
    protected void onResume() {
        super.onResume();
//        Toast.makeText(this,"Resume",Toast.LENGTH_LONG).show();
        Log.i("Activity", "On Resume");
    }
}
