/*
 * Steve Earle
 * 12:32 AM December 20th 2018
 *
 * Main class and program entry point
 * Includes:
 *  -A toolbar with two buttons (New Alarm and Overflow)
 *  -Current alarms (if any)
 *
 * Some code referenced from guides.codepath.com and developer.android.com
 * */

package com.example.alarmapplication;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    /** On application start the view is set to activity_main and the custom toolbar is set */
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar myToolbar = (Toolbar) findViewById(R.id.my_toolbar);
        setSupportActionBar(myToolbar);
    }

    /** Menu icons are inflated */
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu, menu);
        return true;
    }

    /** Sets intents for toolbar buttons */
    public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId()) {
            case R.id.settings:
                return true;

            case R.id.add_alarm:
                Intent intent = new Intent(this, NewAlarm.class);
                startActivity(intent);
                return true;

            default:
                return super.onOptionsItemSelected(item);
        }
    }
}
