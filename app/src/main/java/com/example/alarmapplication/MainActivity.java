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
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    /** Called when the user taps the Send button */
    public void openNewAlarmView(View view) {
        Intent intent = new Intent(this, NewAlarm.class);
        startActivity(intent);
    }
}
