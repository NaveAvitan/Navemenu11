package com.example.navemenu11;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.LinearLayout;

/**
 * this activity offer you 4 options to color the screen and color it with the color that the user picked
 */
public class Main2Activity extends AppCompatActivity {
    LinearLayout lv2;
    /**
     * create the options menu with "main" list and new title "black"
     */
    public boolean onCreateOptionsMenu(Menu menu){
        getMenuInflater().inflate(R.menu.main,menu);
        menu.add(0,4,250,"black");
        return true;
    }
    @Override

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        lv2= findViewById(R.id.lv2);
    }
    /**
     * draw the screen with the color that the user picked
     * @param menu
     * @return
     */
    public boolean onOptionsItemSelected (MenuItem menu){
        int id= menu.getItemId();
        if(id==R.id.red){
            lv2.setBackgroundColor(Color.RED);
        }
        if(id==R.id.blue){
            lv2.setBackgroundColor(Color.BLUE);
        }
        if(id==R.id.green){
            lv2.setBackgroundColor(Color.GREEN);
        }
        if (id==4)
            lv2.setBackgroundColor(Color.BLACK);

        return  true;
    }

    /**
     * return to the first activity
     * @param view
     */
    public void goback(View view) {
        finish();
    }
}
