package com.example.myapplication;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.ContextMenu;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;
import android.widget.Toolbar;

public class MainActivity2 extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.mainmenu,menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected( MenuItem item) {
        int id = item.getItemId();

        if (id == R.id.Sign_out){
            Intent intentt =new Intent(MainActivity2.this,MainActivity.class);
        startActivity(intentt);
        return false;}
        if (id == R.id.Search){
            Intent intent2 =new Intent(MainActivity2.this,searchpage1.class);
            startActivity(intent2);
            return false;}
            if (id == R.id.aljajera_building){
                Intent intent =new Intent(MainActivity2.this,MainActivity4.class);
                startActivity(intent);
                return false;}
        if (id == R.id.msg){
            Intent intent =new Intent(MainActivity2.this,msgpage.class);
            startActivity(intent);
            return false;}
        return super.onOptionsItemSelected(item);
    }}