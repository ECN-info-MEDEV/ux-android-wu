 package com.example.devmoapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import com.google.android.material.tabs.TabLayout;

 public class MainActivity extends AppCompatActivity {

    private static final String LOG_TAG = MainActivity.class.getSimpleName();
    private TextView departureEditText;
    private TextView destinationEditText;
//    private TabLayout tabSingleReturn;
    private Button searchButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        Log.d(LOG_TAG, "-------");
        Log.d(LOG_TAG, "onCreate");
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        departureEditText = findViewById(R.id.departureStation);
        destinationEditText = findViewById(R.id.destinationStation);
//        tabSingleReturn = findViewById(R.id.tab_singlereturn);
        searchButton = findViewById(R.id.searchButton);

//        tabSingleReturn.addOnTabSelectedListener(new TabLayout.OnTabSelectedListener({
//            @Override
//            public void onTabSelected(TabLayout.Tab tab) {
//
//            }
//        }));
    }

    public void switchDestination(View view) {
        Log.d(LOG_TAG, "Switch button clicked.");
        String departure = departureEditText.getText().toString();
        String destination = destinationEditText.getText().toString();
        departureEditText.setText(destination);
        destinationEditText.setText(departure);
    }

    public void searchTickets(View view) {
        Log.d(LOG_TAG, "Search button clicked, pass to ticket view.");
        String departure = departureEditText.getText().toString();
        String destination = destinationEditText.getText().toString();
        Intent intent = new Intent(this, TicketActivity.class);
        intent.putExtra("departureStation", departure);
        intent.putExtra("destinationStation", destination);
        startActivity(intent);
    }


 }