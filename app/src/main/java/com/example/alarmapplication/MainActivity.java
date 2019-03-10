/*
 *
 * Steve Earle
 * 12:32 AM December 20th 2018
 *
 * Main class and program entry point
 * Includes:
 *  -A toolbar with two tabs: Alarms (this) and Avatars
 *  -Current alarms (if any)
 *  -A floating action button that fires a new intent leading to the NewAlarm
 *   view where a user can create a new instance of an alarm
 *
 * */

package com.example.alarmapplication;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar myToolbar = (Toolbar) findViewById(R.id.my_toolbar);
        setSupportActionBar(myToolbar);
    }

    // Menu icons are inflated just as they were with actionbar
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu, menu);
        return true;
    }

    /** Called when the user taps the Send button */
    public void openNewAlarmView(View view) {
        Intent intent = new Intent(this, NewAlarm.class);
        startActivity(intent);
    }
}
