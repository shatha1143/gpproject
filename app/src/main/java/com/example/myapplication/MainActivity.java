package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void sign_in(View view){
      Intent intent=new Intent(MainActivity.this,MainActivity2.class);
      startActivity(intent);
    }
    public void sign_up(View view){
        Intent intent=new Intent(MainActivity.this,adminpage.class);
        startActivity(intent);
    }
}