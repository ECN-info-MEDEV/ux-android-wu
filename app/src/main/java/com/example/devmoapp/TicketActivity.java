package com.example.devmoapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.example.devmoapp.ui.ticket.TicketFragment;

public class TicketActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.ticket_activity);
        if (savedInstanceState == null) {
            getSupportFragmentManager().beginTransaction()
                    .replace(R.id.container, TicketFragment.newInstance())
                    .commitNow();
        }
    }
}