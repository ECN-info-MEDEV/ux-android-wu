 package com.example.devmoapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.TextView;

 public class MainActivity extends AppCompatActivity {

    private static final String LOG_TAG = MainActivity.class.getSimpleName();
    private TextView departureEditText;
    private TextView destinationEditText;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        Log.d(LOG_TAG, "-------");
        Log.d(LOG_TAG, "onCreate");
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        departureEditText = findViewById(R.id.departureStation);
        destinationEditText = findViewById(R.id.destinationStation);
    }

    public void switchDestination(View view) {
        Log.d(LOG_TAG, "Switch button clicked.");
        String departure = departureEditText.getText().toString();
        String destination = destinationEditText.getText().toString();
        departureEditText.setText(destination);
        destinationEditText.setText(departure);
    }
 }