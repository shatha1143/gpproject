package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;

public class msgpage extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_msgpage);
    }
    public void back(View view){
        Intent intent=new Intent(msgpage.this,MainActivity2.class);
        startActivity(intent);
    }
    public void view_map(View view){
        Intent i = new Intent(android.content.Intent.ACTION_VIEW);
        i.setData(Uri.parse("geo:24.489831,39.550548"));
        Intent choose = Intent.createChooser(i,"open Map");
        startActivity(choose);
    }}