package com.example.intentpassdata;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class ViewNameActivity extends AppCompatActivity {

    TextView showNameTextView;
    Button goBackButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_view_name);
        showNameTextView=findViewById(R.id.showNametextView);
        String inputtedName=getIntent().getStringExtra("name");
        showNameTextView.setText("My name is "+inputtedName);
    }

    public void backToMainActivity(View view) {
        Intent moveToMainIntent=new Intent(ViewNameActivity.this,MainActivity.class);
        startActivity(moveToMainIntent);
    }
}
