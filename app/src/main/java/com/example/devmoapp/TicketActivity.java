package com.example.devmoapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ImageView;
import android.widget.ScrollView;
import android.widget.HorizontalScrollView;

import com.example.devmoapp.ui.ticket.TicketFragment;

public class TicketActivity extends AppCompatActivity {

    private ImageView testImageView;
    private ScrollView ticketScrolView;
    private HorizontalScrollView dateScrolView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        testImageView = findViewById(R.id.imageView);
        ticketScrolView = findViewById(R.id.ticketScrolView);
        dateScrolView = findViewById(R.id.dateScrolView);

//        dateScrolView.addView(testImageView);


//        setContentView(R.layout.ticket_activity);

//        if (savedInstanceState == null) {
//            getSupportFragmentManager().beginTransaction()
//                    .replace(R.id.container, TicketFragment.newInstance())
//                    .commitNow();
//        }
    }
}