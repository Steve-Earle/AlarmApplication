/*
 *
 * Steve Earle
 * 12:45 AM December 20th 2018
 *
 * Class/view for creating a new alarm object
 * Includes:
 *  -A toolbar with a back button to the MainActivity view
 *  -An editText for alarm naming
 *  -A date picker that also allows for selection of weekdays for alarm repetition
 *  -A scrolling time picker
 *  -A button that fires an intent to an alarm tone selection view,
 *  -A button that fires an intent to a snooze preference selection view
 *  -A button to save the new alarm with selected settings
 *  -A button to cancel creation
 *
 * */

package com.example.alarmapplication;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.View;
import android.widget.Button;

public class NewAlarm extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_new_alarm);
        Toolbar myToolbar = (Toolbar) findViewById(R.id.new_alarm_toolbar);
        setSupportActionBar(myToolbar);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        getSupportActionBar().setDisplayShowHomeEnabled(true);
    }

    /** Called when user taps the date button */
    public void openNewAlarmDatePicker(View view) {
        Intent intent = new Intent(this, NewAlarmDate.class);
        startActivity(intent);
    }

    /** Called when user taps the time button */
    public void openNewAlarmTimePicker(View view) {
        Intent intent = new Intent(this, NewAlarmTime.class);
        startActivity(intent);
    }

    /** Called when user taps the Tone button */
    public void openNewAlarmTonePicker(View view) {
        Intent intent = new Intent(this, NewAlarmTone.class);
        startActivity(intent);
    }

    /** Called when user taps the Snooze button */
    public void openNewAlarmSnoozePicker(View view) {
        Intent intent = new Intent(this, NewAlarmSnooze.class);
        startActivity(intent);
    }

    /** Called when user taps the Cancel button*/
    public void cancelNewAlarm(View view) {
        Intent intent = new Intent(this, MainActivity.class);
        startActivity(intent);
    }
}
