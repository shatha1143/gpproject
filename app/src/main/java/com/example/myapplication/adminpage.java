package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Toast;

public class adminpage extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_adminpage);
    }
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.adminservices,menu);
        return true;
    }
    @Override
    public boolean onOptionsItemSelected( MenuItem item) {
        int id = item.getItemId();

        if (id == R.id.Sign_out1){
            Intent intentt =new Intent(adminpage.this,MainActivity.class);
            startActivity(intentt);
            return false;}
        if(id==R.id.schedualemp){
            Intent intent1=new Intent(adminpage.this,schedualpage1.class);
            startActivity(intent1);
            return false;
        }
        if(id==R.id.manageusers){
            Intent intent2=new Intent(adminpage.this,manageusers.class);
            startActivity(intent2);
            return false;
        }

        return super.onOptionsItemSelected(item);}


}