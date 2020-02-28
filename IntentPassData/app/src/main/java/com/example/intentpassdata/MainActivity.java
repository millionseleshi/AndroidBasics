package com.example.intentpassdata;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    EditText nameEditText;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        nameEditText = findViewById(R.id.nameEditText);
    }

    public void getName(View view) {
        String name = nameEditText.getText().toString();
        if (name.length() > 0) {
            Intent passDataIntent = new Intent(MainActivity.this, ViewNameActivity.class);
            passDataIntent.putExtra("name", name);
            startActivity(passDataIntent);
        } else {
            Toast.makeText(getApplicationContext(), "No name", Toast.LENGTH_LONG).show();
        }

    }
}
