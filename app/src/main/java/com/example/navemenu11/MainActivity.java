package com.example.navemenu11;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.LinearLayout;

/**
 * this activity offer you 3 options to color the screen and color it with the color that the user picked
 */

public class MainActivity extends AppCompatActivity {
    LinearLayout lv;

    @Override
    /**
     * create the options menu with "main" list
     */
    public boolean onCreateOptionsMenu(Menu menu){
        getMenuInflater().inflate(R.menu.main,menu);

        return true;
    }

    /**
     * @author nave avitan
     * @param savedInstanceState
     */
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        lv= findViewById(R.id.lv);
    }

    /**
     * draw the screen with the color that the user picked
     * @param menu
     * @return
     */
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

    /**
     * next acticity
     * @param view
     */
    public void nextact(View view) {
        Intent si=new Intent(this,Main2Activity.class);
        startActivity(si);
    }
}

