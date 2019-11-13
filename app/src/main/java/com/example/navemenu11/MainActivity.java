package com.example.navemenu11;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.LinearLayout;

public class MainActivity extends AppCompatActivity {
    LinearLayout lv;
    @Override
    public boolean onCreateOptionsMenu(Menu menu){
        getMenuInflater().inflate(R.menu.main,menu);

        return true;
    }
    public boolean onOptionsItemSelected (MenuItem menu){
        int id= menu.getItemId();
        if(id==R.id.red){
            lv.setBackgroundColor(Color.RED);
        }
        if(id==R.id.blue){
            lv.setBackgroundColor(Color.BLUE);
        }
        if(id==R.id.green){
            lv.setBackgroundColor(Color.GREEN);
        }
        return  true;
    }
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        LinearLayout lv= (LinearLayout) findViewById(R.id.lv);
    }

    public void nextact(View view) {
        Intent si=new Intent(this,Main2Activity.class);
        startActivity(si);
    }
}

